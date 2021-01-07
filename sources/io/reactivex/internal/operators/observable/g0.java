package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;

public final class g0<T> extends a<T, T> {
    final l<? super Throwable, ? extends T> b;

    static final class a<T> implements x<T>, b {
        final x<? super T> a;
        final l<? super Throwable, ? extends T> b;
        b c;

        a(x<? super T> xVar, l<? super Throwable, ? extends T> lVar) {
            this.a = xVar;
            this.b = lVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            try {
                Object apply = this.b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.a.onError(nullPointerException);
                    return;
                }
                this.a.onNext(apply);
                this.a.onComplete();
            } catch (Throwable th2) {
                yif.V(th2);
                this.a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                this.c = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public g0(v<T> vVar, l<? super Throwable, ? extends T> lVar) {
        super(vVar);
        this.b = lVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar, this.b));
    }
}
