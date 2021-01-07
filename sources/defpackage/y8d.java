package defpackage;

import defpackage.o8d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: y8d  reason: default package */
final class y8d<T, R> implements l<Throwable, o8d.b> {
    public static final y8d a = new y8d();

    y8d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o8d.b apply(Throwable th) {
        h.e(th, "it");
        return new o8d.b(false);
    }
}
