package io.reactivex.observers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.util.a;
import io.reactivex.x;

public final class c<T> implements x<T>, b {
    final x<? super T> a;
    b b;
    boolean c;
    a<Object> f;
    volatile boolean n;

    public c(x<? super T> xVar) {
        this.a = xVar;
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return this.b.d();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.b.dispose();
    }

    @Override // io.reactivex.x, io.reactivex.c
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

    @Override // io.reactivex.x, io.reactivex.c
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

    /* JADX DEBUG: Type inference failed for r0v6. Raw type applied. Possible types: io.reactivex.x<? super T>, io.reactivex.x<? super U> */
    @Override // io.reactivex.x
    public void onNext(T t) {
        a<Object> aVar;
        if (!this.n) {
            if (t == null) {
                this.b.dispose();
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
            } while (!aVar.a((x<? super T>) this.a));
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        if (DisposableHelper.n(this.b, bVar)) {
            this.b = bVar;
            this.a.onSubscribe(this);
        }
    }
}
