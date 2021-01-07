package retrofit2.adapter.rxjava2;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.s;
import io.reactivex.x;
import retrofit2.v;

final class a<T> extends s<T> {
    private final s<v<T>> a;

    /* renamed from: retrofit2.adapter.rxjava2.a$a  reason: collision with other inner class name */
    private static class C0674a<R> implements x<v<R>> {
        private final x<? super R> a;
        private boolean b;

        C0674a(x<? super R> xVar) {
            this.a = xVar;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.b) {
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (!this.b) {
                this.a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            io.reactivex.plugins.a.g(assertionError);
        }

        @Override // io.reactivex.x
        public void onNext(Object obj) {
            v vVar = (v) obj;
            if (vVar.f()) {
                this.a.onNext((Object) vVar.a());
                return;
            }
            this.b = true;
            HttpException httpException = new HttpException(vVar);
            try {
                this.a.onError(httpException);
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(new CompositeException(httpException, th));
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            this.a.onSubscribe(bVar);
        }
    }

    a(s<v<T>> sVar) {
        this.a = sVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new C0674a(xVar));
    }
}
