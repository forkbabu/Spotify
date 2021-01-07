package defpackage;

import defpackage.gx1;
import defpackage.qx1;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: iy1  reason: default package */
public final class iy1<T> implements g<qx1.l> {
    final /* synthetic */ nmf a;
    final /* synthetic */ t31 b;

    iy1(nmf nmf, t31 t31) {
        this.a = nmf;
        this.b = t31;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(qx1.l lVar) {
        this.a.invoke(gx1.e.a);
        this.b.resume();
    }
}
