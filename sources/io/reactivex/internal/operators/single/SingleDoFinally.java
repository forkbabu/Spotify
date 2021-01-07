package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicInteger;

public final class SingleDoFinally<T> extends z<T> {
    final d0<T> a;
    final a b;

    static final class DoFinallyObserver<T> extends AtomicInteger implements b0<T>, b {
        private static final long serialVersionUID = 4109457741734051389L;
        final b0<? super T> downstream;
        final a onFinally;
        b upstream;

        DoFinallyObserver(b0<? super T> b0Var, a aVar) {
            this.downstream = b0Var;
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

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.upstream.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.upstream.dispose();
            a();
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            a();
        }
    }

    public SingleDoFinally(d0<T> d0Var, a aVar) {
        this.a = d0Var;
        this.b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new DoFinallyObserver(b0Var, this.b));
    }
}
