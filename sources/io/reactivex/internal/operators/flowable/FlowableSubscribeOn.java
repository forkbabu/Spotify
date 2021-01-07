package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSubscribeOn<T> extends a<T, T> {
    final y f;
    final boolean n;

    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements j<T>, vpf, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final upf<? super T> downstream;
        final boolean nonScheduledRequests;
        final AtomicLong requested = new AtomicLong();
        tpf<T> source;
        final AtomicReference<vpf> upstream = new AtomicReference<>();
        final y.c worker;

        /* access modifiers changed from: package-private */
        public static final class a implements Runnable {
            final vpf a;
            final long b;

            a(vpf vpf, long j) {
                this.a = vpf;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.n(this.b);
            }
        }

        SubscribeOnSubscriber(upf<? super T> upf, y.c cVar, tpf<T> tpf, boolean z) {
            this.downstream = upf;
            this.worker = cVar;
            this.source = tpf;
            this.nonScheduledRequests = !z;
        }

        /* access modifiers changed from: package-private */
        public void a(long j, vpf vpf) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                vpf.n(j);
            } else {
                this.worker.b(new a(vpf, j));
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            SubscriptionHelper.d(this.upstream);
            this.worker.dispose();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                vpf vpf = this.upstream.get();
                if (vpf != null) {
                    a(j, vpf);
                    return;
                }
                yif.a(this.requested, j);
                vpf vpf2 = this.upstream.get();
                if (vpf2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        a(andSet, vpf2);
                    }
                }
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this.upstream, vpf)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, vpf);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            tpf<T> tpf = this.source;
            this.source = null;
            tpf.subscribe(this);
        }
    }

    public FlowableSubscribeOn(g<T> gVar, y yVar, boolean z) {
        super(gVar);
        this.f = yVar;
        this.n = z;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        y.c a = this.f.a();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(upf, a, this.c, this.n);
        upf.onSubscribe(subscribeOnSubscriber);
        a.b(subscribeOnSubscriber);
    }
}
