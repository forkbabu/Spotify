package defpackage;

import com.google.android.exoplayer2.util.f0;
import defpackage.xj;

/* renamed from: kj  reason: default package */
public abstract class kj {
    protected final a a;
    protected final g b;
    protected d c;
    private final int d;

    /* renamed from: kj$a */
    public static class a implements xj {
        private final e a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        public a(e eVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = eVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        @Override // defpackage.xj
        public xj.a e(long j) {
            ((b) this.a).getClass();
            return new xj.a(new yj(j, d.h(j, this.c, this.d, this.e, this.f, this.g)));
        }

        @Override // defpackage.xj
        public boolean h() {
            return true;
        }

        @Override // defpackage.xj
        public long j() {
            return this.b;
        }

        public long k(long j) {
            ((b) this.a).getClass();
            return j;
        }
    }

    /* renamed from: kj$b */
    public static final class b implements e {
    }

    /* renamed from: kj$c */
    public static final class c {
    }

    /* access modifiers changed from: protected */
    /* renamed from: kj$d */
    public static class d {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = h(j2, j3, j4, j5, j6, j7);
        }

        static long a(d dVar) {
            return dVar.a;
        }

        static long b(d dVar) {
            return dVar.f;
        }

        static long c(d dVar) {
            return dVar.g;
        }

        static long d(d dVar) {
            return dVar.h;
        }

        static long e(d dVar) {
            return dVar.b;
        }

        static void f(d dVar, long j, long j2) {
            dVar.e = j;
            dVar.g = j2;
            dVar.h = h(dVar.b, dVar.d, j, dVar.f, j2, dVar.c);
        }

        static void g(d dVar, long j, long j2) {
            dVar.d = j;
            dVar.f = j2;
            dVar.h = h(dVar.b, j, dVar.e, j2, dVar.g, dVar.c);
        }

        protected static long h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return f0.i(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: kj$e */
    public interface e {
    }

    /* renamed from: kj$f */
    public static final class f {
        public static final f d = new f(-3, -9223372036854775807L, -1);
        private final int a;
        private final long b;
        private final long c;

        private f(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static f d(long j, long j2) {
            return new f(-1, j, j2);
        }

        public static f e(long j) {
            return new f(0, -9223372036854775807L, j);
        }

        public static f f(long j, long j2) {
            return new f(-2, j, j2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: kj$g */
    public interface g {
        f a(nj njVar, long j, c cVar);

        void b();
    }

    protected kj(e eVar, g gVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = gVar;
        this.d = i;
        this.a = new a(eVar, j, j2, j3, j4, j5, j6);
    }

    public final xj a() {
        return this.a;
    }

    public int b(nj njVar, wj wjVar, c cVar) {
        g gVar = this.b;
        gVar.getClass();
        while (true) {
            d dVar = this.c;
            dVar.getClass();
            long b2 = d.b(dVar);
            long c2 = d.c(dVar);
            long d2 = d.d(dVar);
            if (c2 - b2 <= ((long) this.d)) {
                d(false, b2);
                return e(njVar, b2, wjVar);
            } else if (!g(njVar, d2)) {
                return e(njVar, d2, wjVar);
            } else {
                njVar.j();
                f a2 = gVar.a(njVar, d.e(dVar), null);
                int i = a2.a;
                if (i == -3) {
                    d(false, d2);
                    return e(njVar, d2, wjVar);
                } else if (i == -2) {
                    d.g(dVar, a2.b, a2.c);
                } else if (i == -1) {
                    d.f(dVar, a2.b, a2.c);
                } else if (i == 0) {
                    d(true, a2.c);
                    g(njVar, a2.c);
                    return e(njVar, a2.c, wjVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    /* access modifiers changed from: protected */
    public final void d(boolean z, long j) {
        this.c = null;
        this.b.b();
    }

    /* access modifiers changed from: protected */
    public final int e(nj njVar, long j, wj wjVar) {
        if (j == njVar.e()) {
            return 0;
        }
        wjVar.a = j;
        return 1;
    }

    public final void f(long j) {
        d dVar = this.c;
        if (dVar == null || d.a(dVar) != j) {
            this.a.k(j);
            this.c = new d(j, j, this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean g(nj njVar, long j) {
        long e2 = j - njVar.e();
        if (e2 < 0 || e2 > 262144) {
            return false;
        }
        njVar.l((int) e2);
        return true;
    }
}
