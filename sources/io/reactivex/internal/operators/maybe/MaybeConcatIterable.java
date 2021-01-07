package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.n;
import io.reactivex.p;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeConcatIterable<T> extends g<T> {
    final Iterable<? extends p<? extends T>> c;

    static final class ConcatMaybeObserver<T> extends AtomicInteger implements n<T>, vpf {
        private static final long serialVersionUID = 3520831347801429610L;
        final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);
        final SequentialDisposable disposables = new SequentialDisposable();
        final upf<? super T> downstream;
        long produced;
        final AtomicLong requested = new AtomicLong();
        final Iterator<? extends p<? extends T>> sources;

        ConcatMaybeObserver(upf<? super T> upf, Iterator<? extends p<? extends T>> it) {
            this.downstream = upf;
            this.sources = it;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.current;
                upf<? super T> upf = this.downstream;
                SequentialDisposable sequentialDisposable = this.disposables;
                while (!sequentialDisposable.d()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        boolean z = true;
                        if (obj != NotificationLite.COMPLETE) {
                            long j = this.produced;
                            if (j != this.requested.get()) {
                                this.produced = j + 1;
                                atomicReference.lazySet(null);
                                upf.onNext(obj);
                            } else {
                                z = false;
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (z && !sequentialDisposable.d()) {
                            try {
                                if (this.sources.hasNext()) {
                                    try {
                                        Object next = this.sources.next();
                                        a.c(next, "The source Iterator returned a null MaybeSource");
                                        ((p) next).subscribe(this);
                                    } catch (Throwable th) {
                                        yif.V(th);
                                        upf.onError(th);
                                        return;
                                    }
                                } else {
                                    upf.onComplete();
                                }
                            } catch (Throwable th2) {
                                yif.V(th2);
                                upf.onError(th2);
                                return;
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            DisposableHelper.g(this.disposables);
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                a();
            }
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.current.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this.disposables, bVar);
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            this.current.lazySet(t);
            a();
        }
    }

    public MaybeConcatIterable(Iterable<? extends p<? extends T>> iterable) {
        this.c = iterable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        try {
            Iterator<? extends p<? extends T>> it = this.c.iterator();
            a.c(it, "The sources Iterable returned a null Iterator");
            ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(upf, it);
            upf.onSubscribe(concatMaybeObserver);
            concatMaybeObserver.a();
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
