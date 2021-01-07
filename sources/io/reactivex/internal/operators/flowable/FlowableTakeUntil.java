package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableTakeUntil<T, U> extends a<T, T> {
    final tpf<? extends U> f;

    /* access modifiers changed from: package-private */
    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements j<T>, vpf {
        private static final long serialVersionUID = -4945480365982832967L;
        final upf<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final TakeUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<vpf> upstream = new AtomicReference<>();

        final class OtherSubscriber extends AtomicReference<vpf> implements j<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            OtherSubscriber() {
            }

            @Override // defpackage.upf
            public void onComplete() {
                SubscriptionHelper.d(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                yif.A(takeUntilMainSubscriber.downstream, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // defpackage.upf
            public void onError(Throwable th) {
                SubscriptionHelper.d(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                yif.C(takeUntilMainSubscriber.downstream, th, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // defpackage.upf
            public void onNext(Object obj) {
                SubscriptionHelper.d(this);
                onComplete();
            }

            @Override // io.reactivex.j, defpackage.upf
            public void onSubscribe(vpf vpf) {
                if (SubscriptionHelper.k(this, vpf)) {
                    vpf.n(Long.MAX_VALUE);
                }
            }
        }

        TakeUntilMainSubscriber(upf<? super T> upf) {
            this.downstream = upf;
        }

        @Override // defpackage.vpf
        public void cancel() {
            SubscriptionHelper.d(this.upstream);
            SubscriptionHelper.d(this.other);
        }

        @Override // defpackage.vpf
        public void n(long j) {
            SubscriptionHelper.g(this.upstream, this.requested, j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            SubscriptionHelper.d(this.other);
            yif.A(this.downstream, this, this.error);
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            SubscriptionHelper.d(this.other);
            yif.C(this.downstream, th, this, this.error);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            yif.E(this.downstream, t, this, this.error);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            SubscriptionHelper.h(this.upstream, this.requested, vpf);
        }
    }

    public FlowableTakeUntil(g<T> gVar, tpf<? extends U> tpf) {
        super(gVar);
        this.f = tpf;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        TakeUntilMainSubscriber takeUntilMainSubscriber = new TakeUntilMainSubscriber(upf);
        upf.onSubscribe(takeUntilMainSubscriber);
        this.f.subscribe(takeUntilMainSubscriber.other);
        this.c.subscribe((j) takeUntilMainSubscriber);
    }
}
