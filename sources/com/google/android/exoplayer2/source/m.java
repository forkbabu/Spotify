package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.List;

public final class m implements s, s.a {
    public final s a;
    private s.a b;
    private a[] c = new a[0];
    private long f;
    long n;
    long o;

    private final class a implements b0 {
        public final b0 a;
        private boolean b;

        public a(b0 b0Var) {
            this.a = b0Var;
        }

        public void a() {
            this.b = false;
        }

        @Override // com.google.android.exoplayer2.source.b0
        public boolean d() {
            return !m.this.d() && this.a.d();
        }

        @Override // com.google.android.exoplayer2.source.b0
        public void j() {
            this.a.j();
        }

        @Override // com.google.android.exoplayer2.source.b0
        public int q(e0 e0Var, fj fjVar, boolean z) {
            if (m.this.d()) {
                return -3;
            }
            if (this.b) {
                fjVar.setFlags(4);
                return -4;
            }
            int q = this.a.q(e0Var, fjVar, z);
            if (q == -5) {
                d0 d0Var = e0Var.c;
                d0Var.getClass();
                int i = d0Var.H;
                if (!(i == 0 && d0Var.I == 0)) {
                    m mVar = m.this;
                    int i2 = 0;
                    if (mVar.n != 0) {
                        i = 0;
                    }
                    if (mVar.o == Long.MIN_VALUE) {
                        i2 = d0Var.I;
                    }
                    e0Var.c = d0Var.g(i, i2);
                }
                return -5;
            }
            m mVar2 = m.this;
            long j = mVar2.o;
            if (j == Long.MIN_VALUE || ((q != -4 || fjVar.c < j) && (q != -3 || mVar2.c() != Long.MIN_VALUE))) {
                return q;
            }
            fjVar.clear();
            fjVar.setFlags(4);
            this.b = true;
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.b0
        public int s(long j) {
            if (m.this.d()) {
                return -3;
            }
            return this.a.s(j);
        }
    }

    public m(s sVar, boolean z, long j, long j2) {
        this.a = sVar;
        this.f = z ? j : -9223372036854775807L;
        this.n = j;
        this.o = j2;
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public long a() {
        long a2 = this.a.a();
        if (a2 != Long.MIN_VALUE) {
            long j = this.o;
            if (j == Long.MIN_VALUE || a2 < j) {
                return a2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public boolean b(long j) {
        return this.a.b(j);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public long c() {
        long c2 = this.a.c();
        if (c2 != Long.MIN_VALUE) {
            long j = this.o;
            if (j == Long.MIN_VALUE || c2 < j) {
                return c2;
            }
        }
        return Long.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public void e(long j) {
        this.a.e(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r1 > r5) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    @Override // com.google.android.exoplayer2.source.s
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long f(defpackage.gq[] r16, boolean[] r17, com.google.android.exoplayer2.source.b0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.google.android.exoplayer2.source.m$a[] r1 = new com.google.android.exoplayer2.source.m.a[r1]
            r0.c = r1
            int r1 = r9.length
            com.google.android.exoplayer2.source.b0[] r10 = new com.google.android.exoplayer2.source.b0[r1]
            r11 = 0
            r1 = 0
        L_0x000f:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L_0x0028
            com.google.android.exoplayer2.source.m$a[] r2 = r0.c
            r3 = r9[r1]
            com.google.android.exoplayer2.source.m$a r3 = (com.google.android.exoplayer2.source.m.a) r3
            r2[r1] = r3
            r3 = r2[r1]
            if (r3 == 0) goto L_0x0023
            r2 = r2[r1]
            com.google.android.exoplayer2.source.b0 r12 = r2.a
        L_0x0023:
            r10[r1] = r12
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0028:
            com.google.android.exoplayer2.source.s r1 = r0.a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.f(r2, r3, r4, r5, r6)
            boolean r3 = r15.d()
            r4 = 1
            if (r3 == 0) goto L_0x0068
            long r5 = r0.n
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0068
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0063
            int r3 = r8.length
            r5 = 0
        L_0x004c:
            if (r5 >= r3) goto L_0x0063
            r6 = r8[r5]
            if (r6 == 0) goto L_0x0060
            com.google.android.exoplayer2.d0 r6 = r6.o()
            java.lang.String r6 = r6.r
            boolean r6 = com.google.android.exoplayer2.util.s.h(r6)
            if (r6 != 0) goto L_0x0060
            r3 = 1
            goto L_0x0064
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x004c
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0068
            r5 = r1
            goto L_0x006d
        L_0x0068:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006d:
            r0.f = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0087
            long r5 = r0.n
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0086
            long r5 = r0.o
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0087
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r4 = 0
        L_0x0087:
            com.google.android.exoplayer2.util.g.m(r4)
        L_0x008a:
            int r3 = r9.length
            if (r11 >= r3) goto L_0x00b6
            r3 = r10[r11]
            if (r3 != 0) goto L_0x0096
            com.google.android.exoplayer2.source.m$a[] r3 = r0.c
            r3[r11] = r12
            goto L_0x00ad
        L_0x0096:
            com.google.android.exoplayer2.source.m$a[] r3 = r0.c
            r4 = r3[r11]
            if (r4 == 0) goto L_0x00a4
            r4 = r3[r11]
            com.google.android.exoplayer2.source.b0 r4 = r4.a
            r5 = r10[r11]
            if (r4 == r5) goto L_0x00ad
        L_0x00a4:
            com.google.android.exoplayer2.source.m$a r4 = new com.google.android.exoplayer2.source.m$a
            r5 = r10[r11]
            r4.<init>(r5)
            r3[r11] = r4
        L_0x00ad:
            com.google.android.exoplayer2.source.m$a[] r3 = r0.c
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x008a
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.m.f(gq[], boolean[], com.google.android.exoplayer2.source.b0[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.s
    public /* synthetic */ List h(List list) {
        return r.a(this, list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.source.c0] */
    @Override // com.google.android.exoplayer2.source.c0.a
    public void i(s sVar) {
        s.a aVar = this.b;
        aVar.getClass();
        aVar.i(this);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.s.a
    public void j(s sVar) {
        s.a aVar = this.b;
        aVar.getClass();
        aVar.j(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    @Override // com.google.android.exoplayer2.source.s
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long k(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f = r0
            com.google.android.exoplayer2.source.m$a[] r0 = r6.c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.a()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.exoplayer2.source.s r0 = r6.a
            long r0 = r0.k(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.n
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.o
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            com.google.android.exoplayer2.util.g.m(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.m.k(long):long");
    }

    @Override // com.google.android.exoplayer2.source.s
    public long l(long j, t0 t0Var) {
        long j2 = this.n;
        if (j == j2) {
            return j2;
        }
        long i = f0.i(t0Var.a, 0, j - j2);
        long j3 = t0Var.b;
        long j4 = this.o;
        long i2 = f0.i(j3, 0, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (!(i == t0Var.a && i2 == t0Var.b)) {
            t0Var = new t0(i, i2);
        }
        return this.a.l(j, t0Var);
    }

    @Override // com.google.android.exoplayer2.source.s
    public long m() {
        if (d()) {
            long j = this.f;
            this.f = -9223372036854775807L;
            long m = m();
            return m != -9223372036854775807L ? m : j;
        }
        long m2 = this.a.m();
        if (m2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        g.m(m2 >= this.n);
        long j2 = this.o;
        if (j2 != Long.MIN_VALUE && m2 > j2) {
            z = false;
        }
        g.m(z);
        return m2;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void n(s.a aVar, long j) {
        this.b = aVar;
        this.a.n(this, j);
    }

    @Override // com.google.android.exoplayer2.source.s
    public void r() {
        this.a.r();
    }

    @Override // com.google.android.exoplayer2.source.s
    public f0 t() {
        return this.a.t();
    }

    @Override // com.google.android.exoplayer2.source.s
    public void u(long j, boolean z) {
        this.a.u(j, z);
    }
}
