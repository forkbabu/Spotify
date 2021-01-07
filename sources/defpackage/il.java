package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.v;
import defpackage.xj;

/* access modifiers changed from: package-private */
/* renamed from: il  reason: default package */
public abstract class il {
    private final el a = new el();
    private zj b;
    private rj c;
    private gl d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private b j;
    private long k;
    private boolean l;
    private boolean m;

    /* access modifiers changed from: package-private */
    /* renamed from: il$b */
    public static class b {
        d0 a;
        gl b;

        b() {
        }
    }

    /* renamed from: il$c */
    private static final class c implements gl {
        c(a aVar) {
        }

        @Override // defpackage.gl
        public long a(nj njVar) {
            return -1;
        }

        @Override // defpackage.gl
        public xj b() {
            return new xj.b(-9223372036854775807L, 0);
        }

        @Override // defpackage.gl
        public void c(long j) {
        }
    }

    /* access modifiers changed from: protected */
    public long a(long j2) {
        return (j2 * 1000000) / ((long) this.i);
    }

    /* access modifiers changed from: protected */
    public long b(long j2) {
        return (((long) this.i) * j2) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public void c(rj rjVar, zj zjVar) {
        this.c = rjVar;
        this.b = zjVar;
        h(true);
    }

    /* access modifiers changed from: protected */
    public void d(long j2) {
        this.g = j2;
    }

    /* access modifiers changed from: protected */
    public abstract long e(v vVar);

    /* access modifiers changed from: package-private */
    public final int f(nj njVar, wj wjVar) {
        int i2 = this.h;
        if (i2 == 0) {
            boolean z = true;
            while (z) {
                if (!this.a.d(njVar)) {
                    this.h = 3;
                    return -1;
                }
                this.k = njVar.e() - this.f;
                z = g(this.a.c(), this.f, this.j);
                if (z) {
                    this.f = njVar.e();
                }
            }
            d0 d0Var = this.j.a;
            this.i = d0Var.F;
            if (!this.m) {
                this.b.c(d0Var);
                this.m = true;
            }
            gl glVar = this.j.b;
            if (glVar != null) {
                this.d = glVar;
            } else if (njVar.c() == -1) {
                this.d = new c(null);
            } else {
                fl b2 = this.a.b();
                this.d = new bl(this, this.f, njVar.c(), (long) (b2.e + b2.f), b2.c, (b2.b & 4) != 0);
            }
            this.j = null;
            this.h = 2;
            this.a.f();
            return 0;
        } else if (i2 == 1) {
            njVar.l((int) this.f);
            this.h = 2;
            return 0;
        } else if (i2 == 2) {
            long a2 = this.d.a(njVar);
            if (a2 >= 0) {
                wjVar.a = a2;
                return 1;
            }
            if (a2 < -1) {
                d(-(a2 + 2));
            }
            if (!this.l) {
                this.c.j(this.d.b());
                this.l = true;
            }
            if (this.k > 0 || this.a.d(njVar)) {
                this.k = 0;
                v c2 = this.a.c();
                long e2 = e(c2);
                if (e2 >= 0) {
                    long j2 = this.g;
                    if (j2 + e2 >= this.e) {
                        long a3 = a(j2);
                        this.b.b(c2, c2.c());
                        this.b.d(a3, 1, c2.c(), 0, null);
                        this.e = -1;
                    }
                }
                this.g += e2;
                return 0;
            }
            this.h = 3;
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean g(v vVar, long j2, b bVar);

    /* access modifiers changed from: protected */
    public void h(boolean z) {
        if (z) {
            this.j = new b();
            this.f = 0;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1;
        this.g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void i(long j2, long j3) {
        this.a.e();
        if (j2 == 0) {
            h(!this.l);
        } else if (this.h != 0) {
            long j4 = (((long) this.i) * j3) / 1000000;
            this.e = j4;
            this.d.c(j4);
            this.h = 2;
        }
    }
}
