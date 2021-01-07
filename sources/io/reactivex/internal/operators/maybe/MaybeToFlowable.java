package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.n;
import io.reactivex.p;

public final class MaybeToFlowable<T> extends g<T> {
    final p<T> c;

    static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements n<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        b upstream;

        MaybeToFlowableSubscriber(upf<? super T> upf) {
            super(upf);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, defpackage.vpf
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            a(t);
        }
    }

    public MaybeToFlowable(p<T> pVar) {
        this.c = pVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe(new MaybeToFlowableSubscriber(upf));
    }
}
