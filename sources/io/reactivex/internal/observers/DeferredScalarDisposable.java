package io.reactivex.internal.observers;

import io.reactivex.plugins.a;
import io.reactivex.x;

public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final x<? super T> downstream;
    protected T value;

    public DeferredScalarDisposable(x<? super T> xVar) {
        this.downstream = xVar;
    }

    public final void a() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.downstream.onComplete();
        }
    }

    public final void b(T t) {
        int i = get();
        if ((i & 54) == 0) {
            x<? super T> xVar = this.downstream;
            if (i == 8) {
                this.value = t;
                lazySet(16);
                xVar.onNext(null);
            } else {
                lazySet(2);
                xVar.onNext(t);
            }
            if (get() != 4) {
                xVar.onComplete();
            }
        }
    }

    public final void c(Throwable th) {
        if ((get() & 54) != 0) {
            a.g(th);
            return;
        }
        lazySet(2);
        this.downstream.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.j
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    @Override // io.reactivex.disposables.b
    public final boolean d() {
        return get() == 4;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.fuseable.f
    public final int g(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // io.reactivex.internal.fuseable.j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.fuseable.j
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }
}
