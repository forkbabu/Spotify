package io.reactivex.processors;

import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.util.a;

/* access modifiers changed from: package-private */
public final class b<T> extends a<T> {
    final a<T> c;
    boolean f;
    a<Object> n;
    volatile boolean o;

    b(a<T> aVar) {
        this.c = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe(upf);
    }

    @Override // defpackage.upf
    public void onComplete() {
        if (!this.o) {
            synchronized (this) {
                if (!this.o) {
                    this.o = true;
                    if (this.f) {
                        a<Object> aVar = this.n;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.n = aVar;
                        }
                        aVar.c(NotificationLite.COMPLETE);
                        return;
                    }
                    this.f = true;
                    this.c.onComplete();
                }
            }
        }
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        boolean z;
        if (this.o) {
            io.reactivex.plugins.a.g(th);
            return;
        }
        synchronized (this) {
            z = true;
            if (!this.o) {
                this.o = true;
                if (this.f) {
                    a<Object> aVar = this.n;
                    if (aVar == null) {
                        aVar = new a<>(4);
                        this.n = aVar;
                    }
                    aVar.e(NotificationLite.k(th));
                    return;
                }
                this.f = true;
                z = false;
            }
        }
        if (z) {
            io.reactivex.plugins.a.g(th);
        } else {
            this.c.onError(th);
        }
    }

    @Override // defpackage.upf
    public void onNext(T t) {
        if (!this.o) {
            synchronized (this) {
                if (!this.o) {
                    if (this.f) {
                        a<Object> aVar = this.n;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.n = aVar;
                        }
                        aVar.c(t);
                        return;
                    }
                    this.f = true;
                    this.c.onNext(t);
                    r0();
                }
            }
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        boolean z = true;
        if (!this.o) {
            synchronized (this) {
                if (!this.o) {
                    if (this.f) {
                        a<Object> aVar = this.n;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.n = aVar;
                        }
                        aVar.c(NotificationLite.p(vpf));
                        return;
                    }
                    this.f = true;
                    z = false;
                }
            }
        }
        if (z) {
            vpf.cancel();
            return;
        }
        this.c.onSubscribe(vpf);
        r0();
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.n;
                if (aVar == null) {
                    this.f = false;
                    return;
                }
                this.n = null;
            }
            aVar.b(this.c);
        }
    }
}
