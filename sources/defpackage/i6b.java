package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.z;

/* renamed from: i6b  reason: default package */
public class i6b implements g6b {
    private final w5b a;

    public i6b(w5b w5b) {
        this.a = w5b;
    }

    @Override // defpackage.g6b
    public z<d7b<b91>> a(s7b s7b, g gVar) {
        gVar.getClass();
        if ((gVar instanceof g.b) || (gVar instanceof g.a)) {
            return z.z(d7b.a());
        }
        return this.a.a(s7b).A(new t5b(s7b));
    }
}
