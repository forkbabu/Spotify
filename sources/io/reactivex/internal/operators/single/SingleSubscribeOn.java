package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleSubscribeOn<T> extends z<T> {
    final d0<? extends T> a;
    final y b;

    static final class SubscribeOnObserver<T> extends AtomicReference<b> implements b0<T>, b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final b0<? super T> downstream;
        final d0<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(b0<? super T> b0Var, d0<? extends T> d0Var) {
            this.downstream = b0Var;
            this.source = d0Var;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
            DisposableHelper.g(this.task);
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

        @Override // java.lang.Runnable
        public void run() {
            this.source.subscribe(this);
        }
    }

    public SingleSubscribeOn(d0<? extends T> d0Var, y yVar) {
        this.a = d0Var;
        this.b = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(b0Var, this.a);
        b0Var.onSubscribe(subscribeOnObserver);
        DisposableHelper.i(subscribeOnObserver.task, this.b.b(subscribeOnObserver));
    }
}
