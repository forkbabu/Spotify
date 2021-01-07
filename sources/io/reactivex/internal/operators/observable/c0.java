package io.reactivex.internal.operators.observable;

import io.reactivex.functions.l;
import io.reactivex.v;
import io.reactivex.x;

public final class c0<T, U> extends a<T, U> {
    final l<? super T, ? extends U> b;

    static final class a<T, U> extends io.reactivex.internal.observers.a<T, U> {
        final l<? super T, ? extends U> o;

        a(x<? super U> xVar, l<? super T, ? extends U> lVar) {
            super(xVar);
            this.o = lVar;
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return b(i);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.f) {
                if (this.n != 0) {
                    this.a.onNext(null);
                    return;
                }
                try {
                    Object apply = this.o.apply(t);
                    io.reactivex.internal.functions.a.c(apply, "The mapper function returned a null value.");
                    this.a.onNext(apply);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public U poll() {
            T poll = this.c.poll();
            if (poll == null) {
                return null;
            }
            U u = (U) this.o.apply(poll);
            io.reactivex.internal.functions.a.c(u, "The mapper function returned a null value.");
            return u;
        }
    }

    public c0(v<T> vVar, l<? super T, ? extends U> lVar) {
        super(vVar);
        this.b = lVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super U> xVar) {
        this.a.subscribe(new a(xVar, this.b));
    }
}
