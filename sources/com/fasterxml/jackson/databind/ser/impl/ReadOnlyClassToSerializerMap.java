package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.Map;

public final class ReadOnlyClassToSerializerMap {
    private final Bucket[] _buckets;
    private final int _mask;

    /* access modifiers changed from: private */
    public static final class Bucket {
        protected final Class<?> _class;
        protected final boolean _isTyped;
        protected final JavaType _type;
        public final Bucket next;
        public final JsonSerializer<Object> value;

        public Bucket(Bucket bucket, TypeKey typeKey, JsonSerializer<Object> jsonSerializer) {
            this.next = bucket;
            this.value = jsonSerializer;
            this._isTyped = typeKey.isTyped();
            this._class = typeKey.getRawType();
            this._type = typeKey.getType();
        }
    }

    public ReadOnlyClassToSerializerMap(Map<TypeKey, JsonSerializer<Object>> map) {
        int size = map.size();
        int i = 8;
        while (i < (size <= 64 ? size + size : size + (size >> 2))) {
            i += i;
        }
        this._mask = i - 1;
        Bucket[] bucketArr = new Bucket[i];
        for (Map.Entry<TypeKey, JsonSerializer<Object>> entry : map.entrySet()) {
            TypeKey key = entry.getKey();
            int hashCode = key.hashCode() & this._mask;
            bucketArr[hashCode] = new Bucket(bucketArr[hashCode], key, entry.getValue());
        }
        this._buckets = bucketArr;
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        boolean z;
        Bucket bucket = this._buckets[(javaType.hashCode() - 2) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket._isTyped && javaType.equals(bucket._type)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
            if (!bucket._isTyped || !javaType.equals(bucket._type)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return bucket.value;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        boolean z;
        Bucket bucket = this._buckets[(javaType.hashCode() - 1) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (!bucket._isTyped && javaType.equals(bucket._type)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
            if (bucket._isTyped || !javaType.equals(bucket._type)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return bucket.value;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        boolean z;
        Bucket bucket = this._buckets[(cls.getName().hashCode() + 1) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket._class == cls && bucket._isTyped) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
            if (bucket._class != cls || !bucket._isTyped) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return bucket.value;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        boolean z;
        Bucket bucket = this._buckets[cls.getName().hashCode() & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket._class == cls && !bucket._isTyped) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
            if (bucket._class != cls || bucket._isTyped) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return bucket.value;
    }
}
