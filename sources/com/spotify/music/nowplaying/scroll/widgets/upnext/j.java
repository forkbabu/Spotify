package com.spotify.music.nowplaying.scroll.widgets.upnext;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.player.controls.d;
import io.reactivex.y;

public final class j implements fjf<i> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<bxd> c;
    private final wlf<ExplicitContentFacade> d;
    private final wlf<AgeRestrictedContentFacade> e;
    private final wlf<b4c> f;
    private final wlf<d> g;
    private final wlf<nsb> h;

    public j(wlf<y> wlf, wlf<y> wlf2, wlf<bxd> wlf3, wlf<ExplicitContentFacade> wlf4, wlf<AgeRestrictedContentFacade> wlf5, wlf<b4c> wlf6, wlf<d> wlf7, wlf<nsb> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
