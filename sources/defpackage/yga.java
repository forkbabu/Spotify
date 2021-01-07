package defpackage;

import defpackage.rga;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: yga  reason: default package */
final class yga<T, R> implements l<tga, rga> {
    public static final yga a = new yga();

    yga() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public rga apply(tga tga) {
        tga tga2 = tga;
        h.e(tga2, "it");
        if (tga2.b()) {
            return rga.a.a;
        }
        return rga.c.a;
    }
}
