package defpackage;

import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;

/* renamed from: an1  reason: default package */
public final /* synthetic */ class an1 implements l {
    public final /* synthetic */ eif a;

    public /* synthetic */ an1(eif eif) {
        this.a = eif;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? this.a.a() : o.a;
    }
}
