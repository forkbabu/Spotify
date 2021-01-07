package com.spotify.music.features.california.feature;

import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.bd;
import com.squareup.picasso.Picasso;
import defpackage.bxd;
import io.reactivex.g;

public final class l {
    private final a a;
    private wlf<bd> b;
    private wlf<f> c;
    private wlf<g<PlayerState>> d;
    private wlf<ere> e;
    private wlf<bxd.a> f;
    private wlf<etd> g;
    private wlf<bxd> h;
    private wlf<com.spotify.player.controls.d> i;
    private wlf<g> j;
    private wlf<Picasso> k;
    private wlf<j> l;

    private static class b implements wlf<bd> {
        private final a a;

        b(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public bd get() {
            bd f = this.a.f();
            yif.g(f, "Cannot return null from a non-@Nullable component method");
            return f;
        }
    }

    private static class c implements wlf<Picasso> {
        private final a a;

        c(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public Picasso get() {
            Picasso c = this.a.c();
            yif.g(c, "Cannot return null from a non-@Nullable component method");
            return c;
        }
    }

    private static class d implements wlf<bxd.a> {
        private final a a;

        d(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public bxd.a get() {
            bxd.a g = this.a.g();
            yif.g(g, "Cannot return null from a non-@Nullable component method");
            return g;
        }
    }

    private static class e implements wlf<g<PlayerState>> {
        private final a a;

        e(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public g<PlayerState> get() {
            g<PlayerState> d = this.a.d();
            yif.g(d, "Cannot return null from a non-@Nullable component method");
            return d;
        }
    }

    private static class f implements wlf<ere> {
        private final a a;

        f(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public ere get() {
            ere e = this.a.e();
            yif.g(e, "Cannot return null from a non-@Nullable component method");
            return e;
        }
    }

    l(a aVar, f fVar, etd etd, a aVar2) {
        this.a = aVar;
        this.b = new b(aVar);
        this.c = gjf.a(fVar);
        this.d = new e(aVar);
        this.e = new f(aVar);
        this.f = new d(aVar);
        fjf a2 = gjf.a(etd);
        this.g = a2;
        b bVar = new b(this.f, a2);
        this.h = bVar;
        cxd cxd = new cxd(bVar);
        this.i = cxd;
        this.j = new h(this.c, this.d, this.e, cxd);
        c cVar = new c(aVar);
        this.k = cVar;
        this.l = new k(cVar);
    }

    public CaliforniaPage a() {
        qac a2 = this.a.a();
        yif.g(a2, "Cannot return null from a non-@Nullable component method");
        txc b2 = this.a.b();
        yif.g(b2, "Cannot return null from a non-@Nullable component method");
        return new CaliforniaPage(a2, b2, new d(this.b, this.j, this.l, this.c));
    }
}
