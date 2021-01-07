package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSubscribeOn<T> extends a<T, T> {
    final y b;

    static final class SubscribeOnObserver<T> extends AtomicReference<b> implements x<T>, b {
        private static final long serialVersionUID = 8094547886072529208L;
        final x<? super T> downstream;
        final AtomicReference<b> upstream = new AtomicReference<>();

        SubscribeOnObserver(x<? super T> xVar) {
            this.downstream = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.upstream);
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.upstream, bVar);
        }
    }

    final class a implements Runnable {
        private final SubscribeOnObserver<T> a;

        a(SubscribeOnObserver<T> subscribeOnObserver) {
            this.a = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableSubscribeOn.this.a.subscribe(this.a);
        }
    }

    public ObservableSubscribeOn(v<T> vVar, y yVar) {
        super(vVar);
        this.b = yVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(xVar);
        xVar.onSubscribe(subscribeOnObserver);
        DisposableHelper.l(subscribeOnObserver, this.b.b(new a(subscribeOnObserver)));
    }
}
