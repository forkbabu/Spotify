package defpackage;

import com.google.common.base.MoreObjects;
import defpackage.p2f;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: z4f  reason: default package */
public final /* synthetic */ class z4f implements l {
    public final /* synthetic */ cte a;

    public /* synthetic */ z4f(cte cte) {
        this.a = cte;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p2f.n nVar = (p2f.n) obj;
        return this.a.b(nVar.a()).B().g(s.i0(q2f.f(MoreObjects.nullToEmpty(nVar.b()))));
    }
}
