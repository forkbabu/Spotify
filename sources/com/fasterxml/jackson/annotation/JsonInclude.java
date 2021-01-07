package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonInclude {

    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    public static class Value implements Object<JsonInclude> {
        protected static final Value EMPTY;
        public static final /* synthetic */ int a = 0;
        private static final long serialVersionUID = 1;
        protected final Class<?> _contentFilter;
        protected final Include _contentInclusion;
        protected final Class<?> _valueFilter;
        protected final Include _valueInclusion;

        static {
            Include include = Include.USE_DEFAULTS;
            EMPTY = new Value(include, include, null, null);
        }

        protected Value(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            Include include3 = Include.USE_DEFAULTS;
            this._valueInclusion = include == null ? include3 : include;
            this._contentInclusion = include2 == null ? include3 : include2;
            this._valueFilter = cls == Void.class ? null : cls;
            this._contentFilter = cls2 == Void.class ? null : cls2;
        }

        public static Value construct(Include include, Include include2) {
            Include include3 = Include.USE_DEFAULTS;
            if ((include == include3 || include == null) && (include2 == include3 || include2 == null)) {
                return EMPTY;
            }
            return new Value(include, include2, null, null);
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value from(JsonInclude jsonInclude) {
            Value value = EMPTY;
            Include value2 = jsonInclude.value();
            Include content = jsonInclude.content();
            Include include = Include.USE_DEFAULTS;
            if (value2 == include && content == include) {
                return value;
            }
            Class<?> valueFilter = jsonInclude.valueFilter();
            Class<?> cls = null;
            if (valueFilter == Void.class) {
                valueFilter = null;
            }
            Class<?> contentFilter = jsonInclude.contentFilter();
            if (contentFilter != Void.class) {
                cls = contentFilter;
            }
            return new Value(value2, content, valueFilter, cls);
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
            if (value._valueInclusion == this._valueInclusion && value._contentInclusion == this._contentInclusion && value._valueFilter == this._valueFilter && value._contentFilter == this._contentFilter) {
                return true;
            }
            return false;
        }

        public Class<?> getContentFilter() {
            return this._contentFilter;
        }

        public Include getContentInclusion() {
            return this._contentInclusion;
        }

        public Class<?> getValueFilter() {
            return this._valueFilter;
        }

        public Include getValueInclusion() {
            return this._valueInclusion;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return this._contentInclusion.hashCode() + (this._valueInclusion.hashCode() << 2);
        }

        /* access modifiers changed from: protected */
        public Object readResolve() {
            Include include = this._valueInclusion;
            Include include2 = Include.USE_DEFAULTS;
            return (include == include2 && this._contentInclusion == include2 && this._valueFilter == null && this._contentFilter == null) ? EMPTY : this;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder T0 = je.T0(80, "JsonInclude.Value(value=");
            T0.append(this._valueInclusion);
            T0.append(",content=");
            T0.append(this._contentInclusion);
            if (this._valueFilter != null) {
                T0.append(",valueFilter=");
                T0.append(this._valueFilter.getName());
                T0.append(".class");
            }
            if (this._contentFilter != null) {
                T0.append(",contentFilter=");
                T0.append(this._contentFilter.getName());
                T0.append(".class");
            }
            T0.append(')');
            return T0.toString();
        }

        public Value withOverrides(Value value) {
            Include include = Include.USE_DEFAULTS;
            if (!(value == null || value == EMPTY)) {
                Include include2 = value._valueInclusion;
                Include include3 = value._contentInclusion;
                Class<?> cls = value._valueFilter;
                Class<?> cls2 = value._contentFilter;
                Include include4 = this._valueInclusion;
                boolean z = true;
                boolean z2 = (include2 == include4 || include2 == include) ? false : true;
                Include include5 = this._contentInclusion;
                boolean z3 = (include3 == include5 || include3 == include) ? false : true;
                Class<?> cls3 = this._valueFilter;
                if (cls == cls3 && cls2 == cls3) {
                    z = false;
                }
                if (z2) {
                    if (z3) {
                        return new Value(include2, include3, cls, cls2);
                    }
                    return new Value(include2, include5, cls, cls2);
                } else if (z3) {
                    return new Value(include4, include3, cls, cls2);
                } else {
                    if (z) {
                        return new Value(include4, include5, cls, cls2);
                    }
                }
            }
            return this;
        }

        public Value withValueInclusion(Include include) {
            return include == this._valueInclusion ? this : new Value(include, this._contentInclusion, this._valueFilter, this._contentFilter);
        }
    }

    Include content() default Include.ALWAYS;

    Class<?> contentFilter() default Void.class;

    Include value() default Include.ALWAYS;

    Class<?> valueFilter() default Void.class;
}
