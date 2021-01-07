package com.spotify.mobile.android.hubframework.defaults.playback;

import androidx.lifecycle.n;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.play.f;

public final class m implements fjf<PlayFromContextCommandHandler> {
    private final wlf<f> a;
    private final wlf<bec> b;
    private final wlf<p71> c;
    private final wlf<ExplicitPlaybackCommandHelper> d;
    private final wlf<j81> e;
    private final wlf<ere> f;
    private final wlf<n> g;
    private final wlf<bre> h;
    private final wlf<PlayOrigin> i;

    public m(wlf<f> wlf, wlf<bec> wlf2, wlf<p71> wlf3, wlf<ExplicitPlaybackCommandHelper> wlf4, wlf<j81> wlf5, wlf<ere> wlf6, wlf<n> wlf7, wlf<bre> wlf8, wlf<PlayOrigin> wlf9) {
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

    public static m a(wlf<f> wlf, wlf<bec> wlf2, wlf<p71> wlf3, wlf<ExplicitPlaybackCommandHelper> wlf4, wlf<j81> wlf5, wlf<ere> wlf6, wlf<n> wlf7, wlf<bre> wlf8, wlf<PlayOrigin> wlf9) {
        return new m(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlayFromContextCommandHandler(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
