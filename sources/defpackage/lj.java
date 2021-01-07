package defpackage;

import com.google.android.exoplayer2.util.f0;
import defpackage.xj;
import java.util.Arrays;

/* renamed from: lj  reason: default package */
public final class lj implements xj {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public lj(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0;
        }
    }

    @Override // defpackage.xj
    public xj.a e(long j) {
        int d2 = f0.d(this.e, j, true, true);
        long[] jArr = this.e;
        long j2 = jArr[d2];
        long[] jArr2 = this.c;
        yj yjVar = new yj(j2, jArr2[d2]);
        if (j2 >= j || d2 == this.a - 1) {
            return new xj.a(yjVar);
        }
        int i = d2 + 1;
        return new xj.a(yjVar, new yj(jArr[i], jArr2[i]));
    }

    @Override // defpackage.xj
    public boolean h() {
        return true;
    }

    @Override // defpackage.xj
    public long j() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ChunkIndex(length=");
        V0.append(this.a);
        V0.append(", sizes=");
        V0.append(Arrays.toString(this.b));
        V0.append(", offsets=");
        V0.append(Arrays.toString(this.c));
        V0.append(", timeUs=");
        V0.append(Arrays.toString(this.e));
        V0.append(", durationsUs=");
        V0.append(Arrays.toString(this.d));
        V0.append(")");
        return V0.toString();
    }
}
