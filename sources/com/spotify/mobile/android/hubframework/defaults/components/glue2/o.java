package com.spotify.mobile.android.hubframework.defaults.components.glue2;

public final class o implements fjf<n> {
    private final wlf<Boolean> a;

    public o(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get().booleanValue());
    }
}
