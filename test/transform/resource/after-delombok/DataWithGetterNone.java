class DataWithGetterNone {
	private int x;
	private int y;
	private final String z;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public DataWithGetterNone(final String z) {
		this.z = z;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setX(final int x) {
		this.x = x;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setY(final int y) {
		this.y = y;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof DataWithGetterNone)) return false;
		final DataWithGetterNone other = (DataWithGetterNone) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (this.x != other.x) return false;
		if (this.y != other.y) return false;
		final java.lang.Object this$z = this.z;
		final java.lang.Object other$z = other.z;
		if (this$z == null ? other$z != null : !this$z.equals(other$z)) return false;
		return true;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof DataWithGetterNone;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.x;
		result = result * PRIME + this.y;
		final java.lang.Object $z = this.z;
		result = result * PRIME + ($z == null ? 43 : $z.hashCode());
		return result;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public java.lang.String toString() {
		return "DataWithGetterNone(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
	}
}
