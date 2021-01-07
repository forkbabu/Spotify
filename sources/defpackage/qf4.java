package defpackage;

import defpackage.ne4;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;

/* renamed from: qf4  reason: default package */
public class qf4 {
    private final ne4.b a;
    private final oe4 b;
    private final sf4 c;
    private final t54 d;

    qf4(ne4.b bVar, oe4 oe4, sf4 sf4, t54 t54) {
        this.a = bVar;
        this.b = oe4;
        this.c = sf4;
        this.d = t54;
    }

    public /* synthetic */ ne4.b a(me4 me4) {
        ne4.b bVar = this.a;
        bVar.b();
        return bVar;
    }

    public /* synthetic */ tpf b(ne4.b bVar) {
        return this.b.a(bVar.a());
    }

    public g<b91> c(me4 me4) {
        g N = g.N(me4);
        sf4 sf4 = this.c;
        t54 t54 = this.d;
        sf4.getClass();
        return g.P(N, g.p(new td4(me4, t54), BackpressureStrategy.LATEST)).O(new sd4(this)).f0(new rd4(this));
    }
}
