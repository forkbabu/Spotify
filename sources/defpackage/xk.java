package defpackage;

import com.google.android.exoplayer2.d0;

/* renamed from: xk  reason: default package */
public final class xk {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final d0 f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final yk[] k;

    public xk(int i2, int i3, long j2, long j3, long j4, d0 d0Var, int i4, yk[] ykVarArr, int i5, long[] jArr, long[] jArr2) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = d0Var;
        this.g = i4;
        this.k = ykVarArr;
        this.j = i5;
        this.h = jArr;
        this.i = jArr2;
    }

    public yk a(int i2) {
        yk[] ykVarArr = this.k;
        if (ykVarArr == null) {
            return null;
        }
        return ykVarArr[i2];
    }
}
