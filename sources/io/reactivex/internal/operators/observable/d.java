package io.reactivex.internal.operators.observable;

import io.reactivex.b0;
import io.reactivex.functions.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.z;
import java.util.concurrent.Callable;

public final class d<T, U> extends z<U> implements io.reactivex.internal.fuseable.d<U> {
    final v<T> a;
    final Callable<? extends U> b;
    final b<? super U, ? super T> c;

    static final class a<T, U> implements x<T>, io.reactivex.disposables.b {
        final b0<? super U> a;
        final b<? super U, ? super T> b;
        final U c;
        io.reactivex.disposables.b f;
        boolean n;

        a(b0<? super U> b0Var, U u, b<? super U, ? super T> bVar) {
            this.a = b0Var;
            this.b = bVar;
            this.c = u;
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
                this.a.onSuccess(this.c);
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
                    this.b.a(this.c, t);
                } catch (Throwable th) {
                    this.f.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.n(this.f, bVar)) {
                this.f = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public d(v<T> vVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        this.a = vVar;
        this.b = callable;
        this.c = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super U> b0Var) {
        try {
            Object call = this.b.call();
            io.reactivex.internal.functions.a.c(call, "The initialSupplier returned a null value");
            this.a.subscribe(new a(b0Var, call, this.c));
        } catch (Throwable th) {
            b0Var.onSubscribe(EmptyDisposable.INSTANCE);
            b0Var.onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.d
    public s<U> a() {
        return new c(this.a, this.b, this.c);
    }
}
