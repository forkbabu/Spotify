package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.v0;

public final class d0 extends v0 {
    private static final Object m = new Object();
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final Object k;
    private final Object l;

    public d0(long j2, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, j2, j2, 0, 0, z, z2, z3, obj, obj2);
    }

    @Override // com.google.android.exoplayer2.v0
    public int b(Object obj) {
        return m.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.v0
    public v0.b e(int i2, v0.b bVar, boolean z) {
        g.f(i2, 0, 1);
        bVar.l(null, z ? m : null, 0, this.d, -this.f);
        return bVar;
    }

    @Override // com.google.android.exoplayer2.v0
    public int g() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.v0
    public Object j(int i2) {
        g.f(i2, 0, 1);
        return m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 > r5) goto L_0x001c;
     */
    @Override // com.google.android.exoplayer2.v0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.v0.c l(int r10, com.google.android.exoplayer2.v0.c r11, long r12) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.google.android.exoplayer2.util.g.f(r10, r0, r1)
            long r1 = r9.g
            boolean r10 = r9.i
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r10 == 0) goto L_0x0024
            r5 = 0
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0024
            long r5 = r9.e
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x001e
        L_0x001c:
            r1 = r3
            goto L_0x0024
        L_0x001e:
            long r1 = r1 + r12
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x0024
            goto L_0x001c
        L_0x0024:
            java.lang.Object r12 = com.google.android.exoplayer2.v0.c.k
            java.lang.Object r13 = r9.k
            java.lang.Object r3 = r9.l
            boolean r4 = r9.j
            long r5 = r9.e
            long r7 = r9.f
            r11.a = r12
            r11.b = r13
            r11.c = r3
            r11.d = r10
            r11.e = r4
            r11.h = r1
            r11.i = r5
            r11.f = r0
            r11.g = r0
            r11.j = r7
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.d0.l(int, com.google.android.exoplayer2.v0$c, long):com.google.android.exoplayer2.v0$c");
    }

    @Override // com.google.android.exoplayer2.v0
    public int m() {
        return 1;
    }

    public d0(long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.l = obj;
        this.k = obj2;
    }
}
