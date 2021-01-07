package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;

/* renamed from: eo  reason: default package */
public abstract class eo extends po {
    public final long j;
    public final long k;
    private go l;
    private int[] m;

    public eo(k kVar, m mVar, d0 d0Var, int i, Object obj, long j2, long j3, long j4, long j5, long j6) {
        super(kVar, mVar, d0Var, i, obj, j2, j3, j6);
        this.j = j4;
        this.k = j5;
    }

    public final int h(int i) {
        return this.m[i];
    }

    /* access modifiers changed from: protected */
    public final go i() {
        return this.l;
    }

    public void j(go goVar) {
        this.l = goVar;
        this.m = goVar.a();
    }
}
