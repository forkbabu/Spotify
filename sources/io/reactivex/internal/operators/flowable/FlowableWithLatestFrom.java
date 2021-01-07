package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.c;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.subscribers.b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableWithLatestFrom<T, U, R> extends a<T, R> {
    final c<? super T, ? super U, ? extends R> f;
    final tpf<? extends U> n;

    static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements io.reactivex.internal.fuseable.a<T>, vpf {
        private static final long serialVersionUID = -312246233408980075L;
        final c<? super T, ? super U, ? extends R> combiner;
        final upf<? super R> downstream;
        final AtomicReference<vpf> other = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<vpf> upstream = new AtomicReference<>();

        WithLatestFromSubscriber(upf<? super R> upf, c<? super T, ? super U, ? extends R> cVar) {
            this.downstream = upf;
            this.combiner = cVar;
        }

        @Override // defpackage.vpf
        public void cancel() {
            SubscriptionHelper.d(this.upstream);
            SubscriptionHelper.d(this.other);
        }

        @Override // io.reactivex.internal.fuseable.a
        public boolean e(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    Object a = this.combiner.a(t, obj);
                    io.reactivex.internal.functions.a.c(a, "The combiner returned a null value");
                    this.downstream.onNext(a);
                    return true;
                } catch (Throwable th) {
                    yif.V(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
            return false;
        }

        @Override // defpackage.vpf
        public void n(long j) {
            SubscriptionHelper.g(this.upstream, this.requested, j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            SubscriptionHelper.d(this.other);
            this.downstream.onComplete();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            SubscriptionHelper.d(this.other);
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!e(t)) {
                this.upstream.get().n(1);
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            SubscriptionHelper.h(this.upstream, this.requested, vpf);
        }
    }

    final class a implements j<U> {
        private final WithLatestFromSubscriber<T, U, R> a;

        a(FlowableWithLatestFrom flowableWithLatestFrom, WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.a = withLatestFromSubscriber;
        }

        @Override // defpackage.upf
        public void onComplete() {
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber = this.a;
            SubscriptionHelper.d(withLatestFromSubscriber.upstream);
            withLatestFromSubscriber.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(U u) {
            this.a.lazySet(u);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this.a.other, vpf)) {
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public FlowableWithLatestFrom(g<T> gVar, c<? super T, ? super U, ? extends R> cVar, tpf<? extends U> tpf) {
        super(gVar);
        this.f = cVar;
        this.n = tpf;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        b bVar = new b(upf);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(bVar, this.f);
        bVar.onSubscribe(withLatestFromSubscriber);
        this.n.subscribe(new a(this, withLatestFromSubscriber));
        this.c.subscribe((j) withLatestFromSubscriber);
    }
}
