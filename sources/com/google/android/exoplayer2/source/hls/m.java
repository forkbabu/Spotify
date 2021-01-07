package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.util.g;

/* access modifiers changed from: package-private */
public final class m implements b0 {
    private final int a;
    private final n b;
    private int c = -1;

    public m(n nVar, int i) {
        this.b = nVar;
        this.a = i;
    }

    private boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public void a() {
        g.a(this.c == -1);
        this.c = this.b.w(this.a);
    }

    public void c() {
        if (this.c != -1) {
            this.b.V(this.a);
            this.c = -1;
        }
    }

    @Override // com.google.android.exoplayer2.source.b0
    public boolean d() {
        return this.c == -3 || (b() && this.b.F(this.c));
    }

    @Override // com.google.android.exoplayer2.source.b0
    public void j() {
        int i = this.c;
        if (i == -2) {
            throw new SampleQueueMappingException(this.b.t().a(this.a).a(0).r);
        } else if (i == -1) {
            this.b.J();
        } else if (i != -3) {
            this.b.K(i);
        }
    }

    @Override // com.google.android.exoplayer2.source.b0
    public int q(e0 e0Var, fj fjVar, boolean z) {
        if (this.c == -3) {
            fjVar.addFlag(4);
            return -4;
        } else if (b()) {
            return this.b.N(this.c, e0Var, fjVar, z);
        } else {
            return -3;
        }
    }

    @Override // com.google.android.exoplayer2.source.b0
    public int s(long j) {
        if (b()) {
            return this.b.U(this.c, j);
        }
        return 0;
    }
}
