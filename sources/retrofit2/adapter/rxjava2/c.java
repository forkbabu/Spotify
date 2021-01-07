package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.s;
import io.reactivex.x;
import retrofit2.b;
import retrofit2.v;

final class c<T> extends s<v<T>> {
    private final b<T> a;

    private static final class a implements io.reactivex.disposables.b {
        private final b<?> a;
        private volatile boolean b;

        a(b<?> bVar) {
            this.a = bVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.b = true;
            this.a.cancel();
        }
    }

    c(b<T> bVar) {
        this.a = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super v<T>> xVar) {
        boolean z;
        Throwable th;
        b<T> G1 = this.a.G1();
        a aVar = new a(G1);
        xVar.onSubscribe(aVar);
        if (!aVar.d()) {
            try {
                v<T> h = G1.h();
                if (!aVar.d()) {
                    xVar.onNext(h);
                }
                if (!aVar.d()) {
                    try {
                        xVar.onComplete();
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
                yif.V(th);
                if (z) {
                    io.reactivex.plugins.a.g(th);
                } else if (!aVar.d()) {
                    try {
                        xVar.onError(th);
                    } catch (Throwable th4) {
                        yif.V(th4);
                        io.reactivex.plugins.a.g(new CompositeException(th, th4));
                    }
                }
            }
        }
    }
}
