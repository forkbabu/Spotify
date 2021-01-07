package defpackage;

import defpackage.d7a;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: i6a  reason: default package */
final class i6a<T, R> implements l<d7a, Boolean> {
    public static final i6a a = new i6a();

    i6a() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Boolean apply(d7a d7a) {
        d7a d7a2 = d7a;
        h.e(d7a2, "it");
        return Boolean.valueOf(d7a2 instanceof d7a.a);
    }
}
