package com.spotify.music.homecomponents.promotionv2;

import androidx.lifecycle.n;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import io.reactivex.g;

public final class k implements fjf<HomePromotionPlayClickCommandHandler> {
    private final wlf<g<PlayerState>> a;
    private final wlf<f> b;
    private final wlf<lxd> c;
    private final wlf<d> d;
    private final wlf<HomePromotionPlayButtonLogger> e;
    private final wlf<n> f;
    private final wlf<bre> g;

    public k(wlf<g<PlayerState>> wlf, wlf<f> wlf2, wlf<lxd> wlf3, wlf<d> wlf4, wlf<HomePromotionPlayButtonLogger> wlf5, wlf<n> wlf6, wlf<bre> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static k a(wlf<g<PlayerState>> wlf, wlf<f> wlf2, wlf<lxd> wlf3, wlf<d> wlf4, wlf<HomePromotionPlayButtonLogger> wlf5, wlf<n> wlf6, wlf<bre> wlf7) {
        return new k(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomePromotionPlayClickCommandHandler(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
