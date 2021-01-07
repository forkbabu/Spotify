package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.i;
import com.google.android.exoplayer2.util.p;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.w;
import defpackage.jq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class b0 implements Handler.Callback, s.a, jq.a, t.b, w.a, n0.a {
    private final i0 A = new i0();
    private t0 B;
    private j0 C;
    private t D;
    private p0[] E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;
    private int M;
    private e N;
    private long O;
    private int P;
    private boolean Q;
    private final p0[] a;
    private final q0[] b;
    private final jq c;
    private final kq f;
    private final f0 n;
    private final f o;
    private final p p;
    private final HandlerThread q;
    private final Handler r;
    private final v0.c s;
    private final v0.b t;
    private final long u;
    private final boolean v;
    private final w w;
    private final d x;
    private final ArrayList<c> y;
    private final i z;

    /* access modifiers changed from: private */
    public static final class b {
        public final t a;
        public final v0 b;

        public b(t tVar, v0 v0Var) {
            this.a = tVar;
            this.b = v0Var;
        }
    }

    /* access modifiers changed from: private */
    public static final class c implements Comparable<c> {
        public final n0 a;
        public int b;
        public long c;
        public Object f;

        public c(n0 n0Var) {
            this.a = n0Var;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            c cVar2 = cVar;
            Object obj = this.f;
            if ((obj == null) != (cVar2.f == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.b - cVar2.b;
            return i != 0 ? i : f0.f(this.c, cVar2.c);
        }
    }

    /* access modifiers changed from: private */
    public static final class d {
        private j0 a;
        private int b;
        private boolean c;
        private int d;

        d(a aVar) {
        }

        public boolean d(j0 j0Var) {
            return j0Var != this.a || this.b > 0 || this.c;
        }

        public void e(int i) {
            this.b += i;
        }

        public void f(j0 j0Var) {
            this.a = j0Var;
            this.b = 0;
            this.c = false;
        }

        public void g(int i) {
            boolean z = true;
            if (!this.c || this.d == 4) {
                this.c = true;
                this.d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            g.a(z);
        }
    }

    /* access modifiers changed from: private */
    public static final class e {
        public final v0 a;
        public final int b;
        public final long c;

        public e(v0 v0Var, int i, long j) {
            this.a = v0Var;
            this.b = i;
            this.c = j;
        }
    }

    public b0(p0[] p0VarArr, jq jqVar, kq kqVar, f0 f0Var, f fVar, boolean z2, int i, boolean z3, Handler handler, i iVar) {
        this.a = p0VarArr;
        this.c = jqVar;
        this.f = kqVar;
        this.n = f0Var;
        this.o = fVar;
        this.G = z2;
        this.J = i;
        this.K = z3;
        this.r = handler;
        this.z = iVar;
        v vVar = (v) f0Var;
        this.u = vVar.d();
        this.v = vVar.j();
        this.B = t0.d;
        this.C = j0.d(-9223372036854775807L, kqVar);
        this.x = new d(null);
        this.b = new q0[p0VarArr.length];
        for (int i2 = 0; i2 < p0VarArr.length; i2++) {
            p0VarArr[i2].q(i2);
            this.b[i2] = p0VarArr[i2].getCapabilities();
        }
        this.w = new w(this, iVar);
        this.y = new ArrayList<>();
        this.E = new p0[0];
        this.s = new v0.c();
        this.t = new v0.b();
        jqVar.b(this, fVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.q = handlerThread;
        handlerThread.start();
        this.p = iVar.c(handlerThread.getLooper(), this);
        this.Q = true;
    }

    private void C(t tVar, boolean z2, boolean z3) {
        this.M++;
        G(false, true, z2, z3, true);
        ((v) this.n).e();
        this.D = tVar;
        e0(2);
        tVar.e(this, this.o.b());
        this.p.e(2);
    }

    private void E() {
        G(true, true, true, true, false);
        ((v) this.n).f();
        e0(1);
        this.q.quit();
        synchronized (this) {
            this.F = true;
            notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0050 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F() {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b0.F():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G(boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b0.G(boolean, boolean, boolean, boolean, boolean):void");
    }

    private void H(long j) {
        g0 k = this.A.k();
        if (k != null) {
            j = k.u(j);
        }
        this.O = j;
        this.w.c(j);
        for (p0 p0Var : this.E) {
            p0Var.u(this.O);
        }
        for (g0 k2 = this.A.k(); k2 != null; k2 = k2.g()) {
            gq[] b2 = k2.k().c.b();
            for (gq gqVar : b2) {
                if (gqVar != null) {
                    gqVar.h();
                }
            }
        }
    }

    private boolean I(c cVar) {
        Object obj = cVar.f;
        if (obj == null) {
            v0 h = cVar.a.h();
            int j = cVar.a.j();
            long a2 = u.a(cVar.a.f());
            v0 v0Var = this.C.a;
            Pair<Object, Long> pair = null;
            if (!v0Var.n()) {
                if (h.n()) {
                    h = v0Var;
                }
                try {
                    Pair<Object, Long> h2 = h.h(this.s, this.t, j, a2);
                    if (v0Var == h || v0Var.b(h2.first) != -1) {
                        pair = h2;
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (pair == null) {
                return false;
            }
            int b2 = this.C.a.b(pair.first);
            long longValue = ((Long) pair.second).longValue();
            Object obj2 = pair.first;
            cVar.b = b2;
            cVar.c = longValue;
            cVar.f = obj2;
            return true;
        }
        int b3 = this.C.a.b(obj);
        if (b3 == -1) {
            return false;
        }
        cVar.b = b3;
        return true;
    }

    private Pair<Object, Long> J(e eVar, boolean z2) {
        Object K2;
        v0 v0Var = this.C.a;
        v0 v0Var2 = eVar.a;
        if (v0Var.n()) {
            return null;
        }
        if (v0Var2.n()) {
            v0Var2 = v0Var;
        }
        try {
            Pair<Object, Long> h = v0Var2.h(this.s, this.t, eVar.b, eVar.c);
            if (v0Var == v0Var2 || v0Var.b(h.first) != -1) {
                return h;
            }
            if (z2 && (K2 = K(h.first, v0Var2, v0Var)) != null) {
                return k(v0Var, v0Var.e(v0Var.b(K2), this.t, true).b, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private Object K(Object obj, v0 v0Var, v0 v0Var2) {
        int b2 = v0Var.b(obj);
        int g = v0Var.g();
        int i = b2;
        int i2 = -1;
        for (int i3 = 0; i3 < g && i2 == -1; i3++) {
            i = v0Var.c(i, this.t, this.s, this.J, this.K);
            if (i == -1) {
                break;
            }
            i2 = v0Var2.b(v0Var.j(i));
        }
        if (i2 == -1) {
            return null;
        }
        return v0Var2.j(i2);
    }

    private void L(long j, long j2) {
        this.p.g(2);
        this.p.f(2, j + j2);
    }

    private void N(boolean z2) {
        t.a aVar = this.A.k().f.a;
        long Q2 = Q(aVar, this.C.m, true);
        if (Q2 != this.C.m) {
            this.C = c(aVar, Q2, this.C.d);
            if (z2) {
                this.x.g(4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void O(com.google.android.exoplayer2.b0.e r17) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b0.O(com.google.android.exoplayer2.b0$e):void");
    }

    private long P(t.a aVar, long j) {
        return Q(aVar, j, this.A.k() != this.A.l());
    }

    private long Q(t.a aVar, long j, boolean z2) {
        i0();
        this.H = false;
        j0 j0Var = this.C;
        if (j0Var.e != 1 && !j0Var.a.n()) {
            e0(2);
        }
        g0 k = this.A.k();
        g0 g0Var = k;
        while (true) {
            if (g0Var == null) {
                break;
            }
            if (aVar.equals(g0Var.f.a) && g0Var.d) {
                this.A.q(g0Var);
                break;
            }
            g0Var = this.A.a();
        }
        if (z2 || k != g0Var || (g0Var != null && g0Var.u(j) < 0)) {
            for (p0 p0Var : this.E) {
                e(p0Var);
            }
            this.E = new p0[0];
            k = null;
            if (g0Var != null) {
                g0Var.s(0);
            }
        }
        if (g0Var != null) {
            l0(k);
            if (g0Var.e) {
                long k2 = g0Var.a.k(j);
                g0Var.a.u(k2 - this.u, this.v);
                j = k2;
            }
            H(j);
            y();
        } else {
            this.A.c(true);
            this.C = this.C.c(com.google.android.exoplayer2.source.f0.f, this.f);
            H(j);
        }
        p(false);
        this.p.e(2);
        return j;
    }

    private void S(n0 n0Var) {
        if (n0Var.f() == -9223372036854775807L) {
            T(n0Var);
        } else if (this.D == null || this.M > 0) {
            this.y.add(new c(n0Var));
        } else {
            c cVar = new c(n0Var);
            if (I(cVar)) {
                this.y.add(cVar);
                Collections.sort(this.y);
                return;
            }
            n0Var.l(false);
        }
    }

    private void T(n0 n0Var) {
        if (n0Var.d().getLooper() == this.p.c()) {
            d(n0Var);
            int i = this.C.e;
            if (i == 3 || i == 2) {
                this.p.e(2);
                return;
            }
            return;
        }
        this.p.b(16, n0Var).sendToTarget();
    }

    private void U(n0 n0Var) {
        Handler d2 = n0Var.d();
        if (!d2.getLooper().getThread().isAlive()) {
            n0Var.l(false);
        } else {
            d2.post(new o(this, n0Var));
        }
    }

    private void V() {
        p0[] p0VarArr = this.a;
        for (p0 p0Var : p0VarArr) {
            if (p0Var.g() != null) {
                p0Var.k();
            }
        }
    }

    private void W(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.L != z2) {
            this.L = z2;
            if (!z2) {
                p0[] p0VarArr = this.a;
                for (p0 p0Var : p0VarArr) {
                    if (p0Var.getState() == 0) {
                        p0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void Y(boolean z2) {
        this.H = false;
        this.G = z2;
        if (!z2) {
            i0();
            k0();
            return;
        }
        int i = this.C.e;
        if (i == 3) {
            f0();
            this.p.e(2);
        } else if (i == 2) {
            this.p.e(2);
        }
    }

    private void a0(k0 k0Var) {
        this.w.v(k0Var);
        this.p.a(17, 1, 0, this.w.p()).sendToTarget();
    }

    private j0 c(t.a aVar, long j, long j2) {
        this.Q = true;
        return this.C.a(aVar, j, j2, m());
    }

    private void c0(int i) {
        this.J = i;
        if (!this.A.x(i)) {
            N(true);
        }
        p(false);
    }

    private void d(n0 n0Var) {
        if (!n0Var.k()) {
            try {
                n0Var.g().l(n0Var.i(), n0Var.e());
            } finally {
                n0Var.l(true);
            }
        }
    }

    private void d0(boolean z2) {
        this.K = z2;
        if (!this.A.y(z2)) {
            N(true);
        }
        p(false);
    }

    private void e(p0 p0Var) {
        this.w.a(p0Var);
        if (p0Var.getState() == 2) {
            p0Var.stop();
        }
        p0Var.a();
    }

    private void e0(int i) {
        j0 j0Var = this.C;
        if (j0Var.e != i) {
            this.C = new j0(j0Var.a, j0Var.b, j0Var.c, j0Var.d, i, j0Var.f, j0Var.g, j0Var.h, j0Var.i, j0Var.j, j0Var.k, j0Var.l, j0Var.m);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02de, code lost:
        if (((com.google.android.exoplayer2.v) r21.n).l(m(), r21.w.p().a, r21.H) != false) goto L_0x02e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        // Method dump skipped, instructions count: 856
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b0.f():void");
    }

    private void f0() {
        this.H = false;
        this.w.d();
        for (p0 p0Var : this.E) {
            p0Var.start();
        }
    }

    private void g(boolean[] zArr, int i) {
        this.E = new p0[i];
        kq k = this.A.k().k();
        for (int i2 = 0; i2 < this.a.length; i2++) {
            if (!k.b(i2)) {
                this.a[i2].reset();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a.length; i4++) {
            if (k.b(i4)) {
                boolean z2 = zArr[i4];
                int i5 = i3 + 1;
                g0 k2 = this.A.k();
                p0 p0Var = this.a[i4];
                this.E[i3] = p0Var;
                if (p0Var.getState() == 0) {
                    kq k3 = k2.k();
                    r0 r0Var = k3.b[i4];
                    d0[] h = h(k3.c.a(i4));
                    boolean z3 = this.G && this.C.e == 3;
                    p0Var.j(r0Var, h, k2.c[i4], this.O, !z2 && z3, k2.h());
                    this.w.b(p0Var);
                    if (z3) {
                        p0Var.start();
                    }
                }
                i3 = i5;
            }
        }
    }

    private static d0[] h(gq gqVar) {
        int length = gqVar != null ? gqVar.length() : 0;
        d0[] d0VarArr = new d0[length];
        for (int i = 0; i < length; i++) {
            d0VarArr[i] = gqVar.d(i);
        }
        return d0VarArr;
    }

    private void h0(boolean z2, boolean z3, boolean z4) {
        G(z2 || !this.L, true, z3, z3, z3);
        this.x.e(this.M + (z4 ? 1 : 0));
        this.M = 0;
        ((v) this.n).g();
        e0(1);
    }

    private void i0() {
        this.w.e();
        p0[] p0VarArr = this.E;
        for (p0 p0Var : p0VarArr) {
            if (p0Var.getState() == 2) {
                p0Var.stop();
            }
        }
    }

    private void j0() {
        g0 f2 = this.A.f();
        boolean z2 = this.I || (f2 != null && f2.a.isLoading());
        j0 j0Var = this.C;
        if (z2 != j0Var.g) {
            this.C = new j0(j0Var.a, j0Var.b, j0Var.c, j0Var.d, j0Var.e, j0Var.f, z2, j0Var.h, j0Var.i, j0Var.j, j0Var.k, j0Var.l, j0Var.m);
        }
    }

    private Pair<Object, Long> k(v0 v0Var, int i, long j) {
        return v0Var.h(this.s, this.t, i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00c9 A[EDGE_INSN: B:88:0x00c9->B:40:0x00c9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00de A[EDGE_INSN: B:94:0x00de->B:43:0x00de ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k0() {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b0.k0():void");
    }

    private void l0(g0 g0Var) {
        g0 k = this.A.k();
        if (k != null && g0Var != k) {
            boolean[] zArr = new boolean[this.a.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                p0[] p0VarArr = this.a;
                if (i < p0VarArr.length) {
                    p0 p0Var = p0VarArr[i];
                    zArr[i] = p0Var.getState() != 0;
                    if (k.k().b(i)) {
                        i2++;
                    }
                    if (zArr[i] && (!k.k().b(i) || (p0Var.o() && p0Var.g() == g0Var.c[i]))) {
                        e(p0Var);
                    }
                    i++;
                } else {
                    this.C = this.C.c(k.j(), k.k());
                    g(zArr, i2);
                    return;
                }
            }
        }
    }

    private long m() {
        return n(this.C.k);
    }

    private long n(long j) {
        g0 f2 = this.A.f();
        if (f2 == null) {
            return 0;
        }
        return Math.max(0L, j - f2.t(this.O));
    }

    private void o(s sVar) {
        if (this.A.o(sVar)) {
            this.A.p(this.O);
            y();
        }
    }

    private void p(boolean z2) {
        g0 g0Var;
        boolean z3;
        long j;
        b0 b0Var = this;
        g0 f2 = b0Var.A.f();
        t.a aVar = f2 == null ? b0Var.C.b : f2.f.a;
        boolean z4 = !b0Var.C.j.equals(aVar);
        if (z4) {
            j0 j0Var = b0Var.C;
            z3 = z4;
            g0Var = f2;
            b0Var = this;
            b0Var.C = new j0(j0Var.a, j0Var.b, j0Var.c, j0Var.d, j0Var.e, j0Var.f, j0Var.g, j0Var.h, j0Var.i, aVar, j0Var.k, j0Var.l, j0Var.m);
        } else {
            g0Var = f2;
            z3 = z4;
        }
        j0 j0Var2 = b0Var.C;
        if (g0Var == null) {
            j = j0Var2.m;
        } else {
            j = g0Var.f();
        }
        j0Var2.k = j;
        b0Var.C.l = m();
        if ((z3 || z2) && g0Var != null && g0Var.d) {
            ((v) b0Var.n).h(b0Var.a, g0Var.j(), g0Var.k().c);
        }
    }

    private void q(s sVar) {
        if (this.A.o(sVar)) {
            g0 f2 = this.A.f();
            f2.l(this.w.p().a, this.C.a);
            com.google.android.exoplayer2.source.f0 j = f2.j();
            kq k = f2.k();
            ((v) this.n).h(this.a, j, k.c);
            if (f2 == this.A.k()) {
                H(f2.f.b);
                l0(null);
            }
            y();
        }
    }

    private void r(k0 k0Var, boolean z2) {
        this.r.obtainMessage(1, z2 ? 1 : 0, 0, k0Var).sendToTarget();
        float f2 = k0Var.a;
        for (g0 k = this.A.k(); k != null; k = k.g()) {
            gq[] b2 = k.k().c.b();
            for (gq gqVar : b2) {
                if (gqVar != null) {
                    gqVar.f(f2);
                }
            }
        }
        p0[] p0VarArr = this.a;
        for (p0 p0Var : p0VarArr) {
            if (p0Var != null) {
                p0Var.m(k0Var.a);
            }
        }
    }

    private void s() {
        if (this.C.e != 1) {
            e0(4);
        }
        G(false, false, true, false, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b8 A[LOOP:2: B:68:0x01b8->B:87:0x01b8, LOOP_START, PHI: r0 
      PHI: (r0v10 com.google.android.exoplayer2.g0) = (r0v6 com.google.android.exoplayer2.g0), (r0v11 com.google.android.exoplayer2.g0) binds: [B:67:0x01b6, B:87:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(com.google.android.exoplayer2.b0.b r28) {
        /*
        // Method dump skipped, instructions count: 496
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b0.t(com.google.android.exoplayer2.b0$b):void");
    }

    private boolean u() {
        g0 l = this.A.l();
        if (!l.d) {
            return false;
        }
        int i = 0;
        while (true) {
            p0[] p0VarArr = this.a;
            if (i >= p0VarArr.length) {
                return true;
            }
            p0 p0Var = p0VarArr[i];
            com.google.android.exoplayer2.source.b0 b0Var = l.c[i];
            if (p0Var.g() != b0Var || (b0Var != null && !p0Var.i())) {
                break;
            }
            i++;
        }
        return false;
    }

    private boolean v() {
        g0 f2 = this.A.f();
        if (f2 == null) {
            return false;
        }
        if ((!f2.d ? 0 : f2.a.a()) == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private boolean w() {
        g0 k = this.A.k();
        long j = k.f.e;
        return k.d && (j == -9223372036854775807L || this.C.m < j);
    }

    private void y() {
        boolean z2;
        if (!v()) {
            z2 = false;
        } else {
            g0 f2 = this.A.f();
            z2 = ((v) this.n).k(n(!f2.d ? 0 : f2.a.a()), this.w.p().a);
        }
        this.I = z2;
        if (z2) {
            this.A.f().c(this.O);
        }
        j0();
    }

    private void z() {
        if (this.x.d(this.C)) {
            this.r.obtainMessage(0, this.x.b, this.x.c ? this.x.d : -1, this.C).sendToTarget();
            this.x.f(this.C);
        }
    }

    public void A(k0 k0Var) {
        this.p.a(17, 0, 0, k0Var).sendToTarget();
    }

    public void B(t tVar, boolean z2, boolean z3) {
        this.p.a(0, z2 ? 1 : 0, z3 ? 1 : 0, tVar).sendToTarget();
    }

    public synchronized void D() {
        if (!this.F) {
            if (this.q.isAlive()) {
                this.p.e(7);
                boolean z2 = false;
                while (!this.F) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void M(v0 v0Var, int i, long j) {
        this.p.b(3, new e(v0Var, i, j)).sendToTarget();
    }

    public synchronized void R(n0 n0Var) {
        if (!this.F) {
            if (this.q.isAlive()) {
                this.p.b(15, n0Var).sendToTarget();
                return;
            }
        }
        n0Var.l(false);
    }

    public void X(boolean z2) {
        this.p.d(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public void Z(k0 k0Var) {
        this.p.b(4, k0Var).sendToTarget();
    }

    @Override // defpackage.jq.a
    public void a() {
        this.p.e(11);
    }

    @Override // com.google.android.exoplayer2.source.t.b
    public void b(t tVar, v0 v0Var) {
        this.p.b(8, new b(tVar, v0Var)).sendToTarget();
    }

    public void b0(int i) {
        this.p.d(12, i, 0).sendToTarget();
    }

    public void g0(boolean z2) {
        this.p.d(6, z2 ? 1 : 0, 0).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        ExoPlaybackException exoPlaybackException;
        try {
            switch (message.what) {
                case 0:
                    C((t) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    Y(message.arg1 != 0);
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    O((e) message.obj);
                    break;
                case 4:
                    a0((k0) message.obj);
                    break;
                case 5:
                    this.B = (t0) message.obj;
                    break;
                case 6:
                    h0(false, message.arg1 != 0, true);
                    break;
                case 7:
                    E();
                    return true;
                case 8:
                    t((b) message.obj);
                    break;
                case 9:
                    q((s) message.obj);
                    break;
                case 10:
                    o((s) message.obj);
                    break;
                case 11:
                    F();
                    break;
                case 12:
                    c0(message.arg1);
                    break;
                case 13:
                    d0(message.arg1 != 0);
                    break;
                case 14:
                    W(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 15:
                    S((n0) message.obj);
                    break;
                case 16:
                    U((n0) message.obj);
                    break;
                case 17:
                    r((k0) message.obj, message.arg1 != 0);
                    break;
                default:
                    return false;
            }
            z();
        } catch (ExoPlaybackException e2) {
            if (e2.type != 1) {
                str = "Playback error.";
            } else {
                StringBuilder V0 = je.V0("Renderer error: index=");
                V0.append(e2.rendererIndex);
                V0.append(", type=");
                int c2 = this.a[e2.rendererIndex].c();
                int i = f0.a;
                switch (c2) {
                    case 0:
                        str2 = "default";
                        break;
                    case 1:
                        str2 = "audio";
                        break;
                    case 2:
                        str2 = "video";
                        break;
                    case 3:
                        str2 = "text";
                        break;
                    case 4:
                        str2 = "metadata";
                        break;
                    case 5:
                        str2 = "camera motion";
                        break;
                    case 6:
                        str2 = "none";
                        break;
                    default:
                        if (c2 < 10000) {
                            str2 = "?";
                            break;
                        } else {
                            str2 = je.q0("custom (", c2, ")");
                            break;
                        }
                }
                V0.append(str2);
                V0.append(", format=");
                V0.append(e2.rendererFormat);
                V0.append(", rendererSupport=");
                int i2 = e2.rendererFormatSupport;
                if (i2 == 0) {
                    str3 = "NO";
                } else if (i2 == 1) {
                    str3 = "NO_UNSUPPORTED_TYPE";
                } else if (i2 == 2) {
                    str3 = "NO_UNSUPPORTED_DRM";
                } else if (i2 == 3) {
                    str3 = "NO_EXCEEDS_CAPABILITIES";
                } else if (i2 == 4) {
                    str3 = "YES";
                } else {
                    throw new IllegalStateException();
                }
                V0.append(str3);
                str = V0.toString();
            }
            Log.e("ExoPlayerImplInternal", str, e2);
            h0(true, false, false);
            this.C = this.C.b(e2);
            z();
        } catch (IOException e3) {
            Log.e("ExoPlayerImplInternal", "Source error.", e3);
            h0(false, false, false);
            this.C = this.C.b(ExoPlaybackException.c(e3));
            z();
        } catch (OutOfMemoryError | RuntimeException e4) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e4);
            if (e4 instanceof OutOfMemoryError) {
                exoPlaybackException = ExoPlaybackException.a((OutOfMemoryError) e4);
            } else {
                exoPlaybackException = ExoPlaybackException.d((RuntimeException) e4);
            }
            h0(true, false, false);
            this.C = this.C.b(exoPlaybackException);
            z();
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.source.c0] */
    @Override // com.google.android.exoplayer2.source.c0.a
    public void i(s sVar) {
        this.p.b(10, sVar).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.s.a
    public void j(s sVar) {
        this.p.b(9, sVar).sendToTarget();
    }

    public Looper l() {
        return this.q.getLooper();
    }

    public void x(n0 n0Var) {
        try {
            d(n0Var);
        } catch (ExoPlaybackException e2) {
            Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }
}
