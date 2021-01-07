package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.j;
import io.reactivex.processors.a;

/* access modifiers changed from: package-private */
public abstract class FlowableRepeatWhen$WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements j<T> {
    private static final long serialVersionUID = -5604623027276966720L;
    protected final upf<? super T> downstream;
    protected final a<U> processor;
    private long produced;
    protected final vpf receiver;

    FlowableRepeatWhen$WhenSourceSubscriber(upf<? super T> upf, a<U> aVar, vpf vpf) {
        super(false);
        this.downstream = upf;
        this.processor = aVar;
        this.receiver = vpf;
    }

    @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, defpackage.vpf
    public final void cancel() {
        super.cancel();
        this.receiver.cancel();
    }

    /* access modifiers changed from: protected */
    public final void h(U u) {
        g(EmptySubscription.INSTANCE);
        long j = this.produced;
        if (j != 0) {
            this.produced = 0;
            f(j);
        }
        this.receiver.n(1);
        this.processor.onNext(u);
    }

    @Override // defpackage.upf
    public final void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    @Override // io.reactivex.j, defpackage.upf
    public final void onSubscribe(vpf vpf) {
        g(vpf);
    }
}
