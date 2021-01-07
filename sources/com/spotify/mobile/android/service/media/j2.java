package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.rx.w;
import com.spotify.music.connection.l;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import com.spotify.player.model.PlayerState;
import com.spotify.player.options.d;
import com.spotify.player.play.f;
import com.spotify.playlist.formatlisttype.a;
import io.reactivex.g;
import io.reactivex.s;

public final class j2 implements fjf<ExternalIntegrationServicePlaybackImpl> {
    private final wlf<f> a;
    private final wlf<d> b;
    private final wlf<com.spotify.player.controls.d> c;
    private final wlf<g<PlayerState>> d;
    private final wlf<com.spotify.playlist.endpoints.d> e;
    private final wlf<a> f;
    private final wlf<SpeedControlInteractor> g;
    private final wlf<l> h;
    private final wlf<w> i;
    private final wlf<s<String>> j;
    private final wlf<ifd> k;
    private final wlf<yn0> l;
    private final wlf<c> m;
    private final wlf<cqe> n;

    public j2(wlf<f> wlf, wlf<d> wlf2, wlf<com.spotify.player.controls.d> wlf3, wlf<g<PlayerState>> wlf4, wlf<com.spotify.playlist.endpoints.d> wlf5, wlf<a> wlf6, wlf<SpeedControlInteractor> wlf7, wlf<l> wlf8, wlf<w> wlf9, wlf<s<String>> wlf10, wlf<ifd> wlf11, wlf<yn0> wlf12, wlf<c> wlf13, wlf<cqe> wlf14) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ExternalIntegrationServicePlaybackImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get());
    }
}
