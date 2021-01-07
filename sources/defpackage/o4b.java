package defpackage;

import io.reactivex.g;
import io.reactivex.k;

/* renamed from: o4b  reason: default package */
public class o4b implements n4b {
    private final g4b a;
    private final k<b91, b91> b;

    public o4b(g4b g4b, k<b91, b91> kVar) {
        this.a = g4b;
        this.b = kVar;
    }

    @Override // defpackage.n4b
    public g<b91> c() {
        return this.a.c().l(this.b);
    }
}
