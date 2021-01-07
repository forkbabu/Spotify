package defpackage;

import defpackage.wb9;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: ec9  reason: default package */
public final /* synthetic */ class ec9 implements l {
    public final /* synthetic */ s a;
    public final /* synthetic */ lb9 b;

    public /* synthetic */ ec9(s sVar, lb9 lb9) {
        this.a = sVar;
        this.b = lb9;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        wb9.a aVar = (wb9.a) obj;
        return this.a.j0(new ic9(this.b));
    }
}
