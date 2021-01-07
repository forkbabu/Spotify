package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class FlowableToList<T, U extends Collection<? super T>> extends a<T, U> {
    final Callable<U> f;

    static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements j<T>, vpf {
        private static final long serialVersionUID = -8134157938864266736L;
        vpf upstream;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: U extends java.util.Collection<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        ToListSubscriber(upf<? super U> upf, U u) {
            super(upf);
            this.value = u;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, defpackage.vpf
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // defpackage.upf
        public void onComplete() {
            a(this.value);
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.value = null;
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            T t2 = this.value;
            if (t2 != null) {
                t2.add(t);
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

    public FlowableToList(g<T> gVar, Callable<U> callable) {
        super(gVar);
        this.f = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super U> upf) {
        try {
            U call = this.f.call();
            a.c(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.c.subscribe((j) new ToListSubscriber(upf, call));
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
