package defpackage;

import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: ouc  reason: default package */
final class ouc<T, R> implements l<Throwable, xtc.i> {
    public static final ouc a = new ouc();

    ouc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc.i apply(Throwable th) {
        h.e(th, "it");
        return new xtc.i(null, 1);
    }
}
