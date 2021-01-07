package io.reactivex.internal.operators.observable;

import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.z;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class v0<T, U extends Collection<? super T>> extends z<U> implements d<U> {
    final v<T> a;
    final Callable<U> b;

    static final class a<T, U extends Collection<? super T>> implements x<T>, b {
        final b0<? super U> a;
        U b;
        b c;

        a(b0<? super U> b0Var, U u) {
            this.a = b0Var;
            this.b = u;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            U u = this.b;
            this.b = null;
            this.a.onSuccess(u);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.b = null;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.b.add(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                this.c = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public v0(v<T> vVar, int i) {
        this.a = vVar;
        this.b = Functions.d(i);
    }

    @Override // io.reactivex.z
    public void G(b0<? super U> b0Var) {
        try {
            U call = this.b.call();
            io.reactivex.internal.functions.a.c(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.a.subscribe(new a(b0Var, call));
        } catch (Throwable th) {
            yif.V(th);
            b0Var.onSubscribe(EmptyDisposable.INSTANCE);
            b0Var.onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.d
    public s<U> a() {
        return new u0(this.a, this.b);
    }
}
