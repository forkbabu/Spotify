package io.reactivex.internal.operators.mixed;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.i;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableConcatMapCompletable<T> extends a {
    final g<T> a;
    final l<? super T, ? extends e> b;
    final ErrorMode c;
    final int f;

    static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements j<T>, b {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        int consumed;
        volatile boolean disposed;
        volatile boolean done;
        final c downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
        final l<? super T, ? extends e> mapper;
        final int prefetch;
        final i<T> queue;
        vpf upstream;

        /* access modifiers changed from: package-private */
        public static final class ConcatMapInnerObserver extends AtomicReference<b> implements c {
            private static final long serialVersionUID = 5638352172918776687L;
            final ConcatMapCompletableObserver<?> parent;

            ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.parent = concatMapCompletableObserver;
            }

            @Override // io.reactivex.c
            public void onComplete() {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.parent;
                concatMapCompletableObserver.active = false;
                concatMapCompletableObserver.a();
            }

            @Override // io.reactivex.c
            public void onError(Throwable th) {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.parent;
                if (!ExceptionHelper.a(concatMapCompletableObserver.errors, th)) {
                    io.reactivex.plugins.a.g(th);
                } else if (concatMapCompletableObserver.errorMode == ErrorMode.IMMEDIATE) {
                    concatMapCompletableObserver.upstream.cancel();
                    Throwable b = ExceptionHelper.b(concatMapCompletableObserver.errors);
                    if (b != ExceptionHelper.a) {
                        concatMapCompletableObserver.downstream.onError(b);
                    }
                    if (concatMapCompletableObserver.getAndIncrement() == 0) {
                        concatMapCompletableObserver.queue.clear();
                    }
                } else {
                    concatMapCompletableObserver.active = false;
                    concatMapCompletableObserver.a();
                }
            }

            @Override // io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.i(this, bVar);
            }
        }

        ConcatMapCompletableObserver(c cVar, l<? super T, ? extends e> lVar, ErrorMode errorMode2, int i) {
            this.downstream = cVar;
            this.mapper = lVar;
            this.errorMode = errorMode2;
            this.prefetch = i;
            this.queue = new SpscArrayQueue(i);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        if (this.errorMode != ErrorMode.BOUNDARY || this.errors.get() == null) {
                            boolean z = this.done;
                            T poll = this.queue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable b = ExceptionHelper.b(this.errors);
                                if (b != null) {
                                    this.downstream.onError(b);
                                    return;
                                } else {
                                    this.downstream.onComplete();
                                    return;
                                }
                            } else if (!z2) {
                                int i = this.prefetch;
                                int i2 = i - (i >> 1);
                                int i3 = this.consumed + 1;
                                if (i3 == i2) {
                                    this.consumed = 0;
                                    this.upstream.n((long) i2);
                                } else {
                                    this.consumed = i3;
                                }
                                try {
                                    Object apply = this.mapper.apply(poll);
                                    io.reactivex.internal.functions.a.c(apply, "The mapper returned a null CompletableSource");
                                    e eVar = (e) apply;
                                    this.active = true;
                                    eVar.subscribe(this.inner);
                                } catch (Throwable th) {
                                    yif.V(th);
                                    this.queue.clear();
                                    this.upstream.cancel();
                                    ExceptionHelper.a(this.errors, th);
                                    this.downstream.onError(ExceptionHelper.b(this.errors));
                                    return;
                                }
                            }
                        } else {
                            this.queue.clear();
                            this.downstream.onError(ExceptionHelper.b(this.errors));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.disposed;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            DisposableHelper.g(this.inner);
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.done = true;
            a();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (!ExceptionHelper.a(this.errors, th)) {
                io.reactivex.plugins.a.g(th);
            } else if (this.errorMode == ErrorMode.IMMEDIATE) {
                DisposableHelper.g(this.inner);
                Throwable b = ExceptionHelper.b(this.errors);
                if (b != ExceptionHelper.a) {
                    this.downstream.onError(b);
                }
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            } else {
                this.done = true;
                a();
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (this.queue.offer(t)) {
                a();
                return;
            }
            this.upstream.cancel();
            onError(new MissingBackpressureException("Queue full?!"));
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                vpf.n((long) this.prefetch);
            }
        }
    }

    public FlowableConcatMapCompletable(g<T> gVar, l<? super T, ? extends e> lVar, ErrorMode errorMode, int i) {
        this.a = gVar;
        this.b = lVar;
        this.c = errorMode;
        this.f = i;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe((j) new ConcatMapCompletableObserver(cVar, this.b, this.c, this.f));
    }
}
