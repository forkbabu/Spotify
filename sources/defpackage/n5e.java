package defpackage;

import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* renamed from: n5e  reason: default package */
final class n5e<T> implements n<Boolean> {
    public static final n5e a = new n5e();

    n5e() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "granted");
        return bool2.booleanValue();
    }
}
