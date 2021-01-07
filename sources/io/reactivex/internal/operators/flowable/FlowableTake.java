package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FlowableTake<T> extends a<T, T> {
    final long f;

    static final class TakeSubscriber<T> extends AtomicBoolean implements j<T>, vpf {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final upf<? super T> downstream;
        final long limit;
        long remaining;
        vpf upstream;

        TakeSubscriber(upf<? super T> upf, long j) {
            this.downstream = upf;
            this.limit = j;
            this.remaining = j;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                if (get() || !compareAndSet(false, true) || j < this.limit) {
                    this.upstream.n(j);
                } else {
                    this.upstream.n(Long.MAX_VALUE);
                }
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                long j = this.remaining;
                long j2 = j - 1;
                this.remaining = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.downstream.onNext(t);
                    if (z) {
                        this.upstream.cancel();
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                if (this.limit == 0) {
                    vpf.cancel();
                    this.done = true;
                    EmptySubscription.d(this.downstream);
                    return;
                }
                this.downstream.onSubscribe(this);
            }
        }
    }

    public FlowableTake(g<T> gVar, long j) {
        super(gVar);
        this.f = j;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new TakeSubscriber(upf, this.f));
    }
}
