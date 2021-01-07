package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSubscribeOn<T> extends a<T, T> {
    final y b;

    static final class SubscribeOnMaybeObserver<T> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = 8571289934935992137L;
        final n<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnMaybeObserver(n<? super T> nVar) {
            this.downstream = nVar;
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

    static final class a<T> implements Runnable {
        final n<? super T> a;
        final p<T> b;

        a(n<? super T> nVar, p<T> pVar) {
            this.a = nVar;
            this.b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.subscribe(this.a);
        }
    }

    public MaybeSubscribeOn(p<T> pVar, y yVar) {
        super(pVar);
        this.b = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(nVar);
        nVar.onSubscribe(subscribeOnMaybeObserver);
        DisposableHelper.i(subscribeOnMaybeObserver.task, this.b.b(new a(subscribeOnMaybeObserver, this.a)));
    }
}
