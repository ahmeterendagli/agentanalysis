package org.globalpbx.grpcservice;

import io.grpc.stub.StreamObserver;
import org.globalpbx.repository.AgentRepository;

public class CallReportService extends CallReportGrpc.CallReportImplBase {

    private AgentRepository agentRepository;

    public CallReportService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @Override
    public void save(CallReportDto.CallReportInfo request, StreamObserver<CallReportDto.SResult> responseObserver) {

        try {
            agentRepository.connect();
            agentRepository.createAgentTable();
            agentRepository.addAgentInfo(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        CallReportDto.SResult.Builder response = new CallReportDto.SResult.Builder();

        response.setResponseCode(0).setResponsemessage("Success");
        System.out.println(responseObserver);
        if (responseObserver != null) {
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }
}
