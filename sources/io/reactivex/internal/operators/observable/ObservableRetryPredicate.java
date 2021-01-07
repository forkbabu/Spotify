package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableRetryPredicate<T> extends a<T, T> {
    final n<? super Throwable> b;
    final long c;

    static final class RepeatObserver<T> extends AtomicInteger implements x<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final x<? super T> downstream;
        final n<? super Throwable> predicate;
        long remaining;
        final v<? extends T> source;
        final SequentialDisposable upstream;

        RepeatObserver(x<? super T> xVar, long j, n<? super Throwable> nVar, SequentialDisposable sequentialDisposable, v<? extends T> vVar) {
            this.downstream = xVar;
            this.upstream = sequentialDisposable;
            this.source = vVar;
            this.predicate = nVar;
            this.remaining = j;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.upstream.d()) {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                yif.V(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this.upstream, bVar);
        }
    }

    public ObservableRetryPredicate(s<T> sVar, long j, n<? super Throwable> nVar) {
        super(sVar);
        this.b = nVar;
        this.c = j;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        xVar.onSubscribe(sequentialDisposable);
        new RepeatObserver(xVar, this.c, this.b, sequentialDisposable, this.a).a();
    }
}
