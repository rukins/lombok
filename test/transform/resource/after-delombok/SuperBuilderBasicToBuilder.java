import java.util.List;
public class SuperBuilderBasicToBuilder {
	public static class Parent {
		private int field1;
		int obtainViaField;
		int obtainViaMethod;
		String obtainViaStaticMethod;
		List<String> items;
		private int method() {
			return 2;
		}
		private static String staticMethod(Parent instance) {
			return "staticMethod";
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static abstract class ParentBuilder<C extends SuperBuilderBasicToBuilder.Parent, B extends SuperBuilderBasicToBuilder.Parent.ParentBuilder<C, B>> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private int field1;
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private int obtainViaField;
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private int obtainViaMethod;
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private String obtainViaStaticMethod;
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private java.util.ArrayList<String> items;
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected B $fillValuesFrom(final C instance) {
				SuperBuilderBasicToBuilder.Parent.ParentBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private static void $fillValuesFromInstanceIntoBuilder(final SuperBuilderBasicToBuilder.Parent instance, final SuperBuilderBasicToBuilder.Parent.ParentBuilder<?, ?> b) {
				b.field1(instance.field1);
				b.obtainViaField(instance.field1);
				b.obtainViaMethod(instance.method());
				b.obtainViaStaticMethod(SuperBuilderBasicToBuilder.Parent.staticMethod(instance));
				b.items(instance.items == null ? java.util.Collections.<String>emptyList() : instance.items);
			}
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B field1(final int field1) {
				this.field1 = field1;
				return self();
			}
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B obtainViaField(final int obtainViaField) {
				this.obtainViaField = obtainViaField;
				return self();
			}
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B obtainViaMethod(final int obtainViaMethod) {
				this.obtainViaMethod = obtainViaMethod;
				return self();
			}
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B obtainViaStaticMethod(final String obtainViaStaticMethod) {
				this.obtainViaStaticMethod = obtainViaStaticMethod;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B item(final String item) {
				if (this.items == null) this.items = new java.util.ArrayList<String>();
				this.items.add(item);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B items(final java.util.Collection<? extends String> items) {
				if (items == null) {
					throw new java.lang.NullPointerException("items cannot be null");
				}
				if (this.items == null) this.items = new java.util.ArrayList<String>();
				this.items.addAll(items);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B clearItems() {
				if (this.items != null) this.items.clear();
				return self();
			}
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public abstract C build();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public java.lang.String toString() {
				return "SuperBuilderBasicToBuilder.Parent.ParentBuilder(field1=" + this.field1 + ", obtainViaField=" + this.obtainViaField + ", obtainViaMethod=" + this.obtainViaMethod + ", obtainViaStaticMethod=" + this.obtainViaStaticMethod + ", items=" + this.items + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static final class ParentBuilderImpl extends SuperBuilderBasicToBuilder.Parent.ParentBuilder<SuperBuilderBasicToBuilder.Parent, SuperBuilderBasicToBuilder.Parent.ParentBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected SuperBuilderBasicToBuilder.Parent.ParentBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public SuperBuilderBasicToBuilder.Parent build() {
				return new SuperBuilderBasicToBuilder.Parent(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		protected Parent(final SuperBuilderBasicToBuilder.Parent.ParentBuilder<?, ?> b) {
			this.field1 = b.field1;
			this.obtainViaField = b.obtainViaField;
			this.obtainViaMethod = b.obtainViaMethod;
			this.obtainViaStaticMethod = b.obtainViaStaticMethod;
			java.util.List<String> items;
			switch (b.items == null ? 0 : b.items.size()) {
			case 0: 
				items = java.util.Collections.emptyList();
				break;
			case 1: 
				items = java.util.Collections.singletonList(b.items.get(0));
				break;
			default: 
				items = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(b.items));
			}
			this.items = items;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static SuperBuilderBasicToBuilder.Parent.ParentBuilder<?, ?> builder() {
			return new SuperBuilderBasicToBuilder.Parent.ParentBuilderImpl();
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public SuperBuilderBasicToBuilder.Parent.ParentBuilder<?, ?> toBuilder() {
			return new SuperBuilderBasicToBuilder.Parent.ParentBuilderImpl().$fillValuesFrom(this);
		}
	}
	public static class Child extends Parent {
		private double field3;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static abstract class ChildBuilder<C extends SuperBuilderBasicToBuilder.Child, B extends SuperBuilderBasicToBuilder.Child.ChildBuilder<C, B>> extends Parent.ParentBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private double field3;
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected B $fillValuesFrom(final C instance) {
				super.$fillValuesFrom(instance);
				SuperBuilderBasicToBuilder.Child.ChildBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private static void $fillValuesFromInstanceIntoBuilder(final SuperBuilderBasicToBuilder.Child instance, final SuperBuilderBasicToBuilder.Child.ChildBuilder<?, ?> b) {
				b.field3(instance.field3);
			}
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B field3(final double field3) {
				this.field3 = field3;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public abstract C build();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public java.lang.String toString() {
				return "SuperBuilderBasicToBuilder.Child.ChildBuilder(super=" + super.toString() + ", field3=" + this.field3 + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static final class ChildBuilderImpl extends SuperBuilderBasicToBuilder.Child.ChildBuilder<SuperBuilderBasicToBuilder.Child, SuperBuilderBasicToBuilder.Child.ChildBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private ChildBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected SuperBuilderBasicToBuilder.Child.ChildBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public SuperBuilderBasicToBuilder.Child build() {
				return new SuperBuilderBasicToBuilder.Child(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		protected Child(final SuperBuilderBasicToBuilder.Child.ChildBuilder<?, ?> b) {
			super(b);
			this.field3 = b.field3;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static SuperBuilderBasicToBuilder.Child.ChildBuilder<?, ?> builder() {
			return new SuperBuilderBasicToBuilder.Child.ChildBuilderImpl();
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public SuperBuilderBasicToBuilder.Child.ChildBuilder<?, ?> toBuilder() {
			return new SuperBuilderBasicToBuilder.Child.ChildBuilderImpl().$fillValuesFrom(this);
		}
	}
	public static void test() {
		Child x = Child.builder().field3(0.0).field1(5).item("").build().toBuilder().build();
	}
}
