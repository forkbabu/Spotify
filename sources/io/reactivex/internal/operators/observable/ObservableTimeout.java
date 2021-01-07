package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTimeout<T, U, V> extends a<T, T> {
    final v<U> b;
    final l<? super T, ? extends v<V>> c;
    final v<? extends T> f;

    static final class TimeoutConsumer extends AtomicReference<b> implements x<Object>, b {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final a parent;

        TimeoutConsumer(long j, a aVar) {
            this.idx = j;
            this.parent = aVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.parent.a(this.idx);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.parent.b(this.idx, th);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.x
        public void onNext(Object obj) {
            b bVar = (b) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                bVar.dispose();
                lazySet(disposableHelper);
                this.parent.a(this.idx);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }
    }

    static final class TimeoutFallbackObserver<T> extends AtomicReference<b> implements x<T>, b, a {
        private static final long serialVersionUID = -7508389464265974549L;
        final x<? super T> downstream;
        v<? extends T> fallback;
        final AtomicLong index;
        final l<? super T, ? extends v<?>> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<b> upstream;

        TimeoutFallbackObserver(x<? super T> xVar, l<? super T, ? extends v<?>> lVar, v<? extends T> vVar) {
            this.downstream = xVar;
            this.itemTimeoutIndicator = lVar;
            this.fallback = vVar;
            this.index = new AtomicLong();
            this.upstream = new AtomicReference<>();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void a(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.g(this.upstream);
                v<? extends T> vVar = this.fallback;
                this.fallback = null;
                vVar.subscribe(new ObservableTimeoutTimed.a(this.downstream, this));
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.a
        public void b(long j, Throwable th) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.g(this);
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.upstream);
            DisposableHelper.g(this);
            DisposableHelper.g(this.task);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onComplete();
                DisposableHelper.g(this.task);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onError(th);
                DisposableHelper.g(this.task);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    b bVar = (b) this.task.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        Object apply = this.itemTimeoutIndicator.apply(t);
                        io.reactivex.internal.functions.a.c(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        v vVar = (v) apply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.i(this.task, timeoutConsumer)) {
                            vVar.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        yif.V(th);
                        this.upstream.get().dispose();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.upstream, bVar);
        }
    }

    static final class TimeoutObserver<T> extends AtomicLong implements x<T>, b, a {
        private static final long serialVersionUID = 3764492702657003550L;
        final x<? super T> downstream;
        final l<? super T, ? extends v<?>> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<b> upstream = new AtomicReference<>();

        TimeoutObserver(x<? super T> xVar, l<? super T, ? extends v<?>> lVar) {
            this.downstream = xVar;
            this.itemTimeoutIndicator = lVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.g(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.a
        public void b(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.g(this.upstream);
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h(this.upstream.get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.upstream);
            DisposableHelper.g(this.task);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    b bVar = (b) this.task.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        Object apply = this.itemTimeoutIndicator.apply(t);
                        io.reactivex.internal.functions.a.c(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        v vVar = (v) apply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.i(this.task, timeoutConsumer)) {
                            vVar.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        yif.V(th);
                        this.upstream.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.upstream, bVar);
        }
    }

    interface a extends ObservableTimeoutTimed.b {
        void b(long j, Throwable th);
    }

    public ObservableTimeout(s<T> sVar, v<U> vVar, l<? super T, ? extends v<V>> lVar, v<? extends T> vVar2) {
        super(sVar);
        this.b = vVar;
        this.c = lVar;
        this.f = vVar2;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        if (this.f == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(xVar, this.c);
            xVar.onSubscribe(timeoutObserver);
            v<U> vVar = this.b;
            if (vVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0, timeoutObserver);
                if (DisposableHelper.i(timeoutObserver.task, timeoutConsumer)) {
                    vVar.subscribe(timeoutConsumer);
                }
            }
            this.a.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(xVar, this.c, this.f);
        xVar.onSubscribe(timeoutFallbackObserver);
        v<U> vVar2 = this.b;
        if (vVar2 != null) {
            TimeoutConsumer timeoutConsumer2 = new TimeoutConsumer(0, timeoutFallbackObserver);
            if (DisposableHelper.i(timeoutFallbackObserver.task, timeoutConsumer2)) {
                vVar2.subscribe(timeoutConsumer2);
            }
        }
        this.a.subscribe(timeoutFallbackObserver);
    }
}
