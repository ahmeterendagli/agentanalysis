package org.globalpbx.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AgentRepository {
    public void createAgentTable() {
        String createTableSQL = "create table if not exists agents (\n" +
        "    id INTEGER PRIMARY KEY,\n" +
                "    username VARCHAR(255),\n" +
                "    email  VARCHAR(255)" +
                ");";
        Connection conn = this.connect();
        System.out.println(conn);
        try (Statement statement = conn.createStatement()) {
            statement.executeUpdate(createTableSQL);
        } catch (SQLException e) {
            System.out.printf(e.getMessage());
            e.printStackTrace();
        }
    }
    public Connection connect() {
        Connection conn = null;

        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:agents.db";
            conn = DriverManager.getConnection(url);
            System.out.println("SQLite veritabanına bağlandı.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void addAgentInfo(String username, String email) {
        String sql = "INSERT INTO agents(username, email) VALUES(?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public List<String> getAllUsers() {
        List<String> getAllUser = new ArrayList<>();
        String sql = "SELECT * FROM agents";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                getAllUser.add(rs.getString("username"));
                getAllUser.add(rs.getString("email"));
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Email: " + rs.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return getAllUser;
    }

}
