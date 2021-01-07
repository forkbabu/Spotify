package defpackage;

import com.google.common.base.MoreObjects;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: y4b  reason: default package */
public class y4b implements l<a7b, g<b91>> {
    private final u7b a;
    private final a5b b;
    private final o1e<b91> c;
    private final g<b91> f;

    y4b(u7b u7b, a5b a5b, o1e<b91> o1e, g<b91> gVar) {
        this.a = u7b;
        this.b = a5b;
        this.c = o1e;
        this.f = gVar;
    }

    /* renamed from: a */
    public g<b91> apply(a7b a7b) {
        if (e8b.a(MoreObjects.nullToEmpty(a7b.c().g())).isEmpty()) {
            return this.f;
        }
        return this.a.a(a7b.c()).v().W(new w2b(this, a7b), false, Integer.MAX_VALUE).q(this.c).Y0(BackpressureStrategy.LATEST);
    }

    public /* synthetic */ v b(a7b a7b, s7b s7b) {
        return (s) this.b.a(s7b, a7b.a());
    }
}
