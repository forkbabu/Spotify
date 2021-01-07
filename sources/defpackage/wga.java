package defpackage;

import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

/* renamed from: wga  reason: default package */
final class wga<T, R> implements l<uga, v<? extends tga>> {
    public static final wga a = new wga();

    wga() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends tga> apply(uga uga) {
        uga uga2 = uga;
        h.e(uga2, "it");
        return s.d0(uga2.a());
    }
}
