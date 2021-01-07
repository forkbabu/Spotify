package com.spotify.remoteconfig;

public final class gb implements fjf<fb> {
    private final wlf<l0e> a;

    public gb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        fb fbVar = (fb) this.a.get().a(a3.a);
        yif.g(fbVar, "Cannot return null from a non-@Nullable @Provides method");
        return fbVar;
    }
}
