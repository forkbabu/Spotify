package com.google.android.exoplayer2;

import android.util.Log;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.util.g;

/* access modifiers changed from: package-private */
public final class g0 {
    public final s a;
    public final Object b;
    public final b0[] c;
    public boolean d;
    public boolean e;
    public h0 f;
    private final boolean[] g;
    private final q0[] h;
    private final jq i;
    private final t j;
    private g0 k;
    private f0 l = f0.f;
    private kq m;
    private long n;

    public g0(q0[] q0VarArr, long j2, jq jqVar, n nVar, t tVar, h0 h0Var, kq kqVar) {
        this.h = q0VarArr;
        this.n = j2;
        this.i = jqVar;
        this.j = tVar;
        t.a aVar = h0Var.a;
        this.b = aVar.a;
        this.f = h0Var;
        this.m = kqVar;
        this.c = new b0[q0VarArr.length];
        this.g = new boolean[q0VarArr.length];
        long j3 = h0Var.b;
        long j4 = h0Var.d;
        s f2 = tVar.f(aVar, nVar, j3);
        if (!(j4 == -9223372036854775807L || j4 == Long.MIN_VALUE)) {
            f2 = new m(f2, true, 0, j4);
        }
        this.a = f2;
    }

    private void d() {
        if (n()) {
            int i2 = 0;
            while (true) {
                kq kqVar = this.m;
                if (i2 < kqVar.a) {
                    boolean b2 = kqVar.b(i2);
                    gq a2 = this.m.c.a(i2);
                    if (b2 && a2 != null) {
                        a2.a();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private void e() {
        if (n()) {
            int i2 = 0;
            while (true) {
                kq kqVar = this.m;
                if (i2 < kqVar.a) {
                    boolean b2 = kqVar.b(i2);
                    gq a2 = this.m.c.a(i2);
                    if (b2 && a2 != null) {
                        a2.k();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean n() {
        return this.k == null;
    }

    public long a(kq kqVar, long j2, boolean z) {
        return b(kqVar, j2, z, new boolean[this.h.length]);
    }

    public long b(kq kqVar, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= kqVar.a) {
                break;
            }
            boolean[] zArr2 = this.g;
            if (z || !kqVar.a(this.m, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        b0[] b0VarArr = this.c;
        int i3 = 0;
        while (true) {
            q0[] q0VarArr = this.h;
            if (i3 >= q0VarArr.length) {
                break;
            }
            if (q0VarArr[i3].c() == 6) {
                b0VarArr[i3] = null;
            }
            i3++;
        }
        d();
        this.m = kqVar;
        e();
        hq hqVar = kqVar.c;
        long f2 = this.a.f(hqVar.b(), this.g, this.c, zArr, j2);
        b0[] b0VarArr2 = this.c;
        int i4 = 0;
        while (true) {
            q0[] q0VarArr2 = this.h;
            if (i4 >= q0VarArr2.length) {
                break;
            }
            if (q0VarArr2[i4].c() == 6 && this.m.b(i4)) {
                b0VarArr2[i4] = new p();
            }
            i4++;
        }
        this.e = false;
        int i5 = 0;
        while (true) {
            b0[] b0VarArr3 = this.c;
            if (i5 >= b0VarArr3.length) {
                return f2;
            }
            if (b0VarArr3[i5] != null) {
                g.m(kqVar.b(i5));
                if (this.h[i5].c() != 6) {
                    this.e = true;
                }
            } else {
                g.m(hqVar.a(i5) == null);
            }
            i5++;
        }
    }

    public void c(long j2) {
        g.m(n());
        this.a.b(j2 - this.n);
    }

    public long f() {
        if (!this.d) {
            return this.f.b;
        }
        long c2 = this.e ? this.a.c() : Long.MIN_VALUE;
        return c2 == Long.MIN_VALUE ? this.f.e : c2;
    }

    public g0 g() {
        return this.k;
    }

    public long h() {
        return this.n;
    }

    public long i() {
        return this.f.b + this.n;
    }

    public f0 j() {
        return this.l;
    }

    public kq k() {
        return this.m;
    }

    public void l(float f2, v0 v0Var) {
        this.d = true;
        this.l = this.a.t();
        long b2 = b(q(f2, v0Var), this.f.b, false, new boolean[this.h.length]);
        long j2 = this.n;
        h0 h0Var = this.f;
        long j3 = h0Var.b;
        this.n = (j3 - b2) + j2;
        if (b2 != j3) {
            h0Var = new h0(h0Var.a, b2, h0Var.c, h0Var.d, h0Var.e, h0Var.f, h0Var.g);
        }
        this.f = h0Var;
    }

    public boolean m() {
        return this.d && (!this.e || this.a.c() == Long.MIN_VALUE);
    }

    public void o(long j2) {
        g.m(n());
        if (this.d) {
            this.a.e(j2 - this.n);
        }
    }

    public void p() {
        d();
        long j2 = this.f.d;
        t tVar = this.j;
        s sVar = this.a;
        if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
            tVar.d(sVar);
            return;
        }
        try {
            tVar.d(((m) sVar).a);
        } catch (RuntimeException e2) {
            Log.e("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public kq q(float f2, v0 v0Var) {
        kq e2 = this.i.e(this.h, this.l, this.f.a, v0Var);
        gq[] b2 = e2.c.b();
        for (gq gqVar : b2) {
            if (gqVar != null) {
                gqVar.f(f2);
            }
        }
        return e2;
    }

    public void r(g0 g0Var) {
        if (g0Var != this.k) {
            d();
            this.k = g0Var;
            e();
        }
    }

    public void s(long j2) {
        this.n = j2;
    }

    public long t(long j2) {
        return j2 - this.n;
    }

    public long u(long j2) {
        return j2 + this.n;
    }
}
