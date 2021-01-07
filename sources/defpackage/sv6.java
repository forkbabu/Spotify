package defpackage;

import io.reactivex.functions.l;

/* renamed from: sv6  reason: default package */
public final /* synthetic */ class sv6 implements l {
    public final /* synthetic */ dx6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ sv6(dx6 dx6, String str) {
        this.a = dx6;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Boolean) obj);
    }
}
