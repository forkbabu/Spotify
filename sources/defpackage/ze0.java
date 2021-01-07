package defpackage;

import io.reactivex.functions.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: ze0  reason: default package */
public final class ze0<T> implements g<R> {
    final /* synthetic */ Ref$ObjectRef a;
    final /* synthetic */ af0 b;

    ze0(Ref$ObjectRef ref$ObjectRef, af0 af0) {
        this.a = ref$ObjectRef;
        this.b = af0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(R r) {
        T t = this.a.element;
        if (t != null) {
            t.a(this.b.a(r));
        } else {
            h.k("startPerformanceTracker");
            throw null;
        }
    }
}
