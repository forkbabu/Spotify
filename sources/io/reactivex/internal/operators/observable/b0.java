package io.reactivex.internal.operators.observable;

import io.reactivex.internal.fuseable.h;
import io.reactivex.s;
import io.reactivex.x;

public final class b0<T> extends s<T> implements h<T> {
    private final T a;

    public b0(T t) {
        this.a = t;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(xVar, this.a);
        xVar.onSubscribe(observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }

    @Override // io.reactivex.internal.fuseable.h, java.util.concurrent.Callable
    public T call() {
        return this.a;
    }
}
