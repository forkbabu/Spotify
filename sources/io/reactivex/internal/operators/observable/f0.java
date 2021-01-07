package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.v;
import io.reactivex.x;

public final class f0<T> extends a<T, T> {
    final l<? super Throwable, ? extends v<? extends T>> b;
    final boolean c;

    static final class a<T> implements x<T> {
        final x<? super T> a;
        final l<? super Throwable, ? extends v<? extends T>> b;
        final boolean c;
        final SequentialDisposable f = new SequentialDisposable();
        boolean n;
        boolean o;

        a(x<? super T> xVar, l<? super Throwable, ? extends v<? extends T>> lVar, boolean z) {
            this.a = xVar;
            this.b = lVar;
            this.c = z;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.o) {
                this.o = true;
                this.n = true;
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (!this.n) {
                this.n = true;
                if (!this.c || (th instanceof Exception)) {
                    try {
                        v vVar = (v) this.b.apply(th);
                        if (vVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.a.onError(nullPointerException);
                            return;
                        }
                        vVar.subscribe(this);
                    } catch (Throwable th2) {
                        yif.V(th2);
                        this.a.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.a.onError(th);
                }
            } else if (this.o) {
                io.reactivex.plugins.a.g(th);
            } else {
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.o) {
                this.a.onNext(t);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this.f, bVar);
        }
    }

    public f0(v<T> vVar, l<? super Throwable, ? extends v<? extends T>> lVar, boolean z) {
        super(vVar);
        this.b = lVar;
        this.c = z;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        a aVar = new a(xVar, this.b, this.c);
        xVar.onSubscribe(aVar.f);
        this.a.subscribe(aVar);
    }
}
