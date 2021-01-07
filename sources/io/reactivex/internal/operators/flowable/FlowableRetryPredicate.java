package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.n;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;

public final class FlowableRetryPredicate<T> extends a<T, T> {
    final n<? super Throwable> f;
    final long n;

    static final class RetrySubscriber<T> extends AtomicInteger implements j<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final upf<? super T> downstream;
        final n<? super Throwable> predicate;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final tpf<? extends T> source;

        RetrySubscriber(upf<? super T> upf, long j, n<? super Throwable> nVar, SubscriptionArbiter subscriptionArbiter, tpf<? extends T> tpf) {
            this.downstream = upf;
            this.sa = subscriptionArbiter;
            this.source = tpf;
            this.predicate = nVar;
            this.remaining = j;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sa.d()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0;
                        this.sa.f(j);
                    }
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                yif.V(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            this.sa.g(vpf);
        }
    }

    public FlowableRetryPredicate(g<T> gVar, long j, n<? super Throwable> nVar) {
        super(gVar);
        this.f = nVar;
        this.n = j;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        upf.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(upf, this.n, this.f, subscriptionArbiter, this.c).a();
    }
}
