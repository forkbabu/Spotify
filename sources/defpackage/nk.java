package defpackage;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import defpackage.xj;

/* renamed from: nk  reason: default package */
final class nk implements lk {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    private nk(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1;
    }

    public static nk a(long j, long j2, vj vjVar, v vVar) {
        int B;
        int i = vjVar.g;
        int i2 = vjVar.d;
        int h = vVar.h();
        if ((h & 1) != 1 || (B = vVar.B()) == 0) {
            return null;
        }
        long K = f0.K((long) B, ((long) i) * 1000000, (long) i2);
        if ((h & 6) != 6) {
            return new nk(j2, vjVar.c, K, -1, null);
        }
        long B2 = (long) vVar.B();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) vVar.x();
        }
        int i4 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        return new nk(j2, vjVar.c, K, B2, jArr);
    }

    @Override // defpackage.xj
    public xj.a e(long j) {
        double d2;
        if (!h()) {
            return new xj.a(new yj(0, this.a + ((long) this.b)));
        }
        long i = f0.i(j, 0, this.c);
        double d3 = (double) i;
        Double.isNaN(d3);
        double d4 = (double) this.c;
        Double.isNaN(d4);
        double d5 = (d3 * 100.0d) / d4;
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 100.0d) {
                d6 = 256.0d;
            } else {
                int i2 = (int) d5;
                long[] jArr = this.f;
                jArr.getClass();
                double d7 = (double) jArr[i2];
                if (i2 == 99) {
                    d2 = 256.0d;
                } else {
                    d2 = (double) jArr[i2 + 1];
                }
                double d8 = (double) i2;
                Double.isNaN(d8);
                Double.isNaN(d7);
                Double.isNaN(d7);
                d6 = d7 + ((d2 - d7) * (d5 - d8));
            }
        }
        double d9 = (double) this.d;
        Double.isNaN(d9);
        return new xj.a(new yj(i, this.a + f0.i(Math.round((d6 / 256.0d) * d9), (long) this.b, this.d - 1)));
    }

    @Override // defpackage.lk
    public long g() {
        return this.e;
    }

    @Override // defpackage.xj
    public boolean h() {
        return this.f != null;
    }

    @Override // defpackage.lk
    public long i(long j) {
        long j2;
        double d2;
        long j3 = j - this.a;
        if (!h() || j3 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = this.f;
        jArr.getClass();
        double d3 = (double) j3;
        Double.isNaN(d3);
        Double.isNaN(d3);
        double d4 = (double) this.d;
        Double.isNaN(d4);
        Double.isNaN(d4);
        double d5 = (d3 * 256.0d) / d4;
        int d6 = f0.d(jArr, (long) d5, true, true);
        long j4 = this.c;
        long j5 = (((long) d6) * j4) / 100;
        long j6 = jArr[d6];
        int i = d6 + 1;
        long j7 = (j4 * ((long) i)) / 100;
        if (d6 == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j6 == j2) {
            d2 = 0.0d;
        } else {
            double d7 = (double) j6;
            Double.isNaN(d7);
            Double.isNaN(d7);
            double d8 = (double) (j2 - j6);
            Double.isNaN(d8);
            Double.isNaN(d8);
            d2 = (d5 - d7) / d8;
        }
        double d9 = (double) (j7 - j5);
        Double.isNaN(d9);
        Double.isNaN(d9);
        return Math.round(d2 * d9) + j5;
    }

    @Override // defpackage.xj
    public long j() {
        return this.c;
    }
}
