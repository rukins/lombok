public class SuperBuilderNestedGenericTypes {
  public static abstract @lombok.experimental.SuperBuilder class Generic<T extends Generic<?>> {
    public static abstract @java.lang.SuppressWarnings("all") @lombok.Generated class GenericBuilder<T extends Generic<?>, C extends SuperBuilderNestedGenericTypes.Generic<T>, B extends SuperBuilderNestedGenericTypes.Generic.GenericBuilder<T, C, B>> {
      public GenericBuilder() {
        super();
      }
      protected abstract @java.lang.SuppressWarnings("all") @lombok.Generated B self();
      public abstract @java.lang.SuppressWarnings("all") @lombok.Generated C build();
      public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
        return "SuperBuilderNestedGenericTypes.Generic.GenericBuilder()";
      }
    }
    protected @java.lang.SuppressWarnings("all") @lombok.Generated Generic(final SuperBuilderNestedGenericTypes.Generic.GenericBuilder<T, ?, ?> b) {
      super();
    }
  }
  public static abstract @lombok.experimental.SuperBuilder class NestedGeneric<T extends OtherGeneric<?>> extends Generic<NestedGeneric<? extends OtherGeneric<?>>> {
    public static abstract @java.lang.SuppressWarnings("all") @lombok.Generated class NestedGenericBuilder<T extends OtherGeneric<?>, C extends SuperBuilderNestedGenericTypes.NestedGeneric<T>, B extends SuperBuilderNestedGenericTypes.NestedGeneric.NestedGenericBuilder<T, C, B>> extends Generic.GenericBuilder<NestedGeneric<? extends OtherGeneric<?>>, C, B> {
      public NestedGenericBuilder() {
        super();
      }
      protected abstract @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated B self();
      public abstract @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated C build();
      public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
        return (("SuperBuilderNestedGenericTypes.NestedGeneric.NestedGenericBuilder(super=" + super.toString()) + ")");
      }
    }
    protected @java.lang.SuppressWarnings("all") @lombok.Generated NestedGeneric(final SuperBuilderNestedGenericTypes.NestedGeneric.NestedGenericBuilder<T, ?, ?> b) {
      super(b);
    }
  }
  public interface OtherGeneric<T> {
  }
  public SuperBuilderNestedGenericTypes() {
    super();
  }
}
