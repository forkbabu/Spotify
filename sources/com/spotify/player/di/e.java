package com.spotify.player.di;

import androidx.lifecycle.Lifecycle;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;
import com.spotify.player.di.g;
import com.spotify.player.esperanto.proto.k;
import com.spotify.player.internal.PlayerCommandResolverImpl;
import com.spotify.player.internal.PlayerSessionCommandResolverImpl;
import com.spotify.player.internal.i;
import com.spotify.player.queue.f;
import com.spotify.remoteconfig.rj;

public final class e implements g {
    private final h a;
    private wlf<RxRouterProvider> b;
    private wlf<Lifecycle> c;
    private wlf<RxRouter> d;
    private wlf<k.b> e;
    private wlf<pxd> f;
    private wlf<PlayerCommandResolverImpl> g;
    private wlf<PlayerSessionCommandResolverImpl> h;

    /* access modifiers changed from: private */
    public static final class b implements g.a {
        private b() {
        }

        public g a(h hVar, Lifecycle lifecycle) {
            hVar.getClass();
            lifecycle.getClass();
            return new e(new c(), hVar, lifecycle, null);
        }

        b(a aVar) {
        }
    }

    private static class c implements wlf<pxd> {
        private final h a;

        c(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public pxd get() {
            pxd b = this.a.b();
            yif.g(b, "Cannot return null from a non-@Nullable component method");
            return b;
        }
    }

    private static class d implements wlf<RxRouterProvider> {
        private final h a;

        d(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public RxRouterProvider get() {
            RxRouterProvider d = this.a.d();
            yif.g(d, "Cannot return null from a non-@Nullable component method");
            return d;
        }
    }

    e(c cVar, h hVar, Lifecycle lifecycle, a aVar) {
        this.a = hVar;
        this.b = new d(hVar);
        fjf a2 = gjf.a(lifecycle);
        this.c = a2;
        wlf<RxRouter> b2 = ejf.b(new n(this.b, a2));
        this.d = b2;
        this.e = new d(cVar, b2);
        c cVar2 = new c(hVar);
        this.f = cVar2;
        this.g = new com.spotify.player.internal.e(b2, cVar2);
        this.h = new i(b2, cVar2);
    }

    public static g.a e() {
        return new b(null);
    }

    private com.spotify.player.internal.a f() {
        cqe a2 = this.a.a();
        yif.g(a2, "Cannot return null from a non-@Nullable component method");
        return new com.spotify.player.internal.a(a2);
    }

    @Override // defpackage.bxd
    public f a() {
        ajf a2 = ejf.a(this.d);
        ajf a3 = ejf.a(this.f);
        ajf a4 = ejf.a(this.g);
        ajf a5 = ejf.a(this.e);
        com.spotify.player.internal.a f2 = f();
        rj c2 = this.a.c();
        yif.g(c2, "Cannot return null from a non-@Nullable component method");
        return m.a(a2, a3, a4, a5, f2, c2);
    }

    @Override // defpackage.bxd
    public com.spotify.player.controls.d b() {
        ajf a2 = ejf.a(this.g);
        ajf a3 = ejf.a(this.e);
        com.spotify.player.internal.a f2 = f();
        rj c2 = this.a.c();
        yif.g(c2, "Cannot return null from a non-@Nullable component method");
        return j.a(a2, a3, f2, c2);
    }

    @Override // defpackage.bxd
    public com.spotify.player.play.f c() {
        rj c2 = this.a.c();
        yif.g(c2, "Cannot return null from a non-@Nullable component method");
        return k.b(c2, ejf.a(this.e), ejf.a(this.g), ejf.a(this.h), f(), ejf.a(this.f));
    }

    @Override // defpackage.bxd
    public com.spotify.player.options.d d() {
        ajf a2 = ejf.a(this.g);
        ajf a3 = ejf.a(this.e);
        com.spotify.player.internal.a f2 = f();
        rj c2 = this.a.c();
        yif.g(c2, "Cannot return null from a non-@Nullable component method");
        return l.a(a2, a3, f2, c2);
    }
}
