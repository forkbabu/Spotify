package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.f;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.a;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableCreate<T> extends s<T> {
    final u<T> a;

    static final class CreateEmitter<T> extends AtomicReference<b> implements t<T>, b {
        private static final long serialVersionUID = -3434801548987643227L;
        final x<? super T> observer;

        CreateEmitter(x<? super T> xVar) {
            this.observer = xVar;
        }

        @Override // io.reactivex.t
        public void a(b bVar) {
            DisposableHelper.k(this, bVar);
        }

        @Override // io.reactivex.t, io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.t
        public void e(f fVar) {
            DisposableHelper.k(this, new CancellableDisposable(fVar));
        }

        /* JADX INFO: finally extract failed */
        @Override // io.reactivex.t
        public boolean f(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (d()) {
                return false;
            }
            try {
                this.observer.onError(th);
                DisposableHelper.g(this);
                return true;
            } catch (Throwable th2) {
                DisposableHelper.g(this);
                throw th2;
            }
        }

        @Override // io.reactivex.f
        public void onComplete() {
            if (!d()) {
                try {
                    this.observer.onComplete();
                } finally {
                    DisposableHelper.g(this);
                }
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th) {
            if (!f(th)) {
                a.g(th);
            }
        }

        @Override // io.reactivex.f
        public void onNext(T t) {
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!f(nullPointerException)) {
                    a.g(nullPointerException);
                }
            } else if (!d()) {
                this.observer.onNext(t);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference, java.lang.Object
        public String toString() {
            return String.format("%s{%s}", CreateEmitter.class.getSimpleName(), super.toString());
        }
    }

    public ObservableCreate(u<T> uVar) {
        this.a = uVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        CreateEmitter createEmitter = new CreateEmitter(xVar);
        xVar.onSubscribe(createEmitter);
        try {
            this.a.subscribe(createEmitter);
        } catch (Throwable th) {
            yif.V(th);
            if (!createEmitter.f(th)) {
                a.g(th);
            }
        }
    }
}
