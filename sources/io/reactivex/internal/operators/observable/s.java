package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.b;
import io.reactivex.x;

public final class s<T> extends io.reactivex.s<T> {
    final T[] a;

    static final class a<T> extends b<T> {
        final x<? super T> a;
        final T[] b;
        int c;
        boolean f;
        volatile boolean n;

        a(x<? super T> xVar, T[] tArr) {
            this.a = xVar;
            this.b = tArr;
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.c = this.b.length;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.n;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.n = true;
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.c == this.b.length;
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            int i = this.c;
            T[] tArr = this.b;
            if (i == tArr.length) {
                return null;
            }
            this.c = i + 1;
            T t = tArr[i];
            io.reactivex.internal.functions.a.c(t, "The array element is null");
            return t;
        }
    }

    public s(T[] tArr) {
        this.a = tArr;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        a aVar = new a(xVar, this.a);
        xVar.onSubscribe(aVar);
        if (!aVar.f) {
            T[] tArr = aVar.b;
            int length = tArr.length;
            for (int i = 0; i < length && !aVar.n; i++) {
                T t = tArr[i];
                if (t == null) {
                    aVar.a.onError(new NullPointerException(je.q0("The element at index ", i, " is null")));
                    return;
                } else {
                    aVar.a.onNext(t);
                }
            }
            if (!aVar.n) {
                aVar.a.onComplete();
            }
        }
    }
}
