package com.spotify.music.features.ads.audioplus.overlay.brandads;

import com.spotify.music.features.ads.audioplus.overlay.c;
import com.squareup.picasso.Picasso;

public final class q implements fjf<l> {
    private final wlf<Picasso> a;
    private final wlf<c> b;
    private final wlf<nu3> c;

    public q(wlf<Picasso> wlf, wlf<c> wlf2, wlf<nu3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        l lVar = new l();
        lVar.u = this.a.get();
        lVar.v = this.b.get();
        lVar.w = this.c.get();
        return lVar;
    }
}
