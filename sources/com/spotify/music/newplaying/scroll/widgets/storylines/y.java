package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import com.spotify.music.navigation.t;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class y implements fjf<StorylinesWidgetPresenter> {
    private final wlf<g<PlayerState>> a;
    private final wlf<hjd> b;
    private final wlf<fjd> c;
    private final wlf<t> d;
    private final wlf<m> e;
    private final wlf<xn1<bob>> f;
    private final wlf<io.reactivex.y> g;
    private final wlf<qjd> h;
    private final wlf<f> i;

    public y(wlf<g<PlayerState>> wlf, wlf<hjd> wlf2, wlf<fjd> wlf3, wlf<t> wlf4, wlf<m> wlf5, wlf<xn1<bob>> wlf6, wlf<io.reactivex.y> wlf7, wlf<qjd> wlf8, wlf<f> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    public static y a(wlf<g<PlayerState>> wlf, wlf<hjd> wlf2, wlf<fjd> wlf3, wlf<t> wlf4, wlf<m> wlf5, wlf<xn1<bob>> wlf6, wlf<io.reactivex.y> wlf7, wlf<qjd> wlf8, wlf<f> wlf9) {
        return new y(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new StorylinesWidgetPresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
