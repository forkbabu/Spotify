package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableSubscribeOn extends a {
    final e a;
    final y b;

    static final class SubscribeOnObserver extends AtomicReference<b> implements c, b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final c downstream;
        final e source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(c cVar, e eVar) {
            this.downstream = cVar;
            this.source = eVar;
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

        @Override // io.reactivex.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.subscribe(this);
        }
    }

    public CompletableSubscribeOn(e eVar, y yVar) {
        this.a = eVar;
        this.b = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(cVar, this.a);
        cVar.onSubscribe(subscribeOnObserver);
        DisposableHelper.i(subscribeOnObserver.task, this.b.b(subscribeOnObserver));
    }
}
