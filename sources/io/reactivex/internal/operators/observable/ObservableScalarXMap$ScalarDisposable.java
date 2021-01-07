package io.reactivex.internal.operators.observable;

import io.reactivex.internal.fuseable.e;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableScalarXMap$ScalarDisposable<T> extends AtomicInteger implements e<T>, Runnable {
    private static final long serialVersionUID = 3880992722410194083L;
    final x<? super T> observer;
    final T value;

    public ObservableScalarXMap$ScalarDisposable(x<? super T> xVar, T t) {
        this.observer = xVar;
        this.value = t;
    }

    @Override // io.reactivex.internal.fuseable.j
    public void clear() {
        lazySet(3);
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return get() == 3;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        set(3);
    }

    @Override // io.reactivex.internal.fuseable.f
    public int g(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean isEmpty() {
        return get() != 1;
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.j
    public T poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.value;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.observer.onNext(this.value);
            if (get() == 2) {
                lazySet(3);
                this.observer.onComplete();
            }
        }
    }
}
