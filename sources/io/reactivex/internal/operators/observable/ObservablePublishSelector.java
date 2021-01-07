package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublishSelector<T, R> extends a<T, R> {
    final l<? super s<T>, ? extends v<R>> b;

    static final class TargetObserver<T, R> extends AtomicReference<b> implements x<R>, b {
        private static final long serialVersionUID = 854110278590336484L;
        final x<? super R> downstream;
        b upstream;

        TargetObserver(x<? super R> xVar) {
            this.downstream = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.upstream.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.upstream.dispose();
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            DisposableHelper.g(this);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            DisposableHelper.g(this);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    static final class a<T, R> implements x<T> {
        final PublishSubject<T> a;
        final AtomicReference<b> b;

        a(PublishSubject<T> publishSubject, AtomicReference<b> atomicReference) {
            this.a = publishSubject;
            this.b = atomicReference;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.b, bVar);
        }
    }

    public ObservablePublishSelector(v<T> vVar, l<? super s<T>, ? extends v<R>> lVar) {
        super(vVar);
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        PublishSubject h1 = PublishSubject.h1();
        try {
            Object apply = this.b.apply(h1);
            io.reactivex.internal.functions.a.c(apply, "The selector returned a null ObservableSource");
            v vVar = (v) apply;
            TargetObserver targetObserver = new TargetObserver(xVar);
            vVar.subscribe(targetObserver);
            this.a.subscribe(new a(h1, targetObserver));
        } catch (Throwable th) {
            yif.V(th);
            xVar.onSubscribe(EmptyDisposable.INSTANCE);
            xVar.onError(th);
        }
    }
}
