import java.util.List;
public class SuperBuilderWithNonNull {
  public static @lombok.experimental.SuperBuilder class Parent {
    public static abstract @java.lang.SuppressWarnings("all") @lombok.Generated class ParentBuilder<C extends SuperBuilderWithNonNull.Parent, B extends SuperBuilderWithNonNull.Parent.ParentBuilder<C, B>> {
      private @java.lang.SuppressWarnings("all") @lombok.Generated String nonNullParentField$value;
      private @java.lang.SuppressWarnings("all") @lombok.Generated boolean nonNullParentField$set;
      public ParentBuilder() {
        super();
      }
      /**
       * @return {@code this}.
       */
      public @java.lang.SuppressWarnings("all") @lombok.Generated B nonNullParentField(final @lombok.NonNull String nonNullParentField) {
        if ((nonNullParentField == null))
            {
              throw new java.lang.NullPointerException("nonNullParentField is marked non-null but is null");
            }
        this.nonNullParentField$value = nonNullParentField;
        nonNullParentField$set = true;
        return self();
      }
      protected abstract @java.lang.SuppressWarnings("all") @lombok.Generated B self();
      public abstract @java.lang.SuppressWarnings("all") @lombok.Generated C build();
      public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
        return (("SuperBuilderWithNonNull.Parent.ParentBuilder(nonNullParentField$value=" + this.nonNullParentField$value) + ")");
      }
    }
    private static final @java.lang.SuppressWarnings("all") @lombok.Generated class ParentBuilderImpl extends SuperBuilderWithNonNull.Parent.ParentBuilder<SuperBuilderWithNonNull.Parent, SuperBuilderWithNonNull.Parent.ParentBuilderImpl> {
      private ParentBuilderImpl() {
        super();
      }
      protected @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithNonNull.Parent.ParentBuilderImpl self() {
        return this;
      }
      public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithNonNull.Parent build() {
        return new SuperBuilderWithNonNull.Parent(this);
      }
    }
    final @lombok.NonNull @lombok.Builder.Default String nonNullParentField;
    private static @java.lang.SuppressWarnings("all") @lombok.Generated String $default$nonNullParentField() {
      return "default";
    }
    protected @java.lang.SuppressWarnings("all") @lombok.Generated Parent(final SuperBuilderWithNonNull.Parent.ParentBuilder<?, ?> b) {
      super();
      if (b.nonNullParentField$set)
          this.nonNullParentField = b.nonNullParentField$value;
      else
          this.nonNullParentField = SuperBuilderWithNonNull.Parent.$default$nonNullParentField();
      if ((nonNullParentField == null))
          {
            throw new java.lang.NullPointerException("nonNullParentField is marked non-null but is null");
          }
    }
    public static @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithNonNull.Parent.ParentBuilder<?, ?> builder() {
      return new SuperBuilderWithNonNull.Parent.ParentBuilderImpl();
    }
  }
  public static @lombok.experimental.SuperBuilder class Child extends Parent {
    public static abstract @java.lang.SuppressWarnings("all") @lombok.Generated class ChildBuilder<C extends SuperBuilderWithNonNull.Child, B extends SuperBuilderWithNonNull.Child.ChildBuilder<C, B>> extends Parent.ParentBuilder<C, B> {
      private @java.lang.SuppressWarnings("all") @lombok.Generated String nonNullChildField;
      public ChildBuilder() {
        super();
      }
      /**
       * @return {@code this}.
       */
      public @java.lang.SuppressWarnings("all") @lombok.Generated B nonNullChildField(final @lombok.NonNull String nonNullChildField) {
        if ((nonNullChildField == null))
            {
              throw new java.lang.NullPointerException("nonNullChildField is marked non-null but is null");
            }
        this.nonNullChildField = nonNullChildField;
        return self();
      }
      protected abstract @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated B self();
      public abstract @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated C build();
      public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
        return (((("SuperBuilderWithNonNull.Child.ChildBuilder(super=" + super.toString()) + ", nonNullChildField=") + this.nonNullChildField) + ")");
      }
    }
    private static final @java.lang.SuppressWarnings("all") @lombok.Generated class ChildBuilderImpl extends SuperBuilderWithNonNull.Child.ChildBuilder<SuperBuilderWithNonNull.Child, SuperBuilderWithNonNull.Child.ChildBuilderImpl> {
      private ChildBuilderImpl() {
        super();
      }
      protected @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithNonNull.Child.ChildBuilderImpl self() {
        return this;
      }
      public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithNonNull.Child build() {
        return new SuperBuilderWithNonNull.Child(this);
      }
    }
    @lombok.NonNull String nonNullChildField;
    protected @java.lang.SuppressWarnings("all") @lombok.Generated Child(final SuperBuilderWithNonNull.Child.ChildBuilder<?, ?> b) {
      super(b);
      this.nonNullChildField = b.nonNullChildField;
      if ((nonNullChildField == null))
          {
            throw new java.lang.NullPointerException("nonNullChildField is marked non-null but is null");
          }
    }
    public static @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithNonNull.Child.ChildBuilder<?, ?> builder() {
      return new SuperBuilderWithNonNull.Child.ChildBuilderImpl();
    }
  }
  public SuperBuilderWithNonNull() {
    super();
  }
  public static void test() {
    Child x = Child.builder().nonNullChildField("child").nonNullParentField("parent").build();
  }
}
