package com.spotify.player.di;

import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.esperanto.proto.k;
import com.spotify.player.internal.a;
import com.spotify.player.internal.c;
import com.spotify.player.queue.EsperantoPlayerQueueInteractor;
import com.spotify.player.queue.d;
import com.spotify.player.queue.f;
import com.spotify.remoteconfig.rj;

public final class m implements fjf<f> {
    private final wlf<RxRouter> a;
    private final wlf<pxd> b;
    private final wlf<c> c;
    private final wlf<k.b> d;
    private final wlf<a> e;
    private final wlf<rj> f;

    public m(wlf<RxRouter> wlf, wlf<pxd> wlf2, wlf<c> wlf3, wlf<k.b> wlf4, wlf<a> wlf5, wlf<rj> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static f a(ajf<RxRouter> ajf, ajf<pxd> ajf2, ajf<c> ajf3, ajf<k.b> ajf4, a aVar, rj rjVar) {
        if (rjVar.a()) {
            return new EsperantoPlayerQueueInteractor(ajf4.get(), aVar);
        }
        return new d(ajf.get(), ajf2.get(), ajf3.get(), aVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(ejf.a(this.a), ejf.a(this.b), ejf.a(this.c), ejf.a(this.d), this.e.get(), this.f.get());
    }
}
