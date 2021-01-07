package com.spotify.mobile.android.service;

import com.spotify.cosmos.android.RxResolverImpl;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class x implements fjf<w> {
    private final wlf<RxPlayerState> a;
    private final wlf<v> b;
    private final wlf<w> c;
    private final wlf<yn1> d;
    private final wlf<RxResolverImpl> e;
    private final wlf<ConnectManager> f;
    private final wlf<g<PlayerState>> g;
    private final wlf<nec> h;

    public x(wlf<RxPlayerState> wlf, wlf<v> wlf2, wlf<w> wlf3, wlf<yn1> wlf4, wlf<RxResolverImpl> wlf5, wlf<ConnectManager> wlf6, wlf<g<PlayerState>> wlf7, wlf<nec> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static w a(RxPlayerState rxPlayerState, v vVar, w wVar, yn1 yn1, RxResolverImpl rxResolverImpl, ConnectManager connectManager, g<PlayerState> gVar, nec nec) {
        return new w(rxPlayerState, vVar, wVar, yn1, rxResolverImpl, connectManager, gVar, nec);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
