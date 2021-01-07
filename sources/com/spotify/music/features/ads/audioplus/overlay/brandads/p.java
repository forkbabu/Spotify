package com.spotify.music.features.ads.audioplus.overlay.brandads;

import com.spotify.music.features.ads.audioplus.overlay.c;
import com.spotify.music.features.ads.audioplus.overlay.g;
import com.squareup.picasso.Picasso;

public final class p implements fjf<n> {
    private final wlf<Picasso> a;
    private final wlf<c> b;
    private final wlf<nu3> c;
    private final wlf<g> d;

    public p(wlf<Picasso> wlf, wlf<c> wlf2, wlf<nu3> wlf3, wlf<g> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        n nVar = new n();
        nVar.u = this.a.get();
        nVar.v = this.b.get();
        nVar.w = this.c.get();
        nVar.x = this.d.get();
        return nVar;
    }
}
