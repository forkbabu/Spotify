package defpackage;

import io.reactivex.functions.g;

/* renamed from: xm1  reason: default package */
public final /* synthetic */ class xm1 implements g {
    public final /* synthetic */ pn1 a;

    public /* synthetic */ xm1(pn1 pn1) {
        this.a = pn1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        pn1.i(this.a, ((Boolean) obj).booleanValue());
    }
}
