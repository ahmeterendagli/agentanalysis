package org.globalpbx.grpcservice;

import io.grpc.stub.StreamObserver;
import org.globalpbx.service.User;

public class OperatorService extends OperatorGrpc.OperatorImplBase {

    @Override
    public void save(OperatorDto.OperatorInfo request, StreamObserver<OperatorDto.SResult> responseObserver) {

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
