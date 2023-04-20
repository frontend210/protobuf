// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: top_scorer.proto

package com.sts.rpclib;

public final class TopScorer {
  private TopScorer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_TopScorerEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_TopScorerEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_TopScorerMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_TopScorerMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_TopScorerFullMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_TopScorerFullMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020top_scorer.proto\022\016com.sts.rpclib\032\014spor" +
      "ts.proto\032\017languages.proto\"\200\002\n\016TopScorerE" +
      "ntry\022\017\n\007ranking\030\001 \001(\005\022\021\n\tplayer_id\030\002 \001(\t" +
      "\0222\n\013player_name\030\003 \003(\0132\035.com.sts.rpclib.L" +
      "ocalizedName\022\r\n\005goals\030\004 \001(\t\022\021\n\tpenalties" +
      "\030\005 \001(\t\022\024\n\014first_scorer\030\006 \001(\t\022\025\n\rparticip" +
      "antId\030\007 \001(\t\0226\n\017participantName\030\010 \003(\0132\035.c" +
      "om.sts.rpclib.LocalizedName\022\017\n\007assists\030\t" +
      " \001(\t\"\205\002\n\020TopScorerMessage\022\022\n\ncategoryId\030" +
      "\001 \001(\t\0223\n\014categoryName\030\002 \003(\0132\035.com.sts.rp" +
      "clib.LocalizedName\022\017\n\007stageId\030\003 \001(\t\0220\n\ts" +
      "tageName\030\004 \003(\0132\035.com.sts.rpclib.Localize" +
      "dName\022/\n\007entries\030\005 \003(\0132\036.com.sts.rpclib." +
      "TopScorerEntry\022$\n\005sport\030\006 \001(\0162\025.com.sts." +
      "rpclib.Sport\022\016\n\006season\030\007 \001(\t\"$\n\024TopScore" +
      "rFullMessage\022\014\n\004data\030\001 \001(\014B\rP\001Z\t/gorpcli" +
      "bb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sts.rpclib.Sports.getDescriptor(),
          com.sts.rpclib.Languages.getDescriptor(),
        });
    internal_static_com_sts_rpclib_TopScorerEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sts_rpclib_TopScorerEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_TopScorerEntry_descriptor,
        new java.lang.String[] { "Ranking", "PlayerId", "PlayerName", "Goals", "Penalties", "FirstScorer", "ParticipantId", "ParticipantName", "Assists", });
    internal_static_com_sts_rpclib_TopScorerMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sts_rpclib_TopScorerMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_TopScorerMessage_descriptor,
        new java.lang.String[] { "CategoryId", "CategoryName", "StageId", "StageName", "Entries", "Sport", "Season", });
    internal_static_com_sts_rpclib_TopScorerFullMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_sts_rpclib_TopScorerFullMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_TopScorerFullMessage_descriptor,
        new java.lang.String[] { "Data", });
    com.sts.rpclib.Sports.getDescriptor();
    com.sts.rpclib.Languages.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}