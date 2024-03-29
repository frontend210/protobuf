// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: match.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.MatchStatsMessage}
 */
public final class MatchStatsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.MatchStatsMessage)
    MatchStatsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MatchStatsMessage.newBuilder() to construct.
  private MatchStatsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MatchStatsMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MatchStatsMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchStatsMessage_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 15:
        return internalGetStats();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchStatsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.MatchStatsMessage.class, com.sts.rpclib.MatchStatsMessage.Builder.class);
  }

  public static final int TEAMPOSITION_FIELD_NUMBER = 1;
  private int teamPosition_ = 0;
  /**
   * <code>int32 teamPosition = 1;</code>
   * @return The teamPosition.
   */
  @java.lang.Override
  public int getTeamPosition() {
    return teamPosition_;
  }

  public static final int STATS_FIELD_NUMBER = 15;
  private static final class StatsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchStatsMessage_StatsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Integer> stats_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
  internalGetStats() {
    if (stats_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          StatsDefaultEntryHolder.defaultEntry);
    }
    return stats_;
  }
  public int getStatsCount() {
    return internalGetStats().getMap().size();
  }
  /**
   * <code>map&lt;int32, int32&gt; stats = 15;</code>
   */
  @java.lang.Override
  public boolean containsStats(
      int key) {

    return internalGetStats().getMap().containsKey(key);
  }
  /**
   * Use {@link #getStatsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Integer> getStats() {
    return getStatsMap();
  }
  /**
   * <code>map&lt;int32, int32&gt; stats = 15;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, java.lang.Integer> getStatsMap() {
    return internalGetStats().getMap();
  }
  /**
   * <code>map&lt;int32, int32&gt; stats = 15;</code>
   */
  @java.lang.Override
  public int getStatsOrDefault(
      int key,
      int defaultValue) {

    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetStats().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, int32&gt; stats = 15;</code>
   */
  @java.lang.Override
  public int getStatsOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetStats().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (teamPosition_ != 0) {
      output.writeInt32(1, teamPosition_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetStats(),
        StatsDefaultEntryHolder.defaultEntry,
        15);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (teamPosition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, teamPosition_);
    }
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
         : internalGetStats().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
      stats__ = StatsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, stats__);
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
    if (!(obj instanceof com.sts.rpclib.MatchStatsMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.MatchStatsMessage other = (com.sts.rpclib.MatchStatsMessage) obj;

    if (getTeamPosition()
        != other.getTeamPosition()) return false;
    if (!internalGetStats().equals(
        other.internalGetStats())) return false;
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
    hash = (37 * hash) + TEAMPOSITION_FIELD_NUMBER;
    hash = (53 * hash) + getTeamPosition();
    if (!internalGetStats().getMap().isEmpty()) {
      hash = (37 * hash) + STATS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetStats().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.MatchStatsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sts.rpclib.MatchStatsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sts.rpclib.MatchStatsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.MatchStatsMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.MatchStatsMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.MatchStatsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.MatchStatsMessage)
      com.sts.rpclib.MatchStatsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchStatsMessage_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 15:
          return internalGetStats();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 15:
          return internalGetMutableStats();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchStatsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.MatchStatsMessage.class, com.sts.rpclib.MatchStatsMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.MatchStatsMessage.newBuilder()
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
      teamPosition_ = 0;
      internalGetMutableStats().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchStatsMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.MatchStatsMessage getDefaultInstanceForType() {
      return com.sts.rpclib.MatchStatsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.MatchStatsMessage build() {
      com.sts.rpclib.MatchStatsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.MatchStatsMessage buildPartial() {
      com.sts.rpclib.MatchStatsMessage result = new com.sts.rpclib.MatchStatsMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.sts.rpclib.MatchStatsMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.teamPosition_ = teamPosition_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stats_ = internalGetStats();
        result.stats_.makeImmutable();
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
      if (other instanceof com.sts.rpclib.MatchStatsMessage) {
        return mergeFrom((com.sts.rpclib.MatchStatsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.MatchStatsMessage other) {
      if (other == com.sts.rpclib.MatchStatsMessage.getDefaultInstance()) return this;
      if (other.getTeamPosition() != 0) {
        setTeamPosition(other.getTeamPosition());
      }
      internalGetMutableStats().mergeFrom(
          other.internalGetStats());
      bitField0_ |= 0x00000002;
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
              teamPosition_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 122: {
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              stats__ = input.readMessage(
                  StatsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableStats().getMutableMap().put(
                  stats__.getKey(), stats__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 122
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

    private int teamPosition_ ;
    /**
     * <code>int32 teamPosition = 1;</code>
     * @return The teamPosition.
     */
    @java.lang.Override
    public int getTeamPosition() {
      return teamPosition_;
    }
    /**
     * <code>int32 teamPosition = 1;</code>
     * @param value The teamPosition to set.
     * @return This builder for chaining.
     */
    public Builder setTeamPosition(int value) {

      teamPosition_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 teamPosition = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeamPosition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      teamPosition_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> stats_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
        internalGetStats() {
      if (stats_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StatsDefaultEntryHolder.defaultEntry);
      }
      return stats_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
        internalGetMutableStats() {
      if (stats_ == null) {
        stats_ = com.google.protobuf.MapField.newMapField(
            StatsDefaultEntryHolder.defaultEntry);
      }
      if (!stats_.isMutable()) {
        stats_ = stats_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return stats_;
    }
    public int getStatsCount() {
      return internalGetStats().getMap().size();
    }
    /**
     * <code>map&lt;int32, int32&gt; stats = 15;</code>
     */
    @java.lang.Override
    public boolean containsStats(
        int key) {

      return internalGetStats().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStatsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getStats() {
      return getStatsMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; stats = 15;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getStatsMap() {
      return internalGetStats().getMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; stats = 15;</code>
     */
    @java.lang.Override
    public int getStatsOrDefault(
        int key,
        int defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetStats().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, int32&gt; stats = 15;</code>
     */
    @java.lang.Override
    public int getStatsOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetStats().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearStats() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableStats().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, int32&gt; stats = 15;</code>
     */
    public Builder removeStats(
        int key) {

      internalGetMutableStats().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer>
        getMutableStats() {
      bitField0_ |= 0x00000002;
      return internalGetMutableStats().getMutableMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; stats = 15;</code>
     */
    public Builder putStats(
        int key,
        int value) {


      internalGetMutableStats().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;int32, int32&gt; stats = 15;</code>
     */
    public Builder putAllStats(
        java.util.Map<java.lang.Integer, java.lang.Integer> values) {
      internalGetMutableStats().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.MatchStatsMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.MatchStatsMessage)
  private static final com.sts.rpclib.MatchStatsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.MatchStatsMessage();
  }

  public static com.sts.rpclib.MatchStatsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatchStatsMessage>
      PARSER = new com.google.protobuf.AbstractParser<MatchStatsMessage>() {
    @java.lang.Override
    public MatchStatsMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<MatchStatsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatchStatsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.MatchStatsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

