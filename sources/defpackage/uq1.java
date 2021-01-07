package defpackage;

import io.reactivex.functions.g;

/* renamed from: uq1  reason: default package */
public final /* synthetic */ class uq1 implements g {
    public final /* synthetic */ zr1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ uq1(zr1 zr1, int i) {
        this.a = zr1;
        this.b = i;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k(this.b, (String) obj);
    }
}
