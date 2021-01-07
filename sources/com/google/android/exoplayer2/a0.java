package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.s;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.i;
import com.google.android.exoplayer2.v0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
public final class a0 extends s implements y {
    final kq b;
    private final p0[] c;
    private final jq d;
    private final Handler e;
    private final b0 f;
    private final Handler g;
    private final CopyOnWriteArrayList<s.a> h;
    private final v0.b i;
    private final ArrayDeque<Runnable> j;
    private t k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private k0 s;
    private j0 t;
    private int u;
    private int v;
    private long w;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a0.this.E(message);
        }
    }

    /* access modifiers changed from: private */
    public static final class b implements Runnable {
        private final j0 a;
        private final CopyOnWriteArrayList<s.a> b;
        private final jq c;
        private final boolean f;
        private final int n;
        private final int o;
        private final boolean p;
        private final boolean q;
        private final boolean r;
        private final boolean s;
        private final boolean t;
        private final boolean u;
        private final boolean v;
        private final boolean w;

        public b(j0 j0Var, j0 j0Var2, CopyOnWriteArrayList<s.a> copyOnWriteArrayList, jq jqVar, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.a = j0Var;
            this.b = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.c = jqVar;
            this.f = z;
            this.n = i;
            this.o = i2;
            this.p = z2;
            this.v = z3;
            this.w = z4;
            boolean z5 = true;
            this.q = j0Var2.e != j0Var.e;
            ExoPlaybackException exoPlaybackException = j0Var2.f;
            ExoPlaybackException exoPlaybackException2 = j0Var.f;
            this.r = (exoPlaybackException == exoPlaybackException2 || exoPlaybackException2 == null) ? false : true;
            this.s = j0Var2.a != j0Var.a;
            this.t = j0Var2.g != j0Var.g;
            this.u = j0Var2.i == j0Var.i ? false : z5;
        }

        public /* synthetic */ void a(m0.a aVar) {
            aVar.n(this.a.a, this.o);
        }

        public /* synthetic */ void b(m0.a aVar) {
            aVar.M(this.n);
        }

        public /* synthetic */ void c(m0.a aVar) {
            aVar.O(this.a.f);
        }

        public /* synthetic */ void d(m0.a aVar) {
            j0 j0Var = this.a;
            aVar.G(j0Var.h, j0Var.i.c);
        }

        public /* synthetic */ void e(m0.a aVar) {
            aVar.k(this.a.g);
        }

        public /* synthetic */ void f(m0.a aVar) {
            aVar.R(this.v, this.a.e);
        }

        public /* synthetic */ void g(m0.a aVar) {
            aVar.b0(this.a.e == 3);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.s || this.o == 0) {
                a0.F(this.b, new f(this));
            }
            if (this.f) {
                a0.F(this.b, new h(this));
            }
            if (this.r) {
                a0.F(this.b, new e(this));
            }
            if (this.u) {
                this.c.d(this.a.i.d);
                a0.F(this.b, new i(this));
            }
            if (this.t) {
                a0.F(this.b, new g(this));
            }
            if (this.q) {
                a0.F(this.b, new k(this));
            }
            if (this.w) {
                a0.F(this.b, new j(this));
            }
            if (this.p) {
                a0.F(this.b, p.a);
            }
        }
    }

    public a0(p0[] p0VarArr, jq jqVar, f0 f0Var, f fVar, i iVar, Looper looper) {
        Integer.toHexString(System.identityHashCode(this));
        String str = f0.e;
        g.m(p0VarArr.length > 0);
        this.c = p0VarArr;
        jqVar.getClass();
        this.d = jqVar;
        this.l = false;
        this.n = 0;
        this.h = new CopyOnWriteArrayList<>();
        kq kqVar = new kq(new r0[p0VarArr.length], new gq[p0VarArr.length], null);
        this.b = kqVar;
        this.i = new v0.b();
        this.s = k0.e;
        t0 t0Var = t0.d;
        this.m = 0;
        a aVar = new a(looper);
        this.e = aVar;
        this.t = j0.d(0, kqVar);
        this.j = new ArrayDeque<>();
        b0 b0Var = new b0(p0VarArr, jqVar, kqVar, f0Var, fVar, this.l, this.n, false, aVar, iVar);
        this.f = b0Var;
        this.g = new Handler(b0Var.l());
    }

    private j0 D(boolean z, boolean z2, boolean z3, int i2) {
        long j2;
        long j3 = 0;
        if (z) {
            this.u = 0;
            this.v = 0;
            this.w = 0;
        } else {
            this.u = i();
            this.v = u();
            this.w = f();
        }
        boolean z4 = z || z2;
        t.a e2 = z4 ? this.t.e(false, this.a, this.i) : this.t.b;
        if (!z4) {
            j3 = this.t.m;
        }
        if (z4) {
            j2 = -9223372036854775807L;
        } else {
            j2 = this.t.d;
        }
        return new j0(z2 ? v0.a : this.t.a, e2, j3, j2, i2, z3 ? null : this.t.f, false, z2 ? com.google.android.exoplayer2.source.f0.f : this.t.h, z2 ? this.b : this.t.i, e2, j3, 0, j3);
    }

    /* access modifiers changed from: private */
    public static void F(CopyOnWriteArrayList<s.a> copyOnWriteArrayList, s.b bVar) {
        Iterator<s.a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void I(s.b bVar) {
        J(new l(new CopyOnWriteArrayList(this.h), bVar));
    }

    private void J(Runnable runnable) {
        boolean z = !this.j.isEmpty();
        this.j.addLast(runnable);
        if (!z) {
            while (!this.j.isEmpty()) {
                this.j.peekFirst().run();
                this.j.removeFirst();
            }
        }
    }

    private boolean O() {
        return this.t.a.n() || this.o > 0;
    }

    private void P(j0 j0Var, boolean z, int i2, int i3, boolean z2) {
        boolean r2 = r();
        j0 j0Var2 = this.t;
        this.t = j0Var;
        J(new b(j0Var, j0Var2, this.h, this.d, z, i2, i3, z2, this.l, r2 != r()));
    }

    public int A() {
        return this.c.length;
    }

    public int B(int i2) {
        return this.c[i2].c();
    }

    public int C() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void E(Message message) {
        int i2 = message.what;
        boolean z = true;
        if (i2 == 0) {
            j0 j0Var = (j0) message.obj;
            int i3 = message.arg1;
            int i4 = message.arg2;
            if (i4 == -1) {
                z = false;
            }
            int i5 = this.o - i3;
            this.o = i5;
            if (i5 == 0) {
                if (j0Var.c == -9223372036854775807L) {
                    j0Var = j0Var.a(j0Var.b, 0, j0Var.d, j0Var.l);
                }
                if (!this.t.a.n() && j0Var.a.n()) {
                    this.v = 0;
                    this.u = 0;
                    this.w = 0;
                }
                int i6 = this.p ? 0 : 2;
                boolean z2 = this.q;
                this.p = false;
                this.q = false;
                P(j0Var, z, i4, i6, z2);
            }
        } else if (i2 == 1) {
            k0 k0Var = (k0) message.obj;
            if (message.arg1 == 0) {
                z = false;
            }
            if (z) {
                this.r--;
            }
            if (this.r == 0 && !this.s.equals(k0Var)) {
                this.s = k0Var;
                I(new b(k0Var));
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean G() {
        return !O() && this.t.b.a();
    }

    public void K(t tVar, boolean z, boolean z2) {
        this.k = tVar;
        j0 D = D(z, z2, true, 2);
        this.p = true;
        this.o++;
        this.f.B(tVar, z, z2);
        P(D, false, 4, 1, false);
    }

    public void L(boolean z, int i2) {
        boolean r2 = r();
        boolean z2 = this.l && this.m == 0;
        boolean z3 = z && i2 == 0;
        if (z2 != z3) {
            this.f.X(z3);
        }
        boolean z4 = this.l != z;
        boolean z5 = this.m != i2;
        this.l = z;
        this.m = i2;
        boolean r3 = r();
        boolean z6 = r2 != r3;
        if (z4 || z5 || z6) {
            I(new d(z4, z, this.t.e, z5, i2, z6, r3));
        }
    }

    public void M(k0 k0Var) {
        if (k0Var == null) {
            k0Var = k0.e;
        }
        if (!this.s.equals(k0Var)) {
            this.r++;
            this.s = k0Var;
            this.f.Z(k0Var);
            I(new m(k0Var));
        }
    }

    public void N(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.f.b0(i2);
            I(new n(i2));
        }
    }

    @Override // com.google.android.exoplayer2.y
    public void a(t tVar) {
        K(tVar, true, true);
    }

    @Override // com.google.android.exoplayer2.y
    public n0 b(n0.b bVar) {
        return new n0(this.f, bVar, this.t.a, i(), this.g);
    }

    @Override // com.google.android.exoplayer2.m0
    public void d() {
        Integer.toHexString(System.identityHashCode(this));
        String str = f0.e;
        c0.b();
        this.f.D();
        this.e.removeCallbacksAndMessages(null);
        this.t = D(false, false, false, 1);
    }

    @Override // com.google.android.exoplayer2.m0
    public long e() {
        if (G()) {
            j0 j0Var = this.t;
            t.a aVar = j0Var.b;
            j0Var.a.f(aVar.a, this.i);
            return u.b(this.i.b(aVar.b, aVar.c));
        }
        v0 l2 = l();
        if (l2.n()) {
            return -9223372036854775807L;
        }
        return u.b(l2.k(i(), this.a).i);
    }

    @Override // com.google.android.exoplayer2.m0
    public long f() {
        if (O()) {
            return this.w;
        }
        if (this.t.b.a()) {
            return u.b(this.t.m);
        }
        j0 j0Var = this.t;
        t.a aVar = j0Var.b;
        long b2 = u.b(j0Var.m);
        this.t.a.f(aVar.a, this.i);
        return this.i.i() + b2;
    }

    @Override // com.google.android.exoplayer2.m0
    public long g() {
        return u.b(this.t.l);
    }

    @Override // com.google.android.exoplayer2.m0
    public void h(m0.a aVar) {
        Iterator<s.a> it = this.h.iterator();
        while (it.hasNext()) {
            s.a next = it.next();
            if (next.a.equals(aVar)) {
                next.b();
                this.h.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.m0
    public int i() {
        if (O()) {
            return this.u;
        }
        j0 j0Var = this.t;
        return j0Var.a.f(j0Var.b.a, this.i).b;
    }

    @Override // com.google.android.exoplayer2.m0
    public void j(boolean z) {
        L(z, 0);
    }

    @Override // com.google.android.exoplayer2.m0
    public int k() {
        if (G()) {
            return this.t.b.b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.m0
    public v0 l() {
        return this.t.a;
    }

    @Override // com.google.android.exoplayer2.m0
    public void m(int i2, long j2) {
        long j3;
        v0 v0Var = this.t.a;
        if (i2 < 0 || (!v0Var.n() && i2 >= v0Var.m())) {
            throw new IllegalSeekPositionException(v0Var, i2, j2);
        }
        this.q = true;
        this.o++;
        if (G()) {
            this.e.obtainMessage(0, 1, -1, this.t).sendToTarget();
            return;
        }
        this.u = i2;
        long j4 = 0;
        if (v0Var.n()) {
            if (j2 != -9223372036854775807L) {
                j4 = j2;
            }
            this.w = j4;
            this.v = 0;
        } else {
            if (j2 == -9223372036854775807L) {
                j3 = v0Var.l(i2, this.a, 0).h;
            } else {
                j3 = u.a(j2);
            }
            Pair<Object, Long> h2 = v0Var.h(this.a, this.i, i2, j3);
            this.w = u.b(j3);
            this.v = v0Var.b(h2.first);
        }
        this.f.M(v0Var, i2, u.a(j2));
        I(c.a);
    }

    @Override // com.google.android.exoplayer2.m0
    public void n(boolean z) {
        j0 D = D(z, z, z, 1);
        this.o++;
        this.f.g0(z);
        P(D, false, 4, 1, false);
    }

    @Override // com.google.android.exoplayer2.m0
    public void o(m0.a aVar) {
        this.h.addIfAbsent(new s.a(aVar));
    }

    @Override // com.google.android.exoplayer2.m0
    public int p() {
        if (G()) {
            return this.t.b.c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.m0
    public long q() {
        if (!G()) {
            return f();
        }
        j0 j0Var = this.t;
        j0Var.a.f(j0Var.b.a, this.i);
        j0 j0Var2 = this.t;
        if (j0Var2.d == -9223372036854775807L) {
            return j0Var2.a.k(i(), this.a).a();
        }
        return this.i.i() + u.b(this.t.d);
    }

    public Looper t() {
        return this.e.getLooper();
    }

    public int u() {
        if (O()) {
            return this.v;
        }
        j0 j0Var = this.t;
        return j0Var.a.b(j0Var.b.a);
    }

    public boolean v() {
        return this.l;
    }

    public ExoPlaybackException w() {
        return this.t.f;
    }

    public k0 x() {
        return this.s;
    }

    public int y() {
        return this.t.e;
    }

    public int z() {
        return this.m;
    }
}
