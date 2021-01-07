package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.f0;
import defpackage.xj;

/* renamed from: jk  reason: default package */
final class jk implements lk {
    private final long[] a;
    private final long[] b;
    private final long c;

    private jk(long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = u.a(jArr2[jArr2.length - 1]);
    }

    public static jk a(long j, qn qnVar) {
        int length = qnVar.n.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j2 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (qnVar.c + qnVar.n[i3]);
            j2 += (long) (qnVar.f + qnVar.o[i3]);
            jArr[i2] = j;
            jArr2[i2] = j2;
        }
        return new jk(jArr, jArr2);
    }

    private static Pair<Long, Long> b(long j, long[] jArr, long[] jArr2) {
        double d;
        int d2 = f0.d(jArr, j, true, true);
        long j2 = jArr[d2];
        long j3 = jArr2[d2];
        int i = d2 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d3 = (double) j;
            double d4 = (double) j2;
            Double.isNaN(d3);
            Double.isNaN(d4);
            double d5 = (double) (j4 - j2);
            Double.isNaN(d5);
            d = (d3 - d4) / d5;
        }
        double d6 = (double) (j5 - j3);
        Double.isNaN(d6);
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * d6)) + j3));
    }

    @Override // defpackage.xj
    public xj.a e(long j) {
        Pair<Long, Long> b2 = b(u.b(f0.i(j, 0, this.c)), this.b, this.a);
        return new xj.a(new yj(u.a(((Long) b2.first).longValue()), ((Long) b2.second).longValue()));
    }

    @Override // defpackage.lk
    public long g() {
        return -1;
    }

    @Override // defpackage.xj
    public boolean h() {
        return true;
    }

    @Override // defpackage.lk
    public long i(long j) {
        return u.a(((Long) b(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.xj
    public long j() {
        return this.c;
    }
}
