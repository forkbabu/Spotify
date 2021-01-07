package defpackage;

import io.reactivex.functions.l;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: zg7  reason: default package */
final class zg7<T, R> implements l<v<Boolean>, gg7> {
    public static final zg7 a = new zg7();

    zg7() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public gg7 apply(v<Boolean> vVar) {
        v<Boolean> vVar2 = vVar;
        h.e(vVar2, "response");
        Boolean a2 = vVar2.a();
        if (a2 == null) {
            a2 = Boolean.FALSE;
        }
        h.d(a2, "response.body() ?: false");
        return new mg7(a2.booleanValue());
    }
}
