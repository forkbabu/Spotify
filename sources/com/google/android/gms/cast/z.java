package com.google.android.gms.cast;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.cast.internal.c;
import com.google.android.gms.cast.internal.i;
import com.google.android.gms.cast.internal.k0;
import com.google.android.gms.cast.internal.l;
import com.google.android.gms.cast.internal.m0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.zzen;
import com.google.android.gms.tasks.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class z extends b<e.b> implements p1 {
    private static final com.google.android.gms.cast.internal.b G = new com.google.android.gms.cast.internal.b("CastClient");
    private static final a.AbstractC0094a<k0, e.b> H;
    private static final a<e.b> I;
    public static final /* synthetic */ int J = 0;
    private v A;
    private final CastDevice B;
    private final Map<Long, h<Void>> C;
    final Map<String, e.d> D;
    private final e.c E;
    private final List<q1> F = Collections.synchronizedList(new ArrayList());
    final k0 k = new k0(this);
    private final Handler l;
    private int m;
    private boolean n;
    private boolean o;
    private h<e.a> p;
    private h<Status> q;
    private final AtomicLong r;
    private final Object s = new Object();
    private final Object t = new Object();
    private d u;
    private String v;
    private double w;
    private boolean x;
    private int y;
    private int z;

    static {
        l0 l0Var = new l0();
        H = l0Var;
        I = new a<>("Cast.API_CXLESS", l0Var, l.b);
    }

    z(Context context, e.b bVar) {
        super(context, I, bVar, b.a.c);
        g.k(context, "context cannot be null");
        g.k(bVar, "CastOptions cannot be null");
        this.E = bVar.b;
        this.B = bVar.a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.r = new AtomicLong(0);
        this.m = 1;
        k0();
        this.l = new o0(n());
    }

    static void I(z zVar, long j, int i) {
        h<Void> hVar;
        synchronized (zVar.C) {
            hVar = zVar.C.get(Long.valueOf(j));
            zVar.C.remove(Long.valueOf(j));
        }
        if (hVar == null) {
            return;
        }
        if (i == 0) {
            hVar.c(null);
        } else {
            hVar.b(g0(i));
        }
    }

    static void J(z zVar, e.a aVar) {
        synchronized (zVar.s) {
            h<e.a> hVar = zVar.p;
            if (hVar != null) {
                hVar.c(aVar);
            }
            zVar.p = null;
        }
    }

    static void K(z zVar, c cVar) {
        boolean z2;
        zVar.getClass();
        String I1 = cVar.I1();
        if (!com.google.android.gms.cast.internal.a.d(I1, zVar.v)) {
            zVar.v = I1;
            z2 = true;
        } else {
            z2 = false;
        }
        G.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(zVar.o));
        e.c cVar2 = zVar.E;
        if (cVar2 != null && (z2 || zVar.o)) {
            cVar2.d();
        }
        zVar.o = false;
    }

    static void L(z zVar, m0 m0Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        zVar.getClass();
        d U0 = m0Var.U0();
        if (!com.google.android.gms.cast.internal.a.d(U0, zVar.u)) {
            zVar.u = U0;
            zVar.E.c(U0);
        }
        double o2 = m0Var.o2();
        if (Double.isNaN(o2) || Math.abs(o2 - zVar.w) <= 1.0E-7d) {
            z2 = false;
        } else {
            zVar.w = o2;
            z2 = true;
        }
        boolean p2 = m0Var.p2();
        if (p2 != zVar.x) {
            zVar.x = p2;
            z2 = true;
        }
        com.google.android.gms.cast.internal.b bVar = G;
        bVar.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(zVar.n));
        e.c cVar = zVar.E;
        if (cVar != null && (z2 || zVar.n)) {
            cVar.f();
        }
        Double.isNaN(m0Var.r2());
        int I1 = m0Var.I1();
        if (I1 != zVar.y) {
            zVar.y = I1;
            z3 = true;
        } else {
            z3 = false;
        }
        bVar.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(zVar.n));
        e.c cVar2 = zVar.E;
        if (cVar2 != null && (z3 || zVar.n)) {
            cVar2.a(zVar.y);
        }
        int Q1 = m0Var.Q1();
        if (Q1 != zVar.z) {
            zVar.z = Q1;
            z4 = true;
        } else {
            z4 = false;
        }
        bVar.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(zVar.n));
        e.c cVar3 = zVar.E;
        if (cVar3 != null && (z4 || zVar.n)) {
            cVar3.e(zVar.z);
        }
        if (!com.google.android.gms.cast.internal.a.d(zVar.A, m0Var.q2())) {
            zVar.A = m0Var.q2();
        }
        zVar.n = false;
    }

    private final void O(h<e.a> hVar) {
        synchronized (this.s) {
            if (this.p != null) {
                e0(2002);
            }
            this.p = hVar;
        }
    }

    static void Z(z zVar, int i) {
        synchronized (zVar.t) {
            h<Status> hVar = zVar.q;
            if (hVar != null) {
                if (i == 0) {
                    hVar.c(new Status(i, (String) null));
                } else {
                    hVar.b(g0(i));
                }
                zVar.q = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void e0(int i) {
        synchronized (this.s) {
            h<e.a> hVar = this.p;
            if (hVar != null) {
                hVar.b(g0(i));
            }
            this.p = null;
        }
    }

    private static ApiException g0(int i) {
        return f.c(new Status(i, (String) null));
    }

    static void i0(z zVar) {
        zVar.y = -1;
        zVar.z = -1;
        zVar.u = null;
        zVar.v = null;
        zVar.w = 0.0d;
        zVar.k0();
        zVar.x = false;
        zVar.A = null;
    }

    /* access modifiers changed from: private */
    public final void j0() {
        G.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.D) {
            this.D.clear();
        }
    }

    private final double k0() {
        if (this.B.r2(2048)) {
            return 0.02d;
        }
        if (!this.B.r2(4) || this.B.r2(1) || "Chromecast Audio".equals(this.B.q2())) {
            return 0.05d;
        }
        return 0.02d;
    }

    private final void u() {
        g.p(this.m == 2, "Not connected to device");
    }

    /* access modifiers changed from: private */
    public final com.google.android.gms.tasks.g<Boolean> y(i iVar) {
        k.a<?> b = o(iVar, "castDeviceControllerListenerKey").b();
        g.k(b, "Key must not be null");
        return i(b);
    }

    public final com.google.android.gms.tasks.g<Status> A(String str) {
        s.a a = s.a();
        a.b(new i0(this, str));
        return k(a.a());
    }

    public final com.google.android.gms.tasks.g<Void> B(String str, e.d dVar) {
        com.google.android.gms.cast.internal.a.c(str);
        if (dVar != null) {
            synchronized (this.D) {
                this.D.put(str, dVar);
            }
        }
        s.a a = s.a();
        a.b(new e0(this, str, dVar));
        return k(a.a());
    }

    public final com.google.android.gms.tasks.g<e.a> C(String str, h hVar) {
        s.a a = s.a();
        a.b(new g0(this, str, hVar));
        return k(a.a());
    }

    public final com.google.android.gms.tasks.g<Void> D(String str, String str2) {
        com.google.android.gms.cast.internal.a.c(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() <= 524288) {
            s.a a = s.a();
            a.b(new h0(this, str, str2));
            return k(a.a());
        } else {
            G.f("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
    }

    public final com.google.android.gms.tasks.g<Void> E(boolean z2) {
        s.a a = s.a();
        a.b(new c0(this, z2));
        return k(a.a());
    }

    /* access modifiers changed from: package-private */
    public final void G(e.d dVar, String str, k0 k0Var, h hVar) {
        boolean z2 = true;
        if (this.m == 1) {
            z2 = false;
        }
        g.p(z2, "Not active connection");
        if (dVar != null) {
            ((com.google.android.gms.cast.internal.g) k0Var.z()).x2(str);
        }
        hVar.c(null);
    }

    public final void M(q1 q1Var) {
        if (q1Var != null) {
            this.F.add(q1Var);
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void N(zzen zzen, String str, String str2, k0 k0Var, h hVar) {
        long incrementAndGet = this.r.incrementAndGet();
        u();
        try {
            this.C.put(Long.valueOf(incrementAndGet), hVar);
            ((com.google.android.gms.cast.internal.g) k0Var.z()).Y1(str, str2, incrementAndGet);
        } catch (RemoteException e) {
            this.C.remove(Long.valueOf(incrementAndGet));
            hVar.b(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void P(String str, e.d dVar, k0 k0Var, h hVar) {
        boolean z2 = true;
        if (this.m == 1) {
            z2 = false;
        }
        g.p(z2, "Not active connection");
        ((com.google.android.gms.cast.internal.g) k0Var.z()).x2(str);
        if (dVar != null) {
            ((com.google.android.gms.cast.internal.g) k0Var.z()).o1(str);
        }
        hVar.c(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Q(String str, h hVar, k0 k0Var, h hVar2) {
        u();
        ((com.google.android.gms.cast.internal.g) k0Var.z()).x3(str, hVar);
        O(hVar2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void R(String str, k0 k0Var, h hVar) {
        u();
        ((com.google.android.gms.cast.internal.g) k0Var.z()).R(str);
        synchronized (this.t) {
            if (this.q != null) {
                hVar.b(g0(2001));
            } else {
                this.q = hVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void S(String str, String str2, t0 t0Var, k0 k0Var, h hVar) {
        u();
        ((com.google.android.gms.cast.internal.g) k0Var.z()).W1(str, str2, null);
        O(hVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void T(boolean z2, k0 k0Var, h hVar) {
        ((com.google.android.gms.cast.internal.g) k0Var.z()).o0(z2, this.w, this.x);
        hVar.c(null);
    }

    public final com.google.android.gms.tasks.g<Void> W() {
        k o2 = o(this.k, "castDeviceControllerListenerKey");
        p.a a = p.a();
        b0 b0Var = new b0(this);
        q qVar = a0.a;
        a.e(o2);
        a.b(b0Var);
        a.d(qVar);
        a.c(x.b);
        return h(a.a());
    }

    public final com.google.android.gms.tasks.g<Void> X(String str) {
        e.d remove;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.D) {
                remove = this.D.remove(str);
            }
            s.a a = s.a();
            a.b(new d0(this, remove, str));
            return k(a.a());
        }
        throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }

    public final com.google.android.gms.tasks.g<e.a> Y(String str, String str2) {
        s.a a = s.a();
        a.b(new j0(this, str, str2));
        return k(a.a());
    }

    public final com.google.android.gms.tasks.g<Void> d0() {
        s.a a = s.a();
        a.b(f0.a);
        com.google.android.gms.tasks.g<Void> k2 = k(a.a());
        j0();
        y(this.k);
        return k2;
    }

    public final boolean v() {
        u();
        return this.x;
    }
}
