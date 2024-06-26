class GetterLazy {
	static class ValueType {
	}
	private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> fieldName = new java.util.concurrent.atomic.AtomicReference<java.lang.Object>();
	@java.lang.SuppressWarnings({"all", "unchecked"})
	@lombok.Generated
	public ValueType getFieldName() {
		java.lang.Object $value = this.fieldName.get();
		if ($value == null) {
			synchronized (this.fieldName) {
				$value = this.fieldName.get();
				if ($value == null) {
					final ValueType actualValue = new ValueType();
					$value = actualValue == null ? this.fieldName : actualValue;
					this.fieldName.set($value);
				}
			}
		}
		return (ValueType) ($value == this.fieldName ? null : $value);
	}
}
