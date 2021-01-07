package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.b;
import io.reactivex.s;
import io.reactivex.x;
import java.util.Iterator;

public final class u<T> extends s<T> {
    final Iterable<? extends T> a;

    static final class a<T> extends b<T> {
        final x<? super T> a;
        final Iterator<? extends T> b;
        volatile boolean c;
        boolean f;
        boolean n;
        boolean o;

        a(x<? super T> xVar, Iterator<? extends T> it) {
            this.a = xVar;
            this.b = it;
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.n = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c = true;
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.n;
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            if (this.n) {
                return null;
            }
            if (!this.o) {
                this.o = true;
            } else if (!this.b.hasNext()) {
                this.n = true;
                return null;
            }
            T t = (T) this.b.next();
            io.reactivex.internal.functions.a.c(t, "The iterator returned a null value");
            return t;
        }
    }

    public u(Iterable<? extends T> iterable) {
        this.a = iterable;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        try {
            Iterator<? extends T> it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    xVar.onSubscribe(emptyDisposable);
                    xVar.onComplete();
                    return;
                }
                a aVar = new a(xVar, it);
                xVar.onSubscribe(aVar);
                if (!aVar.f) {
                    while (!aVar.c) {
                        try {
                            Object next = aVar.b.next();
                            io.reactivex.internal.functions.a.c(next, "The iterator returned a null value");
                            aVar.a.onNext(next);
                            if (!aVar.c) {
                                try {
                                    if (!aVar.b.hasNext()) {
                                        if (!aVar.c) {
                                            aVar.a.onComplete();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    yif.V(th);
                                    aVar.a.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            yif.V(th2);
                            aVar.a.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                yif.V(th3);
                xVar.onSubscribe(emptyDisposable);
                xVar.onError(th3);
            }
        } catch (Throwable th4) {
            yif.V(th4);
            xVar.onSubscribe(emptyDisposable);
            xVar.onError(th4);
        }
    }
}
