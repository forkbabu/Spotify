package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTimeoutTimed<T> extends a<T, T> {
    final long b;
    final TimeUnit c;
    final y f;
    final v<? extends T> n;

    static final class TimeoutFallbackObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements x<T>, io.reactivex.disposables.b, b {
        private static final long serialVersionUID = 3764492702657003550L;
        final x<? super T> downstream;
        v<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<io.reactivex.disposables.b> upstream = new AtomicReference<>();
        final y.c worker;

        TimeoutFallbackObserver(x<? super T> xVar, long j, TimeUnit timeUnit, y.c cVar, v<? extends T> vVar) {
            this.downstream = xVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = vVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void a(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.g(this.upstream);
                v<? extends T> vVar = this.fallback;
                this.fallback = null;
                vVar.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((io.reactivex.disposables.b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.upstream);
            DisposableHelper.g(this);
            this.worker.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onError(th);
                this.worker.dispose();
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
                    ((io.reactivex.disposables.b) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    DisposableHelper.i(this.task, this.worker.c(new c(j2, this), this.timeout, this.unit));
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.l(this.upstream, bVar);
        }
    }

    static final class TimeoutObserver<T> extends AtomicLong implements x<T>, io.reactivex.disposables.b, b {
        private static final long serialVersionUID = 3764492702657003550L;
        final x<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<io.reactivex.disposables.b> upstream = new AtomicReference<>();
        final y.c worker;

        TimeoutObserver(x<? super T> xVar, long j, TimeUnit timeUnit, y.c cVar) {
            this.downstream = xVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.g(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.d(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h(this.upstream.get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onError(th);
                this.worker.dispose();
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
                    ((io.reactivex.disposables.b) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    DisposableHelper.i(this.task, this.worker.c(new c(j2, this), this.timeout, this.unit));
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.l(this.upstream, bVar);
        }
    }

    static final class a<T> implements x<T> {
        final x<? super T> a;
        final AtomicReference<io.reactivex.disposables.b> b;

        a(x<? super T> xVar, AtomicReference<io.reactivex.disposables.b> atomicReference) {
            this.a = xVar;
            this.b = atomicReference;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.i(this.b, bVar);
        }
    }

    interface b {
        void a(long j);
    }

    static final class c implements Runnable {
        final b a;
        final long b;

        c(long j, b bVar) {
            this.b = j;
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b);
        }
    }

    public ObservableTimeoutTimed(s<T> sVar, long j, TimeUnit timeUnit, y yVar, v<? extends T> vVar) {
        super(sVar);
        this.b = j;
        this.c = timeUnit;
        this.f = yVar;
        this.n = vVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        if (this.n == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(xVar, this.b, this.c, this.f.a());
            xVar.onSubscribe(timeoutObserver);
            DisposableHelper.i(timeoutObserver.task, timeoutObserver.worker.c(new c(0, timeoutObserver), timeoutObserver.timeout, timeoutObserver.unit));
            this.a.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(xVar, this.b, this.c, this.f.a(), this.n);
        xVar.onSubscribe(timeoutFallbackObserver);
        DisposableHelper.i(timeoutFallbackObserver.task, timeoutFallbackObserver.worker.c(new c(0, timeoutFallbackObserver), timeoutFallbackObserver.timeout, timeoutFallbackObserver.unit));
        this.a.subscribe(timeoutFallbackObserver);
    }
}
