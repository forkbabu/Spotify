package defpackage;

import defpackage.rga;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: zga  reason: default package */
final class zga<T, R> implements l<Throwable, rga> {
    public static final zga a = new zga();

    zga() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public rga apply(Throwable th) {
        h.e(th, "it");
        return rga.b.a;
    }
}
