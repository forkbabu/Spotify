package defpackage;

import io.reactivex.functions.n;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: yg7  reason: default package */
final class yg7<T> implements n<v<Boolean>> {
    public static final yg7 a = new yg7();

    yg7() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(v<Boolean> vVar) {
        v<Boolean> vVar2 = vVar;
        h.e(vVar2, "response");
        return vVar2.f() && vVar2.a() != null;
    }
}
