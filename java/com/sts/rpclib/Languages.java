// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: languages.proto

package com.sts.rpclib;

public final class Languages {
  private Languages() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_LocalizedName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_LocalizedName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017languages.proto\022\016com.sts.rpclib\"Z\n\rLoc" +
      "alizedName\022*\n\010language\030\001 \001(\0162\030.com.sts.r" +
      "pclib.Language\022\r\n\005value\030\002 \001(\t\022\016\n\006manual\030" +
      "\003 \001(\005*\320\001\n\010Language\022\024\n\020UNKNOWN_LANGUAGE\020\000" +
      "\022\013\n\007ENGLISH\020\001\022\n\n\006DANISH\020\002\022\013\n\007RUSSIAN\020\003\022\n" +
      "\n\006GERMAN\020\004\022\013\n\007ITALIAN\020\005\022\013\n\007SPANISH\020\006\022\t\n\005" +
      "CZECH\020\007\022\n\n\006FRENCH\020\010\022\n\n\006ARABIC\020\t\022\016\n\nPORTU" +
      "GUESE\020\n\022\t\n\005DUTCH\020\013\022\013\n\007SWEDISH\020\014\022\014\n\010JAPAN" +
      "ESE\020\r\022\t\n\005HINDI\020\016*\'\n\nLocaleType\022\r\n\tAUTOMA" +
      "TIC\020\000\022\n\n\006MANUAL\020\001B/P\001Z+github.com/snapsc" +
      "oregroup/protobuf/gorpclibb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_sts_rpclib_LocalizedName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sts_rpclib_LocalizedName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_LocalizedName_descriptor,
        new java.lang.String[] { "Language", "Value", "Manual", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
