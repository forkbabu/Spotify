package defpackage;

import io.reactivex.functions.l;

/* renamed from: in6  reason: default package */
public final /* synthetic */ class in6 implements l {
    public final /* synthetic */ bo6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ in6(bo6 bo6, String str) {
        this.a = bo6;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Boolean) obj);
    }
}
