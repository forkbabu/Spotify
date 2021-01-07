package com.spotify.music.features.yourepisodes;

import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.features.yourepisodes.interactor.c;
import com.spotify.music.features.yourepisodes.view.b;
import com.spotify.music.features.yourepisodes.view.b0;
import com.spotify.music.features.yourepisodes.view.e;
import com.spotify.music.features.yourepisodes.view.p;
import com.spotify.music.features.yourepisodes.view.u;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class n implements fjf<l<s<c>, com.spotify.music.features.yourepisodes.view.n>> {
    private final wlf<w> a;
    private final wlf<b0> b;
    private final wlf<p> c;
    private final wlf<b> d;
    private final wlf<u> e;
    private final wlf<e> f;
    private final wlf<EncoreConsumerEntryPoint> g;

    public n(wlf<w> wlf, wlf<b0> wlf2, wlf<p> wlf3, wlf<b> wlf4, wlf<u> wlf5, wlf<e> wlf6, wlf<EncoreConsumerEntryPoint> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        w wVar = this.a.get();
        b0 b0Var = this.b.get();
        p pVar = this.c.get();
        b bVar = this.d.get();
        u uVar = this.e.get();
        e eVar = this.f.get();
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.g.get();
        h.e(wVar, "injector");
        h.e(b0Var, "viewsFactory");
        h.e(pVar, "viewBinderFactory");
        h.e(bVar, "headerViewBinderFactory");
        h.e(uVar, "viewConnectableFactory");
        h.e(eVar, "downloadListener");
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        return new k(wVar, b0Var, pVar, bVar, uVar, eVar, encoreConsumerEntryPoint);
    }
}
