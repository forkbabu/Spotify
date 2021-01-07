package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableDebounceTimed<T> extends a<T, T> {
    final long f;
    final TimeUnit n;
    final y o;

    static final class DebounceEmitter<T> extends AtomicReference<b> implements Runnable, b {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final DebounceTimedSubscriber<T> parent;
        final T value;

        DebounceEmitter(T t, long j, DebounceTimedSubscriber<T> debounceTimedSubscriber) {
            this.value = t;
            this.idx = j;
            this.parent = debounceTimedSubscriber;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.once.compareAndSet(false, true)) {
                DebounceTimedSubscriber<T> debounceTimedSubscriber = this.parent;
                long j = this.idx;
                T t = this.value;
                if (j != debounceTimedSubscriber.index) {
                    return;
                }
                if (debounceTimedSubscriber.get() != 0) {
                    debounceTimedSubscriber.downstream.onNext(t);
                    yif.G(debounceTimedSubscriber, 1);
                    DisposableHelper.g(this);
                    return;
                }
                debounceTimedSubscriber.cancel();
                debounceTimedSubscriber.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements j<T>, vpf {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final upf<? super T> downstream;
        volatile long index;
        final long timeout;
        b timer;
        final TimeUnit unit;
        vpf upstream;
        final y.c worker;

        DebounceTimedSubscriber(upf<? super T> upf, long j, TimeUnit timeUnit, y.c cVar) {
            this.downstream = upf;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this, j);
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                b bVar = this.timer;
                if (bVar != null) {
                    bVar.dispose();
                }
                DebounceEmitter debounceEmitter = (DebounceEmitter) bVar;
                if (debounceEmitter != null) {
                    debounceEmitter.a();
                }
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done) {
                a.g(th);
                return;
            }
            this.done = true;
            b bVar = this.timer;
            if (bVar != null) {
                bVar.dispose();
            }
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                long j = this.index + 1;
                this.index = j;
                b bVar = this.timer;
                if (bVar != null) {
                    bVar.dispose();
                }
                DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
                this.timer = debounceEmitter;
                DisposableHelper.i(debounceEmitter, this.worker.c(debounceEmitter, this.timeout, this.unit));
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public FlowableDebounceTimed(g<T> gVar, long j, TimeUnit timeUnit, y yVar) {
        super(gVar);
        this.f = j;
        this.n = timeUnit;
        this.o = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new DebounceTimedSubscriber(new io.reactivex.subscribers.b(upf), this.f, this.n, this.o.a()));
    }
}
