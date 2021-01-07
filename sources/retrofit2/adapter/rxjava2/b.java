package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.s;
import io.reactivex.x;
import retrofit2.d;
import retrofit2.v;

final class b<T> extends s<v<T>> {
    private final retrofit2.b<T> a;

    private static final class a<T> implements io.reactivex.disposables.b, d<T> {
        private final retrofit2.b<?> a;
        private final x<? super v<T>> b;
        private volatile boolean c;
        boolean f = false;

        a(retrofit2.b<?> bVar, x<? super v<T>> xVar) {
            this.a = bVar;
            this.b = xVar;
        }

        @Override // retrofit2.d
        public void a(retrofit2.b<T> bVar, Throwable th) {
            if (!bVar.l()) {
                try {
                    this.b.onError(th);
                } catch (Throwable th2) {
                    yif.V(th2);
                    io.reactivex.plugins.a.g(new CompositeException(th, th2));
                }
            }
        }

        @Override // retrofit2.d
        public void b(retrofit2.b<T> bVar, v<T> vVar) {
            if (!this.c) {
                try {
                    this.b.onNext(vVar);
                    if (!this.c) {
                        this.f = true;
                        this.b.onComplete();
                    }
                } catch (Throwable th) {
                    yif.V(th);
                    io.reactivex.plugins.a.g(new CompositeException(th, th));
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c = true;
            this.a.cancel();
        }
    }

    b(retrofit2.b<T> bVar) {
        this.a = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super v<T>> xVar) {
        retrofit2.b<T> G1 = this.a.G1();
        a aVar = new a(G1, xVar);
        xVar.onSubscribe(aVar);
        if (!aVar.d()) {
            G1.d0(aVar);
        }
    }
}
