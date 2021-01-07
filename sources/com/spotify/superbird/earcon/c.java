package com.spotify.superbird.earcon;

public final class c implements fjf<b> {
    private final wlf<ene> a;

    public c(wlf<ene> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
