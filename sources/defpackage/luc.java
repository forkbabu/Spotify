package defpackage;

import defpackage.auc;
import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: luc  reason: default package */
final class luc<T, R> implements l<Throwable, xtc> {
    public static final luc a = new luc();

    luc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc apply(Throwable th) {
        h.e(th, "it");
        return new xtc.d(auc.b.a);
    }
}
