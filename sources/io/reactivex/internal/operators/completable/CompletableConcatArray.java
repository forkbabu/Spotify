package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableConcatArray extends a {
    final e[] a;

    static final class ConcatInnerObserver extends AtomicInteger implements c {
        private static final long serialVersionUID = -7965400327305809232L;
        final c downstream;
        int index;
        final SequentialDisposable sd = new SequentialDisposable();
        final e[] sources;

        ConcatInnerObserver(c cVar, e[] eVarArr) {
            this.downstream = cVar;
            this.sources = eVarArr;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.sd.d() && getAndIncrement() == 0) {
                e[] eVarArr = this.sources;
                while (!this.sd.d()) {
                    int i = this.index;
                    this.index = i + 1;
                    if (i == eVarArr.length) {
                        this.downstream.onComplete();
                        return;
                    }
                    eVarArr[i].subscribe(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.c
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this.sd, bVar);
        }
    }

    public CompletableConcatArray(e[] eVarArr) {
        this.a = eVarArr;
    }

    @Override // io.reactivex.a
    public void F(c cVar) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(cVar, this.a);
        cVar.onSubscribe(concatInnerObserver.sd);
        concatInnerObserver.a();
    }
}
