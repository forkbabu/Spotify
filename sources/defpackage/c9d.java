package defpackage;

import defpackage.o8d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: c9d  reason: default package */
final class c9d<T, R> implements l<Throwable, o8d> {
    public static final c9d a = new c9d();

    c9d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o8d apply(Throwable th) {
        h.e(th, "it");
        return o8d.d.a;
    }
}
