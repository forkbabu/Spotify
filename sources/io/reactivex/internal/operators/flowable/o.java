package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.x;

public final class o<T> extends g<T> {
    private final s<T> c;

    static final class a<T> implements x<T>, vpf {
        final upf<? super T> a;
        b b;

        a(upf<? super T> upf) {
            this.a = upf;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.b.dispose();
        }

        @Override // defpackage.vpf
        public void n(long j) {
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
            this.a.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            this.b = bVar;
            this.a.onSubscribe(this);
        }
    }

    public o(s<T> sVar) {
        this.c = sVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe(new a(upf));
    }
}
