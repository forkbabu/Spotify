package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.fuseable.e;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.observers.f;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.v;
import io.reactivex.x;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableConcatMapEager<T, R> extends a<T, R> {
    final l<? super T, ? extends v<? extends R>> b;
    final ErrorMode c;
    final int f;
    final int n;

    static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements x<T>, b, f<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        volatile boolean cancelled;
        InnerQueuedObserver<R> current;
        volatile boolean done;
        final x<? super R> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final ErrorMode errorMode;
        final l<? super T, ? extends v<? extends R>> mapper;
        final int maxConcurrency;
        final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();
        final int prefetch;
        j<T> queue;
        int sourceMode;
        b upstream;

        ConcatMapEagerMainObserver(x<? super R> xVar, l<? super T, ? extends v<? extends R>> lVar, int i, int i2, ErrorMode errorMode2) {
            this.downstream = xVar;
            this.mapper = lVar;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode2;
        }

        @Override // io.reactivex.internal.observers.f
        public void a() {
            ErrorMode errorMode2 = ErrorMode.IMMEDIATE;
            if (getAndIncrement() == 0) {
                j<T> jVar = this.queue;
                ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
                x<? super R> xVar = this.downstream;
                ErrorMode errorMode3 = this.errorMode;
                int i = 1;
                while (true) {
                    int i2 = this.activeCount;
                    while (true) {
                        if (i2 == this.maxConcurrency) {
                            break;
                        } else if (this.cancelled) {
                            jVar.clear();
                            f();
                            return;
                        } else if (errorMode3 != errorMode2 || ((Throwable) this.error.get()) == null) {
                            try {
                                T poll = jVar.poll();
                                if (poll == null) {
                                    break;
                                }
                                Object apply = this.mapper.apply(poll);
                                a.c(apply, "The mapper returned a null ObservableSource");
                                v vVar = (v) apply;
                                InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.prefetch);
                                arrayDeque.offer(innerQueuedObserver);
                                vVar.subscribe(innerQueuedObserver);
                                i2++;
                            } catch (Throwable th) {
                                yif.V(th);
                                this.upstream.dispose();
                                jVar.clear();
                                f();
                                ExceptionHelper.a(this.error, th);
                                xVar.onError(ExceptionHelper.b(this.error));
                                return;
                            }
                        } else {
                            jVar.clear();
                            f();
                            xVar.onError(ExceptionHelper.b(this.error));
                            return;
                        }
                    }
                    this.activeCount = i2;
                    if (this.cancelled) {
                        jVar.clear();
                        f();
                        return;
                    } else if (errorMode3 != errorMode2 || ((Throwable) this.error.get()) == null) {
                        InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
                        if (innerQueuedObserver2 == null) {
                            if (errorMode3 != ErrorMode.BOUNDARY || ((Throwable) this.error.get()) == null) {
                                boolean z = this.done;
                                InnerQueuedObserver<R> poll2 = arrayDeque.poll();
                                boolean z2 = poll2 == null;
                                if (!z || !z2) {
                                    if (!z2) {
                                        this.current = poll2;
                                    }
                                    innerQueuedObserver2 = poll2;
                                } else if (((Throwable) this.error.get()) != null) {
                                    jVar.clear();
                                    f();
                                    xVar.onError(ExceptionHelper.b(this.error));
                                    return;
                                } else {
                                    xVar.onComplete();
                                    return;
                                }
                            } else {
                                jVar.clear();
                                f();
                                xVar.onError(ExceptionHelper.b(this.error));
                                return;
                            }
                        }
                        if (innerQueuedObserver2 != null) {
                            j<R> b = innerQueuedObserver2.b();
                            while (!this.cancelled) {
                                boolean a = innerQueuedObserver2.a();
                                if (errorMode3 != errorMode2 || ((Throwable) this.error.get()) == null) {
                                    try {
                                        R poll3 = b.poll();
                                        boolean z3 = poll3 == null;
                                        if (a && z3) {
                                            this.current = null;
                                            this.activeCount--;
                                        } else if (!z3) {
                                            xVar.onNext(poll3);
                                        }
                                    } catch (Throwable th2) {
                                        yif.V(th2);
                                        ExceptionHelper.a(this.error, th2);
                                        this.current = null;
                                        this.activeCount--;
                                    }
                                } else {
                                    jVar.clear();
                                    f();
                                    xVar.onError(ExceptionHelper.b(this.error));
                                    return;
                                }
                            }
                            jVar.clear();
                            f();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        jVar.clear();
                        f();
                        xVar.onError(ExceptionHelper.b(this.error));
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.observers.f
        public void b(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
            if (ExceptionHelper.a(this.error, th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.upstream.dispose();
                }
                innerQueuedObserver.c();
                a();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.internal.observers.f
        public void c(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.c();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (getAndIncrement() == 0) {
                    do {
                        this.queue.clear();
                        f();
                    } while (decrementAndGet() != 0);
                }
            }
        }

        @Override // io.reactivex.internal.observers.f
        public void e(InnerQueuedObserver<R> innerQueuedObserver, R r) {
            innerQueuedObserver.b().offer(r);
            a();
        }

        /* access modifiers changed from: package-private */
        public void f() {
            InnerQueuedObserver<R> innerQueuedObserver = this.current;
            if (innerQueuedObserver != null) {
                DisposableHelper.g(innerQueuedObserver);
            }
            while (true) {
                InnerQueuedObserver<R> poll = this.observers.poll();
                if (poll != null) {
                    DisposableHelper.g(poll);
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.done = true;
            a();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (ExceptionHelper.a(this.error, th)) {
                this.done = true;
                a();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.offer(t);
            }
            a();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof e) {
                    e eVar = (e) bVar;
                    int g = eVar.g(3);
                    if (g == 1) {
                        this.sourceMode = g;
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        a();
                        return;
                    } else if (g == 2) {
                        this.sourceMode = g;
                        this.queue = eVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.a(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapEager(v<T> vVar, l<? super T, ? extends v<? extends R>> lVar, ErrorMode errorMode, int i, int i2) {
        super(vVar);
        this.b = lVar;
        this.c = errorMode;
        this.f = i;
        this.n = i2;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        this.a.subscribe(new ConcatMapEagerMainObserver(xVar, this.b, this.f, this.n, this.c));
    }
}
