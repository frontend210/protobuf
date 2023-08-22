// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envelope.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.Headers}
 */
public final class Headers extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.Headers)
    HeadersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Headers.newBuilder() to construct.
  private Headers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Headers() {
    provider_ = 0;
    sport_ = 0;
    matchId_ = "";
    stageId_ = "";
    season_ = "";
    messageType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Headers();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_Headers_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_Headers_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.Headers.class, com.sts.rpclib.Headers.Builder.class);
  }

  public static final int PROVIDER_FIELD_NUMBER = 1;
  private int provider_ = 0;
  /**
   * <pre>
   * the provider
   * </pre>
   *
   * <code>.com.sts.rpclib.Provider provider = 1;</code>
   * @return The enum numeric value on the wire for provider.
   */
  @java.lang.Override public int getProviderValue() {
    return provider_;
  }
  /**
   * <pre>
   * the provider
   * </pre>
   *
   * <code>.com.sts.rpclib.Provider provider = 1;</code>
   * @return The provider.
   */
  @java.lang.Override public com.sts.rpclib.Provider getProvider() {
    com.sts.rpclib.Provider result = com.sts.rpclib.Provider.forNumber(provider_);
    return result == null ? com.sts.rpclib.Provider.UNRECOGNIZED : result;
  }

  public static final int SPORT_FIELD_NUMBER = 2;
  private int sport_ = 0;
  /**
   * <pre>
   * the sport
   * </pre>
   *
   * <code>.com.sts.rpclib.Sport sport = 2;</code>
   * @return The enum numeric value on the wire for sport.
   */
  @java.lang.Override public int getSportValue() {
    return sport_;
  }
  /**
   * <pre>
   * the sport
   * </pre>
   *
   * <code>.com.sts.rpclib.Sport sport = 2;</code>
   * @return The sport.
   */
  @java.lang.Override public com.sts.rpclib.Sport getSport() {
    com.sts.rpclib.Sport result = com.sts.rpclib.Sport.forNumber(sport_);
    return result == null ? com.sts.rpclib.Sport.UNRECOGNIZED : result;
  }

  public static final int MATCHID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object matchId_ = "";
  /**
   * <code>string matchId = 3;</code>
   * @return The matchId.
   */
  @java.lang.Override
  public java.lang.String getMatchId() {
    java.lang.Object ref = matchId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      matchId_ = s;
      return s;
    }
  }
  /**
   * <code>string matchId = 3;</code>
   * @return The bytes for matchId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMatchIdBytes() {
    java.lang.Object ref = matchId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      matchId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STAGEID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object stageId_ = "";
  /**
   * <code>string stageId = 4;</code>
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
   * <code>string stageId = 4;</code>
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

  public static final int SEASON_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object season_ = "";
  /**
   * <code>string season = 5;</code>
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
   * <code>string season = 5;</code>
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

  public static final int TIMESTAMP_FIELD_NUMBER = 6;
  private long timestamp_ = 0L;
  /**
   * <pre>
   * timestamp of when the message was created
   * </pre>
   *
   * <code>int64 timestamp = 6;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int MESSAGE_TYPE_FIELD_NUMBER = 7;
  private int messageType_ = 0;
  /**
   * <pre>
   * the type of message the body of the envelope contains
   * </pre>
   *
   * <code>.com.sts.rpclib.MessageType message_type = 7;</code>
   * @return The enum numeric value on the wire for messageType.
   */
  @java.lang.Override public int getMessageTypeValue() {
    return messageType_;
  }
  /**
   * <pre>
   * the type of message the body of the envelope contains
   * </pre>
   *
   * <code>.com.sts.rpclib.MessageType message_type = 7;</code>
   * @return The messageType.
   */
  @java.lang.Override public com.sts.rpclib.MessageType getMessageType() {
    com.sts.rpclib.MessageType result = com.sts.rpclib.MessageType.forNumber(messageType_);
    return result == null ? com.sts.rpclib.MessageType.UNRECOGNIZED : result;
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
    if (provider_ != com.sts.rpclib.Provider.UNKNOWN_PROVIDER.getNumber()) {
      output.writeEnum(1, provider_);
    }
    if (sport_ != com.sts.rpclib.Sport.UNKNOWN_SPORT.getNumber()) {
      output.writeEnum(2, sport_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(matchId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, matchId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, stageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(season_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, season_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(6, timestamp_);
    }
    if (messageType_ != com.sts.rpclib.MessageType.UNKNOWN_MESSAGE.getNumber()) {
      output.writeEnum(7, messageType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (provider_ != com.sts.rpclib.Provider.UNKNOWN_PROVIDER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, provider_);
    }
    if (sport_ != com.sts.rpclib.Sport.UNKNOWN_SPORT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, sport_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(matchId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, matchId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, stageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(season_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, season_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, timestamp_);
    }
    if (messageType_ != com.sts.rpclib.MessageType.UNKNOWN_MESSAGE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, messageType_);
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
    if (!(obj instanceof com.sts.rpclib.Headers)) {
      return super.equals(obj);
    }
    com.sts.rpclib.Headers other = (com.sts.rpclib.Headers) obj;

    if (provider_ != other.provider_) return false;
    if (sport_ != other.sport_) return false;
    if (!getMatchId()
        .equals(other.getMatchId())) return false;
    if (!getStageId()
        .equals(other.getStageId())) return false;
    if (!getSeason()
        .equals(other.getSeason())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (messageType_ != other.messageType_) return false;
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
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + provider_;
    hash = (37 * hash) + SPORT_FIELD_NUMBER;
    hash = (53 * hash) + sport_;
    hash = (37 * hash) + MATCHID_FIELD_NUMBER;
    hash = (53 * hash) + getMatchId().hashCode();
    hash = (37 * hash) + STAGEID_FIELD_NUMBER;
    hash = (53 * hash) + getStageId().hashCode();
    hash = (37 * hash) + SEASON_FIELD_NUMBER;
    hash = (53 * hash) + getSeason().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + MESSAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + messageType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.Headers parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.Headers parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.Headers parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.Headers parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.Headers parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.Headers parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.Headers parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.Headers parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sts.rpclib.Headers parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sts.rpclib.Headers parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.Headers parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.Headers parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.Headers prototype) {
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
   * Protobuf type {@code com.sts.rpclib.Headers}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.Headers)
      com.sts.rpclib.HeadersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_Headers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_Headers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.Headers.class, com.sts.rpclib.Headers.Builder.class);
    }

    // Construct using com.sts.rpclib.Headers.newBuilder()
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
      provider_ = 0;
      sport_ = 0;
      matchId_ = "";
      stageId_ = "";
      season_ = "";
      timestamp_ = 0L;
      messageType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_Headers_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.Headers getDefaultInstanceForType() {
      return com.sts.rpclib.Headers.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.Headers build() {
      com.sts.rpclib.Headers result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.Headers buildPartial() {
      com.sts.rpclib.Headers result = new com.sts.rpclib.Headers(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.sts.rpclib.Headers result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.provider_ = provider_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sport_ = sport_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.matchId_ = matchId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.stageId_ = stageId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.season_ = season_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.timestamp_ = timestamp_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.messageType_ = messageType_;
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
      if (other instanceof com.sts.rpclib.Headers) {
        return mergeFrom((com.sts.rpclib.Headers)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.Headers other) {
      if (other == com.sts.rpclib.Headers.getDefaultInstance()) return this;
      if (other.provider_ != 0) {
        setProviderValue(other.getProviderValue());
      }
      if (other.sport_ != 0) {
        setSportValue(other.getSportValue());
      }
      if (!other.getMatchId().isEmpty()) {
        matchId_ = other.matchId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getStageId().isEmpty()) {
        stageId_ = other.stageId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getSeason().isEmpty()) {
        season_ = other.season_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.messageType_ != 0) {
        setMessageTypeValue(other.getMessageTypeValue());
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
            case 8: {
              provider_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              sport_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              matchId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              stageId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              season_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              timestamp_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              messageType_ = input.readEnum();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private int provider_ = 0;
    /**
     * <pre>
     * the provider
     * </pre>
     *
     * <code>.com.sts.rpclib.Provider provider = 1;</code>
     * @return The enum numeric value on the wire for provider.
     */
    @java.lang.Override public int getProviderValue() {
      return provider_;
    }
    /**
     * <pre>
     * the provider
     * </pre>
     *
     * <code>.com.sts.rpclib.Provider provider = 1;</code>
     * @param value The enum numeric value on the wire for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderValue(int value) {
      provider_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the provider
     * </pre>
     *
     * <code>.com.sts.rpclib.Provider provider = 1;</code>
     * @return The provider.
     */
    @java.lang.Override
    public com.sts.rpclib.Provider getProvider() {
      com.sts.rpclib.Provider result = com.sts.rpclib.Provider.forNumber(provider_);
      return result == null ? com.sts.rpclib.Provider.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the provider
     * </pre>
     *
     * <code>.com.sts.rpclib.Provider provider = 1;</code>
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(com.sts.rpclib.Provider value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      provider_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the provider
     * </pre>
     *
     * <code>.com.sts.rpclib.Provider provider = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProvider() {
      bitField0_ = (bitField0_ & ~0x00000001);
      provider_ = 0;
      onChanged();
      return this;
    }

    private int sport_ = 0;
    /**
     * <pre>
     * the sport
     * </pre>
     *
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @return The enum numeric value on the wire for sport.
     */
    @java.lang.Override public int getSportValue() {
      return sport_;
    }
    /**
     * <pre>
     * the sport
     * </pre>
     *
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @param value The enum numeric value on the wire for sport to set.
     * @return This builder for chaining.
     */
    public Builder setSportValue(int value) {
      sport_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the sport
     * </pre>
     *
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @return The sport.
     */
    @java.lang.Override
    public com.sts.rpclib.Sport getSport() {
      com.sts.rpclib.Sport result = com.sts.rpclib.Sport.forNumber(sport_);
      return result == null ? com.sts.rpclib.Sport.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the sport
     * </pre>
     *
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @param value The sport to set.
     * @return This builder for chaining.
     */
    public Builder setSport(com.sts.rpclib.Sport value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      sport_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the sport
     * </pre>
     *
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSport() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sport_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object matchId_ = "";
    /**
     * <code>string matchId = 3;</code>
     * @return The matchId.
     */
    public java.lang.String getMatchId() {
      java.lang.Object ref = matchId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        matchId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string matchId = 3;</code>
     * @return The bytes for matchId.
     */
    public com.google.protobuf.ByteString
        getMatchIdBytes() {
      java.lang.Object ref = matchId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        matchId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string matchId = 3;</code>
     * @param value The matchId to set.
     * @return This builder for chaining.
     */
    public Builder setMatchId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      matchId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string matchId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMatchId() {
      matchId_ = getDefaultInstance().getMatchId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string matchId = 3;</code>
     * @param value The bytes for matchId to set.
     * @return This builder for chaining.
     */
    public Builder setMatchIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      matchId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object stageId_ = "";
    /**
     * <code>string stageId = 4;</code>
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
     * <code>string stageId = 4;</code>
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
     * <code>string stageId = 4;</code>
     * @param value The stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      stageId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string stageId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStageId() {
      stageId_ = getDefaultInstance().getStageId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string stageId = 4;</code>
     * @param value The bytes for stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      stageId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object season_ = "";
    /**
     * <code>string season = 5;</code>
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
     * <code>string season = 5;</code>
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
     * <code>string season = 5;</code>
     * @param value The season to set.
     * @return This builder for chaining.
     */
    public Builder setSeason(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      season_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string season = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeason() {
      season_ = getDefaultInstance().getSeason();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string season = 5;</code>
     * @param value The bytes for season to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      season_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <pre>
     * timestamp of when the message was created
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * timestamp of when the message was created
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * timestamp of when the message was created
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000020);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private int messageType_ = 0;
    /**
     * <pre>
     * the type of message the body of the envelope contains
     * </pre>
     *
     * <code>.com.sts.rpclib.MessageType message_type = 7;</code>
     * @return The enum numeric value on the wire for messageType.
     */
    @java.lang.Override public int getMessageTypeValue() {
      return messageType_;
    }
    /**
     * <pre>
     * the type of message the body of the envelope contains
     * </pre>
     *
     * <code>.com.sts.rpclib.MessageType message_type = 7;</code>
     * @param value The enum numeric value on the wire for messageType to set.
     * @return This builder for chaining.
     */
    public Builder setMessageTypeValue(int value) {
      messageType_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the type of message the body of the envelope contains
     * </pre>
     *
     * <code>.com.sts.rpclib.MessageType message_type = 7;</code>
     * @return The messageType.
     */
    @java.lang.Override
    public com.sts.rpclib.MessageType getMessageType() {
      com.sts.rpclib.MessageType result = com.sts.rpclib.MessageType.forNumber(messageType_);
      return result == null ? com.sts.rpclib.MessageType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the type of message the body of the envelope contains
     * </pre>
     *
     * <code>.com.sts.rpclib.MessageType message_type = 7;</code>
     * @param value The messageType to set.
     * @return This builder for chaining.
     */
    public Builder setMessageType(com.sts.rpclib.MessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000040;
      messageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the type of message the body of the envelope contains
     * </pre>
     *
     * <code>.com.sts.rpclib.MessageType message_type = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageType() {
      bitField0_ = (bitField0_ & ~0x00000040);
      messageType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.Headers)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.Headers)
  private static final com.sts.rpclib.Headers DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.Headers();
  }

  public static com.sts.rpclib.Headers getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Headers>
      PARSER = new com.google.protobuf.AbstractParser<Headers>() {
    @java.lang.Override
    public Headers parsePartialFrom(
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

  public static com.google.protobuf.Parser<Headers> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Headers> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.Headers getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

