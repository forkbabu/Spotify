package com.spotify.nowplaying.core.di;

import kotlin.jvm.internal.h;

public final class f implements fjf<com.spotify.player.play.f> {
    private final wlf<bxd> a;

    public f(wlf<bxd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        bxd bxd = this.a.get();
        h.e(bxd, "playerApis");
        com.spotify.player.play.f c = bxd.c();
        yif.g(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
