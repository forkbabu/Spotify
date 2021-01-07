package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.util.g;

public abstract class v0 {
    public static final v0 a = new a();

    static class a extends v0 {
        a() {
        }

        @Override // com.google.android.exoplayer2.v0
        public int b(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.v0
        public b e(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.v0
        public int g() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.v0
        public Object j(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.v0
        public c l(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.v0
        public int m() {
            return 0;
        }
    }

    public static final class b {
        public Object a;
        public int b;
        public long c;
        private long d;
        private com.google.android.exoplayer2.source.ads.a e = com.google.android.exoplayer2.source.ads.a.e;

        public int a(int i) {
            return this.e.c[i].a;
        }

        public long b(int i, int i2) {
            a.C0088a aVar = this.e.c[i];
            if (aVar.a != -1) {
                return aVar.d[i2];
            }
            return -9223372036854775807L;
        }

        public int c(long j) {
            com.google.android.exoplayer2.source.ads.a aVar = this.e;
            long j2 = this.c;
            aVar.getClass();
            if (j == Long.MIN_VALUE) {
                return -1;
            }
            if (j2 != -9223372036854775807L && j >= j2) {
                return -1;
            }
            int i = 0;
            while (true) {
                long[] jArr = aVar.b;
                if (i >= jArr.length || jArr[i] == Long.MIN_VALUE || (j < jArr[i] && aVar.c[i].b())) {
                    break;
                }
                i++;
            }
            if (i < aVar.b.length) {
                return i;
            }
            return -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
            if (r10 < r7) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r10 >= r3) goto L_0x002e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(long r10) {
            /*
                r9 = this;
                com.google.android.exoplayer2.source.ads.a r0 = r9.e
                long[] r1 = r0.b
                int r1 = r1.length
                r2 = 1
                int r1 = r1 - r2
            L_0x0007:
                if (r1 < 0) goto L_0x0033
                r3 = -9223372036854775808
                r5 = 0
                int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r6 != 0) goto L_0x0011
                goto L_0x002e
            L_0x0011:
                long[] r6 = r0.b
                r7 = r6[r1]
                int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r6 != 0) goto L_0x0029
                long r3 = r0.d
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x002d
                int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r6 >= 0) goto L_0x002e
                goto L_0x002d
            L_0x0029:
                int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r3 >= 0) goto L_0x002e
            L_0x002d:
                r5 = 1
            L_0x002e:
                if (r5 == 0) goto L_0x0033
                int r1 = r1 + -1
                goto L_0x0007
            L_0x0033:
                if (r1 < 0) goto L_0x0040
                com.google.android.exoplayer2.source.ads.a$a[] r10 = r0.c
                r10 = r10[r1]
                boolean r10 = r10.b()
                if (r10 == 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r1 = -1
            L_0x0041:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.v0.b.d(long):int");
        }

        public long e(int i) {
            return this.e.b[i];
        }

        public long f() {
            this.e.getClass();
            return 0;
        }

        public int g(int i) {
            return this.e.c[i].a(-1);
        }

        public int h(int i, int i2) {
            return this.e.c[i].a(i2);
        }

        public long i() {
            return u.b(this.d);
        }

        public long j() {
            return this.d;
        }

        public boolean k(int i, int i2) {
            a.C0088a aVar = this.e.c[i];
            return (aVar.a == -1 || aVar.c[i2] == 0) ? false : true;
        }

        public b l(Object obj, Object obj2, int i, long j, long j2) {
            com.google.android.exoplayer2.source.ads.a aVar = com.google.android.exoplayer2.source.ads.a.e;
            this.a = obj2;
            this.b = i;
            this.c = j;
            this.d = j2;
            this.e = aVar;
            return this;
        }
    }

    public static final class c {
        public static final Object k = new Object();
        public Object a = k;
        public Object b;
        public Object c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;

        public long a() {
            return u.b(this.h);
        }
    }

    public int a() {
        return n() ? -1 : 0;
    }

    public abstract int b(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(int r2, com.google.android.exoplayer2.v0.b r3, com.google.android.exoplayer2.v0.c r4, int r5, boolean r6) {
        /*
            r1 = this;
            r6 = 0
            com.google.android.exoplayer2.v0$b r3 = r1.e(r2, r3, r6)
            int r3 = r3.b
            com.google.android.exoplayer2.v0$c r6 = r1.k(r3, r4)
            int r6 = r6.g
            r0 = 1
            if (r6 != r2) goto L_0x004f
            r2 = -1
            if (r5 == 0) goto L_0x0035
            if (r5 == r0) goto L_0x0045
            r6 = 2
            if (r5 != r6) goto L_0x002f
            boolean r5 = r1.n()
            if (r5 == 0) goto L_0x0020
            r5 = -1
            goto L_0x0025
        L_0x0020:
            int r5 = r1.m()
            int r5 = r5 + r2
        L_0x0025:
            if (r3 != r5) goto L_0x002c
            int r3 = r1.a()
            goto L_0x0045
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L_0x0035:
            boolean r5 = r1.n()
            if (r5 == 0) goto L_0x003d
            r5 = -1
            goto L_0x0042
        L_0x003d:
            int r5 = r1.m()
            int r5 = r5 + r2
        L_0x0042:
            if (r3 != r5) goto L_0x002c
            r3 = -1
        L_0x0045:
            if (r3 != r2) goto L_0x0048
            return r2
        L_0x0048:
            com.google.android.exoplayer2.v0$c r2 = r1.k(r3, r4)
            int r2 = r2.f
            return r2
        L_0x004f:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.v0.c(int, com.google.android.exoplayer2.v0$b, com.google.android.exoplayer2.v0$c, int, boolean):int");
    }

    public final b d(int i, b bVar) {
        return e(i, bVar, false);
    }

    public abstract b e(int i, b bVar, boolean z);

    public b f(Object obj, b bVar) {
        return e(b(obj), bVar, true);
    }

    public abstract int g();

    public final Pair<Object, Long> h(c cVar, b bVar, int i, long j) {
        Pair<Object, Long> i2 = i(cVar, bVar, i, j, 0);
        i2.getClass();
        return i2;
    }

    public final Pair<Object, Long> i(c cVar, b bVar, int i, long j, long j2) {
        g.f(i, 0, m());
        l(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f;
        long j3 = cVar.j + j;
        long j4 = e(i2, bVar, true).c;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < cVar.g) {
            j3 -= j4;
            i2++;
            j4 = e(i2, bVar, true).c;
        }
        Object obj = bVar.a;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(j3));
    }

    public abstract Object j(int i);

    public final c k(int i, c cVar) {
        return l(i, cVar, 0);
    }

    public abstract c l(int i, c cVar, long j);

    public abstract int m();

    public final boolean n() {
        return m() == 0;
    }
}
