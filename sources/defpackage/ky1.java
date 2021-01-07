package defpackage;

import defpackage.gx1;
import defpackage.qx1;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: ky1  reason: default package */
public final class ky1<T> implements g<qx1.n> {
    final /* synthetic */ t31 a;
    final /* synthetic */ nmf b;
    final /* synthetic */ nmf c;

    ky1(t31 t31, nmf nmf, nmf nmf2) {
        this.a = t31;
        this.b = nmf;
        this.c = nmf2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(qx1.n nVar) {
        qx1.n nVar2 = nVar;
        this.a.pause();
        this.b.invoke(Integer.valueOf(nVar2.a()));
        this.c.invoke(new gx1.f(nVar2.a()));
    }
}
