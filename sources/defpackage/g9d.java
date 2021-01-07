package defpackage;

import defpackage.o8d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: g9d  reason: default package */
final class g9d<T, R> implements l<Throwable, o8d.i> {
    public static final g9d a = new g9d();

    g9d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o8d.i apply(Throwable th) {
        h.e(th, "it");
        return new o8d.i(false);
    }
}
