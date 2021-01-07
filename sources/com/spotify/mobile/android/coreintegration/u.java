package com.spotify.mobile.android.coreintegration;

import android.os.Handler;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.service.feature.q;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.service.w;
import com.spotify.mobile.android.util.connectivity.v;
import com.spotify.music.container.app.foregroundstate.ForegroundServicesStatus;
import com.spotify.music.libs.performance.tracking.e0;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.subjects.a;
import io.reactivex.y;

public final class u implements fjf<t> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<StateRestoreFileDeleter> c;
    private final wlf<FireAndForgetResolver> d;
    private final wlf<mc1> e;
    private final wlf<hz1> f;
    private final wlf<jc1> g;
    private final wlf<wt9> h;
    private final wlf<yt9> i;
    private final wlf<w> j;
    private final wlf<Handler> k;
    private final wlf<s<Boolean>> l;
    private final wlf<s<ForegroundServicesStatus>> m;
    private final wlf<a<BackgroundFeaturesStatus>> n;
    private final wlf<a<TaskRemovedStatus>> o;
    private final wlf<q> p;
    private final wlf<k0> q;
    private final wlf<g<SessionState>> r;
    private final wlf<cg3> s;
    private final wlf<e0> t;
    private final wlf<v> u;
    private final wlf<zla> v;

    public u(wlf<y> wlf, wlf<y> wlf2, wlf<StateRestoreFileDeleter> wlf3, wlf<FireAndForgetResolver> wlf4, wlf<mc1> wlf5, wlf<hz1> wlf6, wlf<jc1> wlf7, wlf<wt9> wlf8, wlf<yt9> wlf9, wlf<w> wlf10, wlf<Handler> wlf11, wlf<s<Boolean>> wlf12, wlf<s<ForegroundServicesStatus>> wlf13, wlf<a<BackgroundFeaturesStatus>> wlf14, wlf<a<TaskRemovedStatus>> wlf15, wlf<q> wlf16, wlf<k0> wlf17, wlf<g<SessionState>> wlf18, wlf<cg3> wlf19, wlf<e0> wlf20, wlf<v> wlf21, wlf<zla> wlf22) {
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
        this.q = wlf17;
        this.r = wlf18;
        this.s = wlf19;
        this.t = wlf20;
        this.u = wlf21;
        this.v = wlf22;
    }

    public static t a(y yVar, Object obj, Object obj2, FireAndForgetResolver fireAndForgetResolver, mc1 mc1, hz1 hz1, jc1 jc1, wt9 wt9, yt9 yt9, w wVar, Handler handler, s<Boolean> sVar, s<ForegroundServicesStatus> sVar2, a<BackgroundFeaturesStatus> aVar, a<TaskRemovedStatus> aVar2, q qVar, k0 k0Var, g<SessionState> gVar, cg3 cg3, e0 e0Var, v vVar, zla zla) {
        return new t(yVar, (y) obj, (StateRestoreFileDeleter) obj2, fireAndForgetResolver, mc1, hz1, jc1, wt9, yt9, wVar, handler, sVar, sVar2, aVar, aVar2, qVar, k0Var, gVar, cg3, e0Var, vVar, zla);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get(), this.u.get(), this.v.get());
    }
}
