package defpackage;

import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;
import kotlin.jvm.internal.h;

/* renamed from: qhb  reason: default package */
/* compiled from: java-style lambda group */
public final class qhb<T, R> implements l<zwd, e> {
    public static final qhb b = new qhb(0);
    public static final qhb c = new qhb(1);
    public final /* synthetic */ int a;

    public qhb(int i) {
        this.a = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public final e apply(zwd zwd) {
        a aVar = b.a;
        int i = this.a;
        if (i == 0) {
            h.e(zwd, "it");
            return aVar;
        } else if (i == 1) {
            h.e(zwd, "it");
            return aVar;
        } else {
            throw null;
        }
    }
}
