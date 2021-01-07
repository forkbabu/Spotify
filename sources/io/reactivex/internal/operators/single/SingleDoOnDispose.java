package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleDoOnDispose<T> extends z<T> {
    final d0<T> a;
    final a b;

    static final class DoOnDisposeObserver<T> extends AtomicReference<a> implements b0<T>, b {
        private static final long serialVersionUID = -8583764624474935784L;
        final b0<? super T> downstream;
        b upstream;

        DoOnDisposeObserver(b0<? super T> b0Var, a aVar) {
            this.downstream = b0Var;
            lazySet(aVar);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.upstream.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            a aVar = (a) getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.run();
                } catch (Throwable th) {
                    yif.V(th);
                    io.reactivex.plugins.a.g(th);
                }
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.downstream.onError(th);
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
        }
    }

    public SingleDoOnDispose(d0<T> d0Var, a aVar) {
        this.a = d0Var;
        this.b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new DoOnDisposeObserver(b0Var, this.b));
    }
}
