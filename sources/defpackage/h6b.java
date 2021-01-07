package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.z;

/* renamed from: h6b  reason: default package */
public class h6b implements g6b {
    private final l6b a;
    private final sg0<jua, b91> b;

    public h6b(l6b l6b, sg0<jua, b91> sg0) {
        this.a = l6b;
        this.b = sg0;
    }

    @Override // defpackage.g6b
    public z<d7b<b91>> a(s7b s7b, g gVar) {
        gVar.getClass();
        if ((gVar instanceof g.b) || (gVar instanceof g.a)) {
            return z.z(d7b.a());
        }
        z<R> A = this.a.a(s7b).A(new r5b(s7b));
        sg0<jua, b91> sg0 = this.b;
        sg0.getClass();
        return A.A(new m5b(sg0)).A(new s5b(s7b));
    }
}
