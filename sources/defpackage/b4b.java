package defpackage;

import io.reactivex.g;

/* renamed from: b4b  reason: default package */
public class b4b {
    private final g<y6b> a;
    private final g<y6b> b;

    public b4b(g<y6b> gVar, g<y6b> gVar2) {
        this.a = gVar;
        this.b = gVar2;
    }

    public g<y6b> a() {
        return g.P(this.a, this.b).b0(y6b.a(20));
    }
}
