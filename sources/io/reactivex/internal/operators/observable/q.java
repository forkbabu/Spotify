package io.reactivex.internal.operators.observable;

import io.reactivex.functions.n;
import io.reactivex.v;
import io.reactivex.x;

public final class q<T> extends a<T, T> {
    final n<? super T> b;

    static final class a<T> extends io.reactivex.internal.observers.a<T, T> {
        final n<? super T> o;

        a(x<? super T> xVar, n<? super T> nVar) {
            super(xVar);
            this.o = nVar;
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return b(i);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (this.n == 0) {
                try {
                    if (this.o.test(t)) {
                        this.a.onNext(t);
                    }
                } catch (Throwable th) {
                    a(th);
                }
            } else {
                this.a.onNext(null);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            T poll;
            do {
                poll = this.c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.o.test(poll));
            return poll;
        }
    }

    public q(v<T> vVar, n<? super T> nVar) {
        super(vVar);
        this.b = nVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar, this.b));
    }
}
