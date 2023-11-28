package org.globalpbx.grpcservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.2)",
    comments = "Source: operator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OperatorGrpc {

  private OperatorGrpc() {}

  public static final String SERVICE_NAME = "Operator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<OperatorDto.OperatorInfo,
      OperatorDto.SResult> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = OperatorDto.OperatorInfo.class,
      responseType = OperatorDto.SResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OperatorDto.OperatorInfo,
      OperatorDto.SResult> getSaveMethod() {
    io.grpc.MethodDescriptor<OperatorDto.OperatorInfo, OperatorDto.SResult> getSaveMethod;
    if ((getSaveMethod = OperatorGrpc.getSaveMethod) == null) {
      synchronized (OperatorGrpc.class) {
        if ((getSaveMethod = OperatorGrpc.getSaveMethod) == null) {
          OperatorGrpc.getSaveMethod = getSaveMethod =
              io.grpc.MethodDescriptor.<OperatorDto.OperatorInfo, OperatorDto.SResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OperatorDto.OperatorInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OperatorDto.SResult.getDefaultInstance()))
              .setSchemaDescriptor(new OperatorMethodDescriptorSupplier("save"))
              .build();
        }
      }
    }
    return getSaveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatorStub>() {
        @java.lang.Override
        public OperatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatorStub(channel, callOptions);
        }
      };
    return OperatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatorBlockingStub>() {
        @java.lang.Override
        public OperatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatorBlockingStub(channel, callOptions);
        }
      };
    return OperatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatorFutureStub>() {
        @java.lang.Override
        public OperatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatorFutureStub(channel, callOptions);
        }
      };
    return OperatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OperatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void save(OperatorDto.OperatorInfo request,
                     io.grpc.stub.StreamObserver<OperatorDto.SResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                OperatorDto.OperatorInfo,
                OperatorDto.SResult>(
                  this, METHODID_SAVE)))
          .build();
    }
  }

  /**
   */
  public static final class OperatorStub extends io.grpc.stub.AbstractAsyncStub<OperatorStub> {
    private OperatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatorStub(channel, callOptions);
    }

    /**
     */
    public void save(OperatorDto.OperatorInfo request,
                     io.grpc.stub.StreamObserver<OperatorDto.SResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OperatorBlockingStub extends io.grpc.stub.AbstractBlockingStub<OperatorBlockingStub> {
    private OperatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public OperatorDto.SResult save(OperatorDto.OperatorInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OperatorFutureStub extends io.grpc.stub.AbstractFutureStub<OperatorFutureStub> {
    private OperatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OperatorDto.SResult> save(
        OperatorDto.OperatorInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OperatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OperatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          serviceImpl.save((OperatorDto.OperatorInfo) request,
              (io.grpc.stub.StreamObserver<OperatorDto.SResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OperatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return OperatorDto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Operator");
    }
  }

  private static final class OperatorFileDescriptorSupplier
      extends OperatorBaseDescriptorSupplier {
    OperatorFileDescriptorSupplier() {}
  }

  private static final class OperatorMethodDescriptorSupplier
      extends OperatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OperatorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OperatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperatorFileDescriptorSupplier())
              .addMethod(getSaveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
