// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player_profile.proto

package com.sts.rpclib;

public interface PlayerMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sts.rpclib.PlayerMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  java.util.List<com.sts.rpclib.LocalizedName> 
      getNameList();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  com.sts.rpclib.LocalizedName getName(int index);
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  int getNameCount();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  java.util.List<? extends com.sts.rpclib.LocalizedNameOrBuilder> 
      getNameOrBuilderList();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  com.sts.rpclib.LocalizedNameOrBuilder getNameOrBuilder(
      int index);

  /**
   * <code>int64 dateOfBirth = 3;</code>
   * @return The dateOfBirth.
   */
  long getDateOfBirth();

  /**
   * <code>double height = 4;</code>
   * @return The height.
   */
  double getHeight();

  /**
   * <code>double weight = 5;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>.com.sts.rpclib.ParticipantPosition position = 6;</code>
   * @return The enum numeric value on the wire for position.
   */
  int getPositionValue();
  /**
   * <code>.com.sts.rpclib.ParticipantPosition position = 6;</code>
   * @return The position.
   */
  com.sts.rpclib.ParticipantPosition getPosition();
}
