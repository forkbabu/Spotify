package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableMergeArray extends a {
    final e[] a;

    static final class InnerCompletableObserver extends AtomicInteger implements c {
        private static final long serialVersionUID = -8360547806504310570L;
        final c downstream;
        final AtomicBoolean once;
        final io.reactivex.disposables.a set;

        InnerCompletableObserver(c cVar, AtomicBoolean atomicBoolean, io.reactivex.disposables.a aVar, int i) {
            this.downstream = cVar;
            this.once = atomicBoolean;
            this.set = aVar;
            lazySet(i);
        }

        @Override // io.reactivex.c
        public void onComplete() {
            if (decrementAndGet() == 0 && this.once.compareAndSet(false, true)) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.set.dispose();
            if (this.once.compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.a.g(th);
            }
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            this.set.b(bVar);
        }
    }

    public CompletableMergeArray(e[] eVarArr) {
        this.a = eVarArr;
    }

    @Override // io.reactivex.a
    public void F(c cVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        InnerCompletableObserver innerCompletableObserver = new InnerCompletableObserver(cVar, new AtomicBoolean(), aVar, this.a.length + 1);
        cVar.onSubscribe(aVar);
        e[] eVarArr = this.a;
        for (e eVar : eVarArr) {
            if (!aVar.d()) {
                if (eVar == null) {
                    aVar.dispose();
                    innerCompletableObserver.onError(new NullPointerException("A completable source is null"));
                    return;
                }
                eVar.subscribe(innerCompletableObserver);
            } else {
                return;
            }
        }
        innerCompletableObserver.onComplete();
    }
}
