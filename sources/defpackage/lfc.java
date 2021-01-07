package defpackage;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: lfc  reason: default package */
public final class lfc<T> implements g<Throwable> {
    final /* synthetic */ gfc a;

    lfc(gfc gfc) {
        this.a = gfc;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "t");
        this.a.i.onError(th2);
    }
}
