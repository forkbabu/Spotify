package com.spotify.music.features.video;

public final class q implements fjf<ua1> {
    private final wlf<wa1> a;

    public q(wlf<wa1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ua1 a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
