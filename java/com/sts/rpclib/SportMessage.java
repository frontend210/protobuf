// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sports.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.SportMessage}
 */
public final class SportMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.SportMessage)
    SportMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SportMessage.newBuilder() to construct.
  private SportMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SportMessage() {
    sport_ = 0;
    name_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SportMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Sports.internal_static_com_sts_rpclib_SportMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Sports.internal_static_com_sts_rpclib_SportMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.SportMessage.class, com.sts.rpclib.SportMessage.Builder.class);
  }

  public static final int SPORT_FIELD_NUMBER = 1;
  private int sport_ = 0;
  /**
   * <code>.com.sts.rpclib.Sport sport = 1;</code>
   * @return The enum numeric value on the wire for sport.
   */
  @java.lang.Override public int getSportValue() {
    return sport_;
  }
  /**
   * <code>.com.sts.rpclib.Sport sport = 1;</code>
   * @return The sport.
   */
  @java.lang.Override public com.sts.rpclib.Sport getSport() {
    com.sts.rpclib.Sport result = com.sts.rpclib.Sport.forNumber(sport_);
    return result == null ? com.sts.rpclib.Sport.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.sts.rpclib.LocalizedName> name_;
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.sts.rpclib.LocalizedName> getNameList() {
    return name_;
  }
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sts.rpclib.LocalizedNameOrBuilder> 
      getNameOrBuilderList() {
    return name_;
  }
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  @java.lang.Override
  public int getNameCount() {
    return name_.size();
  }
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.LocalizedName getName(int index) {
    return name_.get(index);
  }
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.LocalizedNameOrBuilder getNameOrBuilder(
      int index) {
    return name_.get(index);
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
    if (sport_ != com.sts.rpclib.Sport.UNKNOWN_SPORT.getNumber()) {
      output.writeEnum(1, sport_);
    }
    for (int i = 0; i < name_.size(); i++) {
      output.writeMessage(2, name_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sport_ != com.sts.rpclib.Sport.UNKNOWN_SPORT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, sport_);
    }
    for (int i = 0; i < name_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, name_.get(i));
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
    if (!(obj instanceof com.sts.rpclib.SportMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.SportMessage other = (com.sts.rpclib.SportMessage) obj;

    if (sport_ != other.sport_) return false;
    if (!getNameList()
        .equals(other.getNameList())) return false;
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
    hash = (37 * hash) + SPORT_FIELD_NUMBER;
    hash = (53 * hash) + sport_;
    if (getNameCount() > 0) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getNameList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.SportMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.SportMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.SportMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.SportMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.SportMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.SportMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.SportMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.SportMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sts.rpclib.SportMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sts.rpclib.SportMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.SportMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.SportMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.SportMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.SportMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.SportMessage)
      com.sts.rpclib.SportMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Sports.internal_static_com_sts_rpclib_SportMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Sports.internal_static_com_sts_rpclib_SportMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.SportMessage.class, com.sts.rpclib.SportMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.SportMessage.newBuilder()
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
      sport_ = 0;
      if (nameBuilder_ == null) {
        name_ = java.util.Collections.emptyList();
      } else {
        name_ = null;
        nameBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Sports.internal_static_com_sts_rpclib_SportMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.SportMessage getDefaultInstanceForType() {
      return com.sts.rpclib.SportMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.SportMessage build() {
      com.sts.rpclib.SportMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.SportMessage buildPartial() {
      com.sts.rpclib.SportMessage result = new com.sts.rpclib.SportMessage(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.sts.rpclib.SportMessage result) {
      if (nameBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          name_ = java.util.Collections.unmodifiableList(name_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
    }

    private void buildPartial0(com.sts.rpclib.SportMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sport_ = sport_;
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
      if (other instanceof com.sts.rpclib.SportMessage) {
        return mergeFrom((com.sts.rpclib.SportMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.SportMessage other) {
      if (other == com.sts.rpclib.SportMessage.getDefaultInstance()) return this;
      if (other.sport_ != 0) {
        setSportValue(other.getSportValue());
      }
      if (nameBuilder_ == null) {
        if (!other.name_.isEmpty()) {
          if (name_.isEmpty()) {
            name_ = other.name_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNameIsMutable();
            name_.addAll(other.name_);
          }
          onChanged();
        }
      } else {
        if (!other.name_.isEmpty()) {
          if (nameBuilder_.isEmpty()) {
            nameBuilder_.dispose();
            nameBuilder_ = null;
            name_ = other.name_;
            bitField0_ = (bitField0_ & ~0x00000002);
            nameBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNameFieldBuilder() : null;
          } else {
            nameBuilder_.addAllMessages(other.name_);
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
            case 8: {
              sport_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.sts.rpclib.LocalizedName m =
                  input.readMessage(
                      com.sts.rpclib.LocalizedName.parser(),
                      extensionRegistry);
              if (nameBuilder_ == null) {
                ensureNameIsMutable();
                name_.add(m);
              } else {
                nameBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private int sport_ = 0;
    /**
     * <code>.com.sts.rpclib.Sport sport = 1;</code>
     * @return The enum numeric value on the wire for sport.
     */
    @java.lang.Override public int getSportValue() {
      return sport_;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 1;</code>
     * @param value The enum numeric value on the wire for sport to set.
     * @return This builder for chaining.
     */
    public Builder setSportValue(int value) {
      sport_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 1;</code>
     * @return The sport.
     */
    @java.lang.Override
    public com.sts.rpclib.Sport getSport() {
      com.sts.rpclib.Sport result = com.sts.rpclib.Sport.forNumber(sport_);
      return result == null ? com.sts.rpclib.Sport.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 1;</code>
     * @param value The sport to set.
     * @return This builder for chaining.
     */
    public Builder setSport(com.sts.rpclib.Sport value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      sport_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.sts.rpclib.Sport sport = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSport() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sport_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.sts.rpclib.LocalizedName> name_ =
      java.util.Collections.emptyList();
    private void ensureNameIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        name_ = new java.util.ArrayList<com.sts.rpclib.LocalizedName>(name_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.LocalizedName, com.sts.rpclib.LocalizedName.Builder, com.sts.rpclib.LocalizedNameOrBuilder> nameBuilder_;

    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public java.util.List<com.sts.rpclib.LocalizedName> getNameList() {
      if (nameBuilder_ == null) {
        return java.util.Collections.unmodifiableList(name_);
      } else {
        return nameBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public int getNameCount() {
      if (nameBuilder_ == null) {
        return name_.size();
      } else {
        return nameBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public com.sts.rpclib.LocalizedName getName(int index) {
      if (nameBuilder_ == null) {
        return name_.get(index);
      } else {
        return nameBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder setName(
        int index, com.sts.rpclib.LocalizedName value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNameIsMutable();
        name_.set(index, value);
        onChanged();
      } else {
        nameBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder setName(
        int index, com.sts.rpclib.LocalizedName.Builder builderForValue) {
      if (nameBuilder_ == null) {
        ensureNameIsMutable();
        name_.set(index, builderForValue.build());
        onChanged();
      } else {
        nameBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder addName(com.sts.rpclib.LocalizedName value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNameIsMutable();
        name_.add(value);
        onChanged();
      } else {
        nameBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder addName(
        int index, com.sts.rpclib.LocalizedName value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNameIsMutable();
        name_.add(index, value);
        onChanged();
      } else {
        nameBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder addName(
        com.sts.rpclib.LocalizedName.Builder builderForValue) {
      if (nameBuilder_ == null) {
        ensureNameIsMutable();
        name_.add(builderForValue.build());
        onChanged();
      } else {
        nameBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder addName(
        int index, com.sts.rpclib.LocalizedName.Builder builderForValue) {
      if (nameBuilder_ == null) {
        ensureNameIsMutable();
        name_.add(index, builderForValue.build());
        onChanged();
      } else {
        nameBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder addAllName(
        java.lang.Iterable<? extends com.sts.rpclib.LocalizedName> values) {
      if (nameBuilder_ == null) {
        ensureNameIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, name_);
        onChanged();
      } else {
        nameBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        nameBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public Builder removeName(int index) {
      if (nameBuilder_ == null) {
        ensureNameIsMutable();
        name_.remove(index);
        onChanged();
      } else {
        nameBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public com.sts.rpclib.LocalizedName.Builder getNameBuilder(
        int index) {
      return getNameFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public com.sts.rpclib.LocalizedNameOrBuilder getNameOrBuilder(
        int index) {
      if (nameBuilder_ == null) {
        return name_.get(index);  } else {
        return nameBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public java.util.List<? extends com.sts.rpclib.LocalizedNameOrBuilder> 
         getNameOrBuilderList() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(name_);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public com.sts.rpclib.LocalizedName.Builder addNameBuilder() {
      return getNameFieldBuilder().addBuilder(
          com.sts.rpclib.LocalizedName.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public com.sts.rpclib.LocalizedName.Builder addNameBuilder(
        int index) {
      return getNameFieldBuilder().addBuilder(
          index, com.sts.rpclib.LocalizedName.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.LocalizedName name = 2;</code>
     */
    public java.util.List<com.sts.rpclib.LocalizedName.Builder> 
         getNameBuilderList() {
      return getNameFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.LocalizedName, com.sts.rpclib.LocalizedName.Builder, com.sts.rpclib.LocalizedNameOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sts.rpclib.LocalizedName, com.sts.rpclib.LocalizedName.Builder, com.sts.rpclib.LocalizedNameOrBuilder>(
                name_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.SportMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.SportMessage)
  private static final com.sts.rpclib.SportMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.SportMessage();
  }

  public static com.sts.rpclib.SportMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SportMessage>
      PARSER = new com.google.protobuf.AbstractParser<SportMessage>() {
    @java.lang.Override
    public SportMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<SportMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SportMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.SportMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

