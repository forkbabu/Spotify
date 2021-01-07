package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.c;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableWithLatestFrom<T, U, R> extends a<T, R> {
    final c<? super T, ? super U, ? extends R> b;
    final v<? extends U> c;

    static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements x<T>, b {
        private static final long serialVersionUID = -312246233408980075L;
        final c<? super T, ? super U, ? extends R> combiner;
        final x<? super R> downstream;
        final AtomicReference<b> other = new AtomicReference<>();
        final AtomicReference<b> upstream = new AtomicReference<>();

        WithLatestFromObserver(x<? super R> xVar, c<? super T, ? super U, ? extends R> cVar) {
            this.downstream = xVar;
            this.combiner = cVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h(this.upstream.get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.upstream);
            DisposableHelper.g(this.other);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            DisposableHelper.g(this.other);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            DisposableHelper.g(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    Object a = this.combiner.a(t, obj);
                    io.reactivex.internal.functions.a.c(a, "The combiner returned a null value");
                    this.downstream.onNext(a);
                } catch (Throwable th) {
                    yif.V(th);
                    dispose();
                    this.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.upstream, bVar);
        }
    }

    final class a implements x<U> {
        private final WithLatestFromObserver<T, U, R> a;

        a(ObservableWithLatestFrom observableWithLatestFrom, WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.a = withLatestFromObserver;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            WithLatestFromObserver<T, U, R> withLatestFromObserver = this.a;
            DisposableHelper.g(withLatestFromObserver.upstream);
            withLatestFromObserver.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(U u) {
            this.a.lazySet(u);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.a.other, bVar);
        }
    }

    public ObservableWithLatestFrom(v<T> vVar, c<? super T, ? super U, ? extends R> cVar, v<? extends U> vVar2) {
        super(vVar);
        this.b = cVar;
        this.c = vVar2;
    }

    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        io.reactivex.observers.c cVar = new io.reactivex.observers.c(xVar);
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(cVar, this.b);
        cVar.onSubscribe(withLatestFromObserver);
        this.c.subscribe(new a(this, withLatestFromObserver));
        this.a.subscribe(withLatestFromObserver);
    }
}
