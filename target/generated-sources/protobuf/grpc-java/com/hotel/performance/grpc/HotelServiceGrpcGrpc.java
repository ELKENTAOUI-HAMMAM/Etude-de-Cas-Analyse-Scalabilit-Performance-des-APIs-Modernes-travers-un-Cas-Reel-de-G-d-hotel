package com.hotel.performance.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: hotel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HotelServiceGrpcGrpc {

  private HotelServiceGrpcGrpc() {}

  public static final java.lang.String SERVICE_NAME = "HotelServiceGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hotel.performance.grpc.CreateReservationRequest,
      com.hotel.performance.grpc.ReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = com.hotel.performance.grpc.CreateReservationRequest.class,
      responseType = com.hotel.performance.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.performance.grpc.CreateReservationRequest,
      com.hotel.performance.grpc.ReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<com.hotel.performance.grpc.CreateReservationRequest, com.hotel.performance.grpc.ReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = HotelServiceGrpcGrpc.getCreateReservationMethod) == null) {
      synchronized (HotelServiceGrpcGrpc.class) {
        if ((getCreateReservationMethod = HotelServiceGrpcGrpc.getCreateReservationMethod) == null) {
          HotelServiceGrpcGrpc.getCreateReservationMethod = getCreateReservationMethod =
              io.grpc.MethodDescriptor.<com.hotel.performance.grpc.CreateReservationRequest, com.hotel.performance.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.performance.grpc.CreateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.performance.grpc.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceGrpcMethodDescriptorSupplier("CreateReservation"))
              .build();
        }
      }
    }
    return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.performance.grpc.GetReservationRequest,
      com.hotel.performance.grpc.ReservationResponse> getGetReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservation",
      requestType = com.hotel.performance.grpc.GetReservationRequest.class,
      responseType = com.hotel.performance.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.performance.grpc.GetReservationRequest,
      com.hotel.performance.grpc.ReservationResponse> getGetReservationMethod() {
    io.grpc.MethodDescriptor<com.hotel.performance.grpc.GetReservationRequest, com.hotel.performance.grpc.ReservationResponse> getGetReservationMethod;
    if ((getGetReservationMethod = HotelServiceGrpcGrpc.getGetReservationMethod) == null) {
      synchronized (HotelServiceGrpcGrpc.class) {
        if ((getGetReservationMethod = HotelServiceGrpcGrpc.getGetReservationMethod) == null) {
          HotelServiceGrpcGrpc.getGetReservationMethod = getGetReservationMethod =
              io.grpc.MethodDescriptor.<com.hotel.performance.grpc.GetReservationRequest, com.hotel.performance.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.performance.grpc.GetReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.performance.grpc.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceGrpcMethodDescriptorSupplier("GetReservation"))
              .build();
        }
      }
    }
    return getGetReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.performance.grpc.UpdateReservationRequest,
      com.hotel.performance.grpc.ReservationResponse> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = com.hotel.performance.grpc.UpdateReservationRequest.class,
      responseType = com.hotel.performance.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.performance.grpc.UpdateReservationRequest,
      com.hotel.performance.grpc.ReservationResponse> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<com.hotel.performance.grpc.UpdateReservationRequest, com.hotel.performance.grpc.ReservationResponse> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = HotelServiceGrpcGrpc.getUpdateReservationMethod) == null) {
      synchronized (HotelServiceGrpcGrpc.class) {
        if ((getUpdateReservationMethod = HotelServiceGrpcGrpc.getUpdateReservationMethod) == null) {
          HotelServiceGrpcGrpc.getUpdateReservationMethod = getUpdateReservationMethod =
              io.grpc.MethodDescriptor.<com.hotel.performance.grpc.UpdateReservationRequest, com.hotel.performance.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.performance.grpc.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.performance.grpc.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceGrpcMethodDescriptorSupplier("UpdateReservation"))
              .build();
        }
      }
    }
    return getUpdateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.performance.grpc.DeleteReservationRequest,
      com.hotel.performance.grpc.DeleteReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = com.hotel.performance.grpc.DeleteReservationRequest.class,
      responseType = com.hotel.performance.grpc.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.performance.grpc.DeleteReservationRequest,
      com.hotel.performance.grpc.DeleteReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<com.hotel.performance.grpc.DeleteReservationRequest, com.hotel.performance.grpc.DeleteReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = HotelServiceGrpcGrpc.getDeleteReservationMethod) == null) {
      synchronized (HotelServiceGrpcGrpc.class) {
        if ((getDeleteReservationMethod = HotelServiceGrpcGrpc.getDeleteReservationMethod) == null) {
          HotelServiceGrpcGrpc.getDeleteReservationMethod = getDeleteReservationMethod =
              io.grpc.MethodDescriptor.<com.hotel.performance.grpc.DeleteReservationRequest, com.hotel.performance.grpc.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.performance.grpc.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.performance.grpc.DeleteReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceGrpcMethodDescriptorSupplier("DeleteReservation"))
              .build();
        }
      }
    }
    return getDeleteReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceGrpcStub>() {
        @java.lang.Override
        public HotelServiceGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceGrpcStub(channel, callOptions);
        }
      };
    return HotelServiceGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceGrpcBlockingStub>() {
        @java.lang.Override
        public HotelServiceGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceGrpcBlockingStub(channel, callOptions);
        }
      };
    return HotelServiceGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceGrpcFutureStub>() {
        @java.lang.Override
        public HotelServiceGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceGrpcFutureStub(channel, callOptions);
        }
      };
    return HotelServiceGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createReservation(com.hotel.performance.grpc.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     */
    default void getReservation(com.hotel.performance.grpc.GetReservationRequest request,
        io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationMethod(), responseObserver);
    }

    /**
     */
    default void updateReservation(com.hotel.performance.grpc.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    /**
     */
    default void deleteReservation(com.hotel.performance.grpc.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.hotel.performance.grpc.DeleteReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HotelServiceGrpc.
   */
  public static abstract class HotelServiceGrpcImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HotelServiceGrpcGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HotelServiceGrpc.
   */
  public static final class HotelServiceGrpcStub
      extends io.grpc.stub.AbstractAsyncStub<HotelServiceGrpcStub> {
    private HotelServiceGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceGrpcStub(channel, callOptions);
    }

    /**
     */
    public void createReservation(com.hotel.performance.grpc.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservation(com.hotel.performance.grpc.GetReservationRequest request,
        io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(com.hotel.performance.grpc.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(com.hotel.performance.grpc.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.hotel.performance.grpc.DeleteReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HotelServiceGrpc.
   */
  public static final class HotelServiceGrpcBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HotelServiceGrpcBlockingStub> {
    private HotelServiceGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hotel.performance.grpc.ReservationResponse createReservation(com.hotel.performance.grpc.CreateReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.performance.grpc.ReservationResponse getReservation(com.hotel.performance.grpc.GetReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.performance.grpc.ReservationResponse updateReservation(com.hotel.performance.grpc.UpdateReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.performance.grpc.DeleteReservationResponse deleteReservation(com.hotel.performance.grpc.DeleteReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HotelServiceGrpc.
   */
  public static final class HotelServiceGrpcFutureStub
      extends io.grpc.stub.AbstractFutureStub<HotelServiceGrpcFutureStub> {
    private HotelServiceGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.performance.grpc.ReservationResponse> createReservation(
        com.hotel.performance.grpc.CreateReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.performance.grpc.ReservationResponse> getReservation(
        com.hotel.performance.grpc.GetReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.performance.grpc.ReservationResponse> updateReservation(
        com.hotel.performance.grpc.UpdateReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.performance.grpc.DeleteReservationResponse> deleteReservation(
        com.hotel.performance.grpc.DeleteReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_GET_RESERVATION = 1;
  private static final int METHODID_UPDATE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((com.hotel.performance.grpc.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION:
          serviceImpl.getReservation((com.hotel.performance.grpc.GetReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((com.hotel.performance.grpc.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.performance.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((com.hotel.performance.grpc.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.performance.grpc.DeleteReservationResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hotel.performance.grpc.CreateReservationRequest,
              com.hotel.performance.grpc.ReservationResponse>(
                service, METHODID_CREATE_RESERVATION)))
        .addMethod(
          getGetReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hotel.performance.grpc.GetReservationRequest,
              com.hotel.performance.grpc.ReservationResponse>(
                service, METHODID_GET_RESERVATION)))
        .addMethod(
          getUpdateReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hotel.performance.grpc.UpdateReservationRequest,
              com.hotel.performance.grpc.ReservationResponse>(
                service, METHODID_UPDATE_RESERVATION)))
        .addMethod(
          getDeleteReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hotel.performance.grpc.DeleteReservationRequest,
              com.hotel.performance.grpc.DeleteReservationResponse>(
                service, METHODID_DELETE_RESERVATION)))
        .build();
  }

  private static abstract class HotelServiceGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hotel.performance.grpc.HotelProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelServiceGrpc");
    }
  }

  private static final class HotelServiceGrpcFileDescriptorSupplier
      extends HotelServiceGrpcBaseDescriptorSupplier {
    HotelServiceGrpcFileDescriptorSupplier() {}
  }

  private static final class HotelServiceGrpcMethodDescriptorSupplier
      extends HotelServiceGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HotelServiceGrpcMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HotelServiceGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceGrpcFileDescriptorSupplier())
              .addMethod(getCreateReservationMethod())
              .addMethod(getGetReservationMethod())
              .addMethod(getUpdateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
