package io.reactivex.internal.subscriptions;

public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final upf<? super T> downstream;
    protected T value;

    public DeferredScalarSubscription(upf<? super T> upf) {
        this.downstream = upf;
    }

    public final void a(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    upf<? super T> upf = this.downstream;
                    upf.onNext(t);
                    if (get() != 4) {
                        upf.onComplete();
                        return;
                    }
                    return;
                }
                this.value = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.value = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.value = t;
        lazySet(16);
        upf<? super T> upf2 = this.downstream;
        upf2.onNext(t);
        if (get() != 4) {
            upf2.onComplete();
        }
    }

    @Override // defpackage.vpf
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.fuseable.j
    public final void clear() {
        lazySet(32);
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

    @Override // defpackage.vpf
    public final void n(long j) {
        T t;
        if (SubscriptionHelper.l(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (t = this.value) != null) {
                            this.value = null;
                            upf<? super T> upf = this.downstream;
                            upf.onNext(t);
                            if (get() != 4) {
                                upf.onComplete();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // io.reactivex.internal.fuseable.j
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }
}
