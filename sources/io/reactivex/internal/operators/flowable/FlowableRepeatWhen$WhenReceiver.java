package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class FlowableRepeatWhen$WhenReceiver<T, U> extends AtomicInteger implements j<Object>, vpf {
    private static final long serialVersionUID = 2827772011130406689L;
    final AtomicLong requested = new AtomicLong();
    final tpf<T> source;
    FlowableRepeatWhen$WhenSourceSubscriber<T, U> subscriber;
    final AtomicReference<vpf> upstream = new AtomicReference<>();

    FlowableRepeatWhen$WhenReceiver(tpf<T> tpf) {
        this.source = tpf;
    }

    @Override // defpackage.vpf
    public void cancel() {
        SubscriptionHelper.d(this.upstream);
    }

    @Override // defpackage.vpf
    public void n(long j) {
        SubscriptionHelper.g(this.upstream, this.requested, j);
    }

    @Override // defpackage.upf
    public void onComplete() {
        this.subscriber.cancel();
        this.subscriber.downstream.onComplete();
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        this.subscriber.cancel();
        this.subscriber.downstream.onError(th);
    }

    @Override // defpackage.upf
    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.source.subscribe(this.subscriber);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        SubscriptionHelper.h(this.upstream, this.requested, vpf);
    }
}
