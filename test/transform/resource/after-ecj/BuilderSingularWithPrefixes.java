import lombok.Singular;
@lombok.Builder @lombok.experimental.Accessors(prefix = "_") class BuilderSingularWithPrefixes {
  public static @java.lang.SuppressWarnings("all") @lombok.Generated class BuilderSingularWithPrefixesBuilder {
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<String> elems;
    @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularWithPrefixesBuilder() {
      super();
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularWithPrefixes.BuilderSingularWithPrefixesBuilder elem(final String elem) {
      if ((this.elems == null))
          this.elems = new java.util.ArrayList<String>();
      this.elems.add(elem);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularWithPrefixes.BuilderSingularWithPrefixesBuilder elems(final java.util.Collection<? extends String> elems) {
      if ((elems == null))
          {
            throw new java.lang.NullPointerException("elems cannot be null");
          }
      if ((this.elems == null))
          this.elems = new java.util.ArrayList<String>();
      this.elems.addAll(elems);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularWithPrefixes.BuilderSingularWithPrefixesBuilder clearElems() {
      if ((this.elems != null))
          this.elems.clear();
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularWithPrefixes build() {
      java.util.List<String> elems;
      switch (((this.elems == null) ? 0 : this.elems.size())) {
      case 0 :
          elems = java.util.Collections.emptyList();
          break;
      case 1 :
          elems = java.util.Collections.singletonList(this.elems.get(0));
          break;
      default :
          elems = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.elems));
      }
      return new BuilderSingularWithPrefixes(elems);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return (("BuilderSingularWithPrefixes.BuilderSingularWithPrefixesBuilder(elems=" + this.elems) + ")");
    }
  }
  private @Singular java.util.List<String> _elems;
  @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularWithPrefixes(final java.util.List<String> elems) {
    super();
    this._elems = elems;
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularWithPrefixes.BuilderSingularWithPrefixesBuilder builder() {
    return new BuilderSingularWithPrefixes.BuilderSingularWithPrefixesBuilder();
  }
}
