package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableDebounce<T, U> extends a<T, T> {
    final l<? super T, ? extends tpf<U>> f;

    /* access modifiers changed from: package-private */
    public static final class DebounceSubscriber<T, U> extends AtomicLong implements j<T>, vpf {
        private static final long serialVersionUID = 6725975399620862591L;
        final l<? super T, ? extends tpf<U>> debounceSelector;
        final AtomicReference<b> debouncer = new AtomicReference<>();
        boolean done;
        final upf<? super T> downstream;
        volatile long index;
        vpf upstream;

        static final class a<T, U> extends io.reactivex.subscribers.a<U> {
            final DebounceSubscriber<T, U> b;
            final long c;
            final T f;
            boolean n;
            final AtomicBoolean o = new AtomicBoolean();

            a(DebounceSubscriber<T, U> debounceSubscriber, long j, T t) {
                this.b = debounceSubscriber;
                this.c = j;
                this.f = t;
            }

            /* access modifiers changed from: package-private */
            public void b() {
                if (this.o.compareAndSet(false, true)) {
                    DebounceSubscriber<T, U> debounceSubscriber = this.b;
                    long j = this.c;
                    T t = this.f;
                    if (j != debounceSubscriber.index) {
                        return;
                    }
                    if (debounceSubscriber.get() != 0) {
                        debounceSubscriber.downstream.onNext(t);
                        yif.G(debounceSubscriber, 1);
                        return;
                    }
                    debounceSubscriber.cancel();
                    debounceSubscriber.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }

            @Override // defpackage.upf
            public void onComplete() {
                if (!this.n) {
                    this.n = true;
                    b();
                }
            }

            @Override // defpackage.upf
            public void onError(Throwable th) {
                if (this.n) {
                    io.reactivex.plugins.a.g(th);
                    return;
                }
                this.n = true;
                DebounceSubscriber<T, U> debounceSubscriber = this.b;
                DisposableHelper.g(debounceSubscriber.debouncer);
                debounceSubscriber.downstream.onError(th);
            }

            @Override // defpackage.upf
            public void onNext(U u) {
                if (!this.n) {
                    this.n = true;
                    a();
                    b();
                }
            }
        }

        DebounceSubscriber(upf<? super T> upf, l<? super T, ? extends tpf<U>> lVar) {
            this.downstream = upf;
            this.debounceSelector = lVar;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.g(this.debouncer);
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
                b bVar = this.debouncer.get();
                if (!DisposableHelper.h(bVar)) {
                    a aVar = (a) bVar;
                    if (aVar != null) {
                        aVar.b();
                    }
                    DisposableHelper.g(this.debouncer);
                    this.downstream.onComplete();
                }
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            DisposableHelper.g(this.debouncer);
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                long j = this.index + 1;
                this.index = j;
                b bVar = this.debouncer.get();
                if (bVar != null) {
                    bVar.dispose();
                }
                try {
                    Object apply = this.debounceSelector.apply(t);
                    io.reactivex.internal.functions.a.c(apply, "The publisher supplied is null");
                    tpf tpf = (tpf) apply;
                    a aVar = new a(this, j, t);
                    if (this.debouncer.compareAndSet(bVar, aVar)) {
                        tpf.subscribe(aVar);
                    }
                } catch (Throwable th) {
                    yif.V(th);
                    cancel();
                    this.downstream.onError(th);
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

    public FlowableDebounce(g<T> gVar, l<? super T, ? extends tpf<U>> lVar) {
        super(gVar);
        this.f = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new DebounceSubscriber(new io.reactivex.subscribers.b(upf), this.f));
    }
}
