package io.reactivex.internal.operators.mixed;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableAndThenPublisher<R> extends g<R> {
    final e c;
    final tpf<? extends R> f;

    public CompletableAndThenPublisher(e eVar, tpf<? extends R> tpf) {
        this.c = eVar;
        this.f = tpf;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        this.c.subscribe(new AndThenPublisherSubscriber(upf, this.f));
    }

    static final class AndThenPublisherSubscriber<R> extends AtomicReference<vpf> implements j<R>, c, vpf {
        private static final long serialVersionUID = -8948264376121066672L;
        final upf<? super R> downstream;
        tpf<? extends R> other;
        final AtomicLong requested = new AtomicLong();
        b upstream;

        AndThenPublisherSubscriber(upf<? super R> upf, tpf<? extends R> tpf) {
            this.downstream = upf;
            this.other = tpf;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.d(this);
        }

        @Override // defpackage.vpf
        public void n(long j) {
            SubscriptionHelper.g(this, this.requested, j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            tpf<? extends R> tpf = this.other;
            if (tpf == null) {
                this.downstream.onComplete();
                return;
            }
            this.other = null;
            tpf.subscribe(this);
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            SubscriptionHelper.h(this, this.requested, vpf);
        }
    }
}
