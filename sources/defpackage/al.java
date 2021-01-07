package defpackage;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;

/* renamed from: al  reason: default package */
final class al {
    public final xk a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public al(xk xkVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        g.a(iArr.length == jArr2.length);
        g.a(jArr.length == jArr2.length);
        g.a(iArr2.length == jArr2.length ? true : z);
        this.a = xkVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int d2 = f0.d(this.f, j, true, false); d2 >= 0; d2--) {
            if ((this.g[d2] & 1) != 0) {
                return d2;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int b2 = f0.b(this.f, j, true, false); b2 < this.f.length; b2++) {
            if ((this.g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
