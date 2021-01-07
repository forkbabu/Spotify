package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableConcatMapEager<T, R> extends a<T, R> {
    final l<? super T, ? extends tpf<? extends R>> f;
    final int n;
    final int o;
    final ErrorMode p;

    static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements j<T>, vpf, d<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final upf<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final l<? super T, ? extends tpf<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        final AtomicLong requested = new AtomicLong();
        final a<InnerQueuedSubscriber<R>> subscribers;
        vpf upstream;

        ConcatMapEagerDelayErrorSubscriber(upf<? super R> upf, l<? super T, ? extends tpf<? extends R>> lVar, int i, int i2, ErrorMode errorMode2) {
            this.downstream = upf;
            this.mapper = lVar;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode2;
            this.subscribers = new a<>(Math.min(i2, i));
        }

        @Override // io.reactivex.internal.subscribers.d
        public void a() {
            int i;
            long j;
            boolean z;
            long j2;
            io.reactivex.internal.fuseable.j<R> b;
            ErrorMode errorMode2 = ErrorMode.IMMEDIATE;
            if (getAndIncrement() == 0) {
                InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
                upf<? super R> upf = this.downstream;
                ErrorMode errorMode3 = this.errorMode;
                int i2 = 1;
                while (true) {
                    long j3 = this.requested.get();
                    if (innerQueuedSubscriber == null) {
                        if (errorMode3 == ErrorMode.END || ((Throwable) this.errors.get()) == null) {
                            boolean z2 = this.done;
                            InnerQueuedSubscriber<R> poll = this.subscribers.poll();
                            if (!z2 || poll != null) {
                                if (poll != null) {
                                    this.current = poll;
                                }
                                innerQueuedSubscriber = poll;
                            } else {
                                Throwable b2 = ExceptionHelper.b(this.errors);
                                if (b2 != null) {
                                    upf.onError(b2);
                                    return;
                                } else {
                                    upf.onComplete();
                                    return;
                                }
                            }
                        } else {
                            f();
                            upf.onError(ExceptionHelper.b(this.errors));
                            return;
                        }
                    }
                    if (innerQueuedSubscriber == null || (b = innerQueuedSubscriber.b()) == null) {
                        i = i2;
                        j2 = 0;
                        z = false;
                        j = 0;
                    } else {
                        i = i2;
                        j = 0;
                        while (true) {
                            if (j == j3) {
                                break;
                            } else if (this.cancelled) {
                                f();
                                return;
                            } else if (errorMode3 != errorMode2 || ((Throwable) this.errors.get()) == null) {
                                boolean a = innerQueuedSubscriber.a();
                                try {
                                    R poll2 = b.poll();
                                    boolean z3 = poll2 == null;
                                    if (a && z3) {
                                        this.current = null;
                                        this.upstream.n(1);
                                        innerQueuedSubscriber = null;
                                        z = true;
                                        break;
                                    } else if (z3) {
                                        break;
                                    } else {
                                        upf.onNext(poll2);
                                        j++;
                                        innerQueuedSubscriber.c();
                                    }
                                } catch (Throwable th) {
                                    yif.V(th);
                                    this.current = null;
                                    SubscriptionHelper.d(innerQueuedSubscriber);
                                    f();
                                    upf.onError(th);
                                    return;
                                }
                            } else {
                                this.current = null;
                                SubscriptionHelper.d(innerQueuedSubscriber);
                                f();
                                upf.onError(ExceptionHelper.b(this.errors));
                                return;
                            }
                        }
                        z = false;
                        if (j == j3) {
                            if (this.cancelled) {
                                f();
                                return;
                            } else if (errorMode3 != errorMode2 || ((Throwable) this.errors.get()) == null) {
                                boolean a2 = innerQueuedSubscriber.a();
                                boolean isEmpty = b.isEmpty();
                                if (a2 && isEmpty) {
                                    this.current = null;
                                    this.upstream.n(1);
                                    innerQueuedSubscriber = null;
                                    j2 = 0;
                                    z = true;
                                }
                            } else {
                                this.current = null;
                                SubscriptionHelper.d(innerQueuedSubscriber);
                                f();
                                upf.onError(ExceptionHelper.b(this.errors));
                                return;
                            }
                        }
                        j2 = 0;
                    }
                    if (!(j == j2 || j3 == Long.MAX_VALUE)) {
                        this.requested.addAndGet(-j);
                    }
                    if (z) {
                        i2 = i;
                    } else {
                        i2 = addAndGet(-i);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.d
        public void b(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
            if (innerQueuedSubscriber.b().offer(r)) {
                a();
                return;
            }
            SubscriptionHelper.d(innerQueuedSubscriber);
            d(innerQueuedSubscriber, new MissingBackpressureException());
        }

        @Override // io.reactivex.internal.subscribers.d
        public void c(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.d();
            a();
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    do {
                        f();
                    } while (decrementAndGet() != 0);
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.d
        public void d(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
            if (ExceptionHelper.a(this.errors, th)) {
                innerQueuedSubscriber.d();
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.cancel();
                }
                a();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        /* access modifiers changed from: package-private */
        public void f() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
            this.current = null;
            if (innerQueuedSubscriber != null) {
                SubscriptionHelper.d(innerQueuedSubscriber);
            }
            while (true) {
                InnerQueuedSubscriber<R> poll = this.subscribers.poll();
                if (poll != null) {
                    SubscriptionHelper.d(poll);
                } else {
                    return;
                }
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                a();
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.done = true;
            a();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (ExceptionHelper.a(this.errors, th)) {
                this.done = true;
                a();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null Publisher");
                tpf tpf = (tpf) apply;
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.prefetch);
                if (!this.cancelled) {
                    this.subscribers.offer(innerQueuedSubscriber);
                    tpf.subscribe(innerQueuedSubscriber);
                    if (this.cancelled) {
                        SubscriptionHelper.d(innerQueuedSubscriber);
                        if (getAndIncrement() == 0) {
                            do {
                                f();
                            } while (decrementAndGet() != 0);
                        }
                    }
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
                vpf.n(i == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i);
            }
        }
    }

    public FlowableConcatMapEager(g<T> gVar, l<? super T, ? extends tpf<? extends R>> lVar, int i, int i2, ErrorMode errorMode) {
        super(gVar);
        this.f = lVar;
        this.n = i;
        this.o = i2;
        this.p = errorMode;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        this.c.subscribe((j) new ConcatMapEagerDelayErrorSubscriber(upf, this.f, this.n, this.o, this.p));
    }
}
