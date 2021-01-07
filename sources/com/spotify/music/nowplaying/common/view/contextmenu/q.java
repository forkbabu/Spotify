package com.spotify.music.nowplaying.common.view.contextmenu;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;
import com.spotify.remoteconfig.u8;

public final class q implements fjf<p> {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<b42> c;
    private final wlf<h32> d;
    private final wlf<u> e;
    private final wlf<s> f;
    private final wlf<hnd> g;
    private final wlf<u8> h;

    public q(wlf<Context> wlf, wlf<c> wlf2, wlf<b42> wlf3, wlf<h32> wlf4, wlf<u> wlf5, wlf<s> wlf6, wlf<hnd> wlf7, wlf<u8> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static q a(wlf<Context> wlf, wlf<c> wlf2, wlf<b42> wlf3, wlf<h32> wlf4, wlf<u> wlf5, wlf<s> wlf6, wlf<hnd> wlf7, wlf<u8> wlf8) {
        return new q(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get(), this.d.get(), ejf.a(this.e), ejf.a(this.f), this.g.get(), this.h.get());
    }
}
