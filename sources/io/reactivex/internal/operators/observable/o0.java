package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.c;
import io.reactivex.v;
import io.reactivex.x;

public final class o0<T, U> extends a<T, T> {
    final v<U> b;

    final class a implements x<U> {
        final ArrayCompositeDisposable a;
        final b<T> b;
        final c<T> c;
        io.reactivex.disposables.b f;

        a(o0 o0Var, ArrayCompositeDisposable arrayCompositeDisposable, b<T> bVar, c<T> cVar) {
            this.a = arrayCompositeDisposable;
            this.b = bVar;
            this.c = cVar;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.b.f = true;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.a.dispose();
            this.c.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(U u) {
            this.f.dispose();
            this.b.f = true;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.n(this.f, bVar)) {
                this.f = bVar;
                this.a.a(1, bVar);
            }
        }
    }

    static final class b<T> implements x<T> {
        final x<? super T> a;
        final ArrayCompositeDisposable b;
        io.reactivex.disposables.b c;
        volatile boolean f;
        boolean n;

        b(x<? super T> xVar, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.a = xVar;
            this.b = arrayCompositeDisposable;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.b.dispose();
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.b.dispose();
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (this.n) {
                this.a.onNext(t);
            } else if (this.f) {
                this.n = true;
                this.a.onNext(t);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                this.c = bVar;
                this.b.a(0, bVar);
            }
        }
    }

    public o0(v<T> vVar, v<U> vVar2) {
        super(vVar);
        this.b = vVar2;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        c cVar = new c(xVar);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        cVar.onSubscribe(arrayCompositeDisposable);
        b bVar = new b(cVar, arrayCompositeDisposable);
        this.b.subscribe(new a(this, arrayCompositeDisposable, bVar, cVar));
        this.a.subscribe(bVar);
    }
}
