package defpackage;

import defpackage.vy1;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: az1  reason: default package */
final class az1<T, R> implements l<wy1, vy1.c> {
    public static final az1 a = new az1();

    az1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public vy1.c apply(wy1 wy1) {
        wy1 wy12 = wy1;
        h.e(wy12, "status");
        return new vy1.c(wy12);
    }
}
