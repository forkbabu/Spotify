package defpackage;

import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: ujc  reason: default package */
final class ujc<T, R> implements l<onc, wjc> {
    final /* synthetic */ wjc a;

    ujc(wjc wjc) {
        this.a = wjc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public wjc apply(onc onc) {
        onc onc2 = onc;
        h.e(onc2, "it");
        return wjc.a(this.a, null, false, 0, onc2, 7);
    }
}
