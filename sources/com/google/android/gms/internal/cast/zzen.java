package com.google.android.gms.internal.cast;

import java.io.Serializable;

public abstract class zzen<T> implements Serializable {
    zzen() {
    }

    public static <T> zzen<T> a(T t) {
        if (t == null) {
            return zzei.a;
        }
        return new zzep(t);
    }

    public abstract T b();
}
