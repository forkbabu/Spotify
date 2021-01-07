package io.reactivex.internal.operators.observable;

import io.reactivex.functions.d;
import io.reactivex.functions.l;
import io.reactivex.v;
import io.reactivex.x;

public final class i<T, K> extends a<T, T> {
    final l<? super T, K> b;
    final d<? super K, ? super K> c;

    static final class a<T, K> extends io.reactivex.internal.observers.a<T, T> {
        final l<? super T, K> o;
        final d<? super K, ? super K> p;
        K q;
        boolean r;

        a(x<? super T> xVar, l<? super T, K> lVar, d<? super K, ? super K> dVar) {
            super(xVar);
            this.o = lVar;
            this.p = dVar;
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return b(i);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.f) {
                if (this.n != 0) {
                    this.a.onNext(t);
                    return;
                }
                try {
                    K apply = this.o.apply(t);
                    if (this.r) {
                        boolean a = this.p.a(this.q, apply);
                        this.q = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.r = true;
                        this.q = apply;
                    }
                    this.a.onNext(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            while (true) {
                T poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.o.apply(poll);
                if (!this.r) {
                    this.r = true;
                    this.q = apply;
                    return poll;
                } else if (!this.p.a(this.q, apply)) {
                    this.q = apply;
                    return poll;
                } else {
                    this.q = apply;
                }
            }
        }
    }

    public i(v<T> vVar, l<? super T, K> lVar, d<? super K, ? super K> dVar) {
        super(vVar);
        this.b = lVar;
        this.c = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar, this.b, this.c));
    }
}
