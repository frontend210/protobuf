// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.sts.rpclib;

/**
 * Protobuf enum {@code com.sts.rpclib.ElapsedType}
 */
public enum ElapsedType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_ELAPSED = 0;</code>
   */
  UNKNOWN_ELAPSED(0),
  /**
   * <code>MINUTES = 1;</code>
   */
  MINUTES(1),
  /**
   * <code>SECONDS = 2;</code>
   */
  SECONDS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_ELAPSED = 0;</code>
   */
  public static final int UNKNOWN_ELAPSED_VALUE = 0;
  /**
   * <code>MINUTES = 1;</code>
   */
  public static final int MINUTES_VALUE = 1;
  /**
   * <code>SECONDS = 2;</code>
   */
  public static final int SECONDS_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ElapsedType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ElapsedType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_ELAPSED;
      case 1: return MINUTES;
      case 2: return SECONDS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ElapsedType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ElapsedType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ElapsedType>() {
          public ElapsedType findValueByNumber(int number) {
            return ElapsedType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.sts.rpclib.Enums.getDescriptor().getEnumTypes().get(4);
  }

  private static final ElapsedType[] VALUES = values();

  public static ElapsedType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ElapsedType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sts.rpclib.ElapsedType)
}

