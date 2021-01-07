package io.reactivex.internal.operators.observable;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.fuseable.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;

public final class z<T> extends io.reactivex.a implements d<T> {
    final v<T> a;

    static final class a<T> implements x<T>, b {
        final c a;
        b b;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.b.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            this.b = bVar;
            this.a.onSubscribe(this);
        }
    }

    public z(v<T> vVar) {
        this.a = vVar;
    }

    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new a(cVar));
    }

    @Override // io.reactivex.internal.fuseable.d
    public s<T> a() {
        return new y(this.a);
    }
}
