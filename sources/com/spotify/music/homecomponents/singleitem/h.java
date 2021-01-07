package com.spotify.music.homecomponents.singleitem;

import androidx.lifecycle.n;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import io.reactivex.g;

public final class h implements fjf<HomeSingleItemPlayClickCommandHandler> {
    private final wlf<g<PlayerState>> a;
    private final wlf<f> b;
    private final wlf<lxd> c;
    private final wlf<d> d;
    private final wlf<HomeSingleItemPlayButtonLogger> e;
    private final wlf<n> f;

    public h(wlf<g<PlayerState>> wlf, wlf<f> wlf2, wlf<lxd> wlf3, wlf<d> wlf4, wlf<HomeSingleItemPlayButtonLogger> wlf5, wlf<n> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static h a(wlf<g<PlayerState>> wlf, wlf<f> wlf2, wlf<lxd> wlf3, wlf<d> wlf4, wlf<HomeSingleItemPlayButtonLogger> wlf5, wlf<n> wlf6) {
        return new h(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeSingleItemPlayClickCommandHandler(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
