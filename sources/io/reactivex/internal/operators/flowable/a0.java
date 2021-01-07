package io.reactivex.internal.operators.flowable;

import io.reactivex.b0;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.j;
import io.reactivex.z;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class a0<T, U extends Collection<? super T>> extends z<U> implements b<U> {
    final g<T> a;
    final Callable<U> b;

    static final class a<T, U extends Collection<? super T>> implements j<T>, io.reactivex.disposables.b {
        final b0<? super U> a;
        vpf b;
        U c;

        a(b0<? super U> b0Var, U u) {
            this.a = b0Var;
            this.c = u;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.b.cancel();
            this.b = SubscriptionHelper.CANCELLED;
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.b = SubscriptionHelper.CANCELLED;
            this.a.onSuccess(this.c);
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.c = null;
            this.b = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.c.add(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.b, vpf)) {
                this.b = vpf;
                this.a.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public a0(g<T> gVar) {
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        this.a = gVar;
        this.b = arrayListSupplier;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super U> b0Var) {
        try {
            U call = this.b.call();
            io.reactivex.internal.functions.a.c(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.a.subscribe((j) new a(b0Var, call));
        } catch (Throwable th) {
            yif.V(th);
            b0Var.onSubscribe(EmptyDisposable.INSTANCE);
            b0Var.onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.b
    public g<U> c() {
        return new FlowableToList(this.a, this.b);
    }
}
