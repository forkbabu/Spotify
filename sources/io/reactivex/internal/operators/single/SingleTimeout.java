package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.a;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleTimeout<T> extends z<T> {
    final d0<T> a;
    final long b;
    final TimeUnit c;
    final y f;
    final d0<? extends T> n;

    static final class TimeoutMainObserver<T> extends AtomicReference<b> implements b0<T>, Runnable, b {
        private static final long serialVersionUID = 37497744973048446L;
        final b0<? super T> downstream;
        final TimeoutFallbackObserver<T> fallback;
        d0<? extends T> other;
        final AtomicReference<b> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        static final class TimeoutFallbackObserver<T> extends AtomicReference<b> implements b0<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final b0<? super T> downstream;

            TimeoutFallbackObserver(b0<? super T> b0Var) {
                this.downstream = b0Var;
            }

            @Override // io.reactivex.b0
            public void onError(Throwable th) {
                this.downstream.onError(th);
            }

            @Override // io.reactivex.b0
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }

            @Override // io.reactivex.b0
            public void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }
        }

        TimeoutMainObserver(b0<? super T> b0Var, d0<? extends T> d0Var, long j, TimeUnit timeUnit) {
            this.downstream = b0Var;
            this.other = d0Var;
            this.timeout = j;
            this.unit = timeUnit;
            if (d0Var != null) {
                this.fallback = new TimeoutFallbackObserver<>(b0Var);
            } else {
                this.fallback = null;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
            DisposableHelper.g(this.task);
            TimeoutFallbackObserver<T> timeoutFallbackObserver = this.fallback;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.g(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            b bVar = (b) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || !compareAndSet(bVar, disposableHelper)) {
                a.g(th);
                return;
            }
            DisposableHelper.g(this.task);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            b bVar = (b) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper && compareAndSet(bVar, disposableHelper)) {
                DisposableHelper.g(this.task);
                this.downstream.onSuccess(t);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = (b) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper && compareAndSet(bVar, disposableHelper)) {
                if (bVar != null) {
                    bVar.dispose();
                }
                d0<? extends T> d0Var = this.other;
                if (d0Var == null) {
                    this.downstream.onError(new TimeoutException(ExceptionHelper.d(this.timeout, this.unit)));
                    return;
                }
                this.other = null;
                d0Var.subscribe(this.fallback);
            }
        }
    }

    public SingleTimeout(d0<T> d0Var, long j, TimeUnit timeUnit, y yVar, d0<? extends T> d0Var2) {
        this.a = d0Var;
        this.b = j;
        this.c = timeUnit;
        this.f = yVar;
        this.n = d0Var2;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        TimeoutMainObserver timeoutMainObserver = new TimeoutMainObserver(b0Var, this.n, this.b, this.c);
        b0Var.onSubscribe(timeoutMainObserver);
        DisposableHelper.i(timeoutMainObserver.task, this.f.c(timeoutMainObserver, this.b, this.c));
        this.a.subscribe(timeoutMainObserver);
    }
}
