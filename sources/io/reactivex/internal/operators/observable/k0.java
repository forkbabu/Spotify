package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.c;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.Callable;

public final class k0<T, R> extends a<T, R> {
    final c<R, ? super T, R> b;
    final Callable<R> c;

    static final class a<T, R> implements x<T>, b {
        final x<? super R> a;
        final c<R, ? super T, R> b;
        R c;
        b f;
        boolean n;

        a(x<? super R> xVar, c<R, ? super T, R> cVar, R r) {
            this.a = xVar;
            this.b = cVar;
            this.c = r;
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
                    R a2 = this.b.a(this.c, t);
                    io.reactivex.internal.functions.a.c(a2, "The accumulator returned a null value");
                    this.c = a2;
                    this.a.onNext(a2);
                } catch (Throwable th) {
                    yif.V(th);
                    this.f.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.f, bVar)) {
                this.f = bVar;
                this.a.onSubscribe(this);
                this.a.onNext(this.c);
            }
        }
    }

    public k0(v<T> vVar, Callable<R> callable, c<R, ? super T, R> cVar) {
        super(vVar);
        this.b = cVar;
        this.c = callable;
    }

    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        try {
            R call = this.c.call();
            io.reactivex.internal.functions.a.c(call, "The seed supplied is null");
            this.a.subscribe(new a(xVar, this.b, call));
        } catch (Throwable th) {
            yif.V(th);
            xVar.onSubscribe(EmptyDisposable.INSTANCE);
            xVar.onError(th);
        }
    }
}
