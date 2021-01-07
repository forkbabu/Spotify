package com.spotify.music.newplaying.scroll.widgets.btl;

import com.spotify.music.behindthelyrics.presenter.i;
import com.spotify.music.behindthelyrics.presenter.l;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;
import io.reactivex.y;

public final class m implements fjf<l> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<jk2> b;
    private final wlf<i> c;
    private final wlf<l> d;
    private final wlf<y> e;
    private final wlf<sk2> f;

    public m(wlf<g<ContextTrack>> wlf, wlf<jk2> wlf2, wlf<i> wlf3, wlf<l> wlf4, wlf<y> wlf5, wlf<sk2> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static m a(wlf<g<ContextTrack>> wlf, wlf<jk2> wlf2, wlf<i> wlf3, wlf<l> wlf4, wlf<y> wlf5, wlf<sk2> wlf6) {
        return new m(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
