package defpackage;

import com.google.android.exoplayer2.util.f0;
import defpackage.xj;

/* access modifiers changed from: package-private */
/* renamed from: sm  reason: default package */
public final class sm implements xj {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private int g = -1;
    private long h = -1;

    public sm(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public int a() {
        return this.b * this.e * this.a;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.f;
    }

    @Override // defpackage.xj
    public xj.a e(long j) {
        long j2 = this.h - ((long) this.g);
        int i = this.d;
        long i2 = f0.i((((((long) this.c) * j) / 1000000) / ((long) i)) * ((long) i), 0, j2 - ((long) i));
        long j3 = ((long) this.g) + i2;
        long i3 = i(j3);
        yj yjVar = new yj(i3, j3);
        if (i3 < j) {
            int i4 = this.d;
            if (i2 != j2 - ((long) i4)) {
                long j4 = j3 + ((long) i4);
                return new xj.a(yjVar, new yj(i(j4), j4));
            }
        }
        return new xj.a(yjVar);
    }

    public int f() {
        return this.a;
    }

    public long g() {
        return this.h;
    }

    @Override // defpackage.xj
    public boolean h() {
        return true;
    }

    public long i(long j) {
        return (Math.max(0L, j - ((long) this.g)) * 1000000) / ((long) this.c);
    }

    @Override // defpackage.xj
    public long j() {
        return (((this.h - ((long) this.g)) / ((long) this.d)) * 1000000) / ((long) this.b);
    }

    public int k() {
        return this.b;
    }

    public boolean l() {
        return this.g != -1;
    }

    public void m(int i, long j) {
        this.g = i;
        this.h = j;
    }
}
