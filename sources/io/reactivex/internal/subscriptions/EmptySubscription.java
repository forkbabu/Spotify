package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.g;

public enum EmptySubscription implements g<Object> {
    INSTANCE;

    public static void d(upf<?> upf) {
        upf.onSubscribe(INSTANCE);
        upf.onComplete();
    }

    public static void h(Throwable th, upf<?> upf) {
        upf.onSubscribe(INSTANCE);
        upf.onError(th);
    }

    @Override // defpackage.vpf
    public void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.j
    public void clear() {
    }

    @Override // io.reactivex.internal.fuseable.f
    public int g(int i) {
        return i & 2;
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.vpf
    public void n(long j) {
        SubscriptionHelper.l(j);
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.j
    public Object poll() {
        return null;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return "EmptySubscription";
    }
}
