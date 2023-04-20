// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: match.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.MatchCommentaryEntry}
 */
public final class MatchCommentaryEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.MatchCommentaryEntry)
    MatchCommentaryEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MatchCommentaryEntry.newBuilder() to construct.
  private MatchCommentaryEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MatchCommentaryEntry() {
    commentaryId_ = "";
    language_ = 0;
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MatchCommentaryEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MatchCommentaryEntry(
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

            commentaryId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            language_ = rawValue;
            break;
          }
          case 24: {

            elapsed_ = input.readInt32();
            break;
          }
          case 32: {

            injury_ = input.readInt32();
            break;
          }
          case 42: {
            com.sts.rpclib.LocalizedName.Builder subBuilder = null;
            if (commentary_ != null) {
              subBuilder = commentary_.toBuilder();
            }
            commentary_ = input.readMessage(com.sts.rpclib.LocalizedName.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commentary_);
              commentary_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            type_ = rawValue;
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
    return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchCommentaryEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchCommentaryEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.MatchCommentaryEntry.class, com.sts.rpclib.MatchCommentaryEntry.Builder.class);
  }

  public static final int COMMENTARYID_FIELD_NUMBER = 1;
  private volatile java.lang.Object commentaryId_;
  /**
   * <code>string commentaryId = 1;</code>
   * @return The commentaryId.
   */
  @java.lang.Override
  public java.lang.String getCommentaryId() {
    java.lang.Object ref = commentaryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commentaryId_ = s;
      return s;
    }
  }
  /**
   * <code>string commentaryId = 1;</code>
   * @return The bytes for commentaryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommentaryIdBytes() {
    java.lang.Object ref = commentaryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      commentaryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_FIELD_NUMBER = 2;
  private int language_;
  /**
   * <code>.com.sts.rpclib.Language language = 2;</code>
   * @return The enum numeric value on the wire for language.
   */
  @java.lang.Override public int getLanguageValue() {
    return language_;
  }
  /**
   * <code>.com.sts.rpclib.Language language = 2;</code>
   * @return The language.
   */
  @java.lang.Override public com.sts.rpclib.Language getLanguage() {
    @SuppressWarnings("deprecation")
    com.sts.rpclib.Language result = com.sts.rpclib.Language.valueOf(language_);
    return result == null ? com.sts.rpclib.Language.UNRECOGNIZED : result;
  }

  public static final int ELAPSED_FIELD_NUMBER = 3;
  private int elapsed_;
  /**
   * <code>int32 elapsed = 3;</code>
   * @return The elapsed.
   */
  @java.lang.Override
  public int getElapsed() {
    return elapsed_;
  }

  public static final int INJURY_FIELD_NUMBER = 4;
  private int injury_;
  /**
   * <code>int32 injury = 4;</code>
   * @return The injury.
   */
  @java.lang.Override
  public int getInjury() {
    return injury_;
  }

  public static final int COMMENTARY_FIELD_NUMBER = 5;
  private com.sts.rpclib.LocalizedName commentary_;
  /**
   * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
   * @return Whether the commentary field is set.
   */
  @java.lang.Override
  public boolean hasCommentary() {
    return commentary_ != null;
  }
  /**
   * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
   * @return The commentary.
   */
  @java.lang.Override
  public com.sts.rpclib.LocalizedName getCommentary() {
    return commentary_ == null ? com.sts.rpclib.LocalizedName.getDefaultInstance() : commentary_;
  }
  /**
   * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.LocalizedNameOrBuilder getCommentaryOrBuilder() {
    return getCommentary();
  }

  public static final int TYPE_FIELD_NUMBER = 6;
  private int type_;
  /**
   * <pre>
   * repeated CommentaryValue text = 7;
   * </pre>
   *
   * <code>.com.sts.rpclib.CommentaryType type = 6;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * repeated CommentaryValue text = 7;
   * </pre>
   *
   * <code>.com.sts.rpclib.CommentaryType type = 6;</code>
   * @return The type.
   */
  @java.lang.Override public com.sts.rpclib.CommentaryType getType() {
    @SuppressWarnings("deprecation")
    com.sts.rpclib.CommentaryType result = com.sts.rpclib.CommentaryType.valueOf(type_);
    return result == null ? com.sts.rpclib.CommentaryType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commentaryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, commentaryId_);
    }
    if (language_ != com.sts.rpclib.Language.UNKNOWN_LANGUAGE.getNumber()) {
      output.writeEnum(2, language_);
    }
    if (elapsed_ != 0) {
      output.writeInt32(3, elapsed_);
    }
    if (injury_ != 0) {
      output.writeInt32(4, injury_);
    }
    if (commentary_ != null) {
      output.writeMessage(5, getCommentary());
    }
    if (type_ != com.sts.rpclib.CommentaryType.UNKNOWN_COMMENTARY_TYPE.getNumber()) {
      output.writeEnum(6, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commentaryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, commentaryId_);
    }
    if (language_ != com.sts.rpclib.Language.UNKNOWN_LANGUAGE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, language_);
    }
    if (elapsed_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, elapsed_);
    }
    if (injury_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, injury_);
    }
    if (commentary_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCommentary());
    }
    if (type_ != com.sts.rpclib.CommentaryType.UNKNOWN_COMMENTARY_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, type_);
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
    if (!(obj instanceof com.sts.rpclib.MatchCommentaryEntry)) {
      return super.equals(obj);
    }
    com.sts.rpclib.MatchCommentaryEntry other = (com.sts.rpclib.MatchCommentaryEntry) obj;

    if (!getCommentaryId()
        .equals(other.getCommentaryId())) return false;
    if (language_ != other.language_) return false;
    if (getElapsed()
        != other.getElapsed()) return false;
    if (getInjury()
        != other.getInjury()) return false;
    if (hasCommentary() != other.hasCommentary()) return false;
    if (hasCommentary()) {
      if (!getCommentary()
          .equals(other.getCommentary())) return false;
    }
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + COMMENTARYID_FIELD_NUMBER;
    hash = (53 * hash) + getCommentaryId().hashCode();
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + language_;
    hash = (37 * hash) + ELAPSED_FIELD_NUMBER;
    hash = (53 * hash) + getElapsed();
    hash = (37 * hash) + INJURY_FIELD_NUMBER;
    hash = (53 * hash) + getInjury();
    if (hasCommentary()) {
      hash = (37 * hash) + COMMENTARY_FIELD_NUMBER;
      hash = (53 * hash) + getCommentary().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.MatchCommentaryEntry parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.MatchCommentaryEntry prototype) {
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
   * Protobuf type {@code com.sts.rpclib.MatchCommentaryEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.MatchCommentaryEntry)
      com.sts.rpclib.MatchCommentaryEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchCommentaryEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchCommentaryEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.MatchCommentaryEntry.class, com.sts.rpclib.MatchCommentaryEntry.Builder.class);
    }

    // Construct using com.sts.rpclib.MatchCommentaryEntry.newBuilder()
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
      commentaryId_ = "";

      language_ = 0;

      elapsed_ = 0;

      injury_ = 0;

      if (commentaryBuilder_ == null) {
        commentary_ = null;
      } else {
        commentary_ = null;
        commentaryBuilder_ = null;
      }
      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchCommentaryEntry_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.MatchCommentaryEntry getDefaultInstanceForType() {
      return com.sts.rpclib.MatchCommentaryEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.MatchCommentaryEntry build() {
      com.sts.rpclib.MatchCommentaryEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.MatchCommentaryEntry buildPartial() {
      com.sts.rpclib.MatchCommentaryEntry result = new com.sts.rpclib.MatchCommentaryEntry(this);
      result.commentaryId_ = commentaryId_;
      result.language_ = language_;
      result.elapsed_ = elapsed_;
      result.injury_ = injury_;
      if (commentaryBuilder_ == null) {
        result.commentary_ = commentary_;
      } else {
        result.commentary_ = commentaryBuilder_.build();
      }
      result.type_ = type_;
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
      if (other instanceof com.sts.rpclib.MatchCommentaryEntry) {
        return mergeFrom((com.sts.rpclib.MatchCommentaryEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.MatchCommentaryEntry other) {
      if (other == com.sts.rpclib.MatchCommentaryEntry.getDefaultInstance()) return this;
      if (!other.getCommentaryId().isEmpty()) {
        commentaryId_ = other.commentaryId_;
        onChanged();
      }
      if (other.language_ != 0) {
        setLanguageValue(other.getLanguageValue());
      }
      if (other.getElapsed() != 0) {
        setElapsed(other.getElapsed());
      }
      if (other.getInjury() != 0) {
        setInjury(other.getInjury());
      }
      if (other.hasCommentary()) {
        mergeCommentary(other.getCommentary());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      com.sts.rpclib.MatchCommentaryEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.MatchCommentaryEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object commentaryId_ = "";
    /**
     * <code>string commentaryId = 1;</code>
     * @return The commentaryId.
     */
    public java.lang.String getCommentaryId() {
      java.lang.Object ref = commentaryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commentaryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string commentaryId = 1;</code>
     * @return The bytes for commentaryId.
     */
    public com.google.protobuf.ByteString
        getCommentaryIdBytes() {
      java.lang.Object ref = commentaryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commentaryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string commentaryId = 1;</code>
     * @param value The commentaryId to set.
     * @return This builder for chaining.
     */
    public Builder setCommentaryId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      commentaryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string commentaryId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommentaryId() {
      
      commentaryId_ = getDefaultInstance().getCommentaryId();
      onChanged();
      return this;
    }
    /**
     * <code>string commentaryId = 1;</code>
     * @param value The bytes for commentaryId to set.
     * @return This builder for chaining.
     */
    public Builder setCommentaryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      commentaryId_ = value;
      onChanged();
      return this;
    }

    private int language_ = 0;
    /**
     * <code>.com.sts.rpclib.Language language = 2;</code>
     * @return The enum numeric value on the wire for language.
     */
    @java.lang.Override public int getLanguageValue() {
      return language_;
    }
    /**
     * <code>.com.sts.rpclib.Language language = 2;</code>
     * @param value The enum numeric value on the wire for language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageValue(int value) {
      
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.Language language = 2;</code>
     * @return The language.
     */
    @java.lang.Override
    public com.sts.rpclib.Language getLanguage() {
      @SuppressWarnings("deprecation")
      com.sts.rpclib.Language result = com.sts.rpclib.Language.valueOf(language_);
      return result == null ? com.sts.rpclib.Language.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.sts.rpclib.Language language = 2;</code>
     * @param value The language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguage(com.sts.rpclib.Language value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      language_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.Language language = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguage() {
      
      language_ = 0;
      onChanged();
      return this;
    }

    private int elapsed_ ;
    /**
     * <code>int32 elapsed = 3;</code>
     * @return The elapsed.
     */
    @java.lang.Override
    public int getElapsed() {
      return elapsed_;
    }
    /**
     * <code>int32 elapsed = 3;</code>
     * @param value The elapsed to set.
     * @return This builder for chaining.
     */
    public Builder setElapsed(int value) {
      
      elapsed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 elapsed = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearElapsed() {
      
      elapsed_ = 0;
      onChanged();
      return this;
    }

    private int injury_ ;
    /**
     * <code>int32 injury = 4;</code>
     * @return The injury.
     */
    @java.lang.Override
    public int getInjury() {
      return injury_;
    }
    /**
     * <code>int32 injury = 4;</code>
     * @param value The injury to set.
     * @return This builder for chaining.
     */
    public Builder setInjury(int value) {
      
      injury_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 injury = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearInjury() {
      
      injury_ = 0;
      onChanged();
      return this;
    }

    private com.sts.rpclib.LocalizedName commentary_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sts.rpclib.LocalizedName, com.sts.rpclib.LocalizedName.Builder, com.sts.rpclib.LocalizedNameOrBuilder> commentaryBuilder_;
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     * @return Whether the commentary field is set.
     */
    public boolean hasCommentary() {
      return commentaryBuilder_ != null || commentary_ != null;
    }
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     * @return The commentary.
     */
    public com.sts.rpclib.LocalizedName getCommentary() {
      if (commentaryBuilder_ == null) {
        return commentary_ == null ? com.sts.rpclib.LocalizedName.getDefaultInstance() : commentary_;
      } else {
        return commentaryBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     */
    public Builder setCommentary(com.sts.rpclib.LocalizedName value) {
      if (commentaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commentary_ = value;
        onChanged();
      } else {
        commentaryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     */
    public Builder setCommentary(
        com.sts.rpclib.LocalizedName.Builder builderForValue) {
      if (commentaryBuilder_ == null) {
        commentary_ = builderForValue.build();
        onChanged();
      } else {
        commentaryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     */
    public Builder mergeCommentary(com.sts.rpclib.LocalizedName value) {
      if (commentaryBuilder_ == null) {
        if (commentary_ != null) {
          commentary_ =
            com.sts.rpclib.LocalizedName.newBuilder(commentary_).mergeFrom(value).buildPartial();
        } else {
          commentary_ = value;
        }
        onChanged();
      } else {
        commentaryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     */
    public Builder clearCommentary() {
      if (commentaryBuilder_ == null) {
        commentary_ = null;
        onChanged();
      } else {
        commentary_ = null;
        commentaryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     */
    public com.sts.rpclib.LocalizedName.Builder getCommentaryBuilder() {
      
      onChanged();
      return getCommentaryFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     */
    public com.sts.rpclib.LocalizedNameOrBuilder getCommentaryOrBuilder() {
      if (commentaryBuilder_ != null) {
        return commentaryBuilder_.getMessageOrBuilder();
      } else {
        return commentary_ == null ?
            com.sts.rpclib.LocalizedName.getDefaultInstance() : commentary_;
      }
    }
    /**
     * <code>.com.sts.rpclib.LocalizedName commentary = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sts.rpclib.LocalizedName, com.sts.rpclib.LocalizedName.Builder, com.sts.rpclib.LocalizedNameOrBuilder> 
        getCommentaryFieldBuilder() {
      if (commentaryBuilder_ == null) {
        commentaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sts.rpclib.LocalizedName, com.sts.rpclib.LocalizedName.Builder, com.sts.rpclib.LocalizedNameOrBuilder>(
                getCommentary(),
                getParentForChildren(),
                isClean());
        commentary_ = null;
      }
      return commentaryBuilder_;
    }

    private int type_ = 0;
    /**
     * <pre>
     * repeated CommentaryValue text = 7;
     * </pre>
     *
     * <code>.com.sts.rpclib.CommentaryType type = 6;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * repeated CommentaryValue text = 7;
     * </pre>
     *
     * <code>.com.sts.rpclib.CommentaryType type = 6;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * repeated CommentaryValue text = 7;
     * </pre>
     *
     * <code>.com.sts.rpclib.CommentaryType type = 6;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.sts.rpclib.CommentaryType getType() {
      @SuppressWarnings("deprecation")
      com.sts.rpclib.CommentaryType result = com.sts.rpclib.CommentaryType.valueOf(type_);
      return result == null ? com.sts.rpclib.CommentaryType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * repeated CommentaryValue text = 7;
     * </pre>
     *
     * <code>.com.sts.rpclib.CommentaryType type = 6;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.sts.rpclib.CommentaryType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * repeated CommentaryValue text = 7;
     * </pre>
     *
     * <code>.com.sts.rpclib.CommentaryType type = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.MatchCommentaryEntry)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.MatchCommentaryEntry)
  private static final com.sts.rpclib.MatchCommentaryEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.MatchCommentaryEntry();
  }

  public static com.sts.rpclib.MatchCommentaryEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatchCommentaryEntry>
      PARSER = new com.google.protobuf.AbstractParser<MatchCommentaryEntry>() {
    @java.lang.Override
    public MatchCommentaryEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MatchCommentaryEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MatchCommentaryEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatchCommentaryEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.MatchCommentaryEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
