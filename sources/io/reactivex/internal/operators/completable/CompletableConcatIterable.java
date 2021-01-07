package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableConcatIterable extends a {
    final Iterable<? extends e> a;

    static final class ConcatInnerObserver extends AtomicInteger implements c {
        private static final long serialVersionUID = -7965400327305809232L;
        final c downstream;
        final SequentialDisposable sd = new SequentialDisposable();
        final Iterator<? extends e> sources;

        ConcatInnerObserver(c cVar, Iterator<? extends e> it) {
            this.downstream = cVar;
            this.sources = it;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.sd.d() && getAndIncrement() == 0) {
                Iterator<? extends e> it = this.sources;
                while (!this.sd.d()) {
                    try {
                        if (!it.hasNext()) {
                            this.downstream.onComplete();
                            return;
                        }
                        try {
                            Object next = it.next();
                            io.reactivex.internal.functions.a.c(next, "The CompletableSource returned is null");
                            ((e) next).subscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            yif.V(th);
                            this.downstream.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        yif.V(th2);
                        this.downstream.onError(th2);
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

    public CompletableConcatIterable(Iterable<? extends e> iterable) {
        this.a = iterable;
    }

    @Override // io.reactivex.a
    public void F(c cVar) {
        try {
            Iterator<? extends e> it = this.a.iterator();
            io.reactivex.internal.functions.a.c(it, "The iterator returned is null");
            ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(cVar, it);
            cVar.onSubscribe(concatInnerObserver.sd);
            concatInnerObserver.a();
        } catch (Throwable th) {
            yif.V(th);
            cVar.onSubscribe(EmptyDisposable.INSTANCE);
            cVar.onError(th);
        }
    }
}
