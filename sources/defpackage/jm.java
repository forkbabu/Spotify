package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.v;
import defpackage.om;
import java.util.List;

/* renamed from: jm  reason: default package */
public final class jm {
    private final List<d0> a;
    private final zj[] b;

    public jm(List<d0> list) {
        this.a = list;
        this.b = new zj[list.size()];
    }

    public void a(long j, v vVar) {
        yo.a(j, vVar, this.b);
    }

    public void b(rj rjVar, om.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            zj s = rjVar.s(dVar.c(), 3);
            d0 d0Var = this.a.get(i);
            String str = d0Var.r;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            g.b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = d0Var.a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            s.c(d0.v(str2, str, null, -1, d0Var.c, d0Var.J, d0Var.K, null, Long.MAX_VALUE, d0Var.t));
            this.b[i] = s;
        }
    }
}
