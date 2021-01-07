package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: km  reason: default package */
public final class km implements hm {
    private e0 a;
    private zj b;
    private boolean c;

    @Override // defpackage.hm
    public void a(e0 e0Var, rj rjVar, om.d dVar) {
        this.a = e0Var;
        dVar.a();
        zj s = rjVar.s(dVar.c(), 4);
        this.b = s;
        s.c(d0.s(dVar.b(), "application/x-scte35", null, -1, null));
    }

    @Override // defpackage.hm
    public void b(v vVar) {
        if (!this.c) {
            if (this.a.e() != -9223372036854775807L) {
                this.b.c(d0.r(null, "application/x-scte35", this.a.e()));
                this.c = true;
            } else {
                return;
            }
        }
        int a2 = vVar.a();
        this.b.b(vVar, a2);
        this.b.d(this.a.d(), 1, a2, 0, null);
    }
}
