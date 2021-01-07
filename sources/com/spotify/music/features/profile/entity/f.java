package com.spotify.music.features.profile.entity;

import android.app.Activity;
import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.android.glue.patterns.toolbarmenu.f0;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties;
import com.spotify.remoteconfig.s6;
import com.squareup.picasso.Picasso;
import defpackage.ij9;
import defpackage.t8a;
import defpackage.y22;
import io.reactivex.y;

public final class f {
    private static final wlf Z = gjf.a(Optional.absent());
    public static final /* synthetic */ int a0 = 0;
    private wlf<PlaylistMenuMaker.a> A;
    private wlf<z3<com.spotify.playlist.models.j>> B;
    private wlf<AndroidLibsContextMenuPlaylistProperties> C;
    private wlf<com.spotify.mobile.android.ui.contextmenu.delegates.playlist.h> D;
    private wlf<com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f> E;
    private wlf<j42> F;
    private wlf<hk7> G;
    private wlf<gk7> H;
    private wlf<ek7> I;
    private wlf<ere> J;
    private wlf<hq7> K;
    private wlf<i> L;
    private wlf<il7> M;
    private wlf<Boolean> N;
    private wlf<qr7> O;
    private wlf<jz1> P;
    private wlf<ifd> Q;
    private wlf<t8a.a> R;
    private wlf<e0> S;
    private wlf<kzc> T;
    private wlf<androidx.fragment.app.c> U;
    private wlf<ij9.b> V;
    private wlf<Optional<qzc>> W;
    private wlf<jzc> X;
    private wlf<c.a> Y = new ssd(this.u);
    private final g a;
    private final t b;
    private wlf<y> c;
    private wlf<y> d;
    private wlf<y> e;
    private wlf<com.spotify.music.navigation.t> f;
    private wlf<Activity> g;
    private wlf<v> h;
    private wlf<com.spotify.music.follow.m> i;
    private wlf<at7> j;
    private wlf<txc> k;
    private wlf<s6> l;
    private wlf<nr7> m;
    private wlf<com.spotify.android.glue.components.toolbar.d> n;
    private wlf<Context> o;
    private wlf<Picasso> p;
    private wlf<jqa> q;
    private wlf<lqa> r;
    private wlf<com.spotify.mobile.android.util.ui.h> s;
    private wlf<t> t;
    private wlf<qsd> u;
    private wlf<com.spotify.music.libs.viewuri.c> v;
    private wlf<y22.a> w;
    private wlf<z3<com.spotify.playlist.models.b>> x;
    private wlf<w22> y;
    private wlf<u22> z;

    private static class b implements wlf<Activity> {
        private final g a;

        b(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public Activity get() {
            Activity y = this.a.y();
            yif.g(y, "Cannot return null from a non-@Nullable component method");
            return y;
        }
    }

    private static class c implements wlf<Context> {
        private final g a;

        c(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public Context get() {
            Context m = this.a.m();
            yif.g(m, "Cannot return null from a non-@Nullable component method");
            return m;
        }
    }

    private static class d implements wlf<Boolean> {
        private final g a;

        d(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public Boolean get() {
            return Boolean.valueOf(this.a.q());
        }
    }

    private static class e implements wlf<s6> {
        private final g a;

        e(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public s6 get() {
            s6 r = this.a.r();
            yif.g(r, "Cannot return null from a non-@Nullable component method");
            return r;
        }
    }

    /* renamed from: com.spotify.music.features.profile.entity.f$f  reason: collision with other inner class name */
    private static class C0249f implements wlf<AndroidLibsContextMenuPlaylistProperties> {
        private final g a;

        C0249f(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public AndroidLibsContextMenuPlaylistProperties get() {
            AndroidLibsContextMenuPlaylistProperties n = this.a.n();
            yif.g(n, "Cannot return null from a non-@Nullable component method");
            return n;
        }
    }

    private static class g implements wlf<y22.a> {
        private final g a;

        g(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public y22.a get() {
            y22.a p = this.a.p();
            yif.g(p, "Cannot return null from a non-@Nullable component method");
            return p;
        }
    }

    private static class h implements wlf<z3<com.spotify.playlist.models.b>> {
        private final g a;

        h(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public z3<com.spotify.playlist.models.b> get() {
            z3<com.spotify.playlist.models.b> j = this.a.j();
            yif.g(j, "Cannot return null from a non-@Nullable component method");
            return j;
        }
    }

    private static class i implements wlf<y> {
        private final g a;

        i(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public y get() {
            y g = this.a.g();
            yif.g(g, "Cannot return null from a non-@Nullable component method");
            return g;
        }
    }

    private static class j implements wlf<com.spotify.music.follow.m> {
        private final g a;

        j(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public com.spotify.music.follow.m get() {
            com.spotify.music.follow.m f = this.a.f();
            yif.g(f, "Cannot return null from a non-@Nullable component method");
            return f;
        }
    }

    private static class k implements wlf<androidx.fragment.app.c> {
        private final g a;

        k(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public androidx.fragment.app.c get() {
            androidx.fragment.app.c v = this.a.v();
            yif.g(v, "Cannot return null from a non-@Nullable component method");
            return v;
        }
    }

    private static class l implements wlf<com.spotify.android.glue.components.toolbar.d> {
        private final g a;

        l(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public com.spotify.android.glue.components.toolbar.d get() {
            com.spotify.android.glue.components.toolbar.d w = this.a.w();
            yif.g(w, "Cannot return null from a non-@Nullable component method");
            return w;
        }
    }

    private static class m implements wlf<y> {
        private final g a;

        m(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public y get() {
            y l = this.a.l();
            yif.g(l, "Cannot return null from a non-@Nullable component method");
            return l;
        }
    }

    private static class n implements wlf<t8a.a> {
        private final g a;

        n(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public t8a.a get() {
            t8a.a s = this.a.s();
            yif.g(s, "Cannot return null from a non-@Nullable component method");
            return s;
        }
    }

    private static class o implements wlf<jz1> {
        private final g a;

        o(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public jz1 get() {
            jz1 A = this.a.A();
            yif.g(A, "Cannot return null from a non-@Nullable component method");
            return A;
        }
    }

    private static class p implements wlf<y> {
        private final g a;

        p(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public y get() {
            y i = this.a.i();
            yif.g(i, "Cannot return null from a non-@Nullable component method");
            return i;
        }
    }

    private static class q implements wlf<com.spotify.music.navigation.t> {
        private final g a;

        q(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public com.spotify.music.navigation.t get() {
            com.spotify.music.navigation.t k = this.a.k();
            yif.g(k, "Cannot return null from a non-@Nullable component method");
            return k;
        }
    }

    private static class r implements wlf<ij9.b> {
        private final g a;

        r(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public ij9.b get() {
            ij9.b x = this.a.x();
            yif.g(x, "Cannot return null from a non-@Nullable component method");
            return x;
        }
    }

    private static class s implements wlf<Picasso> {
        private final g a;

        s(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public Picasso get() {
            Picasso c = this.a.c();
            yif.g(c, "Cannot return null from a non-@Nullable component method");
            return c;
        }
    }

    private static class t implements wlf<PlaylistMenuMaker.a> {
        private final g a;

        t(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public PlaylistMenuMaker.a get() {
            PlaylistMenuMaker.a e = this.a.e();
            yif.g(e, "Cannot return null from a non-@Nullable component method");
            return e;
        }
    }

    private static class u implements wlf<z3<com.spotify.playlist.models.j>> {
        private final g a;

        u(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public z3<com.spotify.playlist.models.j> get() {
            z3<com.spotify.playlist.models.j> o = this.a.o();
            yif.g(o, "Cannot return null from a non-@Nullable component method");
            return o;
        }
    }

    private static class v implements wlf<txc> {
        private final g a;

        v(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public txc get() {
            txc b = this.a.b();
            yif.g(b, "Cannot return null from a non-@Nullable component method");
            return b;
        }
    }

    private static class w implements wlf<kzc> {
        private final g a;

        w(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public kzc get() {
            kzc u = this.a.u();
            yif.g(u, "Cannot return null from a non-@Nullable component method");
            return u;
        }
    }

    private static class x implements wlf<ere> {
        private final g a;

        x(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public ere get() {
            ere h = this.a.h();
            yif.g(h, "Cannot return null from a non-@Nullable component method");
            return h;
        }
    }

    f(g gVar, t tVar, etd etd, a aVar) {
        this.a = gVar;
        this.b = tVar;
        p pVar = new p(gVar);
        this.c = pVar;
        m mVar = new m(gVar);
        this.d = mVar;
        i iVar = new i(gVar);
        this.e = iVar;
        q qVar = new q(gVar);
        this.f = qVar;
        b bVar = new b(gVar);
        this.g = bVar;
        w wVar = new w(bVar, qVar);
        this.h = wVar;
        j jVar = new j(gVar);
        this.i = jVar;
        bt7 bt7 = new bt7(jVar);
        this.j = bt7;
        v vVar = new v(gVar);
        this.k = vVar;
        e eVar = new e(gVar);
        this.l = eVar;
        this.m = or7.a(pVar, mVar, iVar, qVar, wVar, bt7, vVar, eVar);
        this.n = new l(gVar);
        c cVar = new c(gVar);
        this.o = cVar;
        s sVar = new s(gVar);
        this.p = sVar;
        kqa kqa = new kqa(cVar);
        this.q = kqa;
        this.r = new mqa(cVar, sVar, kqa);
        this.s = new com.spotify.mobile.android.util.ui.i(cVar, sVar);
        fjf a2 = gjf.a(tVar);
        this.t = a2;
        m mVar2 = new m(a2);
        this.u = mVar2;
        rsd rsd = new rsd(mVar2);
        this.v = rsd;
        g gVar2 = new g(gVar);
        this.w = gVar2;
        h hVar = new h(gVar);
        this.x = hVar;
        x22 x22 = new x22(hVar);
        this.y = x22;
        v22 v22 = new v22(gVar2, x22);
        this.z = v22;
        t tVar2 = new t(gVar);
        this.A = tVar2;
        u uVar = new u(gVar);
        this.B = uVar;
        C0249f fVar = new C0249f(gVar);
        this.C = fVar;
        com.spotify.mobile.android.ui.contextmenu.delegates.playlist.i iVar2 = new com.spotify.mobile.android.ui.contextmenu.delegates.playlist.i(uVar, fVar);
        this.D = iVar2;
        com.spotify.mobile.android.ui.contextmenu.delegates.playlist.g gVar3 = new com.spotify.mobile.android.ui.contextmenu.delegates.playlist.g(tVar2, iVar2);
        this.E = gVar3;
        wlf<Context> wlf = this.o;
        k42 k42 = new k42(wlf, rsd);
        this.F = k42;
        ik7 a3 = ik7.a(wlf, rsd, v22, gVar3, k42);
        this.G = a3;
        wlf<gk7> b2 = ejf.b(new n(a3));
        this.H = b2;
        wlf<com.spotify.mobile.android.util.ui.h> wlf2 = this.s;
        wlf<lqa> wlf3 = this.r;
        fk7 fk7 = new fk7(wlf2, wlf3, b2);
        this.I = fk7;
        x xVar = new x(gVar);
        this.J = xVar;
        o oVar = new o(this.t);
        this.K = oVar;
        j jVar2 = new j(xVar, oVar);
        this.L = jVar2;
        jl7 jl7 = new jl7(this.o, this.j);
        this.M = jl7;
        d dVar = new d(gVar);
        this.N = dVar;
        this.O = rr7.a(this.g, this.n, wlf3, fk7, jVar2, oVar, b2, jl7, dVar);
        o oVar2 = new o(gVar);
        this.P = oVar2;
        tsd tsd = new tsd(this.u);
        this.Q = tsd;
        n nVar = new n(gVar);
        this.R = nVar;
        this.S = new f0(oVar2, tsd, nVar);
        w wVar2 = new w(gVar);
        this.T = wVar2;
        k kVar = new k(gVar);
        this.U = kVar;
        r rVar = new r(gVar);
        this.V = rVar;
        wlf<Optional<qzc>> wlf4 = Z;
        this.W = wlf4;
        this.X = ozc.a(wVar2, kVar, this.v, rVar, wlf4);
    }

    public ProfileEntityPage a() {
        qac a2 = this.a.a();
        yif.g(a2, "Cannot return null from a non-@Nullable component method");
        qac qac = a2;
        s sVar = new s(this.m, this.O, this.S, this.X, this.f, this.Y);
        y i2 = this.a.i();
        yif.g(i2, "Cannot return null from a non-@Nullable component method");
        y yVar = i2;
        com.spotify.http.u d2 = this.a.d();
        yif.g(d2, "Cannot return null from a non-@Nullable component method");
        vo7 a3 = wo7.a(d2);
        Cosmonaut z2 = this.a.z();
        yif.g(z2, "Cannot return null from a non-@Nullable component method");
        dqa dqa = new dqa(fqa.a(z2));
        com.spotify.music.follow.m f2 = this.a.f();
        yif.g(f2, "Cannot return null from a non-@Nullable component method");
        at7 at7 = new at7(f2);
        txc b2 = this.a.b();
        yif.g(b2, "Cannot return null from a non-@Nullable component method");
        com.spotify.music.libs.web.h t2 = this.a.t();
        yif.g(t2, "Cannot return null from a non-@Nullable component method");
        y l2 = this.a.l();
        yif.g(l2, "Cannot return null from a non-@Nullable component method");
        RxWebToken rxWebToken = new RxWebToken(t2, l2);
        y i3 = this.a.i();
        yif.g(i3, "Cannot return null from a non-@Nullable component method");
        y l3 = this.a.l();
        yif.g(l3, "Cannot return null from a non-@Nullable component method");
        y g2 = this.a.g();
        yif.g(g2, "Cannot return null from a non-@Nullable component method");
        return new ProfileEntityPage(qac, sVar, yVar, new bp7(a3, dqa, at7, b2, rxWebToken, i3, l3, g2), this.b, this.a.q());
    }
}
