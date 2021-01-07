package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.g;
import java.util.concurrent.atomic.AtomicInteger;

public final class ScalarSubscription<T> extends AtomicInteger implements g<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final upf<? super T> subscriber;
    final T value;

    public ScalarSubscription(upf<? super T> upf, T t) {
        this.subscriber = upf;
        this.value = t;
    }

    @Override // defpackage.vpf
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.fuseable.j
    public void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.internal.fuseable.f
    public int g(int i) {
        return i & 1;
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // defpackage.vpf
    public void n(long j) {
        if (SubscriptionHelper.l(j) && compareAndSet(0, 1)) {
            upf<? super T> upf = this.subscriber;
            upf.onNext(this.value);
            if (get() != 2) {
                upf.onComplete();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.j
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }
}
