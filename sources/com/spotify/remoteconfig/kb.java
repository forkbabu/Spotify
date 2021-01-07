package com.spotify.remoteconfig;

public final class kb implements fjf<jb> {
    private final wlf<l0e> a;

    public kb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        jb jbVar = (jb) this.a.get().a(q3.a);
        yif.g(jbVar, "Cannot return null from a non-@Nullable @Provides method");
        return jbVar;
    }
}
