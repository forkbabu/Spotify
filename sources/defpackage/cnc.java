package defpackage;

import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: cnc  reason: default package */
final class cnc<T, R> implements l<zwd, jnc> {
    final /* synthetic */ bnc a;

    cnc(bnc bnc) {
        this.a = bnc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public jnc apply(zwd zwd) {
        zwd zwd2 = zwd;
        h.e(zwd2, "it");
        return bnc.e(this.a, zwd2);
    }
}
