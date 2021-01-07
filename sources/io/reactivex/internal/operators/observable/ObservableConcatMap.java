package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.e;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.c;
import io.reactivex.plugins.a;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatMap<T, U> extends a<T, U> {
    final l<? super T, ? extends v<? extends U>> b;
    final int c;
    final ErrorMode f;

    static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements x<T>, b {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final x<? super R> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final l<? super T, ? extends v<? extends R>> mapper;
        final DelayErrorInnerObserver<R> observer;
        j<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        b upstream;

        /* access modifiers changed from: package-private */
        public static final class DelayErrorInnerObserver<R> extends AtomicReference<b> implements x<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final x<? super R> downstream;
            final ConcatMapDelayErrorObserver<?, R> parent;

            DelayErrorInnerObserver(x<? super R> xVar, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.downstream = xVar;
                this.parent = concatMapDelayErrorObserver;
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.a();
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onError(Throwable th) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                if (ExceptionHelper.a(concatMapDelayErrorObserver.error, th)) {
                    if (!concatMapDelayErrorObserver.tillTheEnd) {
                        concatMapDelayErrorObserver.upstream.dispose();
                    }
                    concatMapDelayErrorObserver.active = false;
                    concatMapDelayErrorObserver.a();
                    return;
                }
                a.g(th);
            }

            @Override // io.reactivex.x
            public void onNext(R r) {
                this.downstream.onNext(r);
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.i(this, bVar);
            }
        }

        ConcatMapDelayErrorObserver(x<? super R> xVar, l<? super T, ? extends v<? extends R>> lVar, int i, boolean z) {
            this.downstream = xVar;
            this.mapper = lVar;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new DelayErrorInnerObserver<>(xVar, this);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                x<? super R> xVar = this.downstream;
                j<T> jVar = this.queue;
                AtomicThrowable atomicThrowable = this.error;
                while (true) {
                    if (!this.active) {
                        if (this.cancelled) {
                            jVar.clear();
                            return;
                        } else if (this.tillTheEnd || ((Throwable) atomicThrowable.get()) == null) {
                            boolean z = this.done;
                            try {
                                T poll = jVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.cancelled = true;
                                    Throwable b = ExceptionHelper.b(atomicThrowable);
                                    if (b != null) {
                                        xVar.onError(b);
                                        return;
                                    } else {
                                        xVar.onComplete();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        Object apply = this.mapper.apply(poll);
                                        io.reactivex.internal.functions.a.c(apply, "The mapper returned a null ObservableSource");
                                        v vVar = (v) apply;
                                        if (vVar instanceof Callable) {
                                            try {
                                                Object obj = (Object) ((Callable) vVar).call();
                                                if (obj != 0 && !this.cancelled) {
                                                    xVar.onNext(obj);
                                                }
                                            } catch (Throwable th) {
                                                yif.V(th);
                                                ExceptionHelper.a(atomicThrowable, th);
                                            }
                                        } else {
                                            this.active = true;
                                            vVar.subscribe(this.observer);
                                        }
                                    } catch (Throwable th2) {
                                        yif.V(th2);
                                        this.cancelled = true;
                                        this.upstream.dispose();
                                        jVar.clear();
                                        ExceptionHelper.a(atomicThrowable, th2);
                                        xVar.onError(ExceptionHelper.b(atomicThrowable));
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                yif.V(th3);
                                this.cancelled = true;
                                this.upstream.dispose();
                                ExceptionHelper.a(atomicThrowable, th3);
                                xVar.onError(ExceptionHelper.b(atomicThrowable));
                                return;
                            }
                        } else {
                            jVar.clear();
                            this.cancelled = true;
                            xVar.onError(ExceptionHelper.b(atomicThrowable));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
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
            DisposableHelper.g(this.observer);
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
            a.g(th);
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
                this.queue = new io.reactivex.internal.queue.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    static final class SourceObserver<T, U> extends AtomicInteger implements x<T>, b {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final x<? super U> downstream;
        int fusionMode;
        final InnerObserver<U> inner;
        final l<? super T, ? extends v<? extends U>> mapper;
        j<T> queue;
        b upstream;

        /* access modifiers changed from: package-private */
        public static final class InnerObserver<U> extends AtomicReference<b> implements x<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final x<? super U> downstream;
            final SourceObserver<?, ?> parent;

            InnerObserver(x<? super U> xVar, SourceObserver<?, ?> sourceObserver) {
                this.downstream = xVar;
                this.parent = sourceObserver;
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onComplete() {
                SourceObserver<?, ?> sourceObserver = this.parent;
                sourceObserver.active = false;
                sourceObserver.a();
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onError(Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            @Override // io.reactivex.x
            public void onNext(U u) {
                this.downstream.onNext(u);
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.i(this, bVar);
            }
        }

        SourceObserver(x<? super U> xVar, l<? super T, ? extends v<? extends U>> lVar, int i) {
            this.downstream = xVar;
            this.mapper = lVar;
            this.bufferSize = i;
            this.inner = new InnerObserver<>(xVar, this);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            T poll = this.queue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.disposed = true;
                                this.downstream.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.mapper.apply(poll);
                                    io.reactivex.internal.functions.a.c(apply, "The mapper returned a null ObservableSource");
                                    v vVar = (v) apply;
                                    this.active = true;
                                    vVar.subscribe(this.inner);
                                } catch (Throwable th) {
                                    yif.V(th);
                                    dispose();
                                    this.queue.clear();
                                    this.downstream.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            yif.V(th2);
                            dispose();
                            this.queue.clear();
                            this.downstream.onError(th2);
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
            DisposableHelper.g(this.inner);
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                a();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.done) {
                a.g(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode == 0) {
                    this.queue.offer(t);
                }
                a();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof e) {
                    e eVar = (e) bVar;
                    int g = eVar.g(3);
                    if (g == 1) {
                        this.fusionMode = g;
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        a();
                        return;
                    } else if (g == 2) {
                        this.fusionMode = g;
                        this.queue = eVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMap(v<T> vVar, l<? super T, ? extends v<? extends U>> lVar, int i, ErrorMode errorMode) {
        super(vVar);
        this.b = lVar;
        this.f = errorMode;
        this.c = Math.max(8, i);
    }

    @Override // io.reactivex.s
    public void H0(x<? super U> xVar) {
        if (!a0.c(this.a, xVar, this.b)) {
            if (this.f == ErrorMode.IMMEDIATE) {
                this.a.subscribe(new SourceObserver(new c(xVar), this.b, this.c));
            } else {
                this.a.subscribe(new ConcatMapDelayErrorObserver(xVar, this.b, this.c, this.f == ErrorMode.END));
            }
        }
    }
}
