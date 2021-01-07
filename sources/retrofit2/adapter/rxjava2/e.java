package retrofit2.adapter.rxjava2;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.s;
import io.reactivex.x;
import retrofit2.v;

final class e<T> extends s<d<T>> {
    private final s<v<T>> a;

    private static class a<R> implements x<v<R>> {
        private final x<? super d<R>> a;

        a(x<? super d<R>> xVar) {
            this.a = xVar;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            try {
                this.a.onNext(d.a(th));
                this.a.onComplete();
            } catch (Throwable th2) {
                yif.V(th2);
                io.reactivex.plugins.a.g(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.x
        public void onNext(Object obj) {
            this.a.onNext(d.b((v) obj));
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            this.a.onSubscribe(bVar);
        }
    }

    e(s<v<T>> sVar) {
        this.a = sVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super d<T>> xVar) {
        this.a.subscribe(new a(xVar));
    }
}
