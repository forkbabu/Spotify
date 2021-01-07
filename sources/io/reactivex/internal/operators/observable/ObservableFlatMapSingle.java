package io.reactivex.internal.operators.observable;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMapSingle<T, R> extends a<T, R> {
    final l<? super T, ? extends d0<? extends R>> b;
    final boolean c;

    static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements x<T>, b {
        private static final long serialVersionUID = 8600231336733376951L;
        final AtomicInteger active = new AtomicInteger(1);
        volatile boolean cancelled;
        final boolean delayErrors;
        final x<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final l<? super T, ? extends d0<? extends R>> mapper;
        final AtomicReference<a<R>> queue = new AtomicReference<>();
        final io.reactivex.disposables.a set = new io.reactivex.disposables.a();
        b upstream;

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
                FlatMapSingleObserver flatMapSingleObserver = FlatMapSingleObserver.this;
                flatMapSingleObserver.set.c(this);
                if (ExceptionHelper.a(flatMapSingleObserver.errors, th)) {
                    if (!flatMapSingleObserver.delayErrors) {
                        flatMapSingleObserver.upstream.dispose();
                        flatMapSingleObserver.set.dispose();
                    }
                    flatMapSingleObserver.active.decrementAndGet();
                    flatMapSingleObserver.a();
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
                a<R> aVar;
                FlatMapSingleObserver flatMapSingleObserver = FlatMapSingleObserver.this;
                flatMapSingleObserver.set.c(this);
                if (flatMapSingleObserver.get() == 0) {
                    boolean z = false;
                    if (flatMapSingleObserver.compareAndSet(0, 1)) {
                        flatMapSingleObserver.downstream.onNext(r);
                        if (flatMapSingleObserver.active.decrementAndGet() == 0) {
                            z = true;
                        }
                        a<R> aVar2 = flatMapSingleObserver.queue.get();
                        if (!z || (aVar2 != null && !aVar2.isEmpty())) {
                            if (flatMapSingleObserver.decrementAndGet() == 0) {
                                return;
                            }
                            flatMapSingleObserver.b();
                        }
                        Throwable b = ExceptionHelper.b(flatMapSingleObserver.errors);
                        if (b != null) {
                            flatMapSingleObserver.downstream.onError(b);
                            return;
                        } else {
                            flatMapSingleObserver.downstream.onComplete();
                            return;
                        }
                    }
                }
                do {
                    aVar = flatMapSingleObserver.queue.get();
                    if (aVar != null) {
                        break;
                    }
                    aVar = new a<>(s.g());
                } while (!flatMapSingleObserver.queue.compareAndSet(null, aVar));
                synchronized (aVar) {
                    aVar.offer(r);
                }
                flatMapSingleObserver.active.decrementAndGet();
                if (flatMapSingleObserver.getAndIncrement() != 0) {
                    return;
                }
                flatMapSingleObserver.b();
            }
        }

        FlatMapSingleObserver(x<? super R> xVar, l<? super T, ? extends d0<? extends R>> lVar, boolean z) {
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
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null SingleSource");
                d0 d0Var = (d0) apply;
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.cancelled && this.set.b(innerObserver)) {
                    d0Var.subscribe(innerObserver);
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

    public ObservableFlatMapSingle(v<T> vVar, l<? super T, ? extends d0<? extends R>> lVar, boolean z) {
        super(vVar);
        this.b = lVar;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        this.a.subscribe(new FlatMapSingleObserver(xVar, this.b, this.c));
    }
}
