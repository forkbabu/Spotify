package com.spotify.player.di;

import com.spotify.player.esperanto.proto.k;
import com.spotify.player.internal.a;
import com.spotify.player.internal.c;
import com.spotify.player.internal.g;
import com.spotify.player.play.EsperantoPlayer;
import com.spotify.player.play.f;
import com.spotify.remoteconfig.rj;

public final class k implements fjf<f> {
    private final wlf<rj> a;
    private final wlf<k.b> b;
    private final wlf<c> c;
    private final wlf<g> d;
    private final wlf<a> e;
    private final wlf<pxd> f;

    public k(wlf<rj> wlf, wlf<k.b> wlf2, wlf<c> wlf3, wlf<g> wlf4, wlf<a> wlf5, wlf<pxd> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static k a(wlf<rj> wlf, wlf<k.b> wlf2, wlf<c> wlf3, wlf<g> wlf4, wlf<a> wlf5, wlf<pxd> wlf6) {
        return new k(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    public static f b(rj rjVar, ajf<k.b> ajf, ajf<c> ajf2, ajf<g> ajf3, a aVar, ajf<pxd> ajf4) {
        if (rjVar.a()) {
            return new EsperantoPlayer(ajf.get(), aVar, ajf4.get());
        }
        return new com.spotify.player.play.a(ajf2.get(), ajf3.get(), aVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return b(this.a.get(), ejf.a(this.b), ejf.a(this.c), ejf.a(this.d), this.e.get(), ejf.a(this.f));
    }
}
