/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2020 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2020 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package telemetry;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by Agent
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: telemetry.proto")
public final class OpenConfigTelemetryGrpc {

  private OpenConfigTelemetryGrpc() {}

  public static final String SERVICE_NAME = "telemetry.OpenConfigTelemetry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.SubscriptionRequest,
      telemetry.OpenConfigTelemetryProto.OpenConfigData> getTelemetrySubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "telemetrySubscribe",
      requestType = telemetry.OpenConfigTelemetryProto.SubscriptionRequest.class,
      responseType = telemetry.OpenConfigTelemetryProto.OpenConfigData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.SubscriptionRequest,
      telemetry.OpenConfigTelemetryProto.OpenConfigData> getTelemetrySubscribeMethod() {
    io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.SubscriptionRequest, telemetry.OpenConfigTelemetryProto.OpenConfigData> getTelemetrySubscribeMethod;
    if ((getTelemetrySubscribeMethod = OpenConfigTelemetryGrpc.getTelemetrySubscribeMethod) == null) {
      synchronized (OpenConfigTelemetryGrpc.class) {
        if ((getTelemetrySubscribeMethod = OpenConfigTelemetryGrpc.getTelemetrySubscribeMethod) == null) {
          OpenConfigTelemetryGrpc.getTelemetrySubscribeMethod = getTelemetrySubscribeMethod =
              io.grpc.MethodDescriptor.<telemetry.OpenConfigTelemetryProto.SubscriptionRequest, telemetry.OpenConfigTelemetryProto.OpenConfigData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "telemetrySubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.SubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.OpenConfigData.getDefaultInstance()))
              .setSchemaDescriptor(new OpenConfigTelemetryMethodDescriptorSupplier("telemetrySubscribe"))
              .build();
        }
      }
    }
    return getTelemetrySubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest,
      telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply> getCancelTelemetrySubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelTelemetrySubscription",
      requestType = telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest.class,
      responseType = telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest,
      telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply> getCancelTelemetrySubscriptionMethod() {
    io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest, telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply> getCancelTelemetrySubscriptionMethod;
    if ((getCancelTelemetrySubscriptionMethod = OpenConfigTelemetryGrpc.getCancelTelemetrySubscriptionMethod) == null) {
      synchronized (OpenConfigTelemetryGrpc.class) {
        if ((getCancelTelemetrySubscriptionMethod = OpenConfigTelemetryGrpc.getCancelTelemetrySubscriptionMethod) == null) {
          OpenConfigTelemetryGrpc.getCancelTelemetrySubscriptionMethod = getCancelTelemetrySubscriptionMethod =
              io.grpc.MethodDescriptor.<telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest, telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cancelTelemetrySubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply.getDefaultInstance()))
              .setSchemaDescriptor(new OpenConfigTelemetryMethodDescriptorSupplier("cancelTelemetrySubscription"))
              .build();
        }
      }
    }
    return getCancelTelemetrySubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest,
      telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply> getGetTelemetrySubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTelemetrySubscriptions",
      requestType = telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest.class,
      responseType = telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest,
      telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply> getGetTelemetrySubscriptionsMethod() {
    io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest, telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply> getGetTelemetrySubscriptionsMethod;
    if ((getGetTelemetrySubscriptionsMethod = OpenConfigTelemetryGrpc.getGetTelemetrySubscriptionsMethod) == null) {
      synchronized (OpenConfigTelemetryGrpc.class) {
        if ((getGetTelemetrySubscriptionsMethod = OpenConfigTelemetryGrpc.getGetTelemetrySubscriptionsMethod) == null) {
          OpenConfigTelemetryGrpc.getGetTelemetrySubscriptionsMethod = getGetTelemetrySubscriptionsMethod =
              io.grpc.MethodDescriptor.<telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest, telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTelemetrySubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply.getDefaultInstance()))
              .setSchemaDescriptor(new OpenConfigTelemetryMethodDescriptorSupplier("getTelemetrySubscriptions"))
              .build();
        }
      }
    }
    return getGetTelemetrySubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest,
      telemetry.OpenConfigTelemetryProto.GetOperationalStateReply> getGetTelemetryOperationalStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTelemetryOperationalState",
      requestType = telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest.class,
      responseType = telemetry.OpenConfigTelemetryProto.GetOperationalStateReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest,
      telemetry.OpenConfigTelemetryProto.GetOperationalStateReply> getGetTelemetryOperationalStateMethod() {
    io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest, telemetry.OpenConfigTelemetryProto.GetOperationalStateReply> getGetTelemetryOperationalStateMethod;
    if ((getGetTelemetryOperationalStateMethod = OpenConfigTelemetryGrpc.getGetTelemetryOperationalStateMethod) == null) {
      synchronized (OpenConfigTelemetryGrpc.class) {
        if ((getGetTelemetryOperationalStateMethod = OpenConfigTelemetryGrpc.getGetTelemetryOperationalStateMethod) == null) {
          OpenConfigTelemetryGrpc.getGetTelemetryOperationalStateMethod = getGetTelemetryOperationalStateMethod =
              io.grpc.MethodDescriptor.<telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest, telemetry.OpenConfigTelemetryProto.GetOperationalStateReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTelemetryOperationalState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.GetOperationalStateReply.getDefaultInstance()))
              .setSchemaDescriptor(new OpenConfigTelemetryMethodDescriptorSupplier("getTelemetryOperationalState"))
              .build();
        }
      }
    }
    return getGetTelemetryOperationalStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.DataEncodingRequest,
      telemetry.OpenConfigTelemetryProto.DataEncodingReply> getGetDataEncodingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDataEncodings",
      requestType = telemetry.OpenConfigTelemetryProto.DataEncodingRequest.class,
      responseType = telemetry.OpenConfigTelemetryProto.DataEncodingReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.DataEncodingRequest,
      telemetry.OpenConfigTelemetryProto.DataEncodingReply> getGetDataEncodingsMethod() {
    io.grpc.MethodDescriptor<telemetry.OpenConfigTelemetryProto.DataEncodingRequest, telemetry.OpenConfigTelemetryProto.DataEncodingReply> getGetDataEncodingsMethod;
    if ((getGetDataEncodingsMethod = OpenConfigTelemetryGrpc.getGetDataEncodingsMethod) == null) {
      synchronized (OpenConfigTelemetryGrpc.class) {
        if ((getGetDataEncodingsMethod = OpenConfigTelemetryGrpc.getGetDataEncodingsMethod) == null) {
          OpenConfigTelemetryGrpc.getGetDataEncodingsMethod = getGetDataEncodingsMethod =
              io.grpc.MethodDescriptor.<telemetry.OpenConfigTelemetryProto.DataEncodingRequest, telemetry.OpenConfigTelemetryProto.DataEncodingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDataEncodings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.DataEncodingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.OpenConfigTelemetryProto.DataEncodingReply.getDefaultInstance()))
              .setSchemaDescriptor(new OpenConfigTelemetryMethodDescriptorSupplier("getDataEncodings"))
              .build();
        }
      }
    }
    return getGetDataEncodingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OpenConfigTelemetryStub newStub(io.grpc.Channel channel) {
    return new OpenConfigTelemetryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OpenConfigTelemetryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OpenConfigTelemetryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OpenConfigTelemetryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OpenConfigTelemetryFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by Agent
   * </pre>
   */
  public static abstract class OpenConfigTelemetryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Request an inline subscription for data at the specified path.
     * The device should send telemetry data back on the same
     * connection as the subscription request.
     * </pre>
     */
    public void telemetrySubscribe(telemetry.OpenConfigTelemetryProto.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.OpenConfigData> responseObserver) {
      asyncUnimplementedUnaryCall(getTelemetrySubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Terminates and removes an exisiting telemetry subscription
     * </pre>
     */
    public void cancelTelemetrySubscription(telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelTelemetrySubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the list of current telemetry subscriptions from the
     * target. This command returns a list of existing subscriptions
     * not including those that are established via configuration.
     * </pre>
     */
    public void getTelemetrySubscriptions(telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTelemetrySubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Telemetry Agent Operational States
     * </pre>
     */
    public void getTelemetryOperationalState(telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.GetOperationalStateReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTelemetryOperationalStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return the set of data encodings supported by the device for
     * telemetry data
     * </pre>
     */
    public void getDataEncodings(telemetry.OpenConfigTelemetryProto.DataEncodingRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.DataEncodingReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDataEncodingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTelemetrySubscribeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                telemetry.OpenConfigTelemetryProto.SubscriptionRequest,
                telemetry.OpenConfigTelemetryProto.OpenConfigData>(
                  this, METHODID_TELEMETRY_SUBSCRIBE)))
          .addMethod(
            getCancelTelemetrySubscriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest,
                telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply>(
                  this, METHODID_CANCEL_TELEMETRY_SUBSCRIPTION)))
          .addMethod(
            getGetTelemetrySubscriptionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest,
                telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply>(
                  this, METHODID_GET_TELEMETRY_SUBSCRIPTIONS)))
          .addMethod(
            getGetTelemetryOperationalStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest,
                telemetry.OpenConfigTelemetryProto.GetOperationalStateReply>(
                  this, METHODID_GET_TELEMETRY_OPERATIONAL_STATE)))
          .addMethod(
            getGetDataEncodingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                telemetry.OpenConfigTelemetryProto.DataEncodingRequest,
                telemetry.OpenConfigTelemetryProto.DataEncodingReply>(
                  this, METHODID_GET_DATA_ENCODINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by Agent
   * </pre>
   */
  public static final class OpenConfigTelemetryStub extends io.grpc.stub.AbstractStub<OpenConfigTelemetryStub> {
    private OpenConfigTelemetryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OpenConfigTelemetryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenConfigTelemetryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OpenConfigTelemetryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request an inline subscription for data at the specified path.
     * The device should send telemetry data back on the same
     * connection as the subscription request.
     * </pre>
     */
    public void telemetrySubscribe(telemetry.OpenConfigTelemetryProto.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.OpenConfigData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTelemetrySubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Terminates and removes an exisiting telemetry subscription
     * </pre>
     */
    public void cancelTelemetrySubscription(telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelTelemetrySubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the list of current telemetry subscriptions from the
     * target. This command returns a list of existing subscriptions
     * not including those that are established via configuration.
     * </pre>
     */
    public void getTelemetrySubscriptions(telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTelemetrySubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Telemetry Agent Operational States
     * </pre>
     */
    public void getTelemetryOperationalState(telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.GetOperationalStateReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTelemetryOperationalStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return the set of data encodings supported by the device for
     * telemetry data
     * </pre>
     */
    public void getDataEncodings(telemetry.OpenConfigTelemetryProto.DataEncodingRequest request,
        io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.DataEncodingReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDataEncodingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by Agent
   * </pre>
   */
  public static final class OpenConfigTelemetryBlockingStub extends io.grpc.stub.AbstractStub<OpenConfigTelemetryBlockingStub> {
    private OpenConfigTelemetryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OpenConfigTelemetryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenConfigTelemetryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OpenConfigTelemetryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request an inline subscription for data at the specified path.
     * The device should send telemetry data back on the same
     * connection as the subscription request.
     * </pre>
     */
    public java.util.Iterator<telemetry.OpenConfigTelemetryProto.OpenConfigData> telemetrySubscribe(
        telemetry.OpenConfigTelemetryProto.SubscriptionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getTelemetrySubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Terminates and removes an exisiting telemetry subscription
     * </pre>
     */
    public telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply cancelTelemetrySubscription(telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelTelemetrySubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the list of current telemetry subscriptions from the
     * target. This command returns a list of existing subscriptions
     * not including those that are established via configuration.
     * </pre>
     */
    public telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply getTelemetrySubscriptions(telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTelemetrySubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Telemetry Agent Operational States
     * </pre>
     */
    public telemetry.OpenConfigTelemetryProto.GetOperationalStateReply getTelemetryOperationalState(telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTelemetryOperationalStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return the set of data encodings supported by the device for
     * telemetry data
     * </pre>
     */
    public telemetry.OpenConfigTelemetryProto.DataEncodingReply getDataEncodings(telemetry.OpenConfigTelemetryProto.DataEncodingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDataEncodingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by Agent
   * </pre>
   */
  public static final class OpenConfigTelemetryFutureStub extends io.grpc.stub.AbstractStub<OpenConfigTelemetryFutureStub> {
    private OpenConfigTelemetryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OpenConfigTelemetryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenConfigTelemetryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OpenConfigTelemetryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Terminates and removes an exisiting telemetry subscription
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply> cancelTelemetrySubscription(
        telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelTelemetrySubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the list of current telemetry subscriptions from the
     * target. This command returns a list of existing subscriptions
     * not including those that are established via configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply> getTelemetrySubscriptions(
        telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTelemetrySubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Telemetry Agent Operational States
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<telemetry.OpenConfigTelemetryProto.GetOperationalStateReply> getTelemetryOperationalState(
        telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTelemetryOperationalStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return the set of data encodings supported by the device for
     * telemetry data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<telemetry.OpenConfigTelemetryProto.DataEncodingReply> getDataEncodings(
        telemetry.OpenConfigTelemetryProto.DataEncodingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDataEncodingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TELEMETRY_SUBSCRIBE = 0;
  private static final int METHODID_CANCEL_TELEMETRY_SUBSCRIPTION = 1;
  private static final int METHODID_GET_TELEMETRY_SUBSCRIPTIONS = 2;
  private static final int METHODID_GET_TELEMETRY_OPERATIONAL_STATE = 3;
  private static final int METHODID_GET_DATA_ENCODINGS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OpenConfigTelemetryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OpenConfigTelemetryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TELEMETRY_SUBSCRIBE:
          serviceImpl.telemetrySubscribe((telemetry.OpenConfigTelemetryProto.SubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.OpenConfigData>) responseObserver);
          break;
        case METHODID_CANCEL_TELEMETRY_SUBSCRIPTION:
          serviceImpl.cancelTelemetrySubscription((telemetry.OpenConfigTelemetryProto.CancelSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.CancelSubscriptionReply>) responseObserver);
          break;
        case METHODID_GET_TELEMETRY_SUBSCRIPTIONS:
          serviceImpl.getTelemetrySubscriptions((telemetry.OpenConfigTelemetryProto.GetSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.GetSubscriptionsReply>) responseObserver);
          break;
        case METHODID_GET_TELEMETRY_OPERATIONAL_STATE:
          serviceImpl.getTelemetryOperationalState((telemetry.OpenConfigTelemetryProto.GetOperationalStateRequest) request,
              (io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.GetOperationalStateReply>) responseObserver);
          break;
        case METHODID_GET_DATA_ENCODINGS:
          serviceImpl.getDataEncodings((telemetry.OpenConfigTelemetryProto.DataEncodingRequest) request,
              (io.grpc.stub.StreamObserver<telemetry.OpenConfigTelemetryProto.DataEncodingReply>) responseObserver);
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

  private static abstract class OpenConfigTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OpenConfigTelemetryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return telemetry.OpenConfigTelemetryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OpenConfigTelemetry");
    }
  }

  private static final class OpenConfigTelemetryFileDescriptorSupplier
      extends OpenConfigTelemetryBaseDescriptorSupplier {
    OpenConfigTelemetryFileDescriptorSupplier() {}
  }

  private static final class OpenConfigTelemetryMethodDescriptorSupplier
      extends OpenConfigTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OpenConfigTelemetryMethodDescriptorSupplier(String methodName) {
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
      synchronized (OpenConfigTelemetryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OpenConfigTelemetryFileDescriptorSupplier())
              .addMethod(getTelemetrySubscribeMethod())
              .addMethod(getCancelTelemetrySubscriptionMethod())
              .addMethod(getGetTelemetrySubscriptionsMethod())
              .addMethod(getGetTelemetryOperationalStateMethod())
              .addMethod(getGetDataEncodingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
