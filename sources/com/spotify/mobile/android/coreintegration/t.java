package com.spotify.mobile.android.coreintegration;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.service.feature.q;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.service.u;
import com.spotify.mobile.android.service.w;
import com.spotify.mobile.android.util.connectivity.a0;
import com.spotify.mobile.android.util.connectivity.v;
import com.spotify.music.container.app.foregroundstate.ForegroundServicesStatus;
import com.spotify.music.libs.performance.tracking.e0;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class t {
    private static final long D = TimeUnit.MINUTES.toMillis(1);
    public static final /* synthetic */ int E = 0;
    private boolean A;
    private final p B = new p();
    private final Runnable C = new e(this);
    private final y a;
    private final y b;
    private final StateRestoreFileDeleter c;
    private final FireAndForgetResolver d;
    private final mc1 e;
    private final hz1 f;
    private final jc1 g;
    private final wt9 h;
    private final yt9 i;
    private final w j;
    private final Handler k;
    private final s<Boolean> l;
    private final s<Boolean> m;
    private final s<Boolean> n;
    private final s<Boolean> o;
    private final q p;
    private final k0 q;
    private final g<SessionState> r;
    private final cg3 s;
    private final p t = new p();
    private final com.spotify.mobile.android.service.t u = new b(null);
    private final e0 v;
    private final v w;
    private final zla x;
    private lc1 y = new c0();
    private a0 z;

    private class b implements com.spotify.mobile.android.service.t {
        b(a aVar) {
        }

        @Override // com.spotify.mobile.android.service.t
        public void a() {
            t.this.q.a();
            t.this.q.c();
        }

        @Override // com.spotify.mobile.android.service.t
        public void b(SessionState sessionState) {
            t.this.q.b(sessionState);
        }
    }

    t(y yVar, y yVar2, StateRestoreFileDeleter stateRestoreFileDeleter, FireAndForgetResolver fireAndForgetResolver, mc1 mc1, hz1 hz1, jc1 jc1, wt9 wt9, yt9 yt9, w wVar, Handler handler, s<Boolean> sVar, s<ForegroundServicesStatus> sVar2, io.reactivex.subjects.a<BackgroundFeaturesStatus> aVar, io.reactivex.subjects.a<TaskRemovedStatus> aVar2, q qVar, k0 k0Var, g<SessionState> gVar, cg3 cg3, e0 e0Var, v vVar, zla zla) {
        this.a = yVar;
        this.b = yVar2;
        this.c = stateRestoreFileDeleter;
        this.d = fireAndForgetResolver;
        this.e = mc1;
        this.f = hz1;
        this.g = jc1;
        this.h = wt9;
        this.i = yt9;
        this.j = wVar;
        this.k = handler;
        this.l = sVar.E();
        this.m = sVar2.j0(h.a).E();
        this.n = aVar.j0(j.a).E();
        this.o = aVar2.j0(f.a).E();
        this.p = qVar;
        this.q = k0Var;
        this.r = gVar;
        this.s = cg3;
        this.v = e0Var;
        this.w = vVar;
        this.x = zla;
    }

    public static void b(t tVar, CoreAutoShutdownHelper$AutoShutdownAction coreAutoShutdownHelper$AutoShutdownAction) {
        if (coreAutoShutdownHelper$AutoShutdownAction == CoreAutoShutdownHelper$AutoShutdownAction.SHUTDOWN_CANCELLED) {
            tVar.k.removeCallbacks(tVar.C);
        } else {
            tVar.k.postDelayed(tVar.C, coreAutoShutdownHelper$AutoShutdownAction == CoreAutoShutdownHelper$AutoShutdownAction.SHUTDOWN_DELAYED ? D : 0);
        }
    }

    public /* synthetic */ void c() {
        this.w.e(this.z);
        this.w.d();
    }

    public /* synthetic */ void d() {
        this.w.g(this.z);
    }

    public synchronized void e(OrbitServiceInterface orbitServiceInterface) {
        if (!this.A) {
            Logger.g("CoreDependentInfraIntegration start", new Object[0]);
            this.A = true;
            this.s.a();
            this.x.b();
            this.h.a();
            this.i.a();
            this.g.b(orbitServiceInterface.getImageLoader());
            this.z = new j0(orbitServiceInterface);
            this.a.b(new g(this));
            this.d.reset();
            this.b.a();
            this.y = this.e.a(orbitServiceInterface.getOrbitSession());
            this.c.b();
            this.f.b(this.y);
            this.v.a();
            if (this.p.a()) {
                this.B.b(s.l(this.l, this.m, this.n, this.o, c.a).E().N(b.a).o0(this.a).subscribe(new k(this)));
            }
            this.t.b(this.r.Q(this.a).subscribe(new u(this.u)));
        }
    }

    public synchronized void f() {
        if (this.A) {
            Logger.g("CoreDependentInfraIntegration stop", new Object[0]);
            this.A = false;
            this.y = new c0();
            this.a.b(new i(this));
            this.f.c();
            this.d.dispose();
            this.g.c();
            this.h.b();
            this.i.b();
            this.B.a();
            this.t.a();
            this.q.c();
            this.x.a();
            this.s.b();
            this.v.b();
            this.j.a();
        }
    }
}
