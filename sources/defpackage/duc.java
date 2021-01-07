package defpackage;

import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: duc  reason: default package */
final class duc<T, R> implements l<Throwable, xtc> {
    public static final duc a = new duc();

    duc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc apply(Throwable th) {
        h.e(th, "it");
        return new xtc.j(null, 1);
    }
}
