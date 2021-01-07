package com.spotify.music.nowplaying.common.view.pager;

import com.spotify.music.nowplaying.core.util.CoverArtFetcher;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;

public final class g implements fjf<f> {
    private final wlf<d> a;
    private final wlf<io.reactivex.g<PlayerState>> b;
    private final wlf<iqd> c;
    private final wlf<CoverArtFetcher> d;

    public g(wlf<d> wlf, wlf<io.reactivex.g<PlayerState>> wlf2, wlf<iqd> wlf3, wlf<CoverArtFetcher> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
