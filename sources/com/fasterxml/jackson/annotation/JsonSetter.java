package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSetter {

    public static class Value implements Object<JsonSetter> {
        protected static final Value EMPTY;
        private static final long serialVersionUID = 1;
        private final Nulls _contentNulls;
        private final Nulls _nulls;

        static {
            Nulls nulls = Nulls.DEFAULT;
            EMPTY = new Value(nulls, nulls);
        }

        protected Value(Nulls nulls, Nulls nulls2) {
            this._nulls = nulls;
            this._contentNulls = nulls2;
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value from(JsonSetter jsonSetter) {
            Value value = EMPTY;
            if (jsonSetter == null) {
                return value;
            }
            Nulls nulls = jsonSetter.nulls();
            Nulls contentNulls = jsonSetter.contentNulls();
            Nulls nulls2 = Nulls.DEFAULT;
            if (nulls == null) {
                nulls = nulls2;
            }
            if (contentNulls == null) {
                contentNulls = nulls2;
            }
            return nulls == nulls2 && contentNulls == nulls2 ? value : new Value(nulls, contentNulls);
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            if (value._nulls == this._nulls && value._contentNulls == this._contentNulls) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return this._nulls.ordinal() + (this._contentNulls.ordinal() << 2);
        }

        public Nulls nonDefaultContentNulls() {
            Nulls nulls = this._contentNulls;
            if (nulls == Nulls.DEFAULT) {
                return null;
            }
            return nulls;
        }

        public Nulls nonDefaultValueNulls() {
            Nulls nulls = this._nulls;
            if (nulls == Nulls.DEFAULT) {
                return null;
            }
            return nulls;
        }

        /* access modifiers changed from: protected */
        public Object readResolve() {
            Nulls nulls = this._nulls;
            Nulls nulls2 = this._contentNulls;
            Nulls nulls3 = Nulls.DEFAULT;
            return nulls == nulls3 && nulls2 == nulls3 ? EMPTY : this;
        }

        @Override // java.lang.Object
        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this._nulls, this._contentNulls);
        }
    }

    Nulls contentNulls() default Nulls.DEFAULT;

    Nulls nulls() default Nulls.DEFAULT;

    String value() default "";
}
