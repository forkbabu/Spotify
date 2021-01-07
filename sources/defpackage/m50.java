package defpackage;

import io.reactivex.s;
import io.reactivex.x;
import kotlin.jvm.internal.h;

/* renamed from: m50  reason: default package */
public abstract class m50<T> extends s<T> {
    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        h.f(xVar, "observer");
        h1(xVar);
        xVar.onNext(g1());
    }

    /* access modifiers changed from: protected */
    public abstract T g1();

    /* access modifiers changed from: protected */
    public abstract void h1(x<? super T> xVar);
}
