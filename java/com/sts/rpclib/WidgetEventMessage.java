// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: widget_event.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.WidgetEventMessage}
 */
public final class WidgetEventMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.WidgetEventMessage)
    WidgetEventMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WidgetEventMessage.newBuilder() to construct.
  private WidgetEventMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WidgetEventMessage() {
    id_ = "";
    eventType_ = 0;
    refEventId_ = "";
    zone_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WidgetEventMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WidgetEventMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            eventType_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            refEventId_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            zone_ = rawValue;
            break;
          }
          case 40: {

            timestamp_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.WidgetEvent.internal_static_com_sts_rpclib_WidgetEventMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.WidgetEvent.internal_static_com_sts_rpclib_WidgetEventMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.WidgetEventMessage.class, com.sts.rpclib.WidgetEventMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENTTYPE_FIELD_NUMBER = 2;
  private int eventType_;
  /**
   * <code>.com.sts.rpclib.WidgetEventType eventType = 2;</code>
   * @return The enum numeric value on the wire for eventType.
   */
  @java.lang.Override public int getEventTypeValue() {
    return eventType_;
  }
  /**
   * <code>.com.sts.rpclib.WidgetEventType eventType = 2;</code>
   * @return The eventType.
   */
  @java.lang.Override public com.sts.rpclib.WidgetEventType getEventType() {
    @SuppressWarnings("deprecation")
    com.sts.rpclib.WidgetEventType result = com.sts.rpclib.WidgetEventType.valueOf(eventType_);
    return result == null ? com.sts.rpclib.WidgetEventType.UNRECOGNIZED : result;
  }

  public static final int REFEVENTID_FIELD_NUMBER = 3;
  private volatile java.lang.Object refEventId_;
  /**
   * <code>string refEventId = 3;</code>
   * @return The refEventId.
   */
  @java.lang.Override
  public java.lang.String getRefEventId() {
    java.lang.Object ref = refEventId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      refEventId_ = s;
      return s;
    }
  }
  /**
   * <code>string refEventId = 3;</code>
   * @return The bytes for refEventId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRefEventIdBytes() {
    java.lang.Object ref = refEventId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      refEventId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 4;
  private int zone_;
  /**
   * <code>.com.sts.rpclib.PitchZone zone = 4;</code>
   * @return The enum numeric value on the wire for zone.
   */
  @java.lang.Override public int getZoneValue() {
    return zone_;
  }
  /**
   * <code>.com.sts.rpclib.PitchZone zone = 4;</code>
   * @return The zone.
   */
  @java.lang.Override public com.sts.rpclib.PitchZone getZone() {
    @SuppressWarnings("deprecation")
    com.sts.rpclib.PitchZone result = com.sts.rpclib.PitchZone.valueOf(zone_);
    return result == null ? com.sts.rpclib.PitchZone.UNRECOGNIZED : result;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 5;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 5;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (eventType_ != com.sts.rpclib.WidgetEventType.UNKNOWN_WIDGET_EVENT.getNumber()) {
      output.writeEnum(2, eventType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(refEventId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, refEventId_);
    }
    if (zone_ != com.sts.rpclib.PitchZone.UNKNOWN_PITCH_ZONE.getNumber()) {
      output.writeEnum(4, zone_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(5, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (eventType_ != com.sts.rpclib.WidgetEventType.UNKNOWN_WIDGET_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, eventType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(refEventId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, refEventId_);
    }
    if (zone_ != com.sts.rpclib.PitchZone.UNKNOWN_PITCH_ZONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, zone_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, timestamp_);
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
    if (!(obj instanceof com.sts.rpclib.WidgetEventMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.WidgetEventMessage other = (com.sts.rpclib.WidgetEventMessage) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (eventType_ != other.eventType_) return false;
    if (!getRefEventId()
        .equals(other.getRefEventId())) return false;
    if (zone_ != other.zone_) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + EVENTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + eventType_;
    hash = (37 * hash) + REFEVENTID_FIELD_NUMBER;
    hash = (53 * hash) + getRefEventId().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + zone_;
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.WidgetEventMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.WidgetEventMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.WidgetEventMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.WidgetEventMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.WidgetEventMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.WidgetEventMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.WidgetEventMessage)
      com.sts.rpclib.WidgetEventMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.WidgetEvent.internal_static_com_sts_rpclib_WidgetEventMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.WidgetEvent.internal_static_com_sts_rpclib_WidgetEventMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.WidgetEventMessage.class, com.sts.rpclib.WidgetEventMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.WidgetEventMessage.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      eventType_ = 0;

      refEventId_ = "";

      zone_ = 0;

      timestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.WidgetEvent.internal_static_com_sts_rpclib_WidgetEventMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.WidgetEventMessage getDefaultInstanceForType() {
      return com.sts.rpclib.WidgetEventMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.WidgetEventMessage build() {
      com.sts.rpclib.WidgetEventMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.WidgetEventMessage buildPartial() {
      com.sts.rpclib.WidgetEventMessage result = new com.sts.rpclib.WidgetEventMessage(this);
      result.id_ = id_;
      result.eventType_ = eventType_;
      result.refEventId_ = refEventId_;
      result.zone_ = zone_;
      result.timestamp_ = timestamp_;
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
      if (other instanceof com.sts.rpclib.WidgetEventMessage) {
        return mergeFrom((com.sts.rpclib.WidgetEventMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.WidgetEventMessage other) {
      if (other == com.sts.rpclib.WidgetEventMessage.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.eventType_ != 0) {
        setEventTypeValue(other.getEventTypeValue());
      }
      if (!other.getRefEventId().isEmpty()) {
        refEventId_ = other.refEventId_;
        onChanged();
      }
      if (other.zone_ != 0) {
        setZoneValue(other.getZoneValue());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
      com.sts.rpclib.WidgetEventMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.WidgetEventMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private int eventType_ = 0;
    /**
     * <code>.com.sts.rpclib.WidgetEventType eventType = 2;</code>
     * @return The enum numeric value on the wire for eventType.
     */
    @java.lang.Override public int getEventTypeValue() {
      return eventType_;
    }
    /**
     * <code>.com.sts.rpclib.WidgetEventType eventType = 2;</code>
     * @param value The enum numeric value on the wire for eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventTypeValue(int value) {
      
      eventType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.WidgetEventType eventType = 2;</code>
     * @return The eventType.
     */
    @java.lang.Override
    public com.sts.rpclib.WidgetEventType getEventType() {
      @SuppressWarnings("deprecation")
      com.sts.rpclib.WidgetEventType result = com.sts.rpclib.WidgetEventType.valueOf(eventType_);
      return result == null ? com.sts.rpclib.WidgetEventType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.sts.rpclib.WidgetEventType eventType = 2;</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(com.sts.rpclib.WidgetEventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      eventType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.WidgetEventType eventType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      
      eventType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object refEventId_ = "";
    /**
     * <code>string refEventId = 3;</code>
     * @return The refEventId.
     */
    public java.lang.String getRefEventId() {
      java.lang.Object ref = refEventId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        refEventId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string refEventId = 3;</code>
     * @return The bytes for refEventId.
     */
    public com.google.protobuf.ByteString
        getRefEventIdBytes() {
      java.lang.Object ref = refEventId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        refEventId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string refEventId = 3;</code>
     * @param value The refEventId to set.
     * @return This builder for chaining.
     */
    public Builder setRefEventId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      refEventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string refEventId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRefEventId() {
      
      refEventId_ = getDefaultInstance().getRefEventId();
      onChanged();
      return this;
    }
    /**
     * <code>string refEventId = 3;</code>
     * @param value The bytes for refEventId to set.
     * @return This builder for chaining.
     */
    public Builder setRefEventIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      refEventId_ = value;
      onChanged();
      return this;
    }

    private int zone_ = 0;
    /**
     * <code>.com.sts.rpclib.PitchZone zone = 4;</code>
     * @return The enum numeric value on the wire for zone.
     */
    @java.lang.Override public int getZoneValue() {
      return zone_;
    }
    /**
     * <code>.com.sts.rpclib.PitchZone zone = 4;</code>
     * @param value The enum numeric value on the wire for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneValue(int value) {
      
      zone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.PitchZone zone = 4;</code>
     * @return The zone.
     */
    @java.lang.Override
    public com.sts.rpclib.PitchZone getZone() {
      @SuppressWarnings("deprecation")
      com.sts.rpclib.PitchZone result = com.sts.rpclib.PitchZone.valueOf(zone_);
      return result == null ? com.sts.rpclib.PitchZone.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.sts.rpclib.PitchZone zone = 4;</code>
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(com.sts.rpclib.PitchZone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      zone_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.PitchZone zone = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      
      zone_ = 0;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 5;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 5;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.WidgetEventMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.WidgetEventMessage)
  private static final com.sts.rpclib.WidgetEventMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.WidgetEventMessage();
  }

  public static com.sts.rpclib.WidgetEventMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WidgetEventMessage>
      PARSER = new com.google.protobuf.AbstractParser<WidgetEventMessage>() {
    @java.lang.Override
    public WidgetEventMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WidgetEventMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WidgetEventMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WidgetEventMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.WidgetEventMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

