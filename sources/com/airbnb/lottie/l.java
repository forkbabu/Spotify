package com.airbnb.lottie;

import java.util.Arrays;

public final class l<V> {
    private final V a;
    private final Throwable b;

    public l(V v) {
        this.a = v;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        V v = this.a;
        if (v != null && v.equals(lVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || lVar.b == null) {
            return false;
        }
        return th.toString().equals(this.b.toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public l(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
