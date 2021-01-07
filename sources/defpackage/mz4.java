package defpackage;

import defpackage.gz4;
import defpackage.iz4;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: mz4  reason: default package */
final class mz4<T, R> implements l<Throwable, iz4> {
    public static final mz4 a = new mz4();

    mz4() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public iz4 apply(Throwable th) {
        h.e(th, "it");
        return new iz4.c(gz4.b.a);
    }
}
