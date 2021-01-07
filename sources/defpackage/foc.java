package defpackage;

import io.reactivex.functions.l;

/* renamed from: foc  reason: default package */
public final /* synthetic */ class foc implements l {
    public final /* synthetic */ goc a;

    public /* synthetic */ foc(goc goc) {
        this.a = goc;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(((Integer) obj).intValue());
    }
}
