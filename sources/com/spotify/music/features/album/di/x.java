package com.spotify.music.features.album.di;

import com.spotify.music.features.album.encore.AlbumHeaderTransformer;
import com.spotify.music.libs.freetiertrackpreview.transformer.a;
import com.spotify.music.libs.freetiertrackpreview.transformer.c;
import com.spotify.music.libs.freetiertrackpreview.transformer.e;
import com.spotify.remoteconfig.d5;
import defpackage.k1e;
import io.reactivex.w;

public final class x implements fjf<k1e<b91>> {
    private final wlf<Boolean> a;
    private final wlf<Boolean> b;
    private final wlf<Boolean> c;
    private final wlf<h81> d;
    private final wlf<zy3> e;
    private final wlf<ve3> f;
    private final wlf<ay3> g;
    private final wlf<xy3> h;
    private final wlf<ow3> i;
    private final wlf<py3> j;
    private final wlf<ld3> k;
    private final wlf<a> l;
    private final wlf<c> m;
    private final wlf<e> n;
    private final wlf<AlbumHeaderTransformer> o;
    private final wlf<d5> p;

    public x(wlf<Boolean> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<h81> wlf4, wlf<zy3> wlf5, wlf<ve3> wlf6, wlf<ay3> wlf7, wlf<xy3> wlf8, wlf<ow3> wlf9, wlf<py3> wlf10, wlf<ld3> wlf11, wlf<a> wlf12, wlf<c> wlf13, wlf<e> wlf14, wlf<AlbumHeaderTransformer> wlf15, wlf<d5> wlf16) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
    }

    @Override // defpackage.wlf
    public Object get() {
        boolean booleanValue = this.a.get().booleanValue();
        boolean booleanValue2 = this.b.get().booleanValue();
        boolean booleanValue3 = this.c.get().booleanValue();
        ajf a2 = ejf.a(this.d);
        ajf a3 = ejf.a(this.e);
        ajf a4 = ejf.a(this.f);
        ajf a5 = ejf.a(this.g);
        ajf a6 = ejf.a(this.h);
        ajf a7 = ejf.a(this.i);
        ajf a8 = ejf.a(this.j);
        ajf a9 = ejf.a(this.k);
        ajf a10 = ejf.a(this.l);
        ajf a11 = ejf.a(this.m);
        ajf a12 = ejf.a(this.n);
        ajf a13 = ejf.a(this.o);
        k1e.b bVar = new k1e.b();
        if (this.p.get().a()) {
            bVar.a((w) a13.get());
        }
        if (booleanValue3) {
            bVar.a(new h(a2));
        } else if (booleanValue) {
            bVar.a((w) a6.get());
        }
        bVar.a((w) a4.get());
        bVar.a((w) a3.get());
        bVar.a((w) a5.get());
        if (!booleanValue) {
            bVar.a((w) a8.get());
        }
        bVar.a((w) a7.get());
        bVar.a((w) a9.get());
        if (!booleanValue2) {
            bVar.a((w) a10.get());
            bVar.a((w) a12.get());
            bVar.a((w) a11.get());
        }
        return bVar.b();
    }
}
