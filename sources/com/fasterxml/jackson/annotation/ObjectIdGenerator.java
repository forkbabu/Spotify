package com.fasterxml.jackson.annotation;

import java.io.Serializable;

public abstract class ObjectIdGenerator<T> implements Serializable {

    public static final class IdKey implements Serializable {
        private static final long serialVersionUID = 1;
        private final int hashCode;
        public final Object key;
        public final Class<?> scope;
        public final Class<?> type;

        public IdKey(Class<?> cls, Class<?> cls2, Object obj) {
            this.type = cls;
            this.scope = cls2;
            this.key = obj;
            int hashCode2 = cls.getName().hashCode() + obj.hashCode();
            this.hashCode = cls2 != null ? hashCode2 ^ cls2.getName().hashCode() : hashCode2;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != IdKey.class) {
                return false;
            }
            IdKey idKey = (IdKey) obj;
            if (idKey.key.equals(this.key) && idKey.type == this.type && idKey.scope == this.scope) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return this.hashCode;
        }

        /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0015: APUT  (r0v1 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r1v2 java.lang.String) */
        @Override // java.lang.Object
        public String toString() {
            String str;
            Object[] objArr = new Object[3];
            objArr[0] = this.key;
            Class<?> cls = this.type;
            String str2 = "NONE";
            if (cls == null) {
                str = str2;
            } else {
                str = cls.getName();
            }
            objArr[1] = str;
            Class<?> cls2 = this.scope;
            if (cls2 != null) {
                str2 = cls2.getName();
            }
            objArr[2] = str2;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", objArr);
        }
    }

    public abstract boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator);

    public abstract ObjectIdGenerator<T> forScope(Class<?> cls);

    public abstract T generateId(Object obj);

    public abstract Class<?> getScope();

    public abstract IdKey key(Object obj);

    public abstract ObjectIdGenerator<T> newForSerialization(Object obj);
}
