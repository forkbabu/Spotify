package io.reactivex.internal.operators.mixed;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.s;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatMapCompletable<T> extends a {
    final s<T> a;
    final l<? super T, ? extends e> b;
    final ErrorMode c;
    final int f;

    static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements x<T>, b {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        volatile boolean disposed;
        volatile boolean done;
        final c downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
        final l<? super T, ? extends e> mapper;
        final int prefetch;
        j<T> queue;
        b upstream;

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
                    concatMapCompletableObserver.disposed = true;
                    concatMapCompletableObserver.upstream.dispose();
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
        }

        /* access modifiers changed from: package-private */
        public void a() {
            boolean z;
            if (getAndIncrement() == 0) {
                AtomicThrowable atomicThrowable = this.errors;
                ErrorMode errorMode2 = this.errorMode;
                while (!this.disposed) {
                    if (!this.active) {
                        if (errorMode2 != ErrorMode.BOUNDARY || atomicThrowable.get() == null) {
                            boolean z2 = this.done;
                            e eVar = null;
                            try {
                                T poll = this.queue.poll();
                                if (poll != null) {
                                    Object apply = this.mapper.apply(poll);
                                    io.reactivex.internal.functions.a.c(apply, "The mapper returned a null CompletableSource");
                                    eVar = (e) apply;
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z2 && z) {
                                    this.disposed = true;
                                    Throwable b = ExceptionHelper.b(atomicThrowable);
                                    if (b != null) {
                                        this.downstream.onError(b);
                                        return;
                                    } else {
                                        this.downstream.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    this.active = true;
                                    eVar.subscribe(this.inner);
                                }
                            } catch (Throwable th) {
                                yif.V(th);
                                this.disposed = true;
                                this.queue.clear();
                                this.upstream.dispose();
                                ExceptionHelper.a(atomicThrowable, th);
                                this.downstream.onError(ExceptionHelper.b(atomicThrowable));
                                return;
                            }
                        } else {
                            this.disposed = true;
                            this.queue.clear();
                            this.downstream.onError(ExceptionHelper.b(atomicThrowable));
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
            this.upstream.dispose();
            DisposableHelper.g(this.inner);
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.done = true;
            a();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (!ExceptionHelper.a(this.errors, th)) {
                io.reactivex.plugins.a.g(th);
            } else if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.disposed = true;
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

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (t != null) {
                this.queue.offer(t);
            }
            a();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof io.reactivex.internal.fuseable.e) {
                    io.reactivex.internal.fuseable.e eVar = (io.reactivex.internal.fuseable.e) bVar;
                    int g = eVar.g(3);
                    if (g == 1) {
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        a();
                        return;
                    } else if (g == 2) {
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

    public ObservableConcatMapCompletable(s<T> sVar, l<? super T, ? extends e> lVar, ErrorMode errorMode, int i) {
        this.a = sVar;
        this.b = lVar;
        this.c = errorMode;
        this.f = i;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        if (!a.a(this.a, this.b, cVar)) {
            this.a.subscribe(new ConcatMapCompletableObserver(cVar, this.b, this.c, this.f));
        }
    }
}
