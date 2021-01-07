package defpackage;

import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.Collections;
import java.util.List;

/* renamed from: jp  reason: default package */
final class jp implements d {
    private final a[] a;
    private final long[] b;

    public jp(a[] aVarArr, long[] jArr) {
        this.a = aVarArr;
        this.b = jArr;
    }

    @Override // com.google.android.exoplayer2.text.d
    public int d(long j) {
        int b2 = f0.b(this.b, j, false, false);
        if (b2 < this.b.length) {
            return b2;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.d
    public List<a> g(long j) {
        int d = f0.d(this.b, j, true, false);
        if (d != -1) {
            a[] aVarArr = this.a;
            if (aVarArr[d] != a.n) {
                return Collections.singletonList(aVarArr[d]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.text.d
    public long h(int i) {
        boolean z = true;
        g.a(i >= 0);
        if (i >= this.b.length) {
            z = false;
        }
        g.a(z);
        return this.b[i];
    }

    @Override // com.google.android.exoplayer2.text.d
    public int i() {
        return this.b.length;
    }
}
