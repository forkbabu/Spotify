package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.v;
import defpackage.om;
import java.util.List;

/* renamed from: qm  reason: default package */
final class qm {
    private final List<d0> a;
    private final zj[] b;

    public qm(List<d0> list) {
        this.a = list;
        this.b = new zj[list.size()];
    }

    public void a(long j, v vVar) {
        if (vVar.a() >= 9) {
            int h = vVar.h();
            int h2 = vVar.h();
            int x = vVar.x();
            if (h == 434 && h2 == 1195456820 && x == 3) {
                yo.b(j, vVar, this.b);
            }
        }
    }

    public void b(rj rjVar, om.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            zj s = rjVar.s(dVar.c(), 3);
            d0 d0Var = this.a.get(i);
            String str = d0Var.r;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            g.b(z, "Invalid closed caption mime type provided: " + str);
            s.c(d0.v(dVar.b(), str, null, -1, d0Var.c, d0Var.J, d0Var.K, null, Long.MAX_VALUE, d0Var.t));
            this.b[i] = s;
        }
    }
}
