package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.v0;

/* access modifiers changed from: package-private */
public final class i0 {
    private final v0.b a = new v0.b();
    private final v0.c b = new v0.c();
    private long c;
    private v0 d = v0.a;
    private int e;
    private boolean f;
    private g0 g;
    private g0 h;
    private g0 i;
    private int j;
    private Object k;
    private long l;

    private h0 e(g0 g0Var, long j2) {
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        h0 h0Var = g0Var.f;
        long h2 = (g0Var.h() + h0Var.e) - j2;
        long j7 = 0;
        if (h0Var.f) {
            int c2 = this.d.c(this.d.b(h0Var.a.a), this.a, this.b, this.e, this.f);
            if (c2 == -1) {
                return null;
            }
            int i2 = this.d.e(c2, this.a, true).b;
            Object obj2 = this.a.a;
            long j8 = h0Var.a.d;
            if (this.d.k(i2, this.b).f == c2) {
                Pair<Object, Long> i3 = this.d.i(this.b, this.a, i2, -9223372036854775807L, Math.max(0L, h2));
                if (i3 == null) {
                    return null;
                }
                Object obj3 = i3.first;
                long longValue = ((Long) i3.second).longValue();
                g0 g2 = g0Var.g();
                if (g2 == null || !g2.b.equals(obj3)) {
                    j6 = this.c;
                    this.c = 1 + j6;
                } else {
                    j6 = g2.f.a.d;
                }
                j4 = longValue;
                j7 = -9223372036854775807L;
                j5 = j6;
                obj = obj3;
            } else {
                obj = obj2;
                j5 = j8;
                j4 = 0;
            }
            return g(s(obj, j4, j5), j7, j4);
        }
        t.a aVar = h0Var.a;
        this.d.f(aVar.a, this.a);
        if (aVar.a()) {
            int i4 = aVar.b;
            int a2 = this.a.a(i4);
            if (a2 == -1) {
                return null;
            }
            int h3 = this.a.h(i4, aVar.c);
            if (h3 >= a2) {
                long j9 = h0Var.c;
                if (j9 == -9223372036854775807L) {
                    v0 v0Var = this.d;
                    v0.c cVar = this.b;
                    v0.b bVar = this.a;
                    Pair<Object, Long> i5 = v0Var.i(cVar, bVar, bVar.b, -9223372036854775807L, Math.max(0L, h2));
                    if (i5 == null) {
                        return null;
                    }
                    j3 = ((Long) i5.second).longValue();
                } else {
                    j3 = j9;
                }
                return i(aVar.a, j3, aVar.d);
            } else if (!this.a.k(i4, h3)) {
                return null;
            } else {
                return h(aVar.a, i4, h3, h0Var.c, aVar.d);
            }
        } else {
            int d2 = this.a.d(h0Var.d);
            if (d2 == -1) {
                return i(aVar.a, h0Var.e, aVar.d);
            }
            int g3 = this.a.g(d2);
            if (!this.a.k(d2, g3)) {
                return null;
            }
            return h(aVar.a, d2, g3, h0Var.e, aVar.d);
        }
    }

    private h0 g(t.a aVar, long j2, long j3) {
        this.d.f(aVar.a, this.a);
        if (!aVar.a()) {
            return i(aVar.a, j3, aVar.d);
        }
        if (!this.a.k(aVar.b, aVar.c)) {
            return null;
        }
        return h(aVar.a, aVar.b, aVar.c, j2, aVar.d);
    }

    private h0 h(Object obj, int i2, int i3, long j2, long j3) {
        t.a aVar = new t.a(obj, i2, i3, j3);
        v0 v0Var = this.d;
        long b2 = v0Var.e(v0Var.b(obj), this.a, true).b(aVar.b, aVar.c);
        if (i3 == this.a.g(i2)) {
            this.a.f();
        }
        return new h0(aVar, 0, j2, -9223372036854775807L, b2, false, false);
    }

    private h0 i(Object obj, long j2, long j3) {
        long j4;
        int c2 = this.a.c(j2);
        t.a aVar = new t.a(obj, j3, c2);
        boolean z = !aVar.a() && aVar.e == -1;
        boolean n = n(aVar, z);
        long e2 = c2 != -1 ? this.a.e(c2) : -9223372036854775807L;
        if (e2 == -9223372036854775807L || e2 == Long.MIN_VALUE) {
            j4 = this.a.c;
        } else {
            j4 = e2;
        }
        return new h0(aVar, j2, -9223372036854775807L, e2, j4, z, n);
    }

    private boolean n(t.a aVar, boolean z) {
        int b2 = this.d.b(aVar.a);
        if (this.d.k(this.d.d(b2, this.a).b, this.b).d) {
            return false;
        }
        if (!(this.d.c(b2, this.a, this.b, this.e, this.f) == -1) || !z) {
            return false;
        }
        return true;
    }

    private t.a s(Object obj, long j2, long j3) {
        v0 v0Var = this.d;
        v0Var.e(v0Var.b(obj), this.a, true);
        int d2 = this.a.d(j2);
        if (d2 == -1) {
            return new t.a(obj, j3, this.a.c(j2));
        }
        return new t.a(obj, d2, this.a.g(d2), j3);
    }

    private boolean v() {
        g0 g0Var = this.g;
        if (g0Var == null) {
            return true;
        }
        int b2 = this.d.b(g0Var.b);
        while (true) {
            b2 = this.d.c(b2, this.a, this.b, this.e, this.f);
            while (g0Var.g() != null && !g0Var.f.f) {
                g0Var = g0Var.g();
            }
            g0 g2 = g0Var.g();
            if (b2 == -1 || g2 == null || this.d.b(g2.b) != b2) {
                break;
            }
            g0Var = g2;
        }
        boolean q = q(g0Var);
        g0Var.f = m(g0Var.f);
        return !q;
    }

    public g0 a() {
        g0 g0Var = this.g;
        if (g0Var == null) {
            return null;
        }
        if (g0Var == this.h) {
            this.h = g0Var.g();
        }
        this.g.p();
        int i2 = this.j - 1;
        this.j = i2;
        if (i2 == 0) {
            this.i = null;
            g0 g0Var2 = this.g;
            this.k = g0Var2.b;
            this.l = g0Var2.f.a.d;
        }
        g0 g2 = this.g.g();
        this.g = g2;
        return g2;
    }

    public g0 b() {
        g0 g0Var = this.h;
        g.m((g0Var == null || g0Var.g() == null) ? false : true);
        g0 g2 = this.h.g();
        this.h = g2;
        return g2;
    }

    public void c(boolean z) {
        g0 g0Var = this.g;
        if (g0Var != null) {
            this.k = z ? g0Var.b : null;
            this.l = g0Var.f.a.d;
            q(g0Var);
            g0Var.p();
        } else if (!z) {
            this.k = null;
        }
        this.g = null;
        this.i = null;
        this.h = null;
        this.j = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != -9223372036854775807L) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.g0 d(com.google.android.exoplayer2.q0[] r12, defpackage.jq r13, com.google.android.exoplayer2.upstream.n r14, com.google.android.exoplayer2.source.t r15, com.google.android.exoplayer2.h0 r16, defpackage.kq r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.google.android.exoplayer2.g0 r1 = r0.i
            if (r1 != 0) goto L_0x001e
            com.google.android.exoplayer2.source.t$a r1 = r8.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x001b
            long r1 = r8.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            r1 = 0
            goto L_0x002c
        L_0x001e:
            long r1 = r1.h()
            com.google.android.exoplayer2.g0 r3 = r0.i
            com.google.android.exoplayer2.h0 r3 = r3.f
            long r3 = r3.e
            long r1 = r1 + r3
            long r3 = r8.b
            long r1 = r1 - r3
        L_0x002c:
            r3 = r1
            com.google.android.exoplayer2.g0 r10 = new com.google.android.exoplayer2.g0
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.google.android.exoplayer2.g0 r1 = r0.i
            if (r1 == 0) goto L_0x0043
            r1.r(r10)
            goto L_0x0047
        L_0x0043:
            r0.g = r10
            r0.h = r10
        L_0x0047:
            r1 = 0
            r0.k = r1
            r0.i = r10
            int r1 = r0.j
            int r1 = r1 + 1
            r0.j = r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.i0.d(com.google.android.exoplayer2.q0[], jq, com.google.android.exoplayer2.upstream.n, com.google.android.exoplayer2.source.t, com.google.android.exoplayer2.h0, kq):com.google.android.exoplayer2.g0");
    }

    public g0 f() {
        return this.i;
    }

    public h0 j(long j2, j0 j0Var) {
        g0 g0Var = this.i;
        if (g0Var == null) {
            return g(j0Var.b, j0Var.d, j0Var.c);
        }
        return e(g0Var, j2);
    }

    public g0 k() {
        return this.g;
    }

    public g0 l() {
        return this.h;
    }

    public h0 m(h0 h0Var) {
        long j2;
        t.a aVar = h0Var.a;
        boolean z = !aVar.a() && aVar.e == -1;
        boolean n = n(aVar, z);
        this.d.f(h0Var.a.a, this.a);
        if (aVar.a()) {
            j2 = this.a.b(aVar.b, aVar.c);
        } else {
            j2 = h0Var.d;
            if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
                j2 = this.a.c;
            }
        }
        return new h0(aVar, h0Var.b, h0Var.c, h0Var.d, j2, z, n);
    }

    public boolean o(s sVar) {
        g0 g0Var = this.i;
        return g0Var != null && g0Var.a == sVar;
    }

    public void p(long j2) {
        g0 g0Var = this.i;
        if (g0Var != null) {
            g0Var.o(j2);
        }
    }

    public boolean q(g0 g0Var) {
        boolean z = false;
        g.m(g0Var != null);
        this.i = g0Var;
        while (g0Var.g() != null) {
            g0Var = g0Var.g();
            if (g0Var == this.h) {
                this.h = this.g;
                z = true;
            }
            g0Var.p();
            this.j--;
        }
        this.i.r(null);
        return z;
    }

    public t.a r(Object obj, long j2) {
        long j3;
        int b2;
        v0 v0Var = this.d;
        int i2 = v0Var.e(v0Var.b(obj), this.a, true).b;
        Object obj2 = this.k;
        if (obj2 == null || (b2 = this.d.b(obj2)) == -1 || this.d.d(b2, this.a).b != i2) {
            g0 g0Var = this.g;
            while (true) {
                if (g0Var == null) {
                    g0 g0Var2 = this.g;
                    while (true) {
                        if (g0Var2 != null) {
                            int b3 = this.d.b(g0Var2.b);
                            if (b3 != -1 && this.d.d(b3, this.a).b == i2) {
                                j3 = g0Var2.f.a.d;
                                break;
                            }
                            g0Var2 = g0Var2.g();
                        } else {
                            j3 = this.c;
                            this.c = 1 + j3;
                            if (this.g == null) {
                                this.k = obj;
                                this.l = j3;
                            }
                        }
                    }
                } else if (g0Var.b.equals(obj)) {
                    j3 = g0Var.f.a.d;
                    break;
                } else {
                    g0Var = g0Var.g();
                }
            }
        } else {
            j3 = this.l;
        }
        return s(obj, j2, j3);
    }

    public void t(v0 v0Var) {
        this.d = v0Var;
    }

    public boolean u() {
        g0 g0Var = this.i;
        return g0Var == null || (!g0Var.f.g && g0Var.m() && this.i.f.e != -9223372036854775807L && this.j < 100);
    }

    public boolean w(long j2, long j3) {
        h0 h0Var;
        long j4;
        g0 g0Var = this.g;
        g0 g0Var2 = null;
        while (g0Var != null) {
            h0 h0Var2 = g0Var.f;
            if (g0Var2 == null) {
                h0Var = m(h0Var2);
            } else {
                h0 e2 = e(g0Var2, j2);
                if (e2 == null) {
                    return !q(g0Var2);
                }
                if (!(h0Var2.b == e2.b && h0Var2.a.equals(e2.a))) {
                    return !q(g0Var2);
                }
                h0Var = e2;
            }
            long j5 = h0Var2.c;
            g0Var.f = j5 == h0Var.c ? h0Var : new h0(h0Var.a, h0Var.b, j5, h0Var.d, h0Var.e, h0Var.f, h0Var.g);
            long j6 = h0Var2.e;
            long j7 = h0Var.e;
            if (!(j6 == -9223372036854775807L || j6 == j7)) {
                if (j7 == -9223372036854775807L) {
                    j4 = Long.MAX_VALUE;
                } else {
                    j4 = g0Var.u(j7);
                }
                boolean z = g0Var == this.h && (j3 == Long.MIN_VALUE || j3 >= j4);
                if (q(g0Var) || z) {
                    return false;
                }
                return true;
            }
            g0Var2 = g0Var;
            g0Var = g0Var.g();
        }
        return true;
    }

    public boolean x(int i2) {
        this.e = i2;
        return v();
    }

    public boolean y(boolean z) {
        this.f = z;
        return v();
    }
}
