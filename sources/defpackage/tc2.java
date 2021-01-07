package defpackage;

import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;

/* renamed from: tc2  reason: default package */
public final /* synthetic */ class tc2 implements l {
    public final /* synthetic */ us3 a;

    public /* synthetic */ tc2(us3 us3) {
        this.a = us3;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        us3 us3 = this.a;
        if (!((u3) obj).b.booleanValue()) {
            us3.g(true);
        }
        return o.a;
    }
}
