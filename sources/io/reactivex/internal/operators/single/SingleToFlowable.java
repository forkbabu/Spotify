package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

public final class SingleToFlowable<T> extends g<T> {
    final d0<? extends T> c;

    static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements b0<T> {
        private static final long serialVersionUID = 187782011903685568L;
        b upstream;

        SingleToFlowableObserver(upf<? super T> upf) {
            super(upf);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, defpackage.vpf
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            a(t);
        }
    }

    public SingleToFlowable(d0<? extends T> d0Var) {
        this.c = d0Var;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe(new SingleToFlowableObserver(upf));
    }
}
