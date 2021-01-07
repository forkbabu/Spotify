package io.reactivex.internal.operators.flowable;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlatMapSingle<T, R> extends a<T, R> {
    final l<? super T, ? extends d0<? extends R>> f;
    final boolean n;
    final int o;

    static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements j<T>, vpf {
        private static final long serialVersionUID = 8600231336733376951L;
        final AtomicInteger active = new AtomicInteger(1);
        volatile boolean cancelled;
        final boolean delayErrors;
        final upf<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final l<? super T, ? extends d0<? extends R>> mapper;
        final int maxConcurrency;
        final AtomicReference<a<R>> queue = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.disposables.a set = new io.reactivex.disposables.a();
        vpf upstream;

        final class InnerObserver extends AtomicReference<b> implements b0<R>, b {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            @Override // io.reactivex.disposables.b
            public boolean d() {
                return DisposableHelper.h((b) get());
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                DisposableHelper.g(this);
            }

            @Override // io.reactivex.b0
            public void onError(Throwable th) {
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.set.c(this);
                if (ExceptionHelper.a(flatMapSingleSubscriber.errors, th)) {
                    if (!flatMapSingleSubscriber.delayErrors) {
                        flatMapSingleSubscriber.upstream.cancel();
                        flatMapSingleSubscriber.set.dispose();
                    } else if (flatMapSingleSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                        flatMapSingleSubscriber.upstream.n(1);
                    }
                    flatMapSingleSubscriber.active.decrementAndGet();
                    flatMapSingleSubscriber.b();
                    return;
                }
                io.reactivex.plugins.a.g(th);
            }

            @Override // io.reactivex.b0
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }

            @Override // io.reactivex.b0
            public void onSuccess(R r) {
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.set.c(this);
                if (flatMapSingleSubscriber.get() == 0) {
                    boolean z = false;
                    if (flatMapSingleSubscriber.compareAndSet(0, 1)) {
                        if (flatMapSingleSubscriber.active.decrementAndGet() == 0) {
                            z = true;
                        }
                        if (flatMapSingleSubscriber.requested.get() != 0) {
                            flatMapSingleSubscriber.downstream.onNext(r);
                            a<R> aVar = flatMapSingleSubscriber.queue.get();
                            if (!z || (aVar != null && !aVar.isEmpty())) {
                                yif.G(flatMapSingleSubscriber.requested, 1);
                                if (flatMapSingleSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                                    flatMapSingleSubscriber.upstream.n(1);
                                }
                            } else {
                                Throwable b = ExceptionHelper.b(flatMapSingleSubscriber.errors);
                                if (b != null) {
                                    flatMapSingleSubscriber.downstream.onError(b);
                                    return;
                                } else {
                                    flatMapSingleSubscriber.downstream.onComplete();
                                    return;
                                }
                            }
                        } else {
                            a<R> d = flatMapSingleSubscriber.d();
                            synchronized (d) {
                                d.offer(r);
                            }
                        }
                        if (flatMapSingleSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                        flatMapSingleSubscriber.c();
                    }
                }
                a<R> d2 = flatMapSingleSubscriber.d();
                synchronized (d2) {
                    d2.offer(r);
                }
                flatMapSingleSubscriber.active.decrementAndGet();
                if (flatMapSingleSubscriber.getAndIncrement() != 0) {
                    return;
                }
                flatMapSingleSubscriber.c();
            }
        }

        FlatMapSingleSubscriber(upf<? super R> upf, l<? super T, ? extends d0<? extends R>> lVar, boolean z, int i) {
            this.downstream = upf;
            this.mapper = lVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            a<R> aVar = this.queue.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            boolean z;
            upf<? super R> upf = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<a<R>> atomicReference = this.queue;
            int i = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    z = false;
                    if (j2 == j) {
                        break;
                    } else if (this.cancelled) {
                        a();
                        return;
                    } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                        boolean z2 = atomicInteger.get() == 0;
                        a<R> aVar = atomicReference.get();
                        R poll = aVar != null ? aVar.poll() : null;
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            Throwable b = ExceptionHelper.b(this.errors);
                            if (b != null) {
                                upf.onError(b);
                                return;
                            } else {
                                upf.onComplete();
                                return;
                            }
                        } else if (z3) {
                            break;
                        } else {
                            upf.onNext(poll);
                            j2++;
                        }
                    } else {
                        Throwable b2 = ExceptionHelper.b(this.errors);
                        a();
                        upf.onError(b2);
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        a();
                        return;
                    } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                        boolean z4 = atomicInteger.get() == 0;
                        a<R> aVar2 = atomicReference.get();
                        if (aVar2 == null || aVar2.isEmpty()) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable b3 = ExceptionHelper.b(this.errors);
                            if (b3 != null) {
                                upf.onError(b3);
                                return;
                            } else {
                                upf.onComplete();
                                return;
                            }
                        }
                    } else {
                        Throwable b4 = ExceptionHelper.b(this.errors);
                        a();
                        upf.onError(b4);
                        return;
                    }
                }
                if (j2 != 0) {
                    yif.G(this.requested, j2);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.n(j2);
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        /* access modifiers changed from: package-private */
        public a<R> d() {
            a<R> aVar;
            do {
                a<R> aVar2 = this.queue.get();
                if (aVar2 != null) {
                    return aVar2;
                }
                aVar = new a<>(g.g());
            } while (!this.queue.compareAndSet(null, aVar));
            return aVar;
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                b();
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.active.decrementAndGet();
            b();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (ExceptionHelper.a(this.errors, th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                b();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null SingleSource");
                d0 d0Var = (d0) apply;
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.cancelled && this.set.b(innerObserver)) {
                    d0Var.subscribe(innerObserver);
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

    public FlowableFlatMapSingle(g<T> gVar, l<? super T, ? extends d0<? extends R>> lVar, boolean z, int i) {
        super(gVar);
        this.f = lVar;
        this.n = z;
        this.o = i;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        this.c.subscribe((j) new FlatMapSingleSubscriber(upf, this.f, this.n, this.o));
    }
}
