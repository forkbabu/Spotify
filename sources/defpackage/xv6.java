package defpackage;

import io.reactivex.functions.l;

/* renamed from: xv6  reason: default package */
public final /* synthetic */ class xv6 implements l {
    public final /* synthetic */ fx6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ xv6(fx6 fx6, String str) {
        this.a = fx6;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Boolean) obj);
    }
}
