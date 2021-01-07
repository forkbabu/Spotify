package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;

public final class r<T, R> extends a<T, R> {
    final l<? super T, ? extends Iterable<? extends R>> b;

    static final class a<T, R> implements x<T>, b {
        final x<? super R> a;
        final l<? super T, ? extends Iterable<? extends R>> b;
        b c;

        a(x<? super R> xVar, l<? super T, ? extends Iterable<? extends R>> lVar) {
            this.a = xVar;
            this.b = lVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.dispose();
            this.c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            b bVar = this.c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                this.c = disposableHelper;
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            b bVar = this.c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.c = disposableHelper;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (this.c != DisposableHelper.DISPOSED) {
                try {
                    x<? super R> xVar = this.a;
                    for (T t2 : (Iterable) this.b.apply(t)) {
                        try {
                            try {
                                io.reactivex.internal.functions.a.c(t2, "The iterator returned a null value");
                                xVar.onNext(t2);
                            } catch (Throwable th) {
                                yif.V(th);
                                this.c.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            yif.V(th2);
                            this.c.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    yif.V(th3);
                    this.c.dispose();
                    onError(th3);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                this.c = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public r(v<T> vVar, l<? super T, ? extends Iterable<? extends R>> lVar) {
        super(vVar);
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        this.a.subscribe(new a(xVar, this.b));
    }
}
