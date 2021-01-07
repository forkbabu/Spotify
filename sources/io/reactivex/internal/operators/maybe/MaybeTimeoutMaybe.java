package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.plugins.a;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeTimeoutMaybe<T, U> extends a<T, T> {
    final p<U> b;
    final p<? extends T> c = null;

    /* access modifiers changed from: package-private */
    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<b> implements n<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final n<? super T> downstream;

        TimeoutFallbackMaybeObserver(n<? super T> nVar) {
            this.downstream = nVar;
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = -5955289211445418871L;
        final n<? super T> downstream;
        final p<? extends T> fallback;
        final TimeoutOtherMaybeObserver<T, U> other = new TimeoutOtherMaybeObserver<>(this);
        final TimeoutFallbackMaybeObserver<T> otherObserver;

        TimeoutMainMaybeObserver(n<? super T> nVar, p<? extends T> pVar) {
            this.downstream = nVar;
            this.fallback = pVar;
            this.otherObserver = pVar != null ? new TimeoutFallbackMaybeObserver<>(nVar) : null;
        }

        public void a() {
            if (DisposableHelper.g(this)) {
                p<? extends T> pVar = this.fallback;
                if (pVar == null) {
                    this.downstream.onError(new TimeoutException());
                } else {
                    pVar.subscribe(this.otherObserver);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
            DisposableHelper.g(this.other);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.otherObserver;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.g(timeoutFallbackMaybeObserver);
            }
        }

        @Override // io.reactivex.n
        public void onComplete() {
            DisposableHelper.g(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            DisposableHelper.g(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onError(th);
            } else {
                a.g(th);
            }
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            DisposableHelper.g(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t);
            }
        }
    }

    static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<b> implements n<Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final TimeoutMainMaybeObserver<T, U> parent;

        TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.parent = timeoutMainMaybeObserver;
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.parent.a();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver = this.parent;
            if (DisposableHelper.g(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.downstream.onError(th);
            } else {
                a.g(th);
            }
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }

        @Override // io.reactivex.n
        public void onSuccess(Object obj) {
            this.parent.a();
        }
    }

    public MaybeTimeoutMaybe(p<T> pVar, p<U> pVar2, p<? extends T> pVar3) {
        super(pVar);
        this.b = pVar2;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(nVar, this.c);
        nVar.onSubscribe(timeoutMainMaybeObserver);
        this.b.subscribe(timeoutMainMaybeObserver.other);
        this.a.subscribe(timeoutMainMaybeObserver);
    }
}
