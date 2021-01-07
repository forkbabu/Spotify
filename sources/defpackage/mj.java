package defpackage;

import com.google.android.exoplayer2.util.f0;
import defpackage.xj;

/* renamed from: mj  reason: default package */
public class mj implements xj {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public mj(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1;
            this.f = -9223372036854775807L;
            return;
        }
        this.d = j - j2;
        this.f = b(j, j2, i);
    }

    private static long b(long j, long j2, int i) {
        return ((Math.max(0L, j - j2) * 8) * 1000000) / ((long) i);
    }

    public long a(long j) {
        return b(j, this.b, this.e);
    }

    @Override // defpackage.xj
    public xj.a e(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            return new xj.a(new yj(0, this.b));
        }
        long j3 = (long) this.c;
        long i = this.b + f0.i((((((long) this.e) * j) / 8000000) / j3) * j3, 0, j2 - j3);
        long a2 = a(i);
        yj yjVar = new yj(a2, i);
        if (a2 < j) {
            int i2 = this.c;
            if (((long) i2) + i < this.a) {
                long j4 = i + ((long) i2);
                return new xj.a(yjVar, new yj(a(j4), j4));
            }
        }
        return new xj.a(yjVar);
    }

    @Override // defpackage.xj
    public boolean h() {
        return this.d != -1;
    }

    @Override // defpackage.xj
    public long j() {
        return this.f;
    }
}
