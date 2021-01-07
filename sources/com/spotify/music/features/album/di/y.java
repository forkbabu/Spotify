package com.spotify.music.features.album.di;

import defpackage.k1e;
import io.reactivex.w;

public final class y implements fjf<k1e<b91>> {
    private final wlf<gy3> a;
    private final wlf<kk9> b;
    private final wlf<zec> c;
    private final wlf<wf3> d;

    public y(wlf<gy3> wlf, wlf<kk9> wlf2, wlf<zec> wlf3, wlf<wf3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        ajf a2 = ejf.a(this.a);
        ajf a3 = ejf.a(this.b);
        wf3 wf3 = this.d.get();
        k1e.b bVar = new k1e.b();
        if (this.c.get().d() && (!wf3.a() || wf3.b())) {
            bVar.a((w) a3.get());
        }
        if (wf3.b() && wf3.a()) {
            bVar.a((w) a2.get());
        }
        return bVar.b();
    }
}
