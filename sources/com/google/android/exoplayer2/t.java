package com.google.android.exoplayer2;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.r;

public abstract class t implements p0, q0 {
    private final int a;
    private final e0 b = new e0();
    private r0 c;
    private int f;
    private int n;
    private b0 o;
    private d0[] p;
    private long q;
    private long r = Long.MIN_VALUE;
    private boolean s;
    private boolean t;

    public t(int i) {
        this.a = i;
    }

    protected static boolean N(n<?> nVar, l lVar) {
        if (lVar == null) {
            return true;
        }
        if (nVar == null) {
            return false;
        }
        return nVar.a(lVar);
    }

    /* access modifiers changed from: protected */
    public final int A() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public final d0[] B() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public final <T extends q> DrmSession<T> C(d0 d0Var, d0 d0Var2, n<T> nVar, DrmSession<T> drmSession) {
        DrmSession<T> drmSession2 = null;
        if (!(!f0.a(d0Var2.u, d0Var == null ? null : d0Var.u))) {
            return drmSession;
        }
        if (d0Var2.u != null) {
            if (nVar != null) {
                Looper myLooper = Looper.myLooper();
                myLooper.getClass();
                drmSession2 = nVar.e(myLooper, d0Var2.u);
            } else {
                throw x(new IllegalStateException("Media requires a DrmSessionManager"), d0Var2);
            }
        }
        if (drmSession != null) {
            drmSession.d();
        }
        return drmSession2;
    }

    /* access modifiers changed from: protected */
    public final boolean D() {
        return i() ? this.s : this.o.d();
    }

    /* access modifiers changed from: protected */
    public abstract void E();

    /* access modifiers changed from: protected */
    public void F(boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void G(long j, boolean z);

    /* access modifiers changed from: protected */
    public void H() {
    }

    /* access modifiers changed from: protected */
    public void I() {
    }

    /* access modifiers changed from: protected */
    public void J() {
    }

    /* access modifiers changed from: protected */
    public abstract void K(d0[] d0VarArr, long j);

    /* access modifiers changed from: protected */
    public final int L(e0 e0Var, fj fjVar, boolean z) {
        int q2 = this.o.q(e0Var, fjVar, z);
        if (q2 == -4) {
            if (fjVar.isEndOfStream()) {
                this.r = Long.MIN_VALUE;
                if (this.s) {
                    return -4;
                }
                return -3;
            }
            long j = fjVar.c + this.q;
            fjVar.c = j;
            this.r = Math.max(this.r, j);
        } else if (q2 == -5) {
            d0 d0Var = e0Var.c;
            long j2 = d0Var.v;
            if (j2 != Long.MAX_VALUE) {
                e0Var.c = d0Var.j(j2 + this.q);
            }
        }
        return q2;
    }

    /* access modifiers changed from: protected */
    public int M(long j) {
        return this.o.s(j - this.q);
    }

    @Override // com.google.android.exoplayer2.p0
    public final void a() {
        boolean z = true;
        if (this.n != 1) {
            z = false;
        }
        g.m(z);
        this.b.a();
        this.n = 0;
        this.o = null;
        this.p = null;
        this.s = false;
        E();
    }

    @Override // com.google.android.exoplayer2.p0, com.google.android.exoplayer2.q0
    public final int c() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.p0
    public final b0 g() {
        return this.o;
    }

    @Override // com.google.android.exoplayer2.p0
    public final q0 getCapabilities() {
        return this;
    }

    @Override // com.google.android.exoplayer2.p0
    public final int getState() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.p0
    public r h() {
        return null;
    }

    @Override // com.google.android.exoplayer2.p0
    public final boolean i() {
        return this.r == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.p0
    public final void j(r0 r0Var, d0[] d0VarArr, b0 b0Var, long j, boolean z, long j2) {
        g.m(this.n == 0);
        this.c = r0Var;
        this.n = 1;
        F(z);
        g.m(!this.s);
        this.o = b0Var;
        this.r = j2;
        this.p = d0VarArr;
        this.q = j2;
        K(d0VarArr, j2);
        G(j, z);
    }

    @Override // com.google.android.exoplayer2.p0
    public final void k() {
        this.s = true;
    }

    @Override // com.google.android.exoplayer2.n0.b
    public void l(int i, Object obj) {
    }

    @Override // com.google.android.exoplayer2.p0
    public /* synthetic */ void m(float f2) {
        o0.a(this, f2);
    }

    @Override // com.google.android.exoplayer2.p0
    public final void n() {
        this.o.j();
    }

    @Override // com.google.android.exoplayer2.p0
    public final boolean o() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.p0
    public final void q(int i) {
        this.f = i;
    }

    @Override // com.google.android.exoplayer2.q0
    public int r() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.p0
    public final void reset() {
        g.m(this.n == 0);
        this.b.a();
        H();
    }

    @Override // com.google.android.exoplayer2.p0
    public final void start() {
        boolean z = true;
        if (this.n != 1) {
            z = false;
        }
        g.m(z);
        this.n = 2;
        I();
    }

    @Override // com.google.android.exoplayer2.p0
    public final void stop() {
        g.m(this.n == 2);
        this.n = 1;
        J();
    }

    @Override // com.google.android.exoplayer2.p0
    public final long t() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.p0
    public final void u(long j) {
        this.s = false;
        this.r = j;
        G(j, false);
    }

    @Override // com.google.android.exoplayer2.p0
    public final void w(d0[] d0VarArr, b0 b0Var, long j) {
        g.m(!this.s);
        this.o = b0Var;
        this.r = j;
        this.p = d0VarArr;
        this.q = j;
        K(d0VarArr, j);
    }

    /* access modifiers changed from: protected */
    public final ExoPlaybackException x(Exception exc, d0 d0Var) {
        int i;
        if (d0Var != null && !this.t) {
            this.t = true;
            try {
                i = e(d0Var) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.t = false;
            }
            return ExoPlaybackException.b(exc, this.f, d0Var, i);
        }
        i = 4;
        return ExoPlaybackException.b(exc, this.f, d0Var, i);
    }

    /* access modifiers changed from: protected */
    public final r0 y() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final e0 z() {
        this.b.a();
        return this.b;
    }
}
