package org.globalpbx.grpcservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.2)",
    comments = "Source: callreport.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CallReportGrpc {

  private CallReportGrpc() {}

  public static final String SERVICE_NAME = "CallReport";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CallReport.CallReportInfo,
      CallReport.SResult> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = CallReport.CallReportInfo.class,
      responseType = CallReport.SResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CallReport.CallReportInfo,
      CallReport.SResult> getSaveMethod() {
    io.grpc.MethodDescriptor<CallReport.CallReportInfo, CallReport.SResult> getSaveMethod;
    if ((getSaveMethod = CallReportGrpc.getSaveMethod) == null) {
      synchronized (CallReportGrpc.class) {
        if ((getSaveMethod = CallReportGrpc.getSaveMethod) == null) {
          CallReportGrpc.getSaveMethod = getSaveMethod =
              io.grpc.MethodDescriptor.<CallReport.CallReportInfo, CallReport.SResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CallReport.CallReportInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CallReport.SResult.getDefaultInstance()))
              .setSchemaDescriptor(new CallReportMethodDescriptorSupplier("save"))
              .build();
        }
      }
    }
    return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CallReport.Empty,
      CallReport.SResult> getGetAverageCallAnswerToEndSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAverageCallAnswerToEndSeconds",
      requestType = CallReport.Empty.class,
      responseType = CallReport.SResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CallReport.Empty,
      CallReport.SResult> getGetAverageCallAnswerToEndSecondsMethod() {
    io.grpc.MethodDescriptor<CallReport.Empty, CallReport.SResult> getGetAverageCallAnswerToEndSecondsMethod;
    if ((getGetAverageCallAnswerToEndSecondsMethod = CallReportGrpc.getGetAverageCallAnswerToEndSecondsMethod) == null) {
      synchronized (CallReportGrpc.class) {
        if ((getGetAverageCallAnswerToEndSecondsMethod = CallReportGrpc.getGetAverageCallAnswerToEndSecondsMethod) == null) {
          CallReportGrpc.getGetAverageCallAnswerToEndSecondsMethod = getGetAverageCallAnswerToEndSecondsMethod =
              io.grpc.MethodDescriptor.<CallReport.Empty, CallReport.SResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAverageCallAnswerToEndSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CallReport.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CallReport.SResult.getDefaultInstance()))
              .setSchemaDescriptor(new CallReportMethodDescriptorSupplier("getAverageCallAnswerToEndSeconds"))
              .build();
        }
      }
    }
    return getGetAverageCallAnswerToEndSecondsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CallReportStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallReportStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallReportStub>() {
        @Override
        public CallReportStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallReportStub(channel, callOptions);
        }
      };
    return CallReportStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CallReportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallReportBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallReportBlockingStub>() {
        @Override
        public CallReportBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallReportBlockingStub(channel, callOptions);
        }
      };
    return CallReportBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CallReportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallReportFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallReportFutureStub>() {
        @Override
        public CallReportFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallReportFutureStub(channel, callOptions);
        }
      };
    return CallReportFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CallReportImplBase implements io.grpc.BindableService {

    /**
     */
    public void save(CallReport.CallReportInfo request,
                     io.grpc.stub.StreamObserver<CallReport.SResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public void getAverageCallAnswerToEndSeconds(CallReport.Empty request,
                                                 io.grpc.stub.StreamObserver<CallReport.SResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAverageCallAnswerToEndSecondsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CallReport.CallReportInfo,
                CallReport.SResult>(
                  this, METHODID_SAVE)))
          .addMethod(
            getGetAverageCallAnswerToEndSecondsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CallReport.Empty,
                CallReport.SResult>(
                  this, METHODID_GET_AVERAGE_CALL_ANSWER_TO_END_SECONDS)))
          .build();
    }
  }

  /**
   */
  public static final class CallReportStub extends io.grpc.stub.AbstractAsyncStub<CallReportStub> {
    private CallReportStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CallReportStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallReportStub(channel, callOptions);
    }

    /**
     */
    public void save(CallReport.CallReportInfo request,
                     io.grpc.stub.StreamObserver<CallReport.SResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAverageCallAnswerToEndSeconds(CallReport.Empty request,
                                                 io.grpc.stub.StreamObserver<CallReport.SResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAverageCallAnswerToEndSecondsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CallReportBlockingStub extends io.grpc.stub.AbstractBlockingStub<CallReportBlockingStub> {
    private CallReportBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CallReportBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallReportBlockingStub(channel, callOptions);
    }

    /**
     */
    public CallReport.SResult save(CallReport.CallReportInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public CallReport.SResult getAverageCallAnswerToEndSeconds(CallReport.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAverageCallAnswerToEndSecondsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CallReportFutureStub extends io.grpc.stub.AbstractFutureStub<CallReportFutureStub> {
    private CallReportFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CallReportFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallReportFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CallReport.SResult> save(
        CallReport.CallReportInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CallReport.SResult> getAverageCallAnswerToEndSeconds(
        CallReport.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAverageCallAnswerToEndSecondsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE = 0;
  private static final int METHODID_GET_AVERAGE_CALL_ANSWER_TO_END_SECONDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CallReportImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CallReportImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          serviceImpl.save((CallReport.CallReportInfo) request,
              (io.grpc.stub.StreamObserver<CallReport.SResult>) responseObserver);
          break;
        case METHODID_GET_AVERAGE_CALL_ANSWER_TO_END_SECONDS:
          serviceImpl.getAverageCallAnswerToEndSeconds((CallReport.Empty) request,
              (io.grpc.stub.StreamObserver<CallReport.SResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CallReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CallReportBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CallReport.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CallReport");
    }
  }

  private static final class CallReportFileDescriptorSupplier
      extends CallReportBaseDescriptorSupplier {
    CallReportFileDescriptorSupplier() {}
  }

  private static final class CallReportMethodDescriptorSupplier
      extends CallReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CallReportMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CallReportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CallReportFileDescriptorSupplier())
              .addMethod(getSaveMethod())
              .addMethod(getGetAverageCallAnswerToEndSecondsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
