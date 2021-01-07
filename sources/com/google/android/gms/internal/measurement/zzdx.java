package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public abstract class zzdx<T> implements Serializable {
    zzdx() {
    }

    public static <T> zzdx<T> a(T t) {
        t.getClass();
        return new zzdz(t);
    }

    public abstract boolean b();

    public abstract T c();
}
