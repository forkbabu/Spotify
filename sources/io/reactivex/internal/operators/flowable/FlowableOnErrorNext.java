package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.j;

public final class FlowableOnErrorNext<T> extends a<T, T> {
    final l<? super Throwable, ? extends tpf<? extends T>> f;
    final boolean n;

    static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements j<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        final boolean allowFatal;
        boolean done;
        final upf<? super T> downstream;
        final l<? super Throwable, ? extends tpf<? extends T>> nextSupplier;
        boolean once;
        long produced;

        OnErrorNextSubscriber(upf<? super T> upf, l<? super Throwable, ? extends tpf<? extends T>> lVar, boolean z) {
            super(false);
            this.downstream = upf;
            this.nextSupplier = lVar;
            this.allowFatal = z;
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.once = true;
                this.downstream.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (!this.once) {
                this.once = true;
                if (!this.allowFatal || (th instanceof Exception)) {
                    try {
                        Object apply = this.nextSupplier.apply(th);
                        a.c(apply, "The nextSupplier returned a null Publisher");
                        tpf tpf = (tpf) apply;
                        long j = this.produced;
                        if (j != 0) {
                            f(j);
                        }
                        tpf.subscribe(this);
                    } catch (Throwable th2) {
                        yif.V(th2);
                        this.downstream.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.downstream.onError(th);
                }
            } else if (this.done) {
                io.reactivex.plugins.a.g(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                if (!this.once) {
                    this.produced++;
                }
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            g(vpf);
        }
    }

    public FlowableOnErrorNext(g<T> gVar, l<? super Throwable, ? extends tpf<? extends T>> lVar, boolean z) {
        super(gVar);
        this.f = lVar;
        this.n = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(upf, this.f, this.n);
        upf.onSubscribe(onErrorNextSubscriber);
        this.c.subscribe((j) onErrorNextSubscriber);
    }
}
