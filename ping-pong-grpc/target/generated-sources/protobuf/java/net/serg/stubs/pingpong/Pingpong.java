// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pingpong.proto

package net.serg.stubs.pingpong;

public final class Pingpong {
  private Pingpong() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_serg_stubs_pingpong_PingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_serg_stubs_pingpong_PingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_serg_stubs_pingpong_PongResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_serg_stubs_pingpong_PongResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016pingpong.proto\022\027net.serg.stubs.pingpon" +
      "g\"\036\n\013PingRequest\022\017\n\007message\030\001 \001(\t\"\037\n\014Pon" +
      "gResponse\022\017\n\007message\030\001 \001(\t2f\n\017PingPongSe" +
      "rvice\022S\n\004ping\022$.net.serg.stubs.pingpong." +
      "PingRequest\032%.net.serg.stubs.pingpong.Po" +
      "ngResponseB\033\n\027net.serg.stubs.pingpongP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_net_serg_stubs_pingpong_PingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_net_serg_stubs_pingpong_PingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_serg_stubs_pingpong_PingRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_net_serg_stubs_pingpong_PongResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_net_serg_stubs_pingpong_PongResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_serg_stubs_pingpong_PongResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}