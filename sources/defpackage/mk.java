package defpackage;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import defpackage.xj;

/* renamed from: mk  reason: default package */
final class mk implements lk {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    private mk(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static mk a(long j, long j2, vj vjVar, v vVar) {
        int i;
        vVar.L(10);
        int h = vVar.h();
        if (h <= 0) {
            return null;
        }
        int i2 = vjVar.d;
        long K = f0.K((long) h, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int D = vVar.D();
        int D2 = vVar.D();
        int D3 = vVar.D();
        vVar.L(2);
        long j3 = j2 + ((long) vjVar.c);
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        int i3 = 0;
        long j4 = j2;
        while (i3 < D) {
            jArr[i3] = (((long) i3) * K) / ((long) D);
            jArr2[i3] = Math.max(j4, j3);
            if (D3 == 1) {
                i = vVar.x();
            } else if (D3 == 2) {
                i = vVar.D();
            } else if (D3 == 3) {
                i = vVar.A();
            } else if (D3 != 4) {
                return null;
            } else {
                i = vVar.B();
            }
            j4 += (long) (i * D2);
            i3++;
            j3 = j3;
            D2 = D2;
        }
        int i4 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        return new mk(jArr, jArr2, K, j4);
    }

    @Override // defpackage.xj
    public xj.a e(long j) {
        int d2 = f0.d(this.a, j, true, true);
        long[] jArr = this.a;
        long j2 = jArr[d2];
        long[] jArr2 = this.b;
        yj yjVar = new yj(j2, jArr2[d2]);
        if (j2 >= j || d2 == jArr.length - 1) {
            return new xj.a(yjVar);
        }
        int i = d2 + 1;
        return new xj.a(yjVar, new yj(jArr[i], jArr2[i]));
    }

    @Override // defpackage.lk
    public long g() {
        return this.d;
    }

    @Override // defpackage.xj
    public boolean h() {
        return true;
    }

    @Override // defpackage.lk
    public long i(long j) {
        return this.a[f0.d(this.b, j, true, true)];
    }

    @Override // defpackage.xj
    public long j() {
        return this.c;
    }
}
