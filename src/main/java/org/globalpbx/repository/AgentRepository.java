package org.globalpbx.repository;

import org.globalpbx.dto.CallReportDto;
import org.globalpbx.grpcservice.CallReport;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AgentRepository {
    public void createAgentTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS tblcallreport ("
                + "callreportid UUID NOT NULL,"
                + "callanswertime TIMESTAMP WITHOUT TIME ZONE,"
                + "callanswertoendseconds BIGINT,"
                + "callendtime TIMESTAMP WITHOUT TIME ZONE NOT NULL,"
                + "callid VARCHAR(150)  NOT NULL,"
                + "callstarttime TIMESTAMP WITHOUT TIME ZONE NOT NULL,"
                + "callstarttoendseconds BIGINT NOT NULL,"
                + "calltypeid INTEGER NOT NULL,"
                + "callernumber VARCHAR(50)  NOT NULL,"
                + "closesystem BOOLEAN NOT NULL DEFAULT FALSE,"
                + "communicationvoiceid UUID,"
                + "dialednumber VARCHAR(50)  NOT NULL,"
                + "groupid VARCHAR(150)  NOT NULL,"
                + "hangupcausesip VARCHAR(150) ,"
                + "hangupcausesipcode INTEGER,"
                + "hangupid INTEGER NOT NULL,"
                + "info1 VARCHAR(150) ,"
                + "info2 VARCHAR(150) ,"
                + "modulereportid INTEGER,"
                + "ringtime TIMESTAMP WITHOUT TIME ZONE,"
                + "trunkid UUID,"
                + "transfer BOOLEAN NOT NULL DEFAULT FALSE,"
                + "missedcall BOOLEAN NOT NULL DEFAULT FALSE,"
                + "callerinternalid INTEGER,"
                + "dialedinternalid INTEGER,"
                + "dialednumberwithformat VARCHAR(70) ,"
                + "laststatus BOOLEAN NOT NULL DEFAULT FALSE)";

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

    public void addAgentInfo(CallReport.CallReportInfo request) {
        String insertQuery = "INSERT INTO tblcallreport ("
                + "callreportid, callanswertime, callanswertoendseconds, callendtime, callid, callstarttime, "
                + "callstarttoendseconds, calltypeid, callernumber, closesystem, communicationvoiceid, dialednumber, "
                + "groupid, hangupcausesip, hangupcausesipcode, hangupid, info1, info2, modulereportid, ringtime, "
                + "trunkid, transfer, missedcall, callerinternalid, dialedinternalid, dialednumberwithformat, laststatus) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
            pstmt.setString(1, request.getCallreportid());
            pstmt.setString(2, request.getCallanswertime());
            pstmt.setLong(3, request.getCallanswertoendseconds());
            pstmt.setString(4, request.getCallendtime());
            pstmt.setString(5, request.getCallid());
            pstmt.setString(6, request.getCallstarttime());
            pstmt.setLong(7, request.getCallstarttoendseconds());
            pstmt.setInt(8, request.getCalltypeid());
            pstmt.setString(9, request.getCallernumber());
            pstmt.setBoolean(10, request.getClosesystem());
            pstmt.setString(11, request.getCommunicationvoiceid());
            pstmt.setString(12, request.getDialednumber());
            pstmt.setString(13, request.getGroupid());
            pstmt.setString(14, request.getHangupcausesip());
            pstmt.setInt(15, request.getHangupcausesipcode());
            pstmt.setInt(16, request.getHangupid());
            pstmt.setString(17, request.getInfo1());
            pstmt.setString(18, request.getInfo2());
            pstmt.setInt(19, request.getModulereportid());
            pstmt.setString(20, request.getRingtime());
            pstmt.setString(21, request.getTrunkid());
            pstmt.setBoolean(22, request.getTransfer());
            pstmt.setBoolean(23, request.getMissedcall());
            pstmt.setInt(24, request.getCallerinternalid());
            pstmt.setInt(25, request.getDialedinternalid());
            pstmt.setString(26, request.getDialednumberwithformat());
            pstmt.setBoolean(27, request.getLaststatus());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    public List<CallReportDto> getAllCallReport() {
        List<CallReportDto> callReports = new ArrayList<>();
        String query = "SELECT * FROM tblcallreport";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                CallReportDto callReport = new CallReportDto();
                callReport.setCallreportid(rs.getString("callreportid"));
                callReport.setCallanswertime(rs.getString("callanswertime"));
                callReport.setCallanswertoendseconds(rs.getLong("callanswertoendseconds"));
                callReport.setCallendtime(rs.getString("callendtime"));
                callReport.setCallid(rs.getString("callid"));
                callReport.setCallstarttime(rs.getString("callstarttime"));
                callReport.setCallstarttoendseconds(rs.getLong("callstarttoendseconds"));
                callReport.setCalltypeid(rs.getInt("calltypeid"));
                callReport.setCallernumber(rs.getString("callernumber"));
                callReport.setClosesystem(rs.getBoolean("closesystem"));
                callReport.setCommunicationvoiceid(rs.getString("communicationvoiceid"));
                callReport.setDialednumber(rs.getString("dialednumber"));
                callReport.setGroupid(rs.getString("groupid"));
                callReport.setHangupcausesip(rs.getString("hangupcausesip"));
                callReport.setHangupcausesipcode(rs.getInt("hangupcausesipcode"));
                callReport.setHangupid(rs.getInt("hangupid"));
                callReport.setInfo1(rs.getString("info1"));
                callReport.setInfo2(rs.getString("info2"));
                callReport.setModulereportid(rs.getInt("modulereportid"));
                callReport.setRingtime(rs.getString("ringtime"));
                callReport.setTrunkid(rs.getString("trunkid"));
                callReport.setTransfer(rs.getBoolean("transfer"));
                callReport.setMissedcall(rs.getBoolean("missedcall"));
                callReport.setCallerinternalid(rs.getInt("callerinternalid"));
                callReport.setDialedinternalid(rs.getInt("dialedinternalid"));
                callReport.setDialednumberwithformat(rs.getString("dialednumberwithformat"));
                callReport.setLaststatus(rs.getBoolean("laststatus"));

                callReports.add(callReport);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return callReports;
    }
}
