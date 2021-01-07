package com.spotify.mobile.android.hubframework.defaults.components.glue;

public final class d implements fjf<c> {
    private final wlf<Boolean> a;

    public d(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get().booleanValue());
    }
}
