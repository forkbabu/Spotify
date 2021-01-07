package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.b;
import io.reactivex.s;
import io.reactivex.x;

public final class p<T> extends s<T> {
    final e a;

    static final class a extends b<Void> implements c {
        final x<?> a;
        io.reactivex.disposables.b b;

        a(x<?> xVar) {
            this.a = xVar;
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.b.dispose();
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return i & 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.n(this.b, bVar)) {
                this.b = bVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public /* bridge */ /* synthetic */ Object poll() {
            return null;
        }
    }

    public p(e eVar) {
        this.a = eVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar));
    }
}
