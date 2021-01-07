package defpackage;

import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: sx3  reason: default package */
public final /* synthetic */ class sx3 implements l {
    public final /* synthetic */ zy3 a;
    public final /* synthetic */ s b;

    public /* synthetic */ sx3(zy3 zy3, s sVar) {
        this.a = zy3;
        this.b = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Boolean) obj);
    }
}
