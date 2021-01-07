package defpackage;

import defpackage.onc;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* renamed from: tjc  reason: default package */
final class tjc<T> implements n<onc> {
    public static final tjc a = new tjc();

    tjc() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(onc onc) {
        onc onc2 = onc;
        h.e(onc2, "it");
        return !(onc2 instanceof onc.b);
    }
}
