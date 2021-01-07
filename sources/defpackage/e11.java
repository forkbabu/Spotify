package defpackage;

import io.reactivex.functions.l;

/* renamed from: e11  reason: default package */
public final /* synthetic */ class e11 implements l {
    public final /* synthetic */ g11 a;
    public final /* synthetic */ String b;

    public /* synthetic */ e11(g11 g11, String str) {
        this.a = g11;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (Throwable) obj);
    }
}
