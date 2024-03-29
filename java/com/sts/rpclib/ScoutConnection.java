// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.sts.rpclib;

/**
 * Protobuf enum {@code com.sts.rpclib.ScoutConnection}
 */
public enum ScoutConnection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_SCOUT_CONNECTION = 0;</code>
   */
  UNKNOWN_SCOUT_CONNECTION(0),
  /**
   * <code>SCOUT_CONNECTED = 1;</code>
   */
  SCOUT_CONNECTED(1),
  /**
   * <code>SCOUT_DISCONNECTED = 2;</code>
   */
  SCOUT_DISCONNECTED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_SCOUT_CONNECTION = 0;</code>
   */
  public static final int UNKNOWN_SCOUT_CONNECTION_VALUE = 0;
  /**
   * <code>SCOUT_CONNECTED = 1;</code>
   */
  public static final int SCOUT_CONNECTED_VALUE = 1;
  /**
   * <code>SCOUT_DISCONNECTED = 2;</code>
   */
  public static final int SCOUT_DISCONNECTED_VALUE = 2;


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
  public static ScoutConnection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ScoutConnection forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_SCOUT_CONNECTION;
      case 1: return SCOUT_CONNECTED;
      case 2: return SCOUT_DISCONNECTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ScoutConnection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ScoutConnection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ScoutConnection>() {
          public ScoutConnection findValueByNumber(int number) {
            return ScoutConnection.forNumber(number);
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
    return com.sts.rpclib.Enums.getDescriptor().getEnumTypes().get(3);
  }

  private static final ScoutConnection[] VALUES = values();

  public static ScoutConnection valueOf(
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

  private ScoutConnection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sts.rpclib.ScoutConnection)
}

