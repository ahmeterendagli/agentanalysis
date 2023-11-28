package org.globalpbx.service;

import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {

    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {
        System.out.println("inside login");

        String username = request.getUsername();
        String password = request.getPassword();

        User.APIResponse.Builder response = new User.APIResponse.Builder();
        System.out.println("1");
        if(username.equals(password)) {
            response.setResponseCode(0).setResponsemessage("Success");
            System.out.println("success");
        } else {
            response.setResponseCode(-1).setResponsemessage("Invalid user");
        }

        System.out.println(response.build());
        System.out.println("1111");
        System.out.println(responseObserver);
        if (responseObserver != null) {
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
        System.out.println("onNext");
        System.out.println("completed");
    }

    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {
        super.logout(request, responseObserver);
    }
}
