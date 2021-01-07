package defpackage;

import io.reactivex.functions.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: ye0  reason: default package */
public final class ye0<T> implements g<Throwable> {
    final /* synthetic */ Ref$ObjectRef a;
    final /* synthetic */ se0 b;

    ye0(Ref$ObjectRef ref$ObjectRef, se0 se0) {
        this.a = ref$ObjectRef;
        this.b = se0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Throwable th2 = th;
        T t = this.a.element;
        if (t != null) {
            se0 se0 = this.b;
            h.d(th2, "it");
            t.a(se0.a(th2));
            return;
        }
        h.k("startPerformanceTracker");
        throw null;
    }
}
