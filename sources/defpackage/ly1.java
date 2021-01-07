package defpackage;

import defpackage.gx1;
import defpackage.qx1;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: ly1  reason: default package */
public final class ly1<T> implements g<qx1.i> {
    final /* synthetic */ nmf a;

    ly1(nmf nmf) {
        this.a = nmf;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(qx1.i iVar) {
        this.a.invoke(new gx1.g(iVar.a()));
    }
}
