package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonIgnoreProperties {

    public static class Value implements Object<JsonIgnoreProperties> {
        protected static final Value EMPTY = new Value(Collections.emptySet(), false, false, false, true);
        private static final long serialVersionUID = 1;
        protected final boolean _allowGetters;
        protected final boolean _allowSetters;
        protected final boolean _ignoreUnknown;
        protected final Set<String> _ignored;
        protected final boolean _merge;

        protected Value(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (set == null) {
                this._ignored = Collections.emptySet();
            } else {
                this._ignored = set;
            }
            this._ignoreUnknown = z;
            this._allowGetters = z2;
            this._allowSetters = z3;
            this._merge = z4;
        }

        private static boolean _empty(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            Value value = EMPTY;
            if (z != value._ignoreUnknown || z2 != value._allowGetters || z3 != value._allowSetters || z4 != value._merge) {
                return false;
            }
            if (set == null || set.size() == 0) {
                return true;
            }
            return false;
        }

        private static boolean _equals(Value value, Value value2) {
            return value._ignoreUnknown == value2._ignoreUnknown && value._merge == value2._merge && value._allowGetters == value2._allowGetters && value._allowSetters == value2._allowSetters && value._ignored.equals(value2._ignored);
        }

        public static Value construct(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (_empty(set, z, z2, z3, z4)) {
                return EMPTY;
            }
            return new Value(set, z, z2, z3, z4);
        }

        public static Value empty() {
            return EMPTY;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0021 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashSet] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value from(com.fasterxml.jackson.annotation.JsonIgnoreProperties r6) {
            /*
                java.lang.String[] r0 = r6.value()
                r1 = 0
                if (r0 == 0) goto L_0x001d
                int r2 = r0.length
                if (r2 != 0) goto L_0x000b
                goto L_0x001d
            L_0x000b:
                java.util.HashSet r2 = new java.util.HashSet
                int r3 = r0.length
                r2.<init>(r3)
                int r3 = r0.length
                r4 = 0
            L_0x0013:
                if (r4 >= r3) goto L_0x0021
                r5 = r0[r4]
                r2.add(r5)
                int r4 = r4 + 1
                goto L_0x0013
            L_0x001d:
                java.util.Set r2 = java.util.Collections.emptySet()
            L_0x0021:
                boolean r0 = r6.ignoreUnknown()
                boolean r3 = r6.allowGetters()
                boolean r6 = r6.allowSetters()
                com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r6 = construct(r2, r0, r3, r6, r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value.from(com.fasterxml.jackson.annotation.JsonIgnoreProperties):com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value");
        }

        public static Value merge(Value value, Value value2) {
            if (value == null) {
                return null;
            }
            return value;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass() && _equals(this, (Value) obj)) {
                return true;
            }
            return false;
        }

        public Set<String> findIgnoredForDeserialization() {
            if (this._allowSetters) {
                return Collections.emptySet();
            }
            return this._ignored;
        }

        public Set<String> findIgnoredForSerialization() {
            if (this._allowGetters) {
                return Collections.emptySet();
            }
            return this._ignored;
        }

        public boolean getIgnoreUnknown() {
            return this._ignoreUnknown;
        }

        public Set<String> getIgnored() {
            return this._ignored;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return this._ignored.size() + (this._ignoreUnknown ? 1 : -3) + (this._allowGetters ? 3 : -7) + (this._allowSetters ? 7 : -11) + (this._merge ? 11 : -13);
        }

        /* access modifiers changed from: protected */
        public Object readResolve() {
            return _empty(this._ignored, this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge) ? EMPTY : this;
        }

        @Override // java.lang.Object
        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this._ignored, Boolean.valueOf(this._ignoreUnknown), Boolean.valueOf(this._allowGetters), Boolean.valueOf(this._allowSetters), Boolean.valueOf(this._merge));
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
