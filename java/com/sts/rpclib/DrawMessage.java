// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: draw.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.DrawMessage}
 */
public final class DrawMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.DrawMessage)
    DrawMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DrawMessage.newBuilder() to construct.
  private DrawMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DrawMessage() {
    stageId_ = "";
    season_ = "";
    drawType_ = 0;
    drawEvents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DrawMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.DrawMessage.class, com.sts.rpclib.DrawMessage.Builder.class);
  }

  public static final int STAGEID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object stageId_ = "";
  /**
   * <code>string stageId = 1;</code>
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
   * <code>string stageId = 1;</code>
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

  public static final int SEASON_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object season_ = "";
  /**
   * <code>string season = 2;</code>
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
   * <code>string season = 2;</code>
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

  public static final int DRAWTYPE_FIELD_NUMBER = 3;
  private int drawType_ = 0;
  /**
   * <code>.com.sts.rpclib.EventType drawType = 3;</code>
   * @return The enum numeric value on the wire for drawType.
   */
  @java.lang.Override public int getDrawTypeValue() {
    return drawType_;
  }
  /**
   * <code>.com.sts.rpclib.EventType drawType = 3;</code>
   * @return The drawType.
   */
  @java.lang.Override public com.sts.rpclib.EventType getDrawType() {
    com.sts.rpclib.EventType result = com.sts.rpclib.EventType.forNumber(drawType_);
    return result == null ? com.sts.rpclib.EventType.UNRECOGNIZED : result;
  }

  public static final int DRAWEVENTS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<com.sts.rpclib.DrawEventMessage> drawEvents_;
  /**
   * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
   */
  @java.lang.Override
  public java.util.List<com.sts.rpclib.DrawEventMessage> getDrawEventsList() {
    return drawEvents_;
  }
  /**
   * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sts.rpclib.DrawEventMessageOrBuilder> 
      getDrawEventsOrBuilderList() {
    return drawEvents_;
  }
  /**
   * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
   */
  @java.lang.Override
  public int getDrawEventsCount() {
    return drawEvents_.size();
  }
  /**
   * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.DrawEventMessage getDrawEvents(int index) {
    return drawEvents_.get(index);
  }
  /**
   * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.DrawEventMessageOrBuilder getDrawEventsOrBuilder(
      int index) {
    return drawEvents_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(season_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, season_);
    }
    if (drawType_ != com.sts.rpclib.EventType.UNKNOWN_EVENT.getNumber()) {
      output.writeEnum(3, drawType_);
    }
    for (int i = 0; i < drawEvents_.size(); i++) {
      output.writeMessage(4, drawEvents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(season_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, season_);
    }
    if (drawType_ != com.sts.rpclib.EventType.UNKNOWN_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, drawType_);
    }
    for (int i = 0; i < drawEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, drawEvents_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sts.rpclib.DrawMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.DrawMessage other = (com.sts.rpclib.DrawMessage) obj;

    if (!getStageId()
        .equals(other.getStageId())) return false;
    if (!getSeason()
        .equals(other.getSeason())) return false;
    if (drawType_ != other.drawType_) return false;
    if (!getDrawEventsList()
        .equals(other.getDrawEventsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STAGEID_FIELD_NUMBER;
    hash = (53 * hash) + getStageId().hashCode();
    hash = (37 * hash) + SEASON_FIELD_NUMBER;
    hash = (53 * hash) + getSeason().hashCode();
    hash = (37 * hash) + DRAWTYPE_FIELD_NUMBER;
    hash = (53 * hash) + drawType_;
    if (getDrawEventsCount() > 0) {
      hash = (37 * hash) + DRAWEVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getDrawEventsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.DrawMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sts.rpclib.DrawMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sts.rpclib.DrawMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.DrawMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.DrawMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.DrawMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.DrawMessage)
      com.sts.rpclib.DrawMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.DrawMessage.class, com.sts.rpclib.DrawMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.DrawMessage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      stageId_ = "";
      season_ = "";
      drawType_ = 0;
      if (drawEventsBuilder_ == null) {
        drawEvents_ = java.util.Collections.emptyList();
      } else {
        drawEvents_ = null;
        drawEventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.DrawMessage getDefaultInstanceForType() {
      return com.sts.rpclib.DrawMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.DrawMessage build() {
      com.sts.rpclib.DrawMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.DrawMessage buildPartial() {
      com.sts.rpclib.DrawMessage result = new com.sts.rpclib.DrawMessage(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.sts.rpclib.DrawMessage result) {
      if (drawEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          drawEvents_ = java.util.Collections.unmodifiableList(drawEvents_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.drawEvents_ = drawEvents_;
      } else {
        result.drawEvents_ = drawEventsBuilder_.build();
      }
    }

    private void buildPartial0(com.sts.rpclib.DrawMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.stageId_ = stageId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.season_ = season_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.drawType_ = drawType_;
      }
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
      if (other instanceof com.sts.rpclib.DrawMessage) {
        return mergeFrom((com.sts.rpclib.DrawMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.DrawMessage other) {
      if (other == com.sts.rpclib.DrawMessage.getDefaultInstance()) return this;
      if (!other.getStageId().isEmpty()) {
        stageId_ = other.stageId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSeason().isEmpty()) {
        season_ = other.season_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.drawType_ != 0) {
        setDrawTypeValue(other.getDrawTypeValue());
      }
      if (drawEventsBuilder_ == null) {
        if (!other.drawEvents_.isEmpty()) {
          if (drawEvents_.isEmpty()) {
            drawEvents_ = other.drawEvents_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureDrawEventsIsMutable();
            drawEvents_.addAll(other.drawEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.drawEvents_.isEmpty()) {
          if (drawEventsBuilder_.isEmpty()) {
            drawEventsBuilder_.dispose();
            drawEventsBuilder_ = null;
            drawEvents_ = other.drawEvents_;
            bitField0_ = (bitField0_ & ~0x00000008);
            drawEventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDrawEventsFieldBuilder() : null;
          } else {
            drawEventsBuilder_.addAllMessages(other.drawEvents_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              stageId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              season_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              drawType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              com.sts.rpclib.DrawEventMessage m =
                  input.readMessage(
                      com.sts.rpclib.DrawEventMessage.parser(),
                      extensionRegistry);
              if (drawEventsBuilder_ == null) {
                ensureDrawEventsIsMutable();
                drawEvents_.add(m);
              } else {
                drawEventsBuilder_.addMessage(m);
              }
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object stageId_ = "";
    /**
     * <code>string stageId = 1;</code>
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
     * <code>string stageId = 1;</code>
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
     * <code>string stageId = 1;</code>
     * @param value The stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      stageId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string stageId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStageId() {
      stageId_ = getDefaultInstance().getStageId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string stageId = 1;</code>
     * @param value The bytes for stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      stageId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object season_ = "";
    /**
     * <code>string season = 2;</code>
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
     * <code>string season = 2;</code>
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
     * <code>string season = 2;</code>
     * @param value The season to set.
     * @return This builder for chaining.
     */
    public Builder setSeason(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      season_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string season = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeason() {
      season_ = getDefaultInstance().getSeason();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string season = 2;</code>
     * @param value The bytes for season to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      season_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int drawType_ = 0;
    /**
     * <code>.com.sts.rpclib.EventType drawType = 3;</code>
     * @return The enum numeric value on the wire for drawType.
     */
    @java.lang.Override public int getDrawTypeValue() {
      return drawType_;
    }
    /**
     * <code>.com.sts.rpclib.EventType drawType = 3;</code>
     * @param value The enum numeric value on the wire for drawType to set.
     * @return This builder for chaining.
     */
    public Builder setDrawTypeValue(int value) {
      drawType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.EventType drawType = 3;</code>
     * @return The drawType.
     */
    @java.lang.Override
    public com.sts.rpclib.EventType getDrawType() {
      com.sts.rpclib.EventType result = com.sts.rpclib.EventType.forNumber(drawType_);
      return result == null ? com.sts.rpclib.EventType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.sts.rpclib.EventType drawType = 3;</code>
     * @param value The drawType to set.
     * @return This builder for chaining.
     */
    public Builder setDrawType(com.sts.rpclib.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      drawType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.EventType drawType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDrawType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      drawType_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.sts.rpclib.DrawEventMessage> drawEvents_ =
      java.util.Collections.emptyList();
    private void ensureDrawEventsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        drawEvents_ = new java.util.ArrayList<com.sts.rpclib.DrawEventMessage>(drawEvents_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.DrawEventMessage, com.sts.rpclib.DrawEventMessage.Builder, com.sts.rpclib.DrawEventMessageOrBuilder> drawEventsBuilder_;

    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public java.util.List<com.sts.rpclib.DrawEventMessage> getDrawEventsList() {
      if (drawEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(drawEvents_);
      } else {
        return drawEventsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public int getDrawEventsCount() {
      if (drawEventsBuilder_ == null) {
        return drawEvents_.size();
      } else {
        return drawEventsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public com.sts.rpclib.DrawEventMessage getDrawEvents(int index) {
      if (drawEventsBuilder_ == null) {
        return drawEvents_.get(index);
      } else {
        return drawEventsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder setDrawEvents(
        int index, com.sts.rpclib.DrawEventMessage value) {
      if (drawEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDrawEventsIsMutable();
        drawEvents_.set(index, value);
        onChanged();
      } else {
        drawEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder setDrawEvents(
        int index, com.sts.rpclib.DrawEventMessage.Builder builderForValue) {
      if (drawEventsBuilder_ == null) {
        ensureDrawEventsIsMutable();
        drawEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        drawEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder addDrawEvents(com.sts.rpclib.DrawEventMessage value) {
      if (drawEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDrawEventsIsMutable();
        drawEvents_.add(value);
        onChanged();
      } else {
        drawEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder addDrawEvents(
        int index, com.sts.rpclib.DrawEventMessage value) {
      if (drawEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDrawEventsIsMutable();
        drawEvents_.add(index, value);
        onChanged();
      } else {
        drawEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder addDrawEvents(
        com.sts.rpclib.DrawEventMessage.Builder builderForValue) {
      if (drawEventsBuilder_ == null) {
        ensureDrawEventsIsMutable();
        drawEvents_.add(builderForValue.build());
        onChanged();
      } else {
        drawEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder addDrawEvents(
        int index, com.sts.rpclib.DrawEventMessage.Builder builderForValue) {
      if (drawEventsBuilder_ == null) {
        ensureDrawEventsIsMutable();
        drawEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        drawEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder addAllDrawEvents(
        java.lang.Iterable<? extends com.sts.rpclib.DrawEventMessage> values) {
      if (drawEventsBuilder_ == null) {
        ensureDrawEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, drawEvents_);
        onChanged();
      } else {
        drawEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder clearDrawEvents() {
      if (drawEventsBuilder_ == null) {
        drawEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        drawEventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public Builder removeDrawEvents(int index) {
      if (drawEventsBuilder_ == null) {
        ensureDrawEventsIsMutable();
        drawEvents_.remove(index);
        onChanged();
      } else {
        drawEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public com.sts.rpclib.DrawEventMessage.Builder getDrawEventsBuilder(
        int index) {
      return getDrawEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public com.sts.rpclib.DrawEventMessageOrBuilder getDrawEventsOrBuilder(
        int index) {
      if (drawEventsBuilder_ == null) {
        return drawEvents_.get(index);  } else {
        return drawEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public java.util.List<? extends com.sts.rpclib.DrawEventMessageOrBuilder> 
         getDrawEventsOrBuilderList() {
      if (drawEventsBuilder_ != null) {
        return drawEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(drawEvents_);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public com.sts.rpclib.DrawEventMessage.Builder addDrawEventsBuilder() {
      return getDrawEventsFieldBuilder().addBuilder(
          com.sts.rpclib.DrawEventMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public com.sts.rpclib.DrawEventMessage.Builder addDrawEventsBuilder(
        int index) {
      return getDrawEventsFieldBuilder().addBuilder(
          index, com.sts.rpclib.DrawEventMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.DrawEventMessage drawEvents = 4;</code>
     */
    public java.util.List<com.sts.rpclib.DrawEventMessage.Builder> 
         getDrawEventsBuilderList() {
      return getDrawEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.DrawEventMessage, com.sts.rpclib.DrawEventMessage.Builder, com.sts.rpclib.DrawEventMessageOrBuilder> 
        getDrawEventsFieldBuilder() {
      if (drawEventsBuilder_ == null) {
        drawEventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sts.rpclib.DrawEventMessage, com.sts.rpclib.DrawEventMessage.Builder, com.sts.rpclib.DrawEventMessageOrBuilder>(
                drawEvents_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        drawEvents_ = null;
      }
      return drawEventsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.DrawMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.DrawMessage)
  private static final com.sts.rpclib.DrawMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.DrawMessage();
  }

  public static com.sts.rpclib.DrawMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DrawMessage>
      PARSER = new com.google.protobuf.AbstractParser<DrawMessage>() {
    @java.lang.Override
    public DrawMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DrawMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DrawMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.DrawMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

