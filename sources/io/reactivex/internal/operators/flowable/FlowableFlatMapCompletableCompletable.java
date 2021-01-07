package io.reactivex.internal.operators.flowable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlatMapCompletableCompletable<T> extends a implements b<T> {
    final g<T> a;
    final l<? super T, ? extends e> b;
    final int c;
    final boolean f;

    static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements j<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final c downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final l<? super T, ? extends e> mapper;
        final int maxConcurrency;
        final io.reactivex.disposables.a set = new io.reactivex.disposables.a();
        vpf upstream;

        final class InnerObserver extends AtomicReference<io.reactivex.disposables.b> implements c, io.reactivex.disposables.b {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
            }

            @Override // io.reactivex.disposables.b
            public boolean d() {
                return DisposableHelper.h((io.reactivex.disposables.b) get());
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
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.l(this, bVar);
            }
        }

        FlatMapCompletableMainSubscriber(c cVar, l<? super T, ? extends e> lVar, boolean z, int i) {
            this.downstream = cVar;
            this.mapper = lVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.set.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            this.set.dispose();
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
                dispose();
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
                InnerObserver innerObserver = new InnerObserver();
                if (!this.disposed && this.set.b(innerObserver)) {
                    eVar.subscribe(innerObserver);
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
    }

    public FlowableFlatMapCompletableCompletable(g<T> gVar, l<? super T, ? extends e> lVar, boolean z, int i) {
        this.a = gVar;
        this.b = lVar;
        this.f = z;
        this.c = i;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe((j) new FlatMapCompletableMainSubscriber(cVar, this.b, this.f, this.c));
    }

    @Override // io.reactivex.internal.fuseable.b
    public g<T> c() {
        return new FlowableFlatMapCompletable(this.a, this.b, this.f, this.c);
    }
}
