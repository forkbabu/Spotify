package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network.f;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;
import io.reactivex.y;

public final class i implements fjf<h> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<f> c;
    private final wlf<g<ContextTrack>> d;

    public i(wlf<y> wlf, wlf<y> wlf2, wlf<f> wlf3, wlf<g<ContextTrack>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
