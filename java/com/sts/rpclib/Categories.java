// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: categories.proto

package com.sts.rpclib;

public final class Categories {
  private Categories() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_SportCategoryMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_SportCategoryMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_CategoryMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_CategoryMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020categories.proto\022\016com.sts.rpclib\032\014spor" +
      "ts.proto\032\017languages.proto\"\177\n\024SportCatego" +
      "ryMessage\022\016\n\006season\030\001 \001(\t\022$\n\005sport\030\002 \001(\016" +
      "2\025.com.sts.rpclib.Sport\0221\n\010category\030\003 \003(" +
      "\0132\037.com.sts.rpclib.CategoryMessage\"\221\001\n\017C" +
      "ategoryMessage\022\n\n\002id\030\001 \001(\t\022\016\n\006season\030\002 \001" +
      "(\t\022$\n\005sport\030\003 \001(\0162\025.com.sts.rpclib.Sport" +
      "\022+\n\004name\030\004 \003(\0132\035.com.sts.rpclib.Localize" +
      "dName\022\017\n\007updated\030\005 \001(\003B/P\001Z+github.com/s" +
      "napscoregroup/protobuf/gorpclibb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sts.rpclib.Sports.getDescriptor(),
          com.sts.rpclib.Languages.getDescriptor(),
        });
    internal_static_com_sts_rpclib_SportCategoryMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sts_rpclib_SportCategoryMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_SportCategoryMessage_descriptor,
        new java.lang.String[] { "Season", "Sport", "Category", });
    internal_static_com_sts_rpclib_CategoryMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sts_rpclib_CategoryMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_CategoryMessage_descriptor,
        new java.lang.String[] { "Id", "Season", "Sport", "Name", "Updated", });
    com.sts.rpclib.Sports.getDescriptor();
    com.sts.rpclib.Languages.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
