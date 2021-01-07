package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.c;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.x;
import java.util.Iterator;

public final class w0<T, U, V> extends s<V> {
    final s<? extends T> a;
    final Iterable<U> b;
    final c<? super T, ? super U, ? extends V> c;

    static final class a<T, U, V> implements x<T>, b {
        final x<? super V> a;
        final Iterator<U> b;
        final c<? super T, ? super U, ? extends V> c;
        b f;
        boolean n;

        a(x<? super V> xVar, Iterator<U> it, c<? super T, ? super U, ? extends V> cVar) {
            this.a = xVar;
            this.b = it;
            this.c = cVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.n) {
                this.n = true;
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.n) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.n = true;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.n) {
                try {
                    U next = this.b.next();
                    io.reactivex.internal.functions.a.c(next, "The iterator returned a null value");
                    try {
                        Object a2 = this.c.a(t, next);
                        io.reactivex.internal.functions.a.c(a2, "The zipper function returned a null value");
                        this.a.onNext(a2);
                        try {
                            if (!this.b.hasNext()) {
                                this.n = true;
                                this.f.dispose();
                                this.a.onComplete();
                            }
                        } catch (Throwable th) {
                            yif.V(th);
                            this.n = true;
                            this.f.dispose();
                            this.a.onError(th);
                        }
                    } catch (Throwable th2) {
                        yif.V(th2);
                        this.n = true;
                        this.f.dispose();
                        this.a.onError(th2);
                    }
                } catch (Throwable th3) {
                    yif.V(th3);
                    this.n = true;
                    this.f.dispose();
                    this.a.onError(th3);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.f, bVar)) {
                this.f = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public w0(s<? extends T> sVar, Iterable<U> iterable, c<? super T, ? super U, ? extends V> cVar) {
        this.a = sVar;
        this.b = iterable;
        this.c = cVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super V> xVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        try {
            Iterator<U> it = this.b.iterator();
            io.reactivex.internal.functions.a.c(it, "The iterator returned by other is null");
            Iterator<U> it2 = it;
            try {
                if (!it2.hasNext()) {
                    xVar.onSubscribe(emptyDisposable);
                    xVar.onComplete();
                    return;
                }
                this.a.subscribe(new a(xVar, it2, this.c));
            } catch (Throwable th) {
                yif.V(th);
                xVar.onSubscribe(emptyDisposable);
                xVar.onError(th);
            }
        } catch (Throwable th2) {
            yif.V(th2);
            xVar.onSubscribe(emptyDisposable);
            xVar.onError(th2);
        }
    }
}
