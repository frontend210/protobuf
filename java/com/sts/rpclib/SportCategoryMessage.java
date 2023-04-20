// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: categories.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.SportCategoryMessage}
 */
public final class SportCategoryMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.SportCategoryMessage)
    SportCategoryMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SportCategoryMessage.newBuilder() to construct.
  private SportCategoryMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SportCategoryMessage() {
    season_ = "";
    sport_ = 0;
    category_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SportCategoryMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SportCategoryMessage(
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
            java.lang.String s = input.readStringRequireUtf8();

            season_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            sport_ = rawValue;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              category_ = new java.util.ArrayList<com.sts.rpclib.CategoryMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            category_.add(
                input.readMessage(com.sts.rpclib.CategoryMessage.parser(), extensionRegistry));
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
        category_ = java.util.Collections.unmodifiableList(category_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Categories.internal_static_com_sts_rpclib_SportCategoryMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Categories.internal_static_com_sts_rpclib_SportCategoryMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.SportCategoryMessage.class, com.sts.rpclib.SportCategoryMessage.Builder.class);
  }

  public static final int SEASON_FIELD_NUMBER = 1;
  private volatile java.lang.Object season_;
  /**
   * <code>string season = 1;</code>
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
   * <code>string season = 1;</code>
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

  public static final int SPORT_FIELD_NUMBER = 2;
  private int sport_;
  /**
   * <code>.com.sts.rpclib.Sport sport = 2;</code>
   * @return The enum numeric value on the wire for sport.
   */
  @java.lang.Override public int getSportValue() {
    return sport_;
  }
  /**
   * <code>.com.sts.rpclib.Sport sport = 2;</code>
   * @return The sport.
   */
  @java.lang.Override public com.sts.rpclib.Sport getSport() {
    @SuppressWarnings("deprecation")
    com.sts.rpclib.Sport result = com.sts.rpclib.Sport.valueOf(sport_);
    return result == null ? com.sts.rpclib.Sport.UNRECOGNIZED : result;
  }

  public static final int CATEGORY_FIELD_NUMBER = 3;
  private java.util.List<com.sts.rpclib.CategoryMessage> category_;
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.sts.rpclib.CategoryMessage> getCategoryList() {
    return category_;
  }
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sts.rpclib.CategoryMessageOrBuilder> 
      getCategoryOrBuilderList() {
    return category_;
  }
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  @java.lang.Override
  public int getCategoryCount() {
    return category_.size();
  }
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.CategoryMessage getCategory(int index) {
    return category_.get(index);
  }
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.CategoryMessageOrBuilder getCategoryOrBuilder(
      int index) {
    return category_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(season_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, season_);
    }
    if (sport_ != com.sts.rpclib.Sport.UNKNOWN_SPORT.getNumber()) {
      output.writeEnum(2, sport_);
    }
    for (int i = 0; i < category_.size(); i++) {
      output.writeMessage(3, category_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(season_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, season_);
    }
    if (sport_ != com.sts.rpclib.Sport.UNKNOWN_SPORT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, sport_);
    }
    for (int i = 0; i < category_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, category_.get(i));
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
    if (!(obj instanceof com.sts.rpclib.SportCategoryMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.SportCategoryMessage other = (com.sts.rpclib.SportCategoryMessage) obj;

    if (!getSeason()
        .equals(other.getSeason())) return false;
    if (sport_ != other.sport_) return false;
    if (!getCategoryList()
        .equals(other.getCategoryList())) return false;
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
    hash = (37 * hash) + SEASON_FIELD_NUMBER;
    hash = (53 * hash) + getSeason().hashCode();
    hash = (37 * hash) + SPORT_FIELD_NUMBER;
    hash = (53 * hash) + sport_;
    if (getCategoryCount() > 0) {
      hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getCategoryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.SportCategoryMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.SportCategoryMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.SportCategoryMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.SportCategoryMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.SportCategoryMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.SportCategoryMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.SportCategoryMessage)
      com.sts.rpclib.SportCategoryMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Categories.internal_static_com_sts_rpclib_SportCategoryMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Categories.internal_static_com_sts_rpclib_SportCategoryMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.SportCategoryMessage.class, com.sts.rpclib.SportCategoryMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.SportCategoryMessage.newBuilder()
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
        getCategoryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      season_ = "";

      sport_ = 0;

      if (categoryBuilder_ == null) {
        category_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        categoryBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Categories.internal_static_com_sts_rpclib_SportCategoryMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.SportCategoryMessage getDefaultInstanceForType() {
      return com.sts.rpclib.SportCategoryMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.SportCategoryMessage build() {
      com.sts.rpclib.SportCategoryMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.SportCategoryMessage buildPartial() {
      com.sts.rpclib.SportCategoryMessage result = new com.sts.rpclib.SportCategoryMessage(this);
      int from_bitField0_ = bitField0_;
      result.season_ = season_;
      result.sport_ = sport_;
      if (categoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          category_ = java.util.Collections.unmodifiableList(category_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.category_ = category_;
      } else {
        result.category_ = categoryBuilder_.build();
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
      if (other instanceof com.sts.rpclib.SportCategoryMessage) {
        return mergeFrom((com.sts.rpclib.SportCategoryMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.SportCategoryMessage other) {
      if (other == com.sts.rpclib.SportCategoryMessage.getDefaultInstance()) return this;
      if (!other.getSeason().isEmpty()) {
        season_ = other.season_;
        onChanged();
      }
      if (other.sport_ != 0) {
        setSportValue(other.getSportValue());
      }
      if (categoryBuilder_ == null) {
        if (!other.category_.isEmpty()) {
          if (category_.isEmpty()) {
            category_ = other.category_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCategoryIsMutable();
            category_.addAll(other.category_);
          }
          onChanged();
        }
      } else {
        if (!other.category_.isEmpty()) {
          if (categoryBuilder_.isEmpty()) {
            categoryBuilder_.dispose();
            categoryBuilder_ = null;
            category_ = other.category_;
            bitField0_ = (bitField0_ & ~0x00000001);
            categoryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCategoryFieldBuilder() : null;
          } else {
            categoryBuilder_.addAllMessages(other.category_);
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
      com.sts.rpclib.SportCategoryMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.SportCategoryMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object season_ = "";
    /**
     * <code>string season = 1;</code>
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
     * <code>string season = 1;</code>
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
     * <code>string season = 1;</code>
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
     * <code>string season = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeason() {
      
      season_ = getDefaultInstance().getSeason();
      onChanged();
      return this;
    }
    /**
     * <code>string season = 1;</code>
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
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @return The enum numeric value on the wire for sport.
     */
    @java.lang.Override public int getSportValue() {
      return sport_;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @param value The enum numeric value on the wire for sport to set.
     * @return This builder for chaining.
     */
    public Builder setSportValue(int value) {
      
      sport_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @return The sport.
     */
    @java.lang.Override
    public com.sts.rpclib.Sport getSport() {
      @SuppressWarnings("deprecation")
      com.sts.rpclib.Sport result = com.sts.rpclib.Sport.valueOf(sport_);
      return result == null ? com.sts.rpclib.Sport.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
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
     * <code>.com.sts.rpclib.Sport sport = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSport() {
      
      sport_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.sts.rpclib.CategoryMessage> category_ =
      java.util.Collections.emptyList();
    private void ensureCategoryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        category_ = new java.util.ArrayList<com.sts.rpclib.CategoryMessage>(category_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.CategoryMessage, com.sts.rpclib.CategoryMessage.Builder, com.sts.rpclib.CategoryMessageOrBuilder> categoryBuilder_;

    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public java.util.List<com.sts.rpclib.CategoryMessage> getCategoryList() {
      if (categoryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(category_);
      } else {
        return categoryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public int getCategoryCount() {
      if (categoryBuilder_ == null) {
        return category_.size();
      } else {
        return categoryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public com.sts.rpclib.CategoryMessage getCategory(int index) {
      if (categoryBuilder_ == null) {
        return category_.get(index);
      } else {
        return categoryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder setCategory(
        int index, com.sts.rpclib.CategoryMessage value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.set(index, value);
        onChanged();
      } else {
        categoryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder setCategory(
        int index, com.sts.rpclib.CategoryMessage.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.set(index, builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder addCategory(com.sts.rpclib.CategoryMessage value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.add(value);
        onChanged();
      } else {
        categoryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder addCategory(
        int index, com.sts.rpclib.CategoryMessage value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.add(index, value);
        onChanged();
      } else {
        categoryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder addCategory(
        com.sts.rpclib.CategoryMessage.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.add(builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder addCategory(
        int index, com.sts.rpclib.CategoryMessage.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.add(index, builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder addAllCategory(
        java.lang.Iterable<? extends com.sts.rpclib.CategoryMessage> values) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, category_);
        onChanged();
      } else {
        categoryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder clearCategory() {
      if (categoryBuilder_ == null) {
        category_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        categoryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public Builder removeCategory(int index) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.remove(index);
        onChanged();
      } else {
        categoryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public com.sts.rpclib.CategoryMessage.Builder getCategoryBuilder(
        int index) {
      return getCategoryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public com.sts.rpclib.CategoryMessageOrBuilder getCategoryOrBuilder(
        int index) {
      if (categoryBuilder_ == null) {
        return category_.get(index);  } else {
        return categoryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public java.util.List<? extends com.sts.rpclib.CategoryMessageOrBuilder> 
         getCategoryOrBuilderList() {
      if (categoryBuilder_ != null) {
        return categoryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(category_);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public com.sts.rpclib.CategoryMessage.Builder addCategoryBuilder() {
      return getCategoryFieldBuilder().addBuilder(
          com.sts.rpclib.CategoryMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public com.sts.rpclib.CategoryMessage.Builder addCategoryBuilder(
        int index) {
      return getCategoryFieldBuilder().addBuilder(
          index, com.sts.rpclib.CategoryMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
     */
    public java.util.List<com.sts.rpclib.CategoryMessage.Builder> 
         getCategoryBuilderList() {
      return getCategoryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.CategoryMessage, com.sts.rpclib.CategoryMessage.Builder, com.sts.rpclib.CategoryMessageOrBuilder> 
        getCategoryFieldBuilder() {
      if (categoryBuilder_ == null) {
        categoryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sts.rpclib.CategoryMessage, com.sts.rpclib.CategoryMessage.Builder, com.sts.rpclib.CategoryMessageOrBuilder>(
                category_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        category_ = null;
      }
      return categoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.SportCategoryMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.SportCategoryMessage)
  private static final com.sts.rpclib.SportCategoryMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.SportCategoryMessage();
  }

  public static com.sts.rpclib.SportCategoryMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SportCategoryMessage>
      PARSER = new com.google.protobuf.AbstractParser<SportCategoryMessage>() {
    @java.lang.Override
    public SportCategoryMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SportCategoryMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SportCategoryMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SportCategoryMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.SportCategoryMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

