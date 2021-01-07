package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.s;
import defpackage.zj;

final class z {
    private final n<?> a;
    private d0 b;
    private DrmSession<?> c;
    private int d = Constants.ONE_SECOND;
    private int[] e = new int[Constants.ONE_SECOND];
    private long[] f = new long[Constants.ONE_SECOND];
    private int[] g = new int[Constants.ONE_SECOND];
    private int[] h = new int[Constants.ONE_SECOND];
    private long[] i = new long[Constants.ONE_SECOND];
    private zj.a[] j = new zj.a[Constants.ONE_SECOND];
    private d0[] k = new d0[Constants.ONE_SECOND];
    private int l;
    private int m;
    private int n;
    private int o;
    private long p = Long.MIN_VALUE;
    private long q = Long.MIN_VALUE;
    private boolean r;
    private boolean s = true;
    private boolean t = true;
    private d0 u;
    private d0 v;
    private int w;

    public static final class a {
        public int a;
        public long b;
        public zj.a c;
    }

    public z(n<?> nVar) {
        this.a = nVar;
    }

    private long e(int i2) {
        this.p = Math.max(this.p, n(i2));
        int i3 = this.l - i2;
        this.l = i3;
        this.m += i2;
        int i4 = this.n + i2;
        this.n = i4;
        int i5 = this.d;
        if (i4 >= i5) {
            this.n = i4 - i5;
        }
        int i6 = this.o - i2;
        this.o = i6;
        if (i6 < 0) {
            this.o = 0;
        }
        if (i3 != 0) {
            return this.f[this.n];
        }
        int i7 = this.n;
        if (i7 != 0) {
            i5 = i7;
        }
        int i8 = i5 - 1;
        return this.f[i8] + ((long) this.g[i8]);
    }

    private int i(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3 && this.i[i2] <= j2; i5++) {
            if (!z || (this.h[i2] & 1) != 0) {
                i4 = i5;
            }
            i2++;
            if (i2 == this.d) {
                i2 = 0;
            }
        }
        return i4;
    }

    private long n(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int p2 = p(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.i[p2]);
            if ((this.h[p2] & 1) != 0) {
                break;
            }
            p2--;
            if (p2 == -1) {
                p2 = this.d - 1;
            }
        }
        return j2;
    }

    private int p(int i2) {
        int i3 = this.n + i2;
        int i4 = this.d;
        return i3 < i4 ? i3 : i3 - i4;
    }

    private boolean s() {
        return this.o != this.l;
    }

    private boolean v(int i2) {
        DrmSession<?> drmSession;
        if (this.a == n.a || (drmSession = this.c) == null || drmSession.getState() == 4) {
            return true;
        }
        if ((this.h[i2] & 1073741824) != 0 || !this.c.b()) {
            return false;
        }
        return true;
    }

    private void x(d0 d0Var, e0 e0Var) {
        l lVar;
        DrmSession<?> drmSession;
        e0Var.c = d0Var;
        d0 d0Var2 = this.b;
        boolean z = d0Var2 == null;
        if (z) {
            lVar = null;
        } else {
            lVar = d0Var2.u;
        }
        this.b = d0Var;
        if (this.a != n.a) {
            l lVar2 = d0Var.u;
            e0Var.a = true;
            e0Var.b = this.c;
            if (z || !f0.a(lVar, lVar2)) {
                DrmSession<?> drmSession2 = this.c;
                Looper myLooper = Looper.myLooper();
                myLooper.getClass();
                if (lVar2 != null) {
                    drmSession = this.a.e(myLooper, lVar2);
                } else {
                    drmSession = this.a.c(myLooper, s.f(d0Var.r));
                }
                this.c = drmSession;
                e0Var.b = drmSession;
                if (drmSession2 != null) {
                    drmSession2.d();
                }
            }
        }
    }

    public void A() {
        DrmSession<?> drmSession = this.c;
        if (drmSession != null) {
            drmSession.d();
            this.c = null;
            this.b = null;
        }
    }

    public void B(boolean z) {
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.s = true;
        this.p = Long.MIN_VALUE;
        this.q = Long.MIN_VALUE;
        this.r = false;
        this.v = null;
        if (z) {
            this.u = null;
            this.t = true;
        }
    }

    public synchronized void C() {
        this.o = 0;
    }

    public synchronized boolean D(int i2) {
        int i3 = this.m;
        if (i3 > i2 || i2 > this.l + i3) {
            return false;
        }
        this.o = i2 - i3;
        return true;
    }

    public void E(int i2) {
        this.w = i2;
    }

    public synchronized int a(long j2, boolean z, boolean z2) {
        int p2 = p(this.o);
        if (s() && j2 >= this.i[p2]) {
            if (j2 <= this.q || z2) {
                int i2 = i(p2, this.l - this.o, j2, z);
                if (i2 == -1) {
                    return -1;
                }
                this.o += i2;
                return i2;
            }
        }
        return -1;
    }

    public synchronized int b() {
        int i2;
        int i3 = this.l;
        i2 = i3 - this.o;
        this.o = i3;
        return i2;
    }

    public synchronized boolean c(long j2) {
        boolean z = false;
        if (this.l == 0) {
            if (j2 > this.p) {
                z = true;
            }
            return z;
        } else if (Math.max(this.p, n(this.o)) >= j2) {
            return false;
        } else {
            int i2 = this.l;
            int p2 = p(i2 - 1);
            while (i2 > this.o && this.i[p2] >= j2) {
                i2--;
                p2--;
                if (p2 == -1) {
                    p2 = this.d - 1;
                }
            }
            h(this.m + i2);
            return true;
        }
    }

    public synchronized void d(long j2, int i2, long j3, int i3, zj.a aVar) {
        if (this.s) {
            if ((i2 & 1) != 0) {
                this.s = false;
            } else {
                return;
            }
        }
        g.m(!this.t);
        this.r = (536870912 & i2) != 0;
        this.q = Math.max(this.q, j2);
        int p2 = p(this.l);
        this.i[p2] = j2;
        long[] jArr = this.f;
        jArr[p2] = j3;
        this.g[p2] = i3;
        this.h[p2] = i2;
        this.j[p2] = aVar;
        d0[] d0VarArr = this.k;
        d0 d0Var = this.u;
        d0VarArr[p2] = d0Var;
        this.e[p2] = this.w;
        this.v = d0Var;
        int i4 = this.l + 1;
        this.l = i4;
        int i5 = this.d;
        if (i4 == i5) {
            int i6 = i5 + Constants.ONE_SECOND;
            int[] iArr = new int[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            zj.a[] aVarArr = new zj.a[i6];
            d0[] d0VarArr2 = new d0[i6];
            int i7 = this.n;
            int i8 = i5 - i7;
            System.arraycopy(jArr, i7, jArr2, 0, i8);
            System.arraycopy(this.i, this.n, jArr3, 0, i8);
            System.arraycopy(this.h, this.n, iArr2, 0, i8);
            System.arraycopy(this.g, this.n, iArr3, 0, i8);
            System.arraycopy(this.j, this.n, aVarArr, 0, i8);
            System.arraycopy(this.k, this.n, d0VarArr2, 0, i8);
            System.arraycopy(this.e, this.n, iArr, 0, i8);
            int i9 = this.n;
            System.arraycopy(this.f, 0, jArr2, i8, i9);
            System.arraycopy(this.i, 0, jArr3, i8, i9);
            System.arraycopy(this.h, 0, iArr2, i8, i9);
            System.arraycopy(this.g, 0, iArr3, i8, i9);
            System.arraycopy(this.j, 0, aVarArr, i8, i9);
            System.arraycopy(this.k, 0, d0VarArr2, i8, i9);
            System.arraycopy(this.e, 0, iArr, i8, i9);
            this.f = jArr2;
            this.i = jArr3;
            this.h = iArr2;
            this.g = iArr3;
            this.j = aVarArr;
            this.k = d0VarArr2;
            this.e = iArr;
            this.n = 0;
            this.l = this.d;
            this.d = i6;
        }
    }

    public synchronized long f(long j2, boolean z, boolean z2) {
        int i2;
        int i3 = this.l;
        if (i3 != 0) {
            long[] jArr = this.i;
            int i4 = this.n;
            if (j2 >= jArr[i4]) {
                if (z2 && (i2 = this.o) != i3) {
                    i3 = i2 + 1;
                }
                int i5 = i(i4, i3, j2, z);
                if (i5 == -1) {
                    return -1;
                }
                return e(i5);
            }
        }
        return -1;
    }

    public synchronized long g() {
        int i2 = this.l;
        if (i2 == 0) {
            return -1;
        }
        return e(i2);
    }

    public long h(int i2) {
        int i3 = this.m;
        int i4 = this.l;
        int i5 = (i3 + i4) - i2;
        boolean z = false;
        g.a(i5 >= 0 && i5 <= i4 - this.o);
        int i6 = this.l - i5;
        this.l = i6;
        this.q = Math.max(this.p, n(i6));
        if (i5 == 0 && this.r) {
            z = true;
        }
        this.r = z;
        int i7 = this.l;
        if (i7 == 0) {
            return 0;
        }
        int p2 = p(i7 - 1);
        return this.f[p2] + ((long) this.g[p2]);
    }

    public synchronized boolean j(d0 d0Var) {
        if (d0Var == null) {
            this.t = true;
            return false;
        }
        this.t = false;
        if (f0.a(d0Var, this.u)) {
            return false;
        }
        if (f0.a(d0Var, this.v)) {
            this.u = this.v;
            return true;
        }
        this.u = d0Var;
        return true;
    }

    public int k() {
        return this.m;
    }

    public synchronized long l() {
        return this.l == 0 ? Long.MIN_VALUE : this.i[this.n];
    }

    public synchronized long m() {
        return this.q;
    }

    public int o() {
        return this.m + this.o;
    }

    public synchronized d0 q() {
        return this.t ? null : this.u;
    }

    public int r() {
        return this.m + this.l;
    }

    public synchronized boolean t() {
        return this.r;
    }

    public boolean u(boolean z) {
        if (s()) {
            int p2 = p(this.o);
            if (this.k[p2] != this.b) {
                return true;
            }
            return v(p2);
        } else if (z || this.r) {
            return true;
        } else {
            d0 d0Var = this.u;
            if (d0Var == null || d0Var == this.b) {
                return false;
            }
            return true;
        }
    }

    public void w() {
        DrmSession<?> drmSession = this.c;
        if (drmSession != null && drmSession.getState() == 1) {
            DrmSession.DrmSessionException f2 = this.c.f();
            f2.getClass();
            throw f2;
        }
    }

    public synchronized int y() {
        return s() ? this.e[p(this.o)] : this.w;
    }

    public synchronized int z(e0 e0Var, fj fjVar, boolean z, boolean z2, a aVar) {
        if (!s()) {
            if (!z2) {
                if (!this.r) {
                    d0 d0Var = this.u;
                    if (d0Var == null || (!z && d0Var == this.b)) {
                        return -3;
                    }
                    d0Var.getClass();
                    x(d0Var, e0Var);
                    return -5;
                }
            }
            fjVar.setFlags(4);
            return -4;
        }
        int p2 = p(this.o);
        if (z || this.k[p2] != this.b) {
            x(this.k[p2], e0Var);
            return -5;
        } else if (!v(p2)) {
            return -3;
        } else {
            fjVar.setFlags(this.h[p2]);
            fjVar.c = this.i[p2];
            if (fjVar.p()) {
                return -4;
            }
            aVar.a = this.g[p2];
            aVar.b = this.f[p2];
            aVar.c = this.j[p2];
            this.o++;
            return -4;
        }
    }
}
