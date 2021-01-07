package defpackage;

import defpackage.rad;
import io.reactivex.functions.g;

/* renamed from: qad  reason: default package */
final class qad<T> implements g<Throwable> {
    final /* synthetic */ rad.a a;

    qad(rad.a aVar) {
        this.a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        oad.e(this.a.a.a, th.getMessage());
    }
}
