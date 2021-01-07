package io.reactivex.internal.observers;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class j<T> implements c, vpf {
    final upf<? super T> a;
    b b;

    public j(upf<? super T> upf) {
        this.a = upf;
    }

    @Override // defpackage.vpf
    public void cancel() {
        this.b.dispose();
    }

    @Override // defpackage.vpf
    public void n(long j) {
    }

    @Override // io.reactivex.c
    public void onComplete() {
        this.a.onComplete();
    }

    @Override // io.reactivex.c
    public void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // io.reactivex.c
    public void onSubscribe(b bVar) {
        if (DisposableHelper.n(this.b, bVar)) {
            this.b = bVar;
            this.a.onSubscribe(this);
        }
    }
}
