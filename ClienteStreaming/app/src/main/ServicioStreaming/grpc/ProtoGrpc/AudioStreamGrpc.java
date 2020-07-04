package ProtoGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: AudioStreaming.proto")
public final class AudioStreamGrpc {

  private AudioStreamGrpc() {}

  public static final String SERVICE_NAME = "Streaming.AudioStream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ProtoGrpc.AudioStreaming.Cancion,
      ProtoGrpc.AudioStreaming.AudioFormat> getElegirCancionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ElegirCancion",
      requestType = ProtoGrpc.AudioStreaming.Cancion.class,
      responseType = ProtoGrpc.AudioStreaming.AudioFormat.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProtoGrpc.AudioStreaming.Cancion,
      ProtoGrpc.AudioStreaming.AudioFormat> getElegirCancionMethod() {
    io.grpc.MethodDescriptor<ProtoGrpc.AudioStreaming.Cancion, ProtoGrpc.AudioStreaming.AudioFormat> getElegirCancionMethod;
    if ((getElegirCancionMethod = AudioStreamGrpc.getElegirCancionMethod) == null) {
      synchronized (AudioStreamGrpc.class) {
        if ((getElegirCancionMethod = AudioStreamGrpc.getElegirCancionMethod) == null) {
          AudioStreamGrpc.getElegirCancionMethod = getElegirCancionMethod =
              io.grpc.MethodDescriptor.<ProtoGrpc.AudioStreaming.Cancion, ProtoGrpc.AudioStreaming.AudioFormat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ElegirCancion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ProtoGrpc.AudioStreaming.Cancion.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ProtoGrpc.AudioStreaming.AudioFormat.getDefaultInstance()))
              .build();
        }
      }
    }
    return getElegirCancionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProtoGrpc.AudioStreaming.Cancion,
      ProtoGrpc.AudioStreaming.AudioSample> getObtenerStreamDeCancionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtenerStreamDeCancion",
      requestType = ProtoGrpc.AudioStreaming.Cancion.class,
      responseType = ProtoGrpc.AudioStreaming.AudioSample.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ProtoGrpc.AudioStreaming.Cancion,
      ProtoGrpc.AudioStreaming.AudioSample> getObtenerStreamDeCancionMethod() {
    io.grpc.MethodDescriptor<ProtoGrpc.AudioStreaming.Cancion, ProtoGrpc.AudioStreaming.AudioSample> getObtenerStreamDeCancionMethod;
    if ((getObtenerStreamDeCancionMethod = AudioStreamGrpc.getObtenerStreamDeCancionMethod) == null) {
      synchronized (AudioStreamGrpc.class) {
        if ((getObtenerStreamDeCancionMethod = AudioStreamGrpc.getObtenerStreamDeCancionMethod) == null) {
          AudioStreamGrpc.getObtenerStreamDeCancionMethod = getObtenerStreamDeCancionMethod =
              io.grpc.MethodDescriptor.<ProtoGrpc.AudioStreaming.Cancion, ProtoGrpc.AudioStreaming.AudioSample>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ObtenerStreamDeCancion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ProtoGrpc.AudioStreaming.Cancion.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ProtoGrpc.AudioStreaming.AudioSample.getDefaultInstance()))
              .build();
        }
      }
    }
    return getObtenerStreamDeCancionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudioStreamStub newStub(io.grpc.Channel channel) {
    return new AudioStreamStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioStreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AudioStreamBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioStreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AudioStreamFutureStub(channel);
  }

  /**
   */
  public static abstract class AudioStreamImplBase implements io.grpc.BindableService {

    /**
     */
    public void elegirCancion(ProtoGrpc.AudioStreaming.Cancion request,
        io.grpc.stub.StreamObserver<ProtoGrpc.AudioStreaming.AudioFormat> responseObserver) {
      asyncUnimplementedUnaryCall(getElegirCancionMethod(), responseObserver);
    }

    /**
     */
    public void obtenerStreamDeCancion(ProtoGrpc.AudioStreaming.Cancion request,
        io.grpc.stub.StreamObserver<ProtoGrpc.AudioStreaming.AudioSample> responseObserver) {
      asyncUnimplementedUnaryCall(getObtenerStreamDeCancionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getElegirCancionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ProtoGrpc.AudioStreaming.Cancion,
                ProtoGrpc.AudioStreaming.AudioFormat>(
                  this, METHODID_ELEGIR_CANCION)))
          .addMethod(
            getObtenerStreamDeCancionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ProtoGrpc.AudioStreaming.Cancion,
                ProtoGrpc.AudioStreaming.AudioSample>(
                  this, METHODID_OBTENER_STREAM_DE_CANCION)))
          .build();
    }
  }

  /**
   */
  public static final class AudioStreamStub extends io.grpc.stub.AbstractStub<AudioStreamStub> {
    private AudioStreamStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AudioStreamStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioStreamStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AudioStreamStub(channel, callOptions);
    }

    /**
     */
    public void elegirCancion(ProtoGrpc.AudioStreaming.Cancion request,
        io.grpc.stub.StreamObserver<ProtoGrpc.AudioStreaming.AudioFormat> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getElegirCancionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obtenerStreamDeCancion(ProtoGrpc.AudioStreaming.Cancion request,
        io.grpc.stub.StreamObserver<ProtoGrpc.AudioStreaming.AudioSample> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getObtenerStreamDeCancionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AudioStreamBlockingStub extends io.grpc.stub.AbstractStub<AudioStreamBlockingStub> {
    private AudioStreamBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AudioStreamBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioStreamBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AudioStreamBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProtoGrpc.AudioStreaming.AudioFormat elegirCancion(ProtoGrpc.AudioStreaming.Cancion request) {
      return blockingUnaryCall(
          getChannel(), getElegirCancionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ProtoGrpc.AudioStreaming.AudioSample> obtenerStreamDeCancion(
        ProtoGrpc.AudioStreaming.Cancion request) {
      return blockingServerStreamingCall(
          getChannel(), getObtenerStreamDeCancionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AudioStreamFutureStub extends io.grpc.stub.AbstractStub<AudioStreamFutureStub> {
    private AudioStreamFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AudioStreamFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioStreamFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AudioStreamFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProtoGrpc.AudioStreaming.AudioFormat> elegirCancion(
        ProtoGrpc.AudioStreaming.Cancion request) {
      return futureUnaryCall(
          getChannel().newCall(getElegirCancionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ELEGIR_CANCION = 0;
  private static final int METHODID_OBTENER_STREAM_DE_CANCION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudioStreamImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudioStreamImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ELEGIR_CANCION:
          serviceImpl.elegirCancion((ProtoGrpc.AudioStreaming.Cancion) request,
              (io.grpc.stub.StreamObserver<ProtoGrpc.AudioStreaming.AudioFormat>) responseObserver);
          break;
        case METHODID_OBTENER_STREAM_DE_CANCION:
          serviceImpl.obtenerStreamDeCancion((ProtoGrpc.AudioStreaming.Cancion) request,
              (io.grpc.stub.StreamObserver<ProtoGrpc.AudioStreaming.AudioSample>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AudioStreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getElegirCancionMethod())
              .addMethod(getObtenerStreamDeCancionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
