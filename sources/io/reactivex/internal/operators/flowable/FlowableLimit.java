package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableLimit<T> extends a<T, T> {
    final long f;

    static final class LimitSubscriber<T> extends AtomicLong implements j<T>, vpf {
        private static final long serialVersionUID = 2288246011222124525L;
        final upf<? super T> downstream;
        long remaining;
        vpf upstream;

        LimitSubscriber(upf<? super T> upf, long j) {
            this.downstream = upf;
            this.remaining = j;
            lazySet(j);
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.l(j)) {
                do {
                    j2 = get();
                    if (j2 != 0) {
                        j3 = j2 <= j ? j2 : j;
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.upstream.n(j3);
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0;
                this.downstream.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.remaining > 0) {
                this.remaining = 0;
                this.downstream.onError(th);
                return;
            }
            a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            long j = this.remaining;
            if (j > 0) {
                long j2 = j - 1;
                this.remaining = j2;
                this.downstream.onNext(t);
                if (j2 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (!SubscriptionHelper.m(this.upstream, vpf)) {
                return;
            }
            if (this.remaining == 0) {
                vpf.cancel();
                EmptySubscription.d(this.downstream);
                return;
            }
            this.upstream = vpf;
            this.downstream.onSubscribe(this);
        }
    }

    public FlowableLimit(g<T> gVar, long j) {
        super(gVar);
        this.f = j;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new LimitSubscriber(upf, this.f));
    }
}
