package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;

public final class g<T, U> extends s<T> {
    final v<? extends T> a;
    final v<U> b;

    final class a implements x<U> {
        final SequentialDisposable a;
        final x<? super T> b;
        boolean c;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.observable.g$a$a  reason: collision with other inner class name */
        public final class C0617a implements x<T> {
            C0617a() {
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onComplete() {
                a.this.b.onComplete();
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onError(Throwable th) {
                a.this.b.onError(th);
            }

            @Override // io.reactivex.x
            public void onNext(T t) {
                a.this.b.onNext(t);
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.k(a.this.a, bVar);
            }
        }

        a(SequentialDisposable sequentialDisposable, x<? super T> xVar) {
            this.a = sequentialDisposable;
            this.b = xVar;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.c) {
                this.c = true;
                g.this.a.subscribe(new C0617a());
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.c) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.c = true;
            this.b.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(U u) {
            onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.k(this.a, bVar);
        }
    }

    public g(v<? extends T> vVar, v<U> vVar2) {
        this.a = vVar;
        this.b = vVar2;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        xVar.onSubscribe(sequentialDisposable);
        this.b.subscribe(new a(sequentialDisposable, xVar));
    }
}
