package org.globalpbx.grpcservice;

import io.grpc.stub.StreamObserver;
import org.globalpbx.repository.AgentRepository;

public class OperatorService extends OperatorGrpc.OperatorImplBase {

    private AgentRepository agentRepository;

    public OperatorService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @Override
    public void save(OperatorDto.OperatorInfo request, StreamObserver<OperatorDto.SResult> responseObserver) {

        agentRepository.connect();
        agentRepository.createAgentTable();
        agentRepository.addAgentInfo("eren","eren.gmail.com");
        agentRepository.getAllUsers();
        System.out.println(request.getAnsweredCall());
        OperatorDto.SResult.Builder response = new OperatorDto.SResult.Builder();

        response.setResponseCode(0).setResponsemessage("Success");
        System.out.println(responseObserver);
        if (responseObserver != null) {
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
        System.out.println("onNext");
        System.out.println("completed");
    }
}
