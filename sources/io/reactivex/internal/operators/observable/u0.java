package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.v;
import io.reactivex.x;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class u0<T, U extends Collection<? super T>> extends a<T, U> {
    final Callable<U> b;

    static final class a<T, U extends Collection<? super T>> implements x<T>, b {
        final x<? super U> a;
        b b;
        U c;

        a(x<? super U> xVar, U u) {
            this.a = xVar;
            this.c = u;
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
            U u = this.c;
            this.c = null;
            this.a.onNext(u);
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.c = null;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.c.add(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.b, bVar)) {
                this.b = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public u0(v<T> vVar, Callable<U> callable) {
        super(vVar);
        this.b = callable;
    }

    @Override // io.reactivex.s
    public void H0(x<? super U> xVar) {
        try {
            U call = this.b.call();
            io.reactivex.internal.functions.a.c(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.a.subscribe(new a(xVar, call));
        } catch (Throwable th) {
            yif.V(th);
            xVar.onSubscribe(EmptyDisposable.INSTANCE);
            xVar.onError(th);
        }
    }
}
