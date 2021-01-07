package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.internal.operators.maybe.o;
import io.reactivex.l;
import io.reactivex.p;
import io.reactivex.s;

/* renamed from: s4b  reason: default package */
public class s4b implements r4b {
    private final g6b a;
    private final e5b b;

    s4b(g6b g6b, e5b e5b) {
        this.a = g6b;
        this.b = e5b;
    }

    @Override // defpackage.r4b
    public s<b91> a(l<s7b> lVar, g gVar) {
        return lVar.g(new t2b(this, gVar)).v();
    }

    public p b(g gVar, s7b s7b) {
        l<d7b<b91>> O = this.a.a(s7b, gVar).O();
        s2b s2b = new s2b(s7b);
        O.getClass();
        return new o(O, s2b).l(this.b);
    }
}
