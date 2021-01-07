package io.reactivex.subjects;

import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.util.a;
import io.reactivex.x;

/* access modifiers changed from: package-private */
public final class b<T> extends c<T> implements a.AbstractC0621a<Object> {
    final c<T> a;
    boolean b;
    a<Object> c;
    volatile boolean f;

    b(c<T> cVar) {
        this.a = cVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(xVar);
    }

    /* access modifiers changed from: package-private */
    public void h1() {
        a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.c;
                if (aVar == null) {
                    this.b = false;
                    return;
                }
                this.c = null;
            }
            aVar.d(this);
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    this.f = true;
                    if (this.b) {
                        a<Object> aVar = this.c;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.c = aVar;
                        }
                        aVar.c(NotificationLite.COMPLETE);
                        return;
                    }
                    this.b = true;
                    this.a.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        boolean z;
        if (this.f) {
            io.reactivex.plugins.a.g(th);
            return;
        }
        synchronized (this) {
            z = true;
            if (!this.f) {
                this.f = true;
                if (this.b) {
                    a<Object> aVar = this.c;
                    if (aVar == null) {
                        aVar = new a<>(4);
                        this.c = aVar;
                    }
                    aVar.e(NotificationLite.k(th));
                    return;
                }
                this.b = true;
                z = false;
            }
        }
        if (z) {
            io.reactivex.plugins.a.g(th);
        } else {
            this.a.onError(th);
        }
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    if (this.b) {
                        a<Object> aVar = this.c;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.c = aVar;
                        }
                        aVar.c(t);
                        return;
                    }
                    this.b = true;
                    this.a.onNext(t);
                    h1();
                }
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        boolean z = true;
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    if (this.b) {
                        a<Object> aVar = this.c;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.c = aVar;
                        }
                        aVar.c(NotificationLite.i(bVar));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if (z) {
            bVar.dispose();
            return;
        }
        this.a.onSubscribe(bVar);
        h1();
    }

    @Override // io.reactivex.internal.util.a.AbstractC0621a, io.reactivex.functions.n
    public boolean test(Object obj) {
        return NotificationLite.h(obj, this.a);
    }
}
