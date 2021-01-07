package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;

/* renamed from: po  reason: default package */
public abstract class po extends ho {
    public final long i;

    public po(k kVar, m mVar, d0 d0Var, int i2, Object obj, long j, long j2, long j3) {
        super(kVar, mVar, 1, d0Var, i2, obj, j, j2);
        d0Var.getClass();
        this.i = j3;
    }

    public long f() {
        long j = this.i;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    public abstract boolean g();
}
