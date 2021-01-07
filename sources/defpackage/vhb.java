package defpackage;

import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: vhb  reason: default package */
public final class vhb<T, R> implements l<zwd, e> {
    public static final vhb a = new vhb();

    vhb() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public e apply(zwd zwd) {
        h.e(zwd, "it");
        return b.a;
    }
}
