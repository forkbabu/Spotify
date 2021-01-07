package com.spotify.music.features.profile.profilelist;

import android.content.Context;
import com.spotify.http.u;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.features.profile.profilelist.n;
import com.spotify.music.navigation.t;
import com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties;
import com.squareup.picasso.Picasso;
import defpackage.y22;
import io.reactivex.y;

public final class g {
    private wlf<w> A;
    private wlf<wt7> B;
    private wlf<y> C;
    private wlf<y> D;
    private wlf<y> E;
    private wlf<t> F;
    private wlf<com.spotify.music.follow.m> G;
    private wlf<at7> H;
    private wlf<j> I;
    private wlf<u> J;
    private wlf<vo7> K;
    private wlf<il7> L;
    private final h a;
    private final u b;
    private wlf<Context> c;
    private wlf<Picasso> d;
    private wlf<com.spotify.mobile.android.util.ui.h> e;
    private wlf<jqa> f;
    private wlf<lqa> g;
    private wlf<u> h;
    private wlf<dt7> i;
    private wlf<ProfileListMetadataResolver> j;
    private wlf<qsd> k;
    private wlf<com.spotify.music.libs.viewuri.c> l;
    private wlf<y22.a> m;
    private wlf<z3<com.spotify.playlist.models.b>> n;
    private wlf<w22> o;
    private wlf<u22> p;
    private wlf<PlaylistMenuMaker.a> q;
    private wlf<z3<com.spotify.playlist.models.j>> r;
    private wlf<AndroidLibsContextMenuPlaylistProperties> s;
    private wlf<com.spotify.mobile.android.ui.contextmenu.delegates.playlist.h> t;
    private wlf<com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f> u;
    private wlf<j42> v;
    private wlf<hk7> w;
    private wlf<gk7> x;
    private wlf<ek7> y;
    private wlf<ere> z;

    private static class b implements wlf<Context> {
        private final h a;

        b(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public Context get() {
            Context m = this.a.m();
            yif.g(m, "Cannot return null from a non-@Nullable component method");
            return m;
        }
    }

    private static class c implements wlf<AndroidLibsContextMenuPlaylistProperties> {
        private final h a;

        c(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public AndroidLibsContextMenuPlaylistProperties get() {
            AndroidLibsContextMenuPlaylistProperties n = this.a.n();
            yif.g(n, "Cannot return null from a non-@Nullable component method");
            return n;
        }
    }

    private static class d implements wlf<y22.a> {
        private final h a;

        d(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public y22.a get() {
            y22.a p = this.a.p();
            yif.g(p, "Cannot return null from a non-@Nullable component method");
            return p;
        }
    }

    private static class e implements wlf<z3<com.spotify.playlist.models.b>> {
        private final h a;

        e(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public z3<com.spotify.playlist.models.b> get() {
            z3<com.spotify.playlist.models.b> j = this.a.j();
            yif.g(j, "Cannot return null from a non-@Nullable component method");
            return j;
        }
    }

    private static class f implements wlf<y> {
        private final h a;

        f(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public y get() {
            y g = this.a.g();
            yif.g(g, "Cannot return null from a non-@Nullable component method");
            return g;
        }
    }

    /* renamed from: com.spotify.music.features.profile.profilelist.g$g  reason: collision with other inner class name */
    private static class C0252g implements wlf<com.spotify.music.follow.m> {
        private final h a;

        C0252g(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public com.spotify.music.follow.m get() {
            com.spotify.music.follow.m f = this.a.f();
            yif.g(f, "Cannot return null from a non-@Nullable component method");
            return f;
        }
    }

    private static class h implements wlf<y> {
        private final h a;

        h(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public y get() {
            y l = this.a.l();
            yif.g(l, "Cannot return null from a non-@Nullable component method");
            return l;
        }
    }

    private static class i implements wlf<y> {
        private final h a;

        i(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public y get() {
            y i = this.a.i();
            yif.g(i, "Cannot return null from a non-@Nullable component method");
            return i;
        }
    }

    private static class j implements wlf<t> {
        private final h a;

        j(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public t get() {
            t k = this.a.k();
            yif.g(k, "Cannot return null from a non-@Nullable component method");
            return k;
        }
    }

    private static class k implements wlf<Picasso> {
        private final h a;

        k(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public Picasso get() {
            Picasso c = this.a.c();
            yif.g(c, "Cannot return null from a non-@Nullable component method");
            return c;
        }
    }

    private static class l implements wlf<PlaylistMenuMaker.a> {
        private final h a;

        l(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public PlaylistMenuMaker.a get() {
            PlaylistMenuMaker.a e = this.a.e();
            yif.g(e, "Cannot return null from a non-@Nullable component method");
            return e;
        }
    }

    private static class m implements wlf<z3<com.spotify.playlist.models.j>> {
        private final h a;

        m(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public z3<com.spotify.playlist.models.j> get() {
            z3<com.spotify.playlist.models.j> o = this.a.o();
            yif.g(o, "Cannot return null from a non-@Nullable component method");
            return o;
        }
    }

    private static class n implements wlf<u> {
        private final h a;

        n(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public u get() {
            u d = this.a.d();
            yif.g(d, "Cannot return null from a non-@Nullable component method");
            return d;
        }
    }

    private static class o implements wlf<ere> {
        private final h a;

        o(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public ere get() {
            ere h = this.a.h();
            yif.g(h, "Cannot return null from a non-@Nullable component method");
            return h;
        }
    }

    g(h hVar, u uVar, etd etd, a aVar) {
        this.a = hVar;
        this.b = uVar;
        b bVar = new b(hVar);
        this.c = bVar;
        k kVar = new k(hVar);
        this.d = kVar;
        this.e = new com.spotify.mobile.android.util.ui.i(bVar, kVar);
        kqa kqa = new kqa(bVar);
        this.f = kqa;
        this.g = new mqa(bVar, kVar, kqa);
        fjf a2 = gjf.a(uVar);
        this.h = a2;
        p pVar = new p(a2);
        this.i = pVar;
        l lVar = new l(pVar);
        this.j = lVar;
        o oVar = new o(a2, lVar);
        this.k = oVar;
        rsd rsd = new rsd(oVar);
        this.l = rsd;
        d dVar = new d(hVar);
        this.m = dVar;
        e eVar = new e(hVar);
        this.n = eVar;
        x22 x22 = new x22(eVar);
        this.o = x22;
        v22 v22 = new v22(dVar, x22);
        this.p = v22;
        l lVar2 = new l(hVar);
        this.q = lVar2;
        m mVar = new m(hVar);
        this.r = mVar;
        c cVar = new c(hVar);
        this.s = cVar;
        com.spotify.mobile.android.ui.contextmenu.delegates.playlist.i iVar = new com.spotify.mobile.android.ui.contextmenu.delegates.playlist.i(mVar, cVar);
        this.t = iVar;
        com.spotify.mobile.android.ui.contextmenu.delegates.playlist.g gVar = new com.spotify.mobile.android.ui.contextmenu.delegates.playlist.g(lVar2, iVar);
        this.u = gVar;
        wlf<Context> wlf = this.c;
        k42 k42 = new k42(wlf, rsd);
        this.v = k42;
        ik7 a3 = ik7.a(wlf, rsd, v22, gVar, k42);
        this.w = a3;
        wlf<gk7> b2 = ejf.b(a3);
        this.x = b2;
        fk7 fk7 = new fk7(this.e, this.g, b2);
        this.y = fk7;
        o oVar2 = new o(hVar);
        this.z = oVar2;
        x xVar = new x(oVar2, this.i);
        this.A = xVar;
        this.B = new xt7(fk7, b2, xVar);
        h hVar2 = new h(hVar);
        this.C = hVar2;
        f fVar = new f(hVar);
        this.D = fVar;
        i iVar2 = new i(hVar);
        this.E = iVar2;
        j jVar = new j(hVar);
        this.F = jVar;
        C0252g gVar2 = new C0252g(hVar);
        this.G = gVar2;
        bt7 bt7 = new bt7(gVar2);
        this.H = bt7;
        this.I = new k(hVar2, fVar, iVar2, jVar, bt7);
        n nVar = new n(hVar);
        this.J = nVar;
        this.K = new wo7(nVar);
        this.L = new jl7(this.c, bt7);
    }

    public ProfileListPage a() {
        qac a2 = this.a.a();
        yif.g(a2, "Cannot return null from a non-@Nullable component method");
        qac qac = a2;
        t tVar = new t(this.B, this.I);
        u uVar = this.b;
        n.a aVar = n.a;
        kotlin.jvm.internal.h.e(uVar, "profileListPageParameters");
        m mVar = new m(uVar);
        hl7 hl7 = new hl7(new yk7(this.K, this.c, this.L), new al7(this.K, this.c, this.L), new el7(this.K, this.c, this.L), new cl7(this.K, this.c, this.L));
        kotlin.jvm.internal.h.e(mVar, "uriProvider");
        kotlin.jvm.internal.h.e(hl7, "resolver");
        fl7 a3 = hl7.a(mVar.x());
        kotlin.jvm.internal.h.d(a3, "resolver.resolve(uriProvider.pageUri)");
        u uVar2 = this.b;
        kotlin.jvm.internal.h.e(uVar2, "profileListPageParameters");
        return new ProfileListPage(qac, tVar, a3, uVar2, o.a(uVar2, new ProfileListMetadataResolver(new m(uVar2))));
    }
}
