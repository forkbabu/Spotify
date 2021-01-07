package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableDoFinally extends a {
    final e a;
    final io.reactivex.functions.a b;

    static final class DoFinallyObserver extends AtomicInteger implements c, b {
        private static final long serialVersionUID = 4109457741734051389L;
        final c downstream;
        final io.reactivex.functions.a onFinally;
        b upstream;

        DoFinallyObserver(c cVar, io.reactivex.functions.a aVar) {
            this.downstream = cVar;
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

        @Override // io.reactivex.c
        public void onComplete() {
            this.downstream.onComplete();
            a();
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public CompletableDoFinally(e eVar, io.reactivex.functions.a aVar) {
        this.a = eVar;
        this.b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new DoFinallyObserver(cVar, this.b));
    }
}
