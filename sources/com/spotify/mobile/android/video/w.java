package com.spotify.mobile.android.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.v0;
import com.google.android.video.exo.b;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.exo.e;
import com.spotify.mobile.android.video.exo.h;
import com.spotify.mobile.android.video.exo.i;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import defpackage.cq;
import java.lang.ref.WeakReference;
import java.util.List;
import okhttp3.y;

/* access modifiers changed from: package-private */
public class w {
    private u0 a;
    private cq b;
    private u c;
    private o d;
    private BetamaxOfflineManager e;
    private f.a f;
    private h g;
    private WeakReference<p0> h;

    w() {
    }

    private void o(int i, boolean z) {
        cq.e j = this.b.j();
        for (int i2 = 0; i2 < this.a.P(); i2++) {
            if (this.a.Q(i2) == i) {
                j.g(i2, z);
            }
        }
        this.b.r(j.b());
    }

    public long a(long j) {
        if (!f()) {
            return j;
        }
        v0 l = this.a.l();
        if (l.n()) {
            return j;
        }
        v0.b bVar = new v0.b();
        l.d(this.a.L(), bVar);
        return j - bVar.i();
    }

    public long b() {
        return a(this.a.f());
    }

    public v0.c c() {
        if (this.a.l().n()) {
            return null;
        }
        return this.a.l().k(this.a.i(), new v0.c());
    }

    public boolean d() {
        return this.a.R() != 0;
    }

    public u0 e(Context context, e eVar, s0 s0Var, i iVar, cq cqVar, y yVar, u uVar, List<c72> list, BetamaxOfflineManager betamaxOfflineManager, f.a aVar, e72 e72) {
        this.b = cqVar;
        this.c = uVar;
        o a2 = new o.b(context).a();
        this.d = a2;
        this.e = betamaxOfflineManager;
        this.f = aVar;
        eVar.getClass();
        v.a aVar2 = new v.a();
        aVar2.b(50000, 50000, 2500, CrashReportManager.TIME_WINDOW);
        v a3 = aVar2.a();
        u0.b bVar = new u0.b(context, s0Var);
        bVar.b(a2);
        bVar.d(cqVar);
        bVar.c(a3);
        this.a = bVar.a();
        Handler handler = new Handler(Looper.getMainLooper());
        this.g = iVar.b(yVar, e72, list);
        this.d.f(handler, aVar);
        return this.a;
    }

    public boolean f() {
        return this.a.c();
    }

    public void g() {
        this.a.j(false);
    }

    public t h(d0 d0Var, a0 a0Var) {
        boolean z;
        if (a0Var.b().isPresent()) {
            this.a.seekTo(a0Var.b().get().longValue());
            z = false;
        } else {
            z = true;
        }
        t a2 = this.g.a(d0Var, this.d, this.e, this.c);
        this.a.j(a0Var.c());
        this.a.T(a2, z, true);
        return a2;
    }

    public void i() {
        WeakReference<p0> weakReference = this.h;
        if (weakReference != null) {
            p0 p0Var = weakReference.get();
            if (p0Var instanceof b) {
                ((b) p0Var).Z0();
            }
            this.h.clear();
            this.h = null;
        }
        u0 u0Var = this.a;
        if (u0Var != null) {
            u0Var.d();
        }
        this.d.c(this.f);
        this.a = null;
        this.d = null;
    }

    public void j() {
        this.a.j(true);
    }

    public void k(long j) {
        u0 u0Var = this.a;
        u0Var.m(u0Var.i(), j);
    }

    public void l(boolean z) {
        o(1, z);
    }

    public void m(float f2) {
        this.a.W(new k0(f2, 1.0f, false));
    }

    public void n(Optional<i0> optional) {
        cq cqVar = this.b;
        cq.e j = cqVar.j();
        j.f(optional.transform(b.a).or((Optional<V>) ""));
        cqVar.r(j.b());
    }

    public void p(boolean z) {
        this.a.X(z ? 2 : 0);
    }

    public void q(boolean z) {
        o(3, z);
    }

    public void r(Surface surface) {
        p0 p0Var;
        WeakReference<p0> weakReference = this.h;
        if (weakReference != null && (p0Var = weakReference.get()) != null) {
            try {
                n0 b2 = this.a.b(p0Var);
                b2.q(1);
                b2.o(surface);
                b2.m();
                b2.a();
            } catch (InterruptedException e2) {
                Logger.o(e2, "Failed to set surface", new Object[0]);
            }
        }
    }

    public void s(boolean z) {
        o(2, z);
    }

    public void t(p0 p0Var) {
        this.h = new WeakReference<>(p0Var);
    }
}
