package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableMergeIterable extends a {
    final Iterable<? extends e> a;

    static final class MergeCompletableObserver extends AtomicBoolean implements c {
        private static final long serialVersionUID = -7730517613164279224L;
        final c downstream;
        final io.reactivex.disposables.a set;
        final AtomicInteger wip;

        MergeCompletableObserver(c cVar, io.reactivex.disposables.a aVar, AtomicInteger atomicInteger) {
            this.downstream = cVar;
            this.set = aVar;
            this.wip = atomicInteger;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            if (this.wip.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.set.dispose();
            if (compareAndSet(false, true)) {
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

    public CompletableMergeIterable(Iterable<? extends e> iterable) {
        this.a = iterable;
    }

    @Override // io.reactivex.a
    public void F(c cVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        cVar.onSubscribe(aVar);
        try {
            Iterator<? extends e> it = this.a.iterator();
            io.reactivex.internal.functions.a.c(it, "The source iterator returned is null");
            Iterator<? extends e> it2 = it;
            AtomicInteger atomicInteger = new AtomicInteger(1);
            MergeCompletableObserver mergeCompletableObserver = new MergeCompletableObserver(cVar, aVar, atomicInteger);
            while (!aVar.d()) {
                try {
                    if (!it2.hasNext()) {
                        mergeCompletableObserver.onComplete();
                        return;
                    } else if (!aVar.d()) {
                        try {
                            Object next = it2.next();
                            io.reactivex.internal.functions.a.c(next, "The iterator returned a null CompletableSource");
                            e eVar = (e) next;
                            if (!aVar.d()) {
                                atomicInteger.getAndIncrement();
                                eVar.subscribe(mergeCompletableObserver);
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            yif.V(th);
                            aVar.dispose();
                            mergeCompletableObserver.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    yif.V(th2);
                    aVar.dispose();
                    mergeCompletableObserver.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            yif.V(th3);
            cVar.onError(th3);
        }
    }
}
