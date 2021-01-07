package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.e;

public final class j extends a {
    final e a;

    public j(e eVar) {
        this.a = eVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(cVar);
    }
}
