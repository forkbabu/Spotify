package io.reactivex.internal.operators.flowable;

import io.reactivex.c;
import io.reactivex.disposables.a;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlatMapCompletable<T> extends a<T, T> {
    final l<? super T, ? extends e> f;
    final int n;
    final boolean o;

    static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements j<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final upf<? super T> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final l<? super T, ? extends e> mapper;
        final int maxConcurrency;
        final a set = new a();
        vpf upstream;

        final class InnerConsumer extends AtomicReference<b> implements c, b {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerConsumer() {
            }

            @Override // io.reactivex.disposables.b
            public boolean d() {
                return DisposableHelper.h((b) get());
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                DisposableHelper.g(this);
            }

            @Override // io.reactivex.c
            public void onComplete() {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.set.c(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            @Override // io.reactivex.c
            public void onError(Throwable th) {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.set.c(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            @Override // io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }
        }

        FlatMapCompletableMainSubscriber(upf<? super T> upf, l<? super T, ? extends e> lVar, boolean z, int i) {
            this.downstream = upf;
            this.mapper = lVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            lazySet(1);
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return i & 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return true;
        }

        @Override // defpackage.vpf
        public void n(long j) {
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b = ExceptionHelper.b(this.errors);
                if (b != null) {
                    this.downstream.onError(b);
                } else {
                    this.downstream.onComplete();
                }
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.n(1);
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (!ExceptionHelper.a(this.errors, th)) {
                io.reactivex.plugins.a.g(th);
            } else if (!this.delayErrors) {
                cancel();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(ExceptionHelper.b(this.errors));
                }
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(ExceptionHelper.b(this.errors));
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.n(1);
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null CompletableSource");
                e eVar = (e) apply;
                getAndIncrement();
                InnerConsumer innerConsumer = new InnerConsumer();
                if (!this.cancelled && this.set.b(innerConsumer)) {
                    eVar.subscribe(innerConsumer);
                }
            } catch (Throwable th) {
                yif.V(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    vpf.n(Long.MAX_VALUE);
                } else {
                    vpf.n((long) i);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            return null;
        }
    }

    public FlowableFlatMapCompletable(g<T> gVar, l<? super T, ? extends e> lVar, boolean z, int i) {
        super(gVar);
        this.f = lVar;
        this.o = z;
        this.n = i;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new FlatMapCompletableMainSubscriber(upf, this.f, this.o, this.n));
    }
}
