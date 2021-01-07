package defpackage;

import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: u2d  reason: default package */
final class u2d<T, R> implements l<h1d, szc> {
    public static final u2d a = new u2d();

    u2d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public szc apply(h1d h1d) {
        h1d h1d2 = h1d;
        h.e(h1d2, "response");
        return szc.b(k8e.a(h1d2.a()), l8e.a(h1d2.b()));
    }
}
