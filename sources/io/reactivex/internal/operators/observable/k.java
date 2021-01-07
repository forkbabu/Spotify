package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.functions.g;
import io.reactivex.internal.observers.e;
import io.reactivex.s;
import io.reactivex.x;

public final class k<T> extends a<T, T> {
    private final g<? super b> b;
    private final a c;

    public k(s<T> sVar, g<? super b> gVar, a aVar) {
        super(sVar);
        this.b = gVar;
        this.c = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new e(xVar, this.b, this.c));
    }
}
