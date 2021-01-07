package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.processors.a;
import io.reactivex.subscribers.b;

public final class FlowableRetryWhen<T> extends a<T, T> {
    final l<? super g<Throwable>, ? extends tpf<?>> f;

    static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        RetryWhenSubscriber(upf<? super T> upf, a<Throwable> aVar, vpf vpf) {
            super(upf, aVar, vpf);
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            h(th);
        }
    }

    public FlowableRetryWhen(g<T> gVar, l<? super g<Throwable>, ? extends tpf<?>> lVar) {
        super(gVar);
        this.f = lVar;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        b bVar = new b(upf);
        a<T> q0 = UnicastProcessor.s0(8).q0();
        try {
            Object apply = this.f.apply(q0);
            io.reactivex.internal.functions.a.c(apply, "handler returned a null Publisher");
            tpf tpf = (tpf) apply;
            FlowableRepeatWhen$WhenReceiver flowableRepeatWhen$WhenReceiver = new FlowableRepeatWhen$WhenReceiver(this.c);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(bVar, q0, flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.subscriber = retryWhenSubscriber;
            upf.onSubscribe(retryWhenSubscriber);
            tpf.subscribe(flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.onNext(0);
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
