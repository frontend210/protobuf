// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envelope.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.CommandRequestMessage}
 */
public final class CommandRequestMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.CommandRequestMessage)
    CommandRequestMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommandRequestMessage.newBuilder() to construct.
  private CommandRequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommandRequestMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommandRequestMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_CommandRequestMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_CommandRequestMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.CommandRequestMessage.class, com.sts.rpclib.CommandRequestMessage.Builder.class);
  }

  public static final int PROVIDERID_FIELD_NUMBER = 1;
  private int providerId_ = 0;
  /**
   * <code>int32 providerId = 1;</code>
   * @return The providerId.
   */
  @java.lang.Override
  public int getProviderId() {
    return providerId_;
  }

  public static final int COUNTER_FIELD_NUMBER = 2;
  private long counter_ = 0L;
  /**
   * <code>int64 counter = 2;</code>
   * @return The counter.
   */
  @java.lang.Override
  public long getCounter() {
    return counter_;
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
    if (providerId_ != 0) {
      output.writeInt32(1, providerId_);
    }
    if (counter_ != 0L) {
      output.writeInt64(2, counter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (providerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, providerId_);
    }
    if (counter_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, counter_);
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
    if (!(obj instanceof com.sts.rpclib.CommandRequestMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.CommandRequestMessage other = (com.sts.rpclib.CommandRequestMessage) obj;

    if (getProviderId()
        != other.getProviderId()) return false;
    if (getCounter()
        != other.getCounter()) return false;
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
    hash = (37 * hash) + PROVIDERID_FIELD_NUMBER;
    hash = (53 * hash) + getProviderId();
    hash = (37 * hash) + COUNTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCounter());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.CommandRequestMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sts.rpclib.CommandRequestMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sts.rpclib.CommandRequestMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.CommandRequestMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.CommandRequestMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.CommandRequestMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.CommandRequestMessage)
      com.sts.rpclib.CommandRequestMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_CommandRequestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_CommandRequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.CommandRequestMessage.class, com.sts.rpclib.CommandRequestMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.CommandRequestMessage.newBuilder()
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
      providerId_ = 0;
      counter_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Envelope.internal_static_com_sts_rpclib_CommandRequestMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.CommandRequestMessage getDefaultInstanceForType() {
      return com.sts.rpclib.CommandRequestMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.CommandRequestMessage build() {
      com.sts.rpclib.CommandRequestMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.CommandRequestMessage buildPartial() {
      com.sts.rpclib.CommandRequestMessage result = new com.sts.rpclib.CommandRequestMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.sts.rpclib.CommandRequestMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.providerId_ = providerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.counter_ = counter_;
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
      if (other instanceof com.sts.rpclib.CommandRequestMessage) {
        return mergeFrom((com.sts.rpclib.CommandRequestMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.CommandRequestMessage other) {
      if (other == com.sts.rpclib.CommandRequestMessage.getDefaultInstance()) return this;
      if (other.getProviderId() != 0) {
        setProviderId(other.getProviderId());
      }
      if (other.getCounter() != 0L) {
        setCounter(other.getCounter());
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
              providerId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              counter_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int providerId_ ;
    /**
     * <code>int32 providerId = 1;</code>
     * @return The providerId.
     */
    @java.lang.Override
    public int getProviderId() {
      return providerId_;
    }
    /**
     * <code>int32 providerId = 1;</code>
     * @param value The providerId to set.
     * @return This builder for chaining.
     */
    public Builder setProviderId(int value) {

      providerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 providerId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProviderId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      providerId_ = 0;
      onChanged();
      return this;
    }

    private long counter_ ;
    /**
     * <code>int64 counter = 2;</code>
     * @return The counter.
     */
    @java.lang.Override
    public long getCounter() {
      return counter_;
    }
    /**
     * <code>int64 counter = 2;</code>
     * @param value The counter to set.
     * @return This builder for chaining.
     */
    public Builder setCounter(long value) {

      counter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 counter = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCounter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      counter_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.CommandRequestMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.CommandRequestMessage)
  private static final com.sts.rpclib.CommandRequestMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.CommandRequestMessage();
  }

  public static com.sts.rpclib.CommandRequestMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommandRequestMessage>
      PARSER = new com.google.protobuf.AbstractParser<CommandRequestMessage>() {
    @java.lang.Override
    public CommandRequestMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommandRequestMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommandRequestMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.CommandRequestMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

