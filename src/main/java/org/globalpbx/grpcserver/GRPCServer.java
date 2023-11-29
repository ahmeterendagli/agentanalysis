package org.globalpbx.grpcserver;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.globalpbx.grpcservice.CallReportService;
import org.globalpbx.repository.AgentRepository;

import java.io.IOException;

public class GRPCServer {


    public static void main(String[] args) throws IOException, InterruptedException {


        Server server =
                ServerBuilder.forPort(9090)
                        .addService(new CallReportService(new AgentRepository()))
                        .build();

        server.start();

        System.out.println("Server started at " + server.getPort());

        server.awaitTermination();
    }
}
