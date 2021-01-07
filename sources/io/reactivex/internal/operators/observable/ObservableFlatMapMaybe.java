package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMapMaybe<T, R> extends a<T, R> {
    final l<? super T, ? extends p<? extends R>> b;
    final boolean c;

    static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements x<T>, b {
        private static final long serialVersionUID = 8600231336733376951L;
        final AtomicInteger active = new AtomicInteger(1);
        volatile boolean cancelled;
        final boolean delayErrors;
        final x<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final l<? super T, ? extends p<? extends R>> mapper;
        final AtomicReference<a<R>> queue = new AtomicReference<>();
        final io.reactivex.disposables.a set = new io.reactivex.disposables.a();
        b upstream;

        final class InnerObserver extends AtomicReference<b> implements n<R>, b {
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

            @Override // io.reactivex.n
            public void onComplete() {
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.set.c(this);
                if (flatMapMaybeObserver.get() == 0) {
                    boolean z = false;
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        if (flatMapMaybeObserver.active.decrementAndGet() == 0) {
                            z = true;
                        }
                        a<R> aVar = flatMapMaybeObserver.queue.get();
                        if (z && (aVar == null || aVar.isEmpty())) {
                            Throwable b = ExceptionHelper.b(flatMapMaybeObserver.errors);
                            if (b != null) {
                                flatMapMaybeObserver.downstream.onError(b);
                                return;
                            } else {
                                flatMapMaybeObserver.downstream.onComplete();
                                return;
                            }
                        } else if (flatMapMaybeObserver.decrementAndGet() != 0) {
                            flatMapMaybeObserver.b();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                flatMapMaybeObserver.active.decrementAndGet();
                flatMapMaybeObserver.a();
            }

            @Override // io.reactivex.n
            public void onError(Throwable th) {
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.set.c(this);
                if (ExceptionHelper.a(flatMapMaybeObserver.errors, th)) {
                    if (!flatMapMaybeObserver.delayErrors) {
                        flatMapMaybeObserver.upstream.dispose();
                        flatMapMaybeObserver.set.dispose();
                    }
                    flatMapMaybeObserver.active.decrementAndGet();
                    flatMapMaybeObserver.a();
                    return;
                }
                io.reactivex.plugins.a.g(th);
            }

            @Override // io.reactivex.n
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }

            @Override // io.reactivex.n
            public void onSuccess(R r) {
                a<R> aVar;
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.set.c(this);
                if (flatMapMaybeObserver.get() == 0) {
                    boolean z = false;
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        flatMapMaybeObserver.downstream.onNext(r);
                        if (flatMapMaybeObserver.active.decrementAndGet() == 0) {
                            z = true;
                        }
                        a<R> aVar2 = flatMapMaybeObserver.queue.get();
                        if (!z || (aVar2 != null && !aVar2.isEmpty())) {
                            if (flatMapMaybeObserver.decrementAndGet() == 0) {
                                return;
                            }
                            flatMapMaybeObserver.b();
                        }
                        Throwable b = ExceptionHelper.b(flatMapMaybeObserver.errors);
                        if (b != null) {
                            flatMapMaybeObserver.downstream.onError(b);
                            return;
                        } else {
                            flatMapMaybeObserver.downstream.onComplete();
                            return;
                        }
                    }
                }
                do {
                    aVar = flatMapMaybeObserver.queue.get();
                    if (aVar != null) {
                        break;
                    }
                    aVar = new a<>(s.g());
                } while (!flatMapMaybeObserver.queue.compareAndSet(null, aVar));
                synchronized (aVar) {
                    aVar.offer(r);
                }
                flatMapMaybeObserver.active.decrementAndGet();
                if (flatMapMaybeObserver.getAndIncrement() != 0) {
                    return;
                }
                flatMapMaybeObserver.b();
            }
        }

        FlatMapMaybeObserver(x<? super R> xVar, l<? super T, ? extends p<? extends R>> lVar, boolean z) {
            this.downstream = xVar;
            this.mapper = lVar;
            this.delayErrors = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            x<? super R> xVar = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<a<R>> atomicReference = this.queue;
            int i = 1;
            while (!this.cancelled) {
                if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    a<R> aVar = atomicReference.get();
                    R poll = aVar != null ? aVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable b = ExceptionHelper.b(this.errors);
                        if (b != null) {
                            xVar.onError(b);
                            return;
                        } else {
                            xVar.onComplete();
                            return;
                        }
                    } else if (z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        xVar.onNext(poll);
                    }
                } else {
                    Throwable b2 = ExceptionHelper.b(this.errors);
                    a<R> aVar2 = this.queue.get();
                    if (aVar2 != null) {
                        aVar2.clear();
                    }
                    xVar.onError(b2);
                    return;
                }
            }
            a<R> aVar3 = this.queue.get();
            if (aVar3 != null) {
                aVar3.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.active.decrementAndGet();
            a();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (ExceptionHelper.a(this.errors, th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                a();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null MaybeSource");
                p pVar = (p) apply;
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.cancelled && this.set.b(innerObserver)) {
                    pVar.subscribe(innerObserver);
                }
            } catch (Throwable th) {
                yif.V(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapMaybe(v<T> vVar, l<? super T, ? extends p<? extends R>> lVar, boolean z) {
        super(vVar);
        this.b = lVar;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        this.a.subscribe(new FlatMapMaybeObserver(xVar, this.b, this.c));
    }
}
