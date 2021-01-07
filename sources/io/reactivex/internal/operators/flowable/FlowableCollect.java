package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.b;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;

public final class FlowableCollect<T, U> extends a<T, U> {
    final Callable<? extends U> f;
    final b<? super U, ? super T> n;

    static final class CollectSubscriber<T, U> extends DeferredScalarSubscription<U> implements j<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        final b<? super U, ? super T> collector;
        boolean done;
        final U u;
        vpf upstream;

        CollectSubscriber(upf<? super U> upf, U u2, b<? super U, ? super T> bVar) {
            super(upf);
            this.collector = bVar;
            this.u = u2;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, defpackage.vpf
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                a(this.u);
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done) {
                a.g(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                try {
                    this.collector.a(this.u, t);
                } catch (Throwable th) {
                    yif.V(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollect(g<T> gVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        super(gVar);
        this.f = callable;
        this.n = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super U> upf) {
        try {
            Object call = this.f.call();
            io.reactivex.internal.functions.a.c(call, "The initial value supplied is null");
            this.c.subscribe((j) new CollectSubscriber(upf, call, this.n));
        } catch (Throwable th) {
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
