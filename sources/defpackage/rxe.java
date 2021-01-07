package defpackage;

import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: rxe  reason: default package */
public final /* synthetic */ class rxe implements l {
    public final /* synthetic */ cte a;

    public /* synthetic */ rxe(cte cte) {
        this.a = cte;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        uue.m mVar = (uue.m) obj;
        return this.a.b(mVar.b()).B().g(s.i0(vue.h(mVar.a())));
    }
}
