package com.spotify.music.features.queue;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.queue.logging.c;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.player.controls.d;

public final class c0 implements fjf<b0> {
    private final wlf<w> a;
    private final wlf<v> b;
    private final wlf<c> c;
    private final wlf<ExplicitContentFacade> d;
    private final wlf<AgeRestrictedContentFacade> e;
    private final wlf<d> f;
    private final wlf<Boolean> g;

    public c0(wlf<w> wlf, wlf<v> wlf2, wlf<c> wlf3, wlf<ExplicitContentFacade> wlf4, wlf<AgeRestrictedContentFacade> wlf5, wlf<d> wlf6, wlf<Boolean> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
