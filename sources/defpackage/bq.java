package defpackage;

import android.os.SystemClock;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: bq  reason: default package */
public abstract class bq implements gq {
    protected final e0 a;
    protected final int b;
    protected final int[] c;
    private final d0[] d;
    private final long[] e;
    private int f;

    /* renamed from: bq$b */
    private static final class b implements Comparator<d0> {
        b(a aVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(d0 d0Var, d0 d0Var2) {
            return d0Var2.n - d0Var.n;
        }
    }

    public bq(e0 e0Var, int... iArr) {
        int i = 0;
        g.m(iArr.length > 0);
        e0Var.getClass();
        this.a = e0Var;
        int length = iArr.length;
        this.b = length;
        this.d = new d0[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = e0Var.a(iArr[i2]);
        }
        Arrays.sort(this.d, new b(null));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = e0Var.b(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // defpackage.gq
    public void a() {
    }

    @Override // defpackage.gq
    public final boolean c(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean r = r(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !r) {
            r = i2 != i && !r(i2, elapsedRealtime);
            i2++;
        }
        if (!r) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        long j3 = Long.MAX_VALUE;
        int i3 = f0.a;
        long j4 = elapsedRealtime + j;
        if (((j ^ j4) & (elapsedRealtime ^ j4)) >= 0) {
            j3 = j4;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // defpackage.gq
    public final d0 d(int i) {
        return this.d[i];
    }

    @Override // defpackage.gq
    public final int e(int i) {
        return this.c[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bq bqVar = (bq) obj;
        if (this.a != bqVar.a || !Arrays.equals(this.c, bqVar.c)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gq
    public void f(float f2) {
    }

    @Override // defpackage.gq
    public /* synthetic */ void h() {
        fq.a(this);
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.gq
    public final int i(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.gq
    public final e0 j() {
        return this.a;
    }

    @Override // defpackage.gq
    public void k() {
    }

    @Override // defpackage.gq
    public int l(long j, List<? extends po> list) {
        return list.size();
    }

    @Override // defpackage.gq
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.gq
    public final int n() {
        return this.c[b()];
    }

    @Override // defpackage.gq
    public final d0 o() {
        return this.d[b()];
    }

    public final int q(d0 d0Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == d0Var) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final boolean r(int i, long j) {
        return this.e[i] > j;
    }
}
