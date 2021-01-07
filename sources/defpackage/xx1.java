package defpackage;

import defpackage.rx1;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: xx1  reason: default package */
final class xx1<T, R> implements l<px1, rx1> {
    public static final xx1 a = new xx1();

    xx1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public rx1 apply(px1 px1) {
        px1 px12 = px1;
        h.e(px12, "status");
        return new rx1.c(px12);
    }
}
