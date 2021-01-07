package defpackage;

import defpackage.kt7;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;

/* renamed from: nt7  reason: default package */
public final /* synthetic */ class nt7 implements l {
    public final /* synthetic */ at7 a;

    public /* synthetic */ nt7(at7 at7) {
        this.a = at7;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        at7 at7 = this.a;
        kt7.c cVar = (kt7.c) obj;
        String b = cVar.b();
        boolean a2 = cVar.a();
        at7.getClass();
        return a.u(new ws7(at7, b, a2)).g(o.a);
    }
}
