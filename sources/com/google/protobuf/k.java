package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class k {
    static final k b = new k(true);
    private final Map<Object, GeneratedMessageLite.e<?, ?>> a;

    static {
        try {
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }

    k() {
        new HashMap();
    }

    public static k a() {
        Class<?> cls = j.a;
        if (cls != null) {
            try {
                return (k) cls.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return b;
    }

    k(boolean z) {
        this.a = Collections.emptyMap();
    }
}
