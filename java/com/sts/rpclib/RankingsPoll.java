// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rankings.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.RankingsPoll}
 */
public final class RankingsPoll extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.RankingsPoll)
    RankingsPollOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RankingsPoll.newBuilder() to construct.
  private RankingsPoll(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RankingsPoll() {
    pollId_ = "";
    pollName_ = "";
    week_ = "";
    entries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RankingsPoll();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Rankings.internal_static_com_sts_rpclib_RankingsPoll_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Rankings.internal_static_com_sts_rpclib_RankingsPoll_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.RankingsPoll.class, com.sts.rpclib.RankingsPoll.Builder.class);
  }

  public static final int POLLID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pollId_ = "";
  /**
   * <code>string pollId = 1;</code>
   * @return The pollId.
   */
  @java.lang.Override
  public java.lang.String getPollId() {
    java.lang.Object ref = pollId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pollId_ = s;
      return s;
    }
  }
  /**
   * <code>string pollId = 1;</code>
   * @return The bytes for pollId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPollIdBytes() {
    java.lang.Object ref = pollId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pollId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLLNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pollName_ = "";
  /**
   * <code>string pollName = 2;</code>
   * @return The pollName.
   */
  @java.lang.Override
  public java.lang.String getPollName() {
    java.lang.Object ref = pollName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pollName_ = s;
      return s;
    }
  }
  /**
   * <code>string pollName = 2;</code>
   * @return The bytes for pollName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPollNameBytes() {
    java.lang.Object ref = pollName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pollName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEEK_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object week_ = "";
  /**
   * <code>string week = 3;</code>
   * @return The week.
   */
  @java.lang.Override
  public java.lang.String getWeek() {
    java.lang.Object ref = week_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      week_ = s;
      return s;
    }
  }
  /**
   * <code>string week = 3;</code>
   * @return The bytes for week.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWeekBytes() {
    java.lang.Object ref = week_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      week_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EFFECTIVETIME_FIELD_NUMBER = 4;
  private long effectiveTime_ = 0L;
  /**
   * <code>int64 effectiveTime = 4;</code>
   * @return The effectiveTime.
   */
  @java.lang.Override
  public long getEffectiveTime() {
    return effectiveTime_;
  }

  public static final int ENTRIES_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private java.util.List<com.sts.rpclib.RankingEntry> entries_;
  /**
   * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
   */
  @java.lang.Override
  public java.util.List<com.sts.rpclib.RankingEntry> getEntriesList() {
    return entries_;
  }
  /**
   * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sts.rpclib.RankingEntryOrBuilder> 
      getEntriesOrBuilderList() {
    return entries_;
  }
  /**
   * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
   */
  @java.lang.Override
  public int getEntriesCount() {
    return entries_.size();
  }
  /**
   * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.RankingEntry getEntries(int index) {
    return entries_.get(index);
  }
  /**
   * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.RankingEntryOrBuilder getEntriesOrBuilder(
      int index) {
    return entries_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pollId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pollId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pollName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pollName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(week_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, week_);
    }
    if (effectiveTime_ != 0L) {
      output.writeInt64(4, effectiveTime_);
    }
    for (int i = 0; i < entries_.size(); i++) {
      output.writeMessage(5, entries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pollId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pollId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pollName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pollName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(week_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, week_);
    }
    if (effectiveTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, effectiveTime_);
    }
    for (int i = 0; i < entries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, entries_.get(i));
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
    if (!(obj instanceof com.sts.rpclib.RankingsPoll)) {
      return super.equals(obj);
    }
    com.sts.rpclib.RankingsPoll other = (com.sts.rpclib.RankingsPoll) obj;

    if (!getPollId()
        .equals(other.getPollId())) return false;
    if (!getPollName()
        .equals(other.getPollName())) return false;
    if (!getWeek()
        .equals(other.getWeek())) return false;
    if (getEffectiveTime()
        != other.getEffectiveTime()) return false;
    if (!getEntriesList()
        .equals(other.getEntriesList())) return false;
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
    hash = (37 * hash) + POLLID_FIELD_NUMBER;
    hash = (53 * hash) + getPollId().hashCode();
    hash = (37 * hash) + POLLNAME_FIELD_NUMBER;
    hash = (53 * hash) + getPollName().hashCode();
    hash = (37 * hash) + WEEK_FIELD_NUMBER;
    hash = (53 * hash) + getWeek().hashCode();
    hash = (37 * hash) + EFFECTIVETIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEffectiveTime());
    if (getEntriesCount() > 0) {
      hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.RankingsPoll parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sts.rpclib.RankingsPoll parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sts.rpclib.RankingsPoll parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.RankingsPoll parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.RankingsPoll prototype) {
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
   * Protobuf type {@code com.sts.rpclib.RankingsPoll}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.RankingsPoll)
      com.sts.rpclib.RankingsPollOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Rankings.internal_static_com_sts_rpclib_RankingsPoll_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Rankings.internal_static_com_sts_rpclib_RankingsPoll_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.RankingsPoll.class, com.sts.rpclib.RankingsPoll.Builder.class);
    }

    // Construct using com.sts.rpclib.RankingsPoll.newBuilder()
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
      pollId_ = "";
      pollName_ = "";
      week_ = "";
      effectiveTime_ = 0L;
      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
      } else {
        entries_ = null;
        entriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Rankings.internal_static_com_sts_rpclib_RankingsPoll_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.RankingsPoll getDefaultInstanceForType() {
      return com.sts.rpclib.RankingsPoll.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.RankingsPoll build() {
      com.sts.rpclib.RankingsPoll result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.RankingsPoll buildPartial() {
      com.sts.rpclib.RankingsPoll result = new com.sts.rpclib.RankingsPoll(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.sts.rpclib.RankingsPoll result) {
      if (entriesBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.entries_ = entries_;
      } else {
        result.entries_ = entriesBuilder_.build();
      }
    }

    private void buildPartial0(com.sts.rpclib.RankingsPoll result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pollId_ = pollId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pollName_ = pollName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.week_ = week_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.effectiveTime_ = effectiveTime_;
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
      if (other instanceof com.sts.rpclib.RankingsPoll) {
        return mergeFrom((com.sts.rpclib.RankingsPoll)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.RankingsPoll other) {
      if (other == com.sts.rpclib.RankingsPoll.getDefaultInstance()) return this;
      if (!other.getPollId().isEmpty()) {
        pollId_ = other.pollId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPollName().isEmpty()) {
        pollName_ = other.pollName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getWeek().isEmpty()) {
        week_ = other.week_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getEffectiveTime() != 0L) {
        setEffectiveTime(other.getEffectiveTime());
      }
      if (entriesBuilder_ == null) {
        if (!other.entries_.isEmpty()) {
          if (entries_.isEmpty()) {
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureEntriesIsMutable();
            entries_.addAll(other.entries_);
          }
          onChanged();
        }
      } else {
        if (!other.entries_.isEmpty()) {
          if (entriesBuilder_.isEmpty()) {
            entriesBuilder_.dispose();
            entriesBuilder_ = null;
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000010);
            entriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntriesFieldBuilder() : null;
          } else {
            entriesBuilder_.addAllMessages(other.entries_);
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
              pollId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              pollName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              week_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              effectiveTime_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              com.sts.rpclib.RankingEntry m =
                  input.readMessage(
                      com.sts.rpclib.RankingEntry.parser(),
                      extensionRegistry);
              if (entriesBuilder_ == null) {
                ensureEntriesIsMutable();
                entries_.add(m);
              } else {
                entriesBuilder_.addMessage(m);
              }
              break;
            } // case 42
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

    private java.lang.Object pollId_ = "";
    /**
     * <code>string pollId = 1;</code>
     * @return The pollId.
     */
    public java.lang.String getPollId() {
      java.lang.Object ref = pollId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pollId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pollId = 1;</code>
     * @return The bytes for pollId.
     */
    public com.google.protobuf.ByteString
        getPollIdBytes() {
      java.lang.Object ref = pollId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pollId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pollId = 1;</code>
     * @param value The pollId to set.
     * @return This builder for chaining.
     */
    public Builder setPollId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pollId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string pollId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPollId() {
      pollId_ = getDefaultInstance().getPollId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string pollId = 1;</code>
     * @param value The bytes for pollId to set.
     * @return This builder for chaining.
     */
    public Builder setPollIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pollId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object pollName_ = "";
    /**
     * <code>string pollName = 2;</code>
     * @return The pollName.
     */
    public java.lang.String getPollName() {
      java.lang.Object ref = pollName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pollName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pollName = 2;</code>
     * @return The bytes for pollName.
     */
    public com.google.protobuf.ByteString
        getPollNameBytes() {
      java.lang.Object ref = pollName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pollName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pollName = 2;</code>
     * @param value The pollName to set.
     * @return This builder for chaining.
     */
    public Builder setPollName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pollName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string pollName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPollName() {
      pollName_ = getDefaultInstance().getPollName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string pollName = 2;</code>
     * @param value The bytes for pollName to set.
     * @return This builder for chaining.
     */
    public Builder setPollNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pollName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object week_ = "";
    /**
     * <code>string week = 3;</code>
     * @return The week.
     */
    public java.lang.String getWeek() {
      java.lang.Object ref = week_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        week_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string week = 3;</code>
     * @return The bytes for week.
     */
    public com.google.protobuf.ByteString
        getWeekBytes() {
      java.lang.Object ref = week_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        week_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string week = 3;</code>
     * @param value The week to set.
     * @return This builder for chaining.
     */
    public Builder setWeek(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      week_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string week = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeek() {
      week_ = getDefaultInstance().getWeek();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string week = 3;</code>
     * @param value The bytes for week to set.
     * @return This builder for chaining.
     */
    public Builder setWeekBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      week_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long effectiveTime_ ;
    /**
     * <code>int64 effectiveTime = 4;</code>
     * @return The effectiveTime.
     */
    @java.lang.Override
    public long getEffectiveTime() {
      return effectiveTime_;
    }
    /**
     * <code>int64 effectiveTime = 4;</code>
     * @param value The effectiveTime to set.
     * @return This builder for chaining.
     */
    public Builder setEffectiveTime(long value) {

      effectiveTime_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 effectiveTime = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEffectiveTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      effectiveTime_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.sts.rpclib.RankingEntry> entries_ =
      java.util.Collections.emptyList();
    private void ensureEntriesIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        entries_ = new java.util.ArrayList<com.sts.rpclib.RankingEntry>(entries_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.RankingEntry, com.sts.rpclib.RankingEntry.Builder, com.sts.rpclib.RankingEntryOrBuilder> entriesBuilder_;

    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public java.util.List<com.sts.rpclib.RankingEntry> getEntriesList() {
      if (entriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entries_);
      } else {
        return entriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public int getEntriesCount() {
      if (entriesBuilder_ == null) {
        return entries_.size();
      } else {
        return entriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public com.sts.rpclib.RankingEntry getEntries(int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);
      } else {
        return entriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder setEntries(
        int index, com.sts.rpclib.RankingEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.set(index, value);
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder setEntries(
        int index, com.sts.rpclib.RankingEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.set(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder addEntries(com.sts.rpclib.RankingEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder addEntries(
        int index, com.sts.rpclib.RankingEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(index, value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder addEntries(
        com.sts.rpclib.RankingEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder addEntries(
        int index, com.sts.rpclib.RankingEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder addAllEntries(
        java.lang.Iterable<? extends com.sts.rpclib.RankingEntry> values) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entries_);
        onChanged();
      } else {
        entriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder clearEntries() {
      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        entriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public Builder removeEntries(int index) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.remove(index);
        onChanged();
      } else {
        entriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public com.sts.rpclib.RankingEntry.Builder getEntriesBuilder(
        int index) {
      return getEntriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public com.sts.rpclib.RankingEntryOrBuilder getEntriesOrBuilder(
        int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);  } else {
        return entriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public java.util.List<? extends com.sts.rpclib.RankingEntryOrBuilder> 
         getEntriesOrBuilderList() {
      if (entriesBuilder_ != null) {
        return entriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entries_);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public com.sts.rpclib.RankingEntry.Builder addEntriesBuilder() {
      return getEntriesFieldBuilder().addBuilder(
          com.sts.rpclib.RankingEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public com.sts.rpclib.RankingEntry.Builder addEntriesBuilder(
        int index) {
      return getEntriesFieldBuilder().addBuilder(
          index, com.sts.rpclib.RankingEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.RankingEntry entries = 5;</code>
     */
    public java.util.List<com.sts.rpclib.RankingEntry.Builder> 
         getEntriesBuilderList() {
      return getEntriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.RankingEntry, com.sts.rpclib.RankingEntry.Builder, com.sts.rpclib.RankingEntryOrBuilder> 
        getEntriesFieldBuilder() {
      if (entriesBuilder_ == null) {
        entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sts.rpclib.RankingEntry, com.sts.rpclib.RankingEntry.Builder, com.sts.rpclib.RankingEntryOrBuilder>(
                entries_,
                ((bitField0_ & 0x00000010) != 0),
                getParentForChildren(),
                isClean());
        entries_ = null;
      }
      return entriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.RankingsPoll)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.RankingsPoll)
  private static final com.sts.rpclib.RankingsPoll DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.RankingsPoll();
  }

  public static com.sts.rpclib.RankingsPoll getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RankingsPoll>
      PARSER = new com.google.protobuf.AbstractParser<RankingsPoll>() {
    @java.lang.Override
    public RankingsPoll parsePartialFrom(
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

  public static com.google.protobuf.Parser<RankingsPoll> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RankingsPoll> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.RankingsPoll getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

