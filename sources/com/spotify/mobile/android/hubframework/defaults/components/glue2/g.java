package com.spotify.mobile.android.hubframework.defaults.components.glue2;

public final class g implements fjf<f> {
    private final wlf<Boolean> a;

    public g(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get().booleanValue());
    }
}
