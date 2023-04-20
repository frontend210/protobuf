// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: match.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.CommentaryMessage}
 */
public final class CommentaryMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.CommentaryMessage)
    CommentaryMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommentaryMessage.newBuilder() to construct.
  private CommentaryMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommentaryMessage() {
    commentaries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommentaryMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommentaryMessage(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              commentaries_ = new java.util.ArrayList<com.sts.rpclib.MatchCommentaryEntry>();
              mutable_bitField0_ |= 0x00000001;
            }
            commentaries_.add(
                input.readMessage(com.sts.rpclib.MatchCommentaryEntry.parser(), extensionRegistry));
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
        commentaries_ = java.util.Collections.unmodifiableList(commentaries_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Match.internal_static_com_sts_rpclib_CommentaryMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Match.internal_static_com_sts_rpclib_CommentaryMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.CommentaryMessage.class, com.sts.rpclib.CommentaryMessage.Builder.class);
  }

  public static final int COMMENTARIES_FIELD_NUMBER = 2;
  private java.util.List<com.sts.rpclib.MatchCommentaryEntry> commentaries_;
  /**
   * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.sts.rpclib.MatchCommentaryEntry> getCommentariesList() {
    return commentaries_;
  }
  /**
   * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sts.rpclib.MatchCommentaryEntryOrBuilder> 
      getCommentariesOrBuilderList() {
    return commentaries_;
  }
  /**
   * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
   */
  @java.lang.Override
  public int getCommentariesCount() {
    return commentaries_.size();
  }
  /**
   * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.MatchCommentaryEntry getCommentaries(int index) {
    return commentaries_.get(index);
  }
  /**
   * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.MatchCommentaryEntryOrBuilder getCommentariesOrBuilder(
      int index) {
    return commentaries_.get(index);
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
    for (int i = 0; i < commentaries_.size(); i++) {
      output.writeMessage(2, commentaries_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < commentaries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, commentaries_.get(i));
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
    if (!(obj instanceof com.sts.rpclib.CommentaryMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.CommentaryMessage other = (com.sts.rpclib.CommentaryMessage) obj;

    if (!getCommentariesList()
        .equals(other.getCommentariesList())) return false;
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
    if (getCommentariesCount() > 0) {
      hash = (37 * hash) + COMMENTARIES_FIELD_NUMBER;
      hash = (53 * hash) + getCommentariesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.CommentaryMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.CommentaryMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.CommentaryMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.CommentaryMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.CommentaryMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.CommentaryMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.CommentaryMessage)
      com.sts.rpclib.CommentaryMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_CommentaryMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_CommentaryMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.CommentaryMessage.class, com.sts.rpclib.CommentaryMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.CommentaryMessage.newBuilder()
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
        getCommentariesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commentariesBuilder_ == null) {
        commentaries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        commentariesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_CommentaryMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.CommentaryMessage getDefaultInstanceForType() {
      return com.sts.rpclib.CommentaryMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.CommentaryMessage build() {
      com.sts.rpclib.CommentaryMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.CommentaryMessage buildPartial() {
      com.sts.rpclib.CommentaryMessage result = new com.sts.rpclib.CommentaryMessage(this);
      int from_bitField0_ = bitField0_;
      if (commentariesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          commentaries_ = java.util.Collections.unmodifiableList(commentaries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.commentaries_ = commentaries_;
      } else {
        result.commentaries_ = commentariesBuilder_.build();
      }
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
      if (other instanceof com.sts.rpclib.CommentaryMessage) {
        return mergeFrom((com.sts.rpclib.CommentaryMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.CommentaryMessage other) {
      if (other == com.sts.rpclib.CommentaryMessage.getDefaultInstance()) return this;
      if (commentariesBuilder_ == null) {
        if (!other.commentaries_.isEmpty()) {
          if (commentaries_.isEmpty()) {
            commentaries_ = other.commentaries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCommentariesIsMutable();
            commentaries_.addAll(other.commentaries_);
          }
          onChanged();
        }
      } else {
        if (!other.commentaries_.isEmpty()) {
          if (commentariesBuilder_.isEmpty()) {
            commentariesBuilder_.dispose();
            commentariesBuilder_ = null;
            commentaries_ = other.commentaries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            commentariesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCommentariesFieldBuilder() : null;
          } else {
            commentariesBuilder_.addAllMessages(other.commentaries_);
          }
        }
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
      com.sts.rpclib.CommentaryMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.CommentaryMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sts.rpclib.MatchCommentaryEntry> commentaries_ =
      java.util.Collections.emptyList();
    private void ensureCommentariesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        commentaries_ = new java.util.ArrayList<com.sts.rpclib.MatchCommentaryEntry>(commentaries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.MatchCommentaryEntry, com.sts.rpclib.MatchCommentaryEntry.Builder, com.sts.rpclib.MatchCommentaryEntryOrBuilder> commentariesBuilder_;

    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public java.util.List<com.sts.rpclib.MatchCommentaryEntry> getCommentariesList() {
      if (commentariesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(commentaries_);
      } else {
        return commentariesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public int getCommentariesCount() {
      if (commentariesBuilder_ == null) {
        return commentaries_.size();
      } else {
        return commentariesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public com.sts.rpclib.MatchCommentaryEntry getCommentaries(int index) {
      if (commentariesBuilder_ == null) {
        return commentaries_.get(index);
      } else {
        return commentariesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder setCommentaries(
        int index, com.sts.rpclib.MatchCommentaryEntry value) {
      if (commentariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentariesIsMutable();
        commentaries_.set(index, value);
        onChanged();
      } else {
        commentariesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder setCommentaries(
        int index, com.sts.rpclib.MatchCommentaryEntry.Builder builderForValue) {
      if (commentariesBuilder_ == null) {
        ensureCommentariesIsMutable();
        commentaries_.set(index, builderForValue.build());
        onChanged();
      } else {
        commentariesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder addCommentaries(com.sts.rpclib.MatchCommentaryEntry value) {
      if (commentariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentariesIsMutable();
        commentaries_.add(value);
        onChanged();
      } else {
        commentariesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder addCommentaries(
        int index, com.sts.rpclib.MatchCommentaryEntry value) {
      if (commentariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentariesIsMutable();
        commentaries_.add(index, value);
        onChanged();
      } else {
        commentariesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder addCommentaries(
        com.sts.rpclib.MatchCommentaryEntry.Builder builderForValue) {
      if (commentariesBuilder_ == null) {
        ensureCommentariesIsMutable();
        commentaries_.add(builderForValue.build());
        onChanged();
      } else {
        commentariesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder addCommentaries(
        int index, com.sts.rpclib.MatchCommentaryEntry.Builder builderForValue) {
      if (commentariesBuilder_ == null) {
        ensureCommentariesIsMutable();
        commentaries_.add(index, builderForValue.build());
        onChanged();
      } else {
        commentariesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder addAllCommentaries(
        java.lang.Iterable<? extends com.sts.rpclib.MatchCommentaryEntry> values) {
      if (commentariesBuilder_ == null) {
        ensureCommentariesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, commentaries_);
        onChanged();
      } else {
        commentariesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder clearCommentaries() {
      if (commentariesBuilder_ == null) {
        commentaries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        commentariesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public Builder removeCommentaries(int index) {
      if (commentariesBuilder_ == null) {
        ensureCommentariesIsMutable();
        commentaries_.remove(index);
        onChanged();
      } else {
        commentariesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public com.sts.rpclib.MatchCommentaryEntry.Builder getCommentariesBuilder(
        int index) {
      return getCommentariesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public com.sts.rpclib.MatchCommentaryEntryOrBuilder getCommentariesOrBuilder(
        int index) {
      if (commentariesBuilder_ == null) {
        return commentaries_.get(index);  } else {
        return commentariesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public java.util.List<? extends com.sts.rpclib.MatchCommentaryEntryOrBuilder> 
         getCommentariesOrBuilderList() {
      if (commentariesBuilder_ != null) {
        return commentariesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(commentaries_);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public com.sts.rpclib.MatchCommentaryEntry.Builder addCommentariesBuilder() {
      return getCommentariesFieldBuilder().addBuilder(
          com.sts.rpclib.MatchCommentaryEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public com.sts.rpclib.MatchCommentaryEntry.Builder addCommentariesBuilder(
        int index) {
      return getCommentariesFieldBuilder().addBuilder(
          index, com.sts.rpclib.MatchCommentaryEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.MatchCommentaryEntry commentaries = 2;</code>
     */
    public java.util.List<com.sts.rpclib.MatchCommentaryEntry.Builder> 
         getCommentariesBuilderList() {
      return getCommentariesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.MatchCommentaryEntry, com.sts.rpclib.MatchCommentaryEntry.Builder, com.sts.rpclib.MatchCommentaryEntryOrBuilder> 
        getCommentariesFieldBuilder() {
      if (commentariesBuilder_ == null) {
        commentariesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sts.rpclib.MatchCommentaryEntry, com.sts.rpclib.MatchCommentaryEntry.Builder, com.sts.rpclib.MatchCommentaryEntryOrBuilder>(
                commentaries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        commentaries_ = null;
      }
      return commentariesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.CommentaryMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.CommentaryMessage)
  private static final com.sts.rpclib.CommentaryMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.CommentaryMessage();
  }

  public static com.sts.rpclib.CommentaryMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommentaryMessage>
      PARSER = new com.google.protobuf.AbstractParser<CommentaryMessage>() {
    @java.lang.Override
    public CommentaryMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommentaryMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommentaryMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommentaryMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.CommentaryMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
