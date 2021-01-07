package defpackage;

import defpackage.af2;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: ye2  reason: default package */
public final class ye2<T, R> implements l<Throwable, af2> {
    public static final ye2 a = new ye2();

    ye2() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public af2 apply(Throwable th) {
        h.e(th, "it");
        return af2.a.a;
    }
}
