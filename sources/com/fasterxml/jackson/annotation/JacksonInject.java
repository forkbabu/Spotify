package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JacksonInject {

    public static class Value implements Object<JacksonInject> {
        protected static final Value EMPTY = new Value(null, null);
        private static final long serialVersionUID = 1;
        protected final Object _id;
        protected final Boolean _useInput;

        protected Value(Object obj, Boolean bool) {
            this._id = obj;
            this._useInput = bool;
        }

        public static Value construct(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            if (obj == null && bool == null) {
                return EMPTY;
            }
            return new Value(obj, bool);
        }

        public static Value from(JacksonInject jacksonInject) {
            return construct(jacksonInject.value(), jacksonInject.useInput().asBoolean());
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            boolean z;
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                Boolean bool = this._useInput;
                Boolean bool2 = value._useInput;
                if (bool == null) {
                    z = bool2 == null;
                } else {
                    z = bool.equals(bool2);
                }
                if (z) {
                    Object obj2 = this._id;
                    if (obj2 != null) {
                        return obj2.equals(value._id);
                    }
                    if (value._id == null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public Object getId() {
            return this._id;
        }

        public boolean hasId() {
            return this._id != null;
        }

        @Override // java.lang.Object
        public int hashCode() {
            Object obj = this._id;
            int i = 1;
            if (obj != null) {
                i = 1 + obj.hashCode();
            }
            Boolean bool = this._useInput;
            return bool != null ? i + bool.hashCode() : i;
        }

        @Override // java.lang.Object
        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this._id, this._useInput);
        }

        public Value withId(Object obj) {
            if (obj.equals(this._id)) {
                return this;
            }
            return new Value(obj, this._useInput);
        }
    }

    OptBoolean useInput() default OptBoolean.DEFAULT;

    String value() default "";
}
