// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AStarMethod.proto

package emu.grasscutter.net.proto;

public final class AStarMethodOuterClass {
  private AStarMethodOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AStarMethod}
   */
  public enum AStarMethod
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>A_STAR_METHOD_CLASSIC = 0;</code>
     */
    A_STAR_METHOD_CLASSIC(0),
    /**
     * <code>A_STAR_METHOD_TENDENCY = 1;</code>
     */
    A_STAR_METHOD_TENDENCY(1),
    /**
     * <code>A_STAR_METHOD_ADAPTIVE = 2;</code>
     */
    A_STAR_METHOD_ADAPTIVE(2),
    /**
     * <code>A_STAR_METHOD_INFLECTION = 3;</code>
     */
    A_STAR_METHOD_INFLECTION(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>A_STAR_METHOD_CLASSIC = 0;</code>
     */
    public static final int A_STAR_METHOD_CLASSIC_VALUE = 0;
    /**
     * <code>A_STAR_METHOD_TENDENCY = 1;</code>
     */
    public static final int A_STAR_METHOD_TENDENCY_VALUE = 1;
    /**
     * <code>A_STAR_METHOD_ADAPTIVE = 2;</code>
     */
    public static final int A_STAR_METHOD_ADAPTIVE_VALUE = 2;
    /**
     * <code>A_STAR_METHOD_INFLECTION = 3;</code>
     */
    public static final int A_STAR_METHOD_INFLECTION_VALUE = 3;


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
    public static AStarMethod valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AStarMethod forNumber(int value) {
      switch (value) {
        case 0: return A_STAR_METHOD_CLASSIC;
        case 1: return A_STAR_METHOD_TENDENCY;
        case 2: return A_STAR_METHOD_ADAPTIVE;
        case 3: return A_STAR_METHOD_INFLECTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AStarMethod>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AStarMethod> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AStarMethod>() {
            public AStarMethod findValueByNumber(int number) {
              return AStarMethod.forNumber(number);
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
      return emu.grasscutter.net.proto.AStarMethodOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AStarMethod[] VALUES = values();

    public static AStarMethod valueOf(
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

    private AStarMethod(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AStarMethod)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AStarMethod.proto*~\n\013AStarMethod\022\031\n\025A_" +
      "STAR_METHOD_CLASSIC\020\000\022\032\n\026A_STAR_METHOD_T" +
      "ENDENCY\020\001\022\032\n\026A_STAR_METHOD_ADAPTIVE\020\002\022\034\n" +
      "\030A_STAR_METHOD_INFLECTION\020\003B\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}