package com.spotify.remoteconfig;

public final class ha implements fjf<ga> {
    private final wlf<l0e> a;

    public ha(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static ga a(l0e l0e) {
        ga gaVar = (ga) l0e.a(u4.a);
        yif.g(gaVar, "Cannot return null from a non-@Nullable @Provides method");
        return gaVar;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
