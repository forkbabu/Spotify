package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableOnBackpressureDrop<T> extends a<T, T> implements g<T> {
    final g<? super T> f = this;

    static final class BackpressureDropSubscriber<T> extends AtomicLong implements j<T>, vpf {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final upf<? super T> downstream;
        final g<? super T> onDrop;
        vpf upstream;

        BackpressureDropSubscriber(upf<? super T> upf, g<? super T> gVar) {
            this.downstream = upf;
            this.onDrop = gVar;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this, j);
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
                if (get() != 0) {
                    this.downstream.onNext(t);
                    yif.G(this, 1);
                    return;
                }
                try {
                    this.onDrop.accept(t);
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

    public FlowableOnBackpressureDrop(io.reactivex.g<T> gVar) {
        super(gVar);
    }

    @Override // io.reactivex.functions.g
    public void accept(T t) {
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new BackpressureDropSubscriber(upf, this.f));
    }
}
