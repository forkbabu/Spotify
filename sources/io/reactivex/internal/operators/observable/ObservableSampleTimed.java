package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.c;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSampleTimed<T> extends a<T, T> {
    final long b;
    final TimeUnit c;
    final y f;
    final boolean n;

    static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip = new AtomicInteger(1);

        SampleTimedEmitLast(x<? super T> xVar, long j, TimeUnit timeUnit, y yVar) {
            super(xVar, j, timeUnit, yVar);
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void a() {
            b();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                b();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(x<? super T> xVar, long j, TimeUnit timeUnit, y yVar) {
            super(xVar, j, timeUnit, yVar);
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void a() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
        }
    }

    static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements x<T>, b, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final x<? super T> downstream;
        final long period;
        final y scheduler;
        final AtomicReference<b> timer = new AtomicReference<>();
        final TimeUnit unit;
        b upstream;

        SampleTimedObserver(x<? super T> xVar, long j, TimeUnit timeUnit, y yVar) {
            this.downstream = xVar;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = yVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public void b() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.upstream.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.timer);
            this.upstream.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            DisposableHelper.g(this.timer);
            a();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            DisposableHelper.g(this.timer);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
                y yVar = this.scheduler;
                long j = this.period;
                DisposableHelper.i(this.timer, yVar.d(this, j, j, this.unit));
            }
        }
    }

    public ObservableSampleTimed(v<T> vVar, long j, TimeUnit timeUnit, y yVar, boolean z) {
        super(vVar);
        this.b = j;
        this.c = timeUnit;
        this.f = yVar;
        this.n = z;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        c cVar = new c(xVar);
        if (this.n) {
            this.a.subscribe(new SampleTimedEmitLast(cVar, this.b, this.c, this.f));
        } else {
            this.a.subscribe(new SampleTimedNoLast(cVar, this.b, this.c, this.f));
        }
    }
}
