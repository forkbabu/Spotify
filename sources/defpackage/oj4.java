package defpackage;

import com.spotify.music.features.playlistentity.header.x0;
import com.spotify.remoteconfig.o9;
import defpackage.qb6;

/* renamed from: oj4  reason: default package */
public final class oj4 implements fjf<nj4> {
    private final wlf<uj4> a;
    private final wlf<gj4> b;
    private final wlf<qb6.a> c;
    private final wlf<x0.a> d;
    private final wlf<o9> e;
    private final wlf<ij4> f;

    public oj4(wlf<uj4> wlf, wlf<gj4> wlf2, wlf<qb6.a> wlf3, wlf<x0.a> wlf4, wlf<o9> wlf5, wlf<ij4> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nj4(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
