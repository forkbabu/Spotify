package com.spotify.mobile.android.hubframework.defaults;

public final class u implements fjf<t> {
    private final wlf<fd0> a;

    public u(wlf<fd0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get());
    }
}
