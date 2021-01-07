package com.spotify.music.nowplaying.podcast.speedcontrol;

import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<SpeedControlInteractor> b;
    private final wlf<c2c> c;
    private final wlf<e2c> d;
    private final wlf<d> e;
    private final wlf<y> f;

    public f(wlf<g<ContextTrack>> wlf, wlf<SpeedControlInteractor> wlf2, wlf<c2c> wlf3, wlf<e2c> wlf4, wlf<d> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static f a(wlf<g<ContextTrack>> wlf, wlf<SpeedControlInteractor> wlf2, wlf<c2c> wlf3, wlf<e2c> wlf4, wlf<d> wlf5, wlf<y> wlf6) {
        return new f(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
