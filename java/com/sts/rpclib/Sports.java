// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sports.proto

package com.sts.rpclib;

public final class Sports {
  private Sports() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_SportMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_SportMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014sports.proto\022\016com.sts.rpclib\032\017language" +
      "s.proto\"a\n\014SportMessage\022$\n\005sport\030\001 \001(\0162\025" +
      ".com.sts.rpclib.Sport\022+\n\004name\030\002 \003(\0132\035.co" +
      "m.sts.rpclib.LocalizedName*\363\001\n\005Sport\022\021\n\r" +
      "UNKNOWN_SPORT\020\000\022\n\n\006SOCCER\020\001\022\n\n\006TENNIS\020\002\022" +
      "\016\n\nICE_HOCKEY\020\003\022\016\n\nBASKETBALL\020\004\022\013\n\007CRICK" +
      "ET\020\005\022\016\n\nVOLLEYBALL\020\006\022\014\n\010HANDBALL\020\007\022\t\n\005RU" +
      "GBY\020\010\022\025\n\021AMERICAN_FOOTBALL\020\t\022\010\n\004GOLF\020\n\022\020" +
      "\n\014BEACH_VOLLEY\020\013\022\013\n\007SNOOKER\020\014\022\n\n\006ESPORT\020" +
      "\r\022\017\n\013RUGBY_UNION\020\016\022\014\n\010BASEBALL\020\017B/P\001Z+gi" +
      "thub.com/frontend210/protobuf/gorpcli" +
      "bb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sts.rpclib.Languages.getDescriptor(),
        });
    internal_static_com_sts_rpclib_SportMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sts_rpclib_SportMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_SportMessage_descriptor,
        new java.lang.String[] { "Sport", "Name", });
    com.sts.rpclib.Languages.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
