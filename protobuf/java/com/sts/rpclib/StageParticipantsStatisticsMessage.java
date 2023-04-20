// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stages.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.StageParticipantsStatisticsMessage}
 */
public final class StageParticipantsStatisticsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.StageParticipantsStatisticsMessage)
    StageParticipantsStatisticsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StageParticipantsStatisticsMessage.newBuilder() to construct.
  private StageParticipantsStatisticsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StageParticipantsStatisticsMessage() {
    participants_ = java.util.Collections.emptyList();
    stageId_ = "";
    season_ = "";
    sport_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StageParticipantsStatisticsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StageParticipantsStatisticsMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              participants_ = new java.util.ArrayList<com.sts.rpclib.ParticipantMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            participants_.add(
                input.readMessage(com.sts.rpclib.ParticipantMessage.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            stageId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            season_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            sport_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        participants_ = java.util.Collections.unmodifiableList(participants_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Stages.internal_static_com_sts_rpclib_StageParticipantsStatisticsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Stages.internal_static_com_sts_rpclib_StageParticipantsStatisticsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.StageParticipantsStatisticsMessage.class, com.sts.rpclib.StageParticipantsStatisticsMessage.Builder.class);
  }

  public static final int PARTICIPANTS_FIELD_NUMBER = 1;
  private java.util.List<com.sts.rpclib.ParticipantMessage> participants_;
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.sts.rpclib.ParticipantMessage> getParticipantsList() {
    return participants_;
  }
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sts.rpclib.ParticipantMessageOrBuilder> 
      getParticipantsOrBuilderList() {
    return participants_;
  }
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  @java.lang.Override
  public int getParticipantsCount() {
    return participants_.size();
  }
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.ParticipantMessage getParticipants(int index) {
    return participants_.get(index);
  }
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.ParticipantMessageOrBuilder getParticipantsOrBuilder(
      int index) {
    return participants_.get(index);
  }

  public static final int STAGEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object stageId_;
  /**
   * <code>string stageId = 2;</code>
   * @return The stageId.
   */
  @java.lang.Override
  public java.lang.String getStageId() {
    java.lang.Object ref = stageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stageId_ = s;
      return s;
    }
  }
  /**
   * <code>string stageId = 2;</code>
   * @return The bytes for stageId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStageIdBytes() {
    java.lang.Object ref = stageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEASON_FIELD_NUMBER = 3;
  private volatile java.lang.Object season_;
  /**
   * <code>string season = 3;</code>
   * @return The season.
   */
  @java.lang.Override
  public java.lang.String getSeason() {
    java.lang.Object ref = season_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      season_ = s;
      return s;
    }
  }
  /**
   * <code>string season = 3;</code>
   * @return The bytes for season.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSeasonBytes() {
    java.lang.Object ref = season_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      season_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPORT_FIELD_NUMBER = 4;
  private int sport_;
  /**
   * <code>.com.sts.rpclib.Sport sport = 4;</code>
   * @return The enum numeric value on the wire for sport.
   */
  @java.lang.Override public int getSportValue() {
    return sport_;
  }
  /**
   * <code>.com.sts.rpclib.Sport sport = 4;</code>
   * @return The sport.
   */
  @java.lang.Override public com.sts.rpclib.Sport getSport() {
    @SuppressWarnings("deprecation")
    com.sts.rpclib.Sport result = com.sts.rpclib.Sport.valueOf(sport_);
    return result == null ? com.sts.rpclib.Sport.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < participants_.size(); i++) {
      output.writeMessage(1, participants_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(season_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, season_);
    }
    if (sport_ != com.sts.rpclib.Sport.UNKNOWN_SPORT.getNumber()) {
      output.writeEnum(4, sport_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < participants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, participants_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(season_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, season_);
    }
    if (sport_ != com.sts.rpclib.Sport.UNKNOWN_SPORT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, sport_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sts.rpclib.StageParticipantsStatisticsMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.StageParticipantsStatisticsMessage other = (com.sts.rpclib.StageParticipantsStatisticsMessage) obj;

    if (!getParticipantsList()
        .equals(other.getParticipantsList())) return false;
    if (!getStageId()
        .equals(other.getStageId())) return false;
    if (!getSeason()
        .equals(other.getSeason())) return false;
    if (sport_ != other.sport_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getParticipantsCount() > 0) {
      hash = (37 * hash) + PARTICIPANTS_FIELD_NUMBER;
      hash = (53 * hash) + getParticipantsList().hashCode();
    }
    hash = (37 * hash) + STAGEID_FIELD_NUMBER;
    hash = (53 * hash) + getStageId().hashCode();
    hash = (37 * hash) + SEASON_FIELD_NUMBER;
    hash = (53 * hash) + getSeason().hashCode();
    hash = (37 * hash) + SPORT_FIELD_NUMBER;
    hash = (53 * hash) + sport_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.StageParticipantsStatisticsMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.sts.rpclib.StageParticipantsStatisticsMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.sts.rpclib.StageParticipantsStatisticsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.StageParticipantsStatisticsMessage)
      com.sts.rpclib.StageParticipantsStatisticsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Stages.internal_static_com_sts_rpclib_StageParticipantsStatisticsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Stages.internal_static_com_sts_rpclib_StageParticipantsStatisticsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.StageParticipantsStatisticsMessage.class, com.sts.rpclib.StageParticipantsStatisticsMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.StageParticipantsStatisticsMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getParticipantsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (participantsBuilder_ == null) {
        participants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        participantsBuilder_.clear();
      }
      stageId_ = "";

      season_ = "";

      sport_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Stages.internal_static_com_sts_rpclib_StageParticipantsStatisticsMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.StageParticipantsStatisticsMessage getDefaultInstanceForType() {
      return com.sts.rpclib.StageParticipantsStatisticsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.StageParticipantsStatisticsMessage build() {
      com.sts.rpclib.StageParticipantsStatisticsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.StageParticipantsStatisticsMessage buildPartial() {
      com.sts.rpclib.StageParticipantsStatisticsMessage result = new com.sts.rpclib.StageParticipantsStatisticsMessage(this);
      int from_bitField0_ = bitField0_;
      if (participantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          participants_ = java.util.Collections.unmodifiableList(participants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.participants_ = participants_;
      } else {
        result.participants_ = participantsBuilder_.build();
      }
      result.stageId_ = stageId_;
      result.season_ = season_;
      result.sport_ = sport_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sts.rpclib.StageParticipantsStatisticsMessage) {
        return mergeFrom((com.sts.rpclib.StageParticipantsStatisticsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.StageParticipantsStatisticsMessage other) {
      if (other == com.sts.rpclib.StageParticipantsStatisticsMessage.getDefaultInstance()) return this;
      if (participantsBuilder_ == null) {
        if (!other.participants_.isEmpty()) {
          if (participants_.isEmpty()) {
            participants_ = other.participants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParticipantsIsMutable();
            participants_.addAll(other.participants_);
          }
          onChanged();
        }
      } else {
        if (!other.participants_.isEmpty()) {
          if (participantsBuilder_.isEmpty()) {
            participantsBuilder_.dispose();
            participantsBuilder_ = null;
            participants_ = other.participants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            participantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParticipantsFieldBuilder() : null;
          } else {
            participantsBuilder_.addAllMessages(other.participants_);
          }
        }
      }
      if (!other.getStageId().isEmpty()) {
        stageId_ = other.stageId_;
        onChanged();
      }
      if (!other.getSeason().isEmpty()) {
        season_ = other.season_;
        onChanged();
      }
      if (other.sport_ != 0) {
        setSportValue(other.getSportValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.sts.rpclib.StageParticipantsStatisticsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.StageParticipantsStatisticsMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sts.rpclib.ParticipantMessage> participants_ =
      java.util.Collections.emptyList();
    private void ensureParticipantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        participants_ = new java.util.ArrayList<com.sts.rpclib.ParticipantMessage>(participants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.ParticipantMessage, com.sts.rpclib.ParticipantMessage.Builder, com.sts.rpclib.ParticipantMessageOrBuilder> participantsBuilder_;

    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public java.util.List<com.sts.rpclib.ParticipantMessage> getParticipantsList() {
      if (participantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(participants_);
      } else {
        return participantsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public int getParticipantsCount() {
      if (participantsBuilder_ == null) {
        return participants_.size();
      } else {
        return participantsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public com.sts.rpclib.ParticipantMessage getParticipants(int index) {
      if (participantsBuilder_ == null) {
        return participants_.get(index);
      } else {
        return participantsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder setParticipants(
        int index, com.sts.rpclib.ParticipantMessage value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.set(index, value);
        onChanged();
      } else {
        participantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder setParticipants(
        int index, com.sts.rpclib.ParticipantMessage.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.set(index, builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder addParticipants(com.sts.rpclib.ParticipantMessage value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.add(value);
        onChanged();
      } else {
        participantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder addParticipants(
        int index, com.sts.rpclib.ParticipantMessage value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.add(index, value);
        onChanged();
      } else {
        participantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder addParticipants(
        com.sts.rpclib.ParticipantMessage.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.add(builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder addParticipants(
        int index, com.sts.rpclib.ParticipantMessage.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.add(index, builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder addAllParticipants(
        java.lang.Iterable<? extends com.sts.rpclib.ParticipantMessage> values) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, participants_);
        onChanged();
      } else {
        participantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder clearParticipants() {
      if (participantsBuilder_ == null) {
        participants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        participantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public Builder removeParticipants(int index) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.remove(index);
        onChanged();
      } else {
        participantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public com.sts.rpclib.ParticipantMessage.Builder getParticipantsBuilder(
        int index) {
      return getParticipantsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public com.sts.rpclib.ParticipantMessageOrBuilder getParticipantsOrBuilder(
        int index) {
      if (participantsBuilder_ == null) {
        return participants_.get(index);  } else {
        return participantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public java.util.List<? extends com.sts.rpclib.ParticipantMessageOrBuilder> 
         getParticipantsOrBuilderList() {
      if (participantsBuilder_ != null) {
        return participantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(participants_);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public com.sts.rpclib.ParticipantMessage.Builder addParticipantsBuilder() {
      return getParticipantsFieldBuilder().addBuilder(
          com.sts.rpclib.ParticipantMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public com.sts.rpclib.ParticipantMessage.Builder addParticipantsBuilder(
        int index) {
      return getParticipantsFieldBuilder().addBuilder(
          index, com.sts.rpclib.ParticipantMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
     */
    public java.util.List<com.sts.rpclib.ParticipantMessage.Builder> 
         getParticipantsBuilderList() {
      return getParticipantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.ParticipantMessage, com.sts.rpclib.ParticipantMessage.Builder, com.sts.rpclib.ParticipantMessageOrBuilder> 
        getParticipantsFieldBuilder() {
      if (participantsBuilder_ == null) {
        participantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sts.rpclib.ParticipantMessage, com.sts.rpclib.ParticipantMessage.Builder, com.sts.rpclib.ParticipantMessageOrBuilder>(
                participants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        participants_ = null;
      }
      return participantsBuilder_;
    }

    private java.lang.Object stageId_ = "";
    /**
     * <code>string stageId = 2;</code>
     * @return The stageId.
     */
    public java.lang.String getStageId() {
      java.lang.Object ref = stageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stageId = 2;</code>
     * @return The bytes for stageId.
     */
    public com.google.protobuf.ByteString
        getStageIdBytes() {
      java.lang.Object ref = stageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stageId = 2;</code>
     * @param value The stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stageId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStageId() {
      
      stageId_ = getDefaultInstance().getStageId();
      onChanged();
      return this;
    }
    /**
     * <code>string stageId = 2;</code>
     * @param value The bytes for stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stageId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object season_ = "";
    /**
     * <code>string season = 3;</code>
     * @return The season.
     */
    public java.lang.String getSeason() {
      java.lang.Object ref = season_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        season_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string season = 3;</code>
     * @return The bytes for season.
     */
    public com.google.protobuf.ByteString
        getSeasonBytes() {
      java.lang.Object ref = season_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        season_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string season = 3;</code>
     * @param value The season to set.
     * @return This builder for chaining.
     */
    public Builder setSeason(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      season_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string season = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeason() {
      
      season_ = getDefaultInstance().getSeason();
      onChanged();
      return this;
    }
    /**
     * <code>string season = 3;</code>
     * @param value The bytes for season to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      season_ = value;
      onChanged();
      return this;
    }

    private int sport_ = 0;
    /**
     * <code>.com.sts.rpclib.Sport sport = 4;</code>
     * @return The enum numeric value on the wire for sport.
     */
    @java.lang.Override public int getSportValue() {
      return sport_;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 4;</code>
     * @param value The enum numeric value on the wire for sport to set.
     * @return This builder for chaining.
     */
    public Builder setSportValue(int value) {
      
      sport_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 4;</code>
     * @return The sport.
     */
    @java.lang.Override
    public com.sts.rpclib.Sport getSport() {
      @SuppressWarnings("deprecation")
      com.sts.rpclib.Sport result = com.sts.rpclib.Sport.valueOf(sport_);
      return result == null ? com.sts.rpclib.Sport.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 4;</code>
     * @param value The sport to set.
     * @return This builder for chaining.
     */
    public Builder setSport(com.sts.rpclib.Sport value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      sport_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSport() {
      
      sport_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.StageParticipantsStatisticsMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.StageParticipantsStatisticsMessage)
  private static final com.sts.rpclib.StageParticipantsStatisticsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.StageParticipantsStatisticsMessage();
  }

  public static com.sts.rpclib.StageParticipantsStatisticsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StageParticipantsStatisticsMessage>
      PARSER = new com.google.protobuf.AbstractParser<StageParticipantsStatisticsMessage>() {
    @java.lang.Override
    public StageParticipantsStatisticsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StageParticipantsStatisticsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StageParticipantsStatisticsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StageParticipantsStatisticsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.StageParticipantsStatisticsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
