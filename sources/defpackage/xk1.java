package defpackage;

import io.reactivex.functions.l;

/* renamed from: xk1  reason: default package */
public final /* synthetic */ class xk1 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ xk1(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.equals((String) obj));
    }
}
