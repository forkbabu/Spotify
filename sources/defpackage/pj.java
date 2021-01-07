package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.v;
import defpackage.zj;
import java.io.EOFException;

/* renamed from: pj  reason: default package */
public final class pj implements zj {
    @Override // defpackage.zj
    public int a(nj njVar, int i, boolean z) {
        int k = njVar.k(i);
        if (k != -1) {
            return k;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.zj
    public void b(v vVar, int i) {
        vVar.L(i);
    }

    @Override // defpackage.zj
    public void c(d0 d0Var) {
    }

    @Override // defpackage.zj
    public void d(long j, int i, int i2, int i3, zj.a aVar) {
    }
}
