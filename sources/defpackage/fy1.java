package defpackage;

import defpackage.gx1;
import defpackage.qx1;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: fy1  reason: default package */
public final class fy1<T> implements g<qx1.j> {
    final /* synthetic */ nmf a;
    final /* synthetic */ t31 b;

    fy1(nmf nmf, t31 t31) {
        this.a = nmf;
        this.b = t31;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(qx1.j jVar) {
        this.a.invoke(gx1.d.a);
        this.b.pause();
    }
}
