package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableRetryWhen<T> extends a<T, T> {
    final l<? super s<Throwable>, ? extends v<?>> b;

    static final class RepeatWhenObserver<T> extends AtomicInteger implements x<T>, b {
        private static final long serialVersionUID = 802743776666017014L;
        volatile boolean active;
        final x<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final RepeatWhenObserver<T>.InnerRepeatObserver inner = new InnerRepeatObserver();
        final c<Throwable> signaller;
        final v<T> source;
        final AtomicReference<b> upstream = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        final class InnerRepeatObserver extends AtomicReference<b> implements x<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            InnerRepeatObserver() {
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onComplete() {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.g(repeatWhenObserver.upstream);
                yif.z(repeatWhenObserver.downstream, repeatWhenObserver, repeatWhenObserver.error);
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onError(Throwable th) {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.g(repeatWhenObserver.upstream);
                yif.B(repeatWhenObserver.downstream, th, repeatWhenObserver, repeatWhenObserver.error);
            }

            @Override // io.reactivex.x
            public void onNext(Object obj) {
                RepeatWhenObserver.this.a();
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }
        }

        RepeatWhenObserver(x<? super T> xVar, c<Throwable> cVar, v<T> vVar) {
            this.downstream = xVar;
            this.signaller = cVar;
            this.source = vVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.wip.getAndIncrement() == 0) {
                while (!d()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.subscribe(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h(this.upstream.get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.upstream);
            DisposableHelper.g(this.inner);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            DisposableHelper.g(this.inner);
            yif.z(this.downstream, this, this.error);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            DisposableHelper.i(this.upstream, null);
            this.active = false;
            this.signaller.onNext(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            yif.D(this.downstream, t, this, this.error);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this.upstream, bVar);
        }
    }

    public ObservableRetryWhen(v<T> vVar, l<? super s<Throwable>, ? extends v<?>> lVar) {
        super(vVar);
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        c<T> g1 = PublishSubject.h1().g1();
        try {
            Object apply = this.b.apply(g1);
            a.c(apply, "The handler returned a null ObservableSource");
            v vVar = (v) apply;
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(xVar, g1, this.a);
            xVar.onSubscribe(repeatWhenObserver);
            vVar.subscribe(repeatWhenObserver.inner);
            repeatWhenObserver.a();
        } catch (Throwable th) {
            yif.V(th);
            xVar.onSubscribe(EmptyDisposable.INSTANCE);
            xVar.onError(th);
        }
    }
}
