package defpackage;

import io.reactivex.functions.l;

/* renamed from: kec  reason: default package */
public final /* synthetic */ class kec implements l {
    public final /* synthetic */ nec a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ kec(nec nec, int i, int i2) {
        this.a = nec;
        this.b = i;
        this.c = i2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, (Boolean) obj);
    }
}
