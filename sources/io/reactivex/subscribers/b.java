package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.util.a;
import io.reactivex.j;

public final class b<T> implements j<T>, vpf {
    final upf<? super T> a;
    vpf b;
    boolean c;
    a<Object> f;
    volatile boolean n;

    public b(upf<? super T> upf) {
        this.a = upf;
    }

    @Override // defpackage.vpf
    public void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.vpf
    public void n(long j) {
        this.b.n(j);
    }

    @Override // defpackage.upf
    public void onComplete() {
        if (!this.n) {
            synchronized (this) {
                if (!this.n) {
                    if (this.c) {
                        a<Object> aVar = this.f;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.f = aVar;
                        }
                        aVar.c(NotificationLite.COMPLETE);
                        return;
                    }
                    this.n = true;
                    this.c = true;
                    this.a.onComplete();
                }
            }
        }
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        boolean z;
        if (this.n) {
            io.reactivex.plugins.a.g(th);
            return;
        }
        synchronized (this) {
            z = true;
            if (!this.n) {
                if (this.c) {
                    this.n = true;
                    a<Object> aVar = this.f;
                    if (aVar == null) {
                        aVar = new a<>(4);
                        this.f = aVar;
                    }
                    aVar.e(NotificationLite.k(th));
                    return;
                }
                this.n = true;
                this.c = true;
                z = false;
            }
        }
        if (z) {
            io.reactivex.plugins.a.g(th);
        } else {
            this.a.onError(th);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v6. Raw type applied. Possible types: upf<? super T>, upf<? super U> */
    @Override // defpackage.upf
    public void onNext(T t) {
        a<Object> aVar;
        if (!this.n) {
            if (t == null) {
                this.b.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.n) {
                    if (this.c) {
                        a<Object> aVar2 = this.f;
                        if (aVar2 == null) {
                            aVar2 = new a<>(4);
                            this.f = aVar2;
                        }
                        aVar2.c(t);
                        return;
                    }
                    this.c = true;
                } else {
                    return;
                }
            }
            this.a.onNext(t);
            do {
                synchronized (this) {
                    aVar = this.f;
                    if (aVar == null) {
                        this.c = false;
                        return;
                    }
                    this.f = null;
                }
            } while (!aVar.b((upf<? super T>) this.a));
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (SubscriptionHelper.m(this.b, vpf)) {
            this.b = vpf;
            this.a.onSubscribe(this);
        }
    }
}
