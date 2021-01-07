package io.reactivex.internal.operators.flowable;

import io.reactivex.b0;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.z;
import java.util.concurrent.Callable;

public final class b<T, U> extends z<U> implements io.reactivex.internal.fuseable.b<U> {
    final g<T> a;
    final Callable<? extends U> b;
    final io.reactivex.functions.b<? super U, ? super T> c;

    static final class a<T, U> implements j<T>, io.reactivex.disposables.b {
        final b0<? super U> a;
        final io.reactivex.functions.b<? super U, ? super T> b;
        final U c;
        vpf f;
        boolean n;

        a(b0<? super U> b0Var, U u, io.reactivex.functions.b<? super U, ? super T> bVar) {
            this.a = b0Var;
            this.b = bVar;
            this.c = u;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f.cancel();
            this.f = SubscriptionHelper.CANCELLED;
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.n) {
                this.n = true;
                this.f = SubscriptionHelper.CANCELLED;
                this.a.onSuccess(this.c);
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.n) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.n = true;
            this.f = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.n) {
                try {
                    this.b.a(this.c, t);
                } catch (Throwable th) {
                    yif.V(th);
                    this.f.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.f, vpf)) {
                this.f = vpf;
                this.a.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public b(g<T> gVar, Callable<? extends U> callable, io.reactivex.functions.b<? super U, ? super T> bVar) {
        this.a = gVar;
        this.b = callable;
        this.c = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super U> b0Var) {
        try {
            Object call = this.b.call();
            io.reactivex.internal.functions.a.c(call, "The initialSupplier returned a null value");
            this.a.subscribe((j) new a(b0Var, call, this.c));
        } catch (Throwable th) {
            b0Var.onSubscribe(EmptyDisposable.INSTANCE);
            b0Var.onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.b
    public g<U> c() {
        return new FlowableCollect(this.a, this.b, this.c);
    }
}
