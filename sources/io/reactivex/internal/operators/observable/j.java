package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;

public final class j<T> extends a<T, T> {
    final g<? super T> b;
    final g<? super Throwable> c;
    final io.reactivex.functions.a f;
    final io.reactivex.functions.a n;

    static final class a<T> implements x<T>, b {
        final x<? super T> a;
        final g<? super T> b;
        final g<? super Throwable> c;
        final io.reactivex.functions.a f;
        final io.reactivex.functions.a n;
        b o;
        boolean p;

        a(x<? super T> xVar, g<? super T> gVar, g<? super Throwable> gVar2, io.reactivex.functions.a aVar, io.reactivex.functions.a aVar2) {
            this.a = xVar;
            this.b = gVar;
            this.c = gVar2;
            this.f = aVar;
            this.n = aVar2;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.o.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.o.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.p) {
                try {
                    this.f.run();
                    this.p = true;
                    this.a.onComplete();
                    try {
                        this.n.run();
                    } catch (Throwable th) {
                        yif.V(th);
                        io.reactivex.plugins.a.g(th);
                    }
                } catch (Throwable th2) {
                    yif.V(th2);
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.p) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.p = true;
            try {
                this.c.accept(th);
            } catch (Throwable th2) {
                yif.V(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
            try {
                this.n.run();
            } catch (Throwable th3) {
                yif.V(th3);
                io.reactivex.plugins.a.g(th3);
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.p) {
                try {
                    this.b.accept(t);
                    this.a.onNext(t);
                } catch (Throwable th) {
                    yif.V(th);
                    this.o.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.o, bVar)) {
                this.o = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public j(v<T> vVar, g<? super T> gVar, g<? super Throwable> gVar2, io.reactivex.functions.a aVar, io.reactivex.functions.a aVar2) {
        super(vVar);
        this.b = gVar;
        this.c = gVar2;
        this.f = aVar;
        this.n = aVar2;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar, this.b, this.c, this.f, this.n));
    }
}
