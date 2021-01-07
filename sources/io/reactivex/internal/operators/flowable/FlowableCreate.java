package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.f;
import io.reactivex.g;
import io.reactivex.h;
import io.reactivex.i;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableCreate<T> extends g<T> {
    final i<T> c;
    final BackpressureStrategy f;

    /* access modifiers changed from: package-private */
    public static abstract class BaseEmitter<T> extends AtomicLong implements h<T>, vpf {
        private static final long serialVersionUID = 7326289992464377023L;
        final upf<? super T> downstream;
        final SequentialDisposable serial = new SequentialDisposable();

        BaseEmitter(upf<? super T> upf) {
            this.downstream = upf;
        }

        @Override // io.reactivex.h
        public final void a(b bVar) {
            DisposableHelper.k(this.serial, bVar);
        }

        /* access modifiers changed from: protected */
        public void b() {
            if (!isCancelled()) {
                try {
                    this.downstream.onComplete();
                } finally {
                    DisposableHelper.g(this.serial);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public boolean c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                DisposableHelper.g(this.serial);
                return true;
            } catch (Throwable th2) {
                DisposableHelper.g(this.serial);
                throw th2;
            }
        }

        @Override // defpackage.vpf
        public final void cancel() {
            DisposableHelper.g(this.serial);
            h();
        }

        @Override // io.reactivex.h
        public final void e(f fVar) {
            DisposableHelper.k(this.serial, new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.h
        public boolean f(Throwable th) {
            return c(th);
        }

        /* access modifiers changed from: package-private */
        public void g() {
        }

        /* access modifiers changed from: package-private */
        public void h() {
        }

        @Override // io.reactivex.h
        public final boolean isCancelled() {
            return this.serial.d();
        }

        @Override // defpackage.vpf
        public final void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this, j);
                g();
            }
        }

        @Override // io.reactivex.f
        public void onComplete() {
            b();
        }

        @Override // io.reactivex.f
        public final void onError(Throwable th) {
            if (!f(th)) {
                a.g(th);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong, java.lang.Object
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final io.reactivex.internal.queue.a<T> queue;
        final AtomicInteger wip = new AtomicInteger();

        BufferAsyncEmitter(upf<? super T> upf, int i) {
            super(upf);
            this.queue = new io.reactivex.internal.queue.a<>(i);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.h
        public boolean f(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            i();
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void g() {
            i();
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void h() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            if (this.wip.getAndIncrement() == 0) {
                upf<? super T> upf = this.downstream;
                io.reactivex.internal.queue.a<T> aVar = this.queue;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (isCancelled()) {
                            aVar.clear();
                            return;
                        }
                        boolean z = this.done;
                        T poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable th = this.error;
                            if (th != null) {
                                c(th);
                                return;
                            } else {
                                b();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            upf.onNext(poll);
                            j2++;
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            aVar.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean isEmpty = aVar.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                c(th2);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        yif.G(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.f
        public void onComplete() {
            this.done = true;
            i();
        }

        @Override // io.reactivex.f
        public void onNext(T t) {
            if (!this.done && !isCancelled()) {
                if (t == null) {
                    NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!f(nullPointerException)) {
                        a.g(nullPointerException);
                        return;
                    }
                    return;
                }
                this.queue.offer(t);
                i();
            }
        }
    }

    static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        DropAsyncEmitter(upf<? super T> upf) {
            super(upf);
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public void i() {
        }
    }

    static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(upf<? super T> upf) {
            super(upf);
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public void i() {
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("create: could not emit value due to lack of requests");
            if (!f(missingBackpressureException)) {
                a.g(missingBackpressureException);
            }
        }
    }

    static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        LatestAsyncEmitter(upf<? super T> upf) {
            super(upf);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.h
        public boolean f(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            i();
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void g() {
            i();
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void h() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                upf<? super T> upf = this.downstream;
                AtomicReference<T> atomicReference = this.queue;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z2 = this.done;
                            T andSet = atomicReference.getAndSet(null);
                            boolean z3 = andSet == null;
                            if (z2 && z3) {
                                Throwable th = this.error;
                                if (th != null) {
                                    c(th);
                                    return;
                                } else {
                                    b();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                upf.onNext(andSet);
                                j2++;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                c(th2);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        yif.G(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.f
        public void onComplete() {
            this.done = true;
            i();
        }

        @Override // io.reactivex.f
        public void onNext(T t) {
            if (!this.done && !isCancelled()) {
                if (t == null) {
                    NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!f(nullPointerException)) {
                        a.g(nullPointerException);
                        return;
                    }
                    return;
                }
                this.queue.set(t);
                i();
            }
        }
    }

    static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(upf<? super T> upf) {
            super(upf);
        }

        @Override // io.reactivex.f
        public void onNext(T t) {
            long j;
            if (!isCancelled()) {
                if (t != null) {
                    this.downstream.onNext(t);
                    do {
                        j = get();
                        if (j == 0) {
                            return;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!f(nullPointerException)) {
                    a.g(nullPointerException);
                }
            }
        }
    }

    static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        NoOverflowBaseAsyncEmitter(upf<? super T> upf) {
            super(upf);
        }

        /* access modifiers changed from: package-private */
        public abstract void i();

        @Override // io.reactivex.f
        public final void onNext(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!f(nullPointerException)) {
                        a.g(nullPointerException);
                    }
                } else if (get() != 0) {
                    this.downstream.onNext(t);
                    yif.G(this, 1);
                } else {
                    i();
                }
            }
        }
    }

    public FlowableCreate(i<T> iVar, BackpressureStrategy backpressureStrategy) {
        this.c = iVar;
        this.f = backpressureStrategy;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        BaseEmitter baseEmitter;
        int ordinal = this.f.ordinal();
        if (ordinal == 0) {
            baseEmitter = new MissingEmitter(upf);
        } else if (ordinal == 1) {
            baseEmitter = new ErrorAsyncEmitter(upf);
        } else if (ordinal == 3) {
            baseEmitter = new DropAsyncEmitter(upf);
        } else if (ordinal != 4) {
            baseEmitter = new BufferAsyncEmitter(upf, g.g());
        } else {
            baseEmitter = new LatestAsyncEmitter(upf);
        }
        upf.onSubscribe(baseEmitter);
        try {
            this.c.subscribe(baseEmitter);
        } catch (Throwable th) {
            yif.V(th);
            if (!baseEmitter.f(th)) {
                a.g(th);
            }
        }
    }
}
