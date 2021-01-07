package com.spotify.mobile.android.util.connectivity;

public final class u implements fjf<e0> {
    private final wlf<v> a;

    public u(wlf<v> wlf) {
        this.a = wlf;
    }

    public static e0 a(v vVar) {
        return new f0(vVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0(this.a.get());
    }
}
