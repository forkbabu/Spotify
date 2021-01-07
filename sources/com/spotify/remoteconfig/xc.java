package com.spotify.remoteconfig;

public final class xc implements fjf<wc> {
    private final wlf<l0e> a;

    public xc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        wc wcVar = (wc) this.a.get().a(w0.a);
        yif.g(wcVar, "Cannot return null from a non-@Nullable @Provides method");
        return wcVar;
    }
}
