// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: h2h.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.H2HMatchesMessage}
 */
public final class H2HMatchesMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.H2HMatchesMessage)
    H2HMatchesMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use H2HMatchesMessage.newBuilder() to construct.
  private H2HMatchesMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private H2HMatchesMessage() {
    h2HParticipants_ = java.util.Collections.emptyList();
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new H2HMatchesMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private H2HMatchesMessage(
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
              h2HParticipants_ = new java.util.ArrayList<com.sts.rpclib.H2HParticipantMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            h2HParticipants_.add(
                input.readMessage(com.sts.rpclib.H2HParticipantMessage.parser(), extensionRegistry));
            break;
          }
          case 18: {

            data_ = input.readBytes();
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
        h2HParticipants_ = java.util.Collections.unmodifiableList(h2HParticipants_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_H2HMatchesMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_H2HMatchesMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.H2HMatchesMessage.class, com.sts.rpclib.H2HMatchesMessage.Builder.class);
  }

  public static final int H2HPARTICIPANTS_FIELD_NUMBER = 1;
  private java.util.List<com.sts.rpclib.H2HParticipantMessage> h2HParticipants_;
  /**
   * <pre>
   * for provider specific data this contains provider participants and for internal data it contains internal participants
   * </pre>
   *
   * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.sts.rpclib.H2HParticipantMessage> getH2HParticipantsList() {
    return h2HParticipants_;
  }
  /**
   * <pre>
   * for provider specific data this contains provider participants and for internal data it contains internal participants
   * </pre>
   *
   * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sts.rpclib.H2HParticipantMessageOrBuilder> 
      getH2HParticipantsOrBuilderList() {
    return h2HParticipants_;
  }
  /**
   * <pre>
   * for provider specific data this contains provider participants and for internal data it contains internal participants
   * </pre>
   *
   * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
   */
  @java.lang.Override
  public int getH2HParticipantsCount() {
    return h2HParticipants_.size();
  }
  /**
   * <pre>
   * for provider specific data this contains provider participants and for internal data it contains internal participants
   * </pre>
   *
   * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.H2HParticipantMessage getH2HParticipants(int index) {
    return h2HParticipants_.get(index);
  }
  /**
   * <pre>
   * for provider specific data this contains provider participants and for internal data it contains internal participants
   * </pre>
   *
   * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.H2HParticipantMessageOrBuilder getH2HParticipantsOrBuilder(
      int index) {
    return h2HParticipants_.get(index);
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
    for (int i = 0; i < h2HParticipants_.size(); i++) {
      output.writeMessage(1, h2HParticipants_.get(i));
    }
    if (!data_.isEmpty()) {
      output.writeBytes(2, data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < h2HParticipants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, h2HParticipants_.get(i));
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, data_);
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
    if (!(obj instanceof com.sts.rpclib.H2HMatchesMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.H2HMatchesMessage other = (com.sts.rpclib.H2HMatchesMessage) obj;

    if (!getH2HParticipantsList()
        .equals(other.getH2HParticipantsList())) return false;
    if (!getData()
        .equals(other.getData())) return false;
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
    if (getH2HParticipantsCount() > 0) {
      hash = (37 * hash) + H2HPARTICIPANTS_FIELD_NUMBER;
      hash = (53 * hash) + getH2HParticipantsList().hashCode();
    }
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.H2HMatchesMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.H2HMatchesMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.H2HMatchesMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.H2HMatchesMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.H2HMatchesMessage)
      com.sts.rpclib.H2HMatchesMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_H2HMatchesMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_H2HMatchesMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.H2HMatchesMessage.class, com.sts.rpclib.H2HMatchesMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.H2HMatchesMessage.newBuilder()
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
        getH2HParticipantsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (h2HParticipantsBuilder_ == null) {
        h2HParticipants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        h2HParticipantsBuilder_.clear();
      }
      data_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_H2HMatchesMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.H2HMatchesMessage getDefaultInstanceForType() {
      return com.sts.rpclib.H2HMatchesMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.H2HMatchesMessage build() {
      com.sts.rpclib.H2HMatchesMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.H2HMatchesMessage buildPartial() {
      com.sts.rpclib.H2HMatchesMessage result = new com.sts.rpclib.H2HMatchesMessage(this);
      int from_bitField0_ = bitField0_;
      if (h2HParticipantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          h2HParticipants_ = java.util.Collections.unmodifiableList(h2HParticipants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.h2HParticipants_ = h2HParticipants_;
      } else {
        result.h2HParticipants_ = h2HParticipantsBuilder_.build();
      }
      result.data_ = data_;
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
      if (other instanceof com.sts.rpclib.H2HMatchesMessage) {
        return mergeFrom((com.sts.rpclib.H2HMatchesMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.H2HMatchesMessage other) {
      if (other == com.sts.rpclib.H2HMatchesMessage.getDefaultInstance()) return this;
      if (h2HParticipantsBuilder_ == null) {
        if (!other.h2HParticipants_.isEmpty()) {
          if (h2HParticipants_.isEmpty()) {
            h2HParticipants_ = other.h2HParticipants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureH2HParticipantsIsMutable();
            h2HParticipants_.addAll(other.h2HParticipants_);
          }
          onChanged();
        }
      } else {
        if (!other.h2HParticipants_.isEmpty()) {
          if (h2HParticipantsBuilder_.isEmpty()) {
            h2HParticipantsBuilder_.dispose();
            h2HParticipantsBuilder_ = null;
            h2HParticipants_ = other.h2HParticipants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            h2HParticipantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getH2HParticipantsFieldBuilder() : null;
          } else {
            h2HParticipantsBuilder_.addAllMessages(other.h2HParticipants_);
          }
        }
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
      com.sts.rpclib.H2HMatchesMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.H2HMatchesMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sts.rpclib.H2HParticipantMessage> h2HParticipants_ =
      java.util.Collections.emptyList();
    private void ensureH2HParticipantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        h2HParticipants_ = new java.util.ArrayList<com.sts.rpclib.H2HParticipantMessage>(h2HParticipants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.H2HParticipantMessage, com.sts.rpclib.H2HParticipantMessage.Builder, com.sts.rpclib.H2HParticipantMessageOrBuilder> h2HParticipantsBuilder_;

    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public java.util.List<com.sts.rpclib.H2HParticipantMessage> getH2HParticipantsList() {
      if (h2HParticipantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(h2HParticipants_);
      } else {
        return h2HParticipantsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public int getH2HParticipantsCount() {
      if (h2HParticipantsBuilder_ == null) {
        return h2HParticipants_.size();
      } else {
        return h2HParticipantsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public com.sts.rpclib.H2HParticipantMessage getH2HParticipants(int index) {
      if (h2HParticipantsBuilder_ == null) {
        return h2HParticipants_.get(index);
      } else {
        return h2HParticipantsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder setH2HParticipants(
        int index, com.sts.rpclib.H2HParticipantMessage value) {
      if (h2HParticipantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureH2HParticipantsIsMutable();
        h2HParticipants_.set(index, value);
        onChanged();
      } else {
        h2HParticipantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder setH2HParticipants(
        int index, com.sts.rpclib.H2HParticipantMessage.Builder builderForValue) {
      if (h2HParticipantsBuilder_ == null) {
        ensureH2HParticipantsIsMutable();
        h2HParticipants_.set(index, builderForValue.build());
        onChanged();
      } else {
        h2HParticipantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder addH2HParticipants(com.sts.rpclib.H2HParticipantMessage value) {
      if (h2HParticipantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureH2HParticipantsIsMutable();
        h2HParticipants_.add(value);
        onChanged();
      } else {
        h2HParticipantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder addH2HParticipants(
        int index, com.sts.rpclib.H2HParticipantMessage value) {
      if (h2HParticipantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureH2HParticipantsIsMutable();
        h2HParticipants_.add(index, value);
        onChanged();
      } else {
        h2HParticipantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder addH2HParticipants(
        com.sts.rpclib.H2HParticipantMessage.Builder builderForValue) {
      if (h2HParticipantsBuilder_ == null) {
        ensureH2HParticipantsIsMutable();
        h2HParticipants_.add(builderForValue.build());
        onChanged();
      } else {
        h2HParticipantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder addH2HParticipants(
        int index, com.sts.rpclib.H2HParticipantMessage.Builder builderForValue) {
      if (h2HParticipantsBuilder_ == null) {
        ensureH2HParticipantsIsMutable();
        h2HParticipants_.add(index, builderForValue.build());
        onChanged();
      } else {
        h2HParticipantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder addAllH2HParticipants(
        java.lang.Iterable<? extends com.sts.rpclib.H2HParticipantMessage> values) {
      if (h2HParticipantsBuilder_ == null) {
        ensureH2HParticipantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, h2HParticipants_);
        onChanged();
      } else {
        h2HParticipantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder clearH2HParticipants() {
      if (h2HParticipantsBuilder_ == null) {
        h2HParticipants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        h2HParticipantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder removeH2HParticipants(int index) {
      if (h2HParticipantsBuilder_ == null) {
        ensureH2HParticipantsIsMutable();
        h2HParticipants_.remove(index);
        onChanged();
      } else {
        h2HParticipantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public com.sts.rpclib.H2HParticipantMessage.Builder getH2HParticipantsBuilder(
        int index) {
      return getH2HParticipantsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public com.sts.rpclib.H2HParticipantMessageOrBuilder getH2HParticipantsOrBuilder(
        int index) {
      if (h2HParticipantsBuilder_ == null) {
        return h2HParticipants_.get(index);  } else {
        return h2HParticipantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public java.util.List<? extends com.sts.rpclib.H2HParticipantMessageOrBuilder> 
         getH2HParticipantsOrBuilderList() {
      if (h2HParticipantsBuilder_ != null) {
        return h2HParticipantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(h2HParticipants_);
      }
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public com.sts.rpclib.H2HParticipantMessage.Builder addH2HParticipantsBuilder() {
      return getH2HParticipantsFieldBuilder().addBuilder(
          com.sts.rpclib.H2HParticipantMessage.getDefaultInstance());
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public com.sts.rpclib.H2HParticipantMessage.Builder addH2HParticipantsBuilder(
        int index) {
      return getH2HParticipantsFieldBuilder().addBuilder(
          index, com.sts.rpclib.H2HParticipantMessage.getDefaultInstance());
    }
    /**
     * <pre>
     * for provider specific data this contains provider participants and for internal data it contains internal participants
     * </pre>
     *
     * <code>repeated .com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public java.util.List<com.sts.rpclib.H2HParticipantMessage.Builder> 
         getH2HParticipantsBuilderList() {
      return getH2HParticipantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.H2HParticipantMessage, com.sts.rpclib.H2HParticipantMessage.Builder, com.sts.rpclib.H2HParticipantMessageOrBuilder> 
        getH2HParticipantsFieldBuilder() {
      if (h2HParticipantsBuilder_ == null) {
        h2HParticipantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sts.rpclib.H2HParticipantMessage, com.sts.rpclib.H2HParticipantMessage.Builder, com.sts.rpclib.H2HParticipantMessageOrBuilder>(
                h2HParticipants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        h2HParticipants_ = null;
      }
      return h2HParticipantsBuilder_;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 2;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 2;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.H2HMatchesMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.H2HMatchesMessage)
  private static final com.sts.rpclib.H2HMatchesMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.H2HMatchesMessage();
  }

  public static com.sts.rpclib.H2HMatchesMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<H2HMatchesMessage>
      PARSER = new com.google.protobuf.AbstractParser<H2HMatchesMessage>() {
    @java.lang.Override
    public H2HMatchesMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new H2HMatchesMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<H2HMatchesMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<H2HMatchesMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.H2HMatchesMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

