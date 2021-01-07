package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.observers.i;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleResumeNext<T> extends z<T> {
    final d0<? extends T> a;
    final l<? super Throwable, ? extends d0<? extends T>> b;

    static final class ResumeMainSingleObserver<T> extends AtomicReference<b> implements b0<T>, b {
        private static final long serialVersionUID = -5314538511045349925L;
        final b0<? super T> downstream;
        final l<? super Throwable, ? extends d0<? extends T>> nextFunction;

        ResumeMainSingleObserver(b0<? super T> b0Var, l<? super Throwable, ? extends d0<? extends T>> lVar) {
            this.downstream = b0Var;
            this.nextFunction = lVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            try {
                Object apply = this.nextFunction.apply(th);
                a.c(apply, "The nextFunction returned a null SingleSource.");
                ((d0) apply).subscribe(new i(this, this.downstream));
            } catch (Throwable th2) {
                yif.V(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public SingleResumeNext(d0<? extends T> d0Var, l<? super Throwable, ? extends d0<? extends T>> lVar) {
        this.a = d0Var;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new ResumeMainSingleObserver(b0Var, this.b));
    }
}
