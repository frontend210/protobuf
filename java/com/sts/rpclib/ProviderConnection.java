// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.sts.rpclib;

/**
 * Protobuf enum {@code com.sts.rpclib.ProviderConnection}
 */
public enum ProviderConnection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PROVIDER_CONNECTED = 0;</code>
   */
  PROVIDER_CONNECTED(0),
  /**
   * <code>PROVIDER_DISCONNECTED = 1;</code>
   */
  PROVIDER_DISCONNECTED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PROVIDER_CONNECTED = 0;</code>
   */
  public static final int PROVIDER_CONNECTED_VALUE = 0;
  /**
   * <code>PROVIDER_DISCONNECTED = 1;</code>
   */
  public static final int PROVIDER_DISCONNECTED_VALUE = 1;


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
  public static ProviderConnection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProviderConnection forNumber(int value) {
    switch (value) {
      case 0: return PROVIDER_CONNECTED;
      case 1: return PROVIDER_DISCONNECTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProviderConnection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProviderConnection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProviderConnection>() {
          public ProviderConnection findValueByNumber(int number) {
            return ProviderConnection.forNumber(number);
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
    return com.sts.rpclib.Enums.getDescriptor().getEnumTypes().get(22);
  }

  private static final ProviderConnection[] VALUES = values();

  public static ProviderConnection valueOf(
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

  private ProviderConnection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sts.rpclib.ProviderConnection)
}

