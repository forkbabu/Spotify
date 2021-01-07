package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.e;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.v;
import io.reactivex.x;

public final class ObservableDoFinally<T> extends a<T, T> {
    final a b;

    static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements x<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final x<? super T> downstream;
        final a onFinally;
        e<T> qd;
        boolean syncFused;
        b upstream;

        DoFinallyObserver(x<? super T> xVar, a aVar) {
            this.downstream = xVar;
            this.onFinally = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    yif.V(th);
                    io.reactivex.plugins.a.g(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.qd.clear();
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.upstream.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.upstream.dispose();
            a();
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            e<T> eVar = this.qd;
            boolean z = false;
            if (eVar == null || (i & 4) != 0) {
                return 0;
            }
            int g = eVar.g(i);
            if (g != 0) {
                if (g == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return g;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.downstream.onComplete();
            a();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof e) {
                    this.qd = (e) bVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            T poll = this.qd.poll();
            if (poll == null && this.syncFused) {
                a();
            }
            return poll;
        }
    }

    public ObservableDoFinally(v<T> vVar, a aVar) {
        super(vVar);
        this.b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new DoFinallyObserver(xVar, this.b));
    }
}
