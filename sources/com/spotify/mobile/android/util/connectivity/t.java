package com.spotify.mobile.android.util.connectivity;

public final class t implements fjf<y> {
    private final wlf<v> a;

    public t(wlf<v> wlf) {
        this.a = wlf;
    }

    public static y a(v vVar) {
        return new z(vVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a.get());
    }
}
