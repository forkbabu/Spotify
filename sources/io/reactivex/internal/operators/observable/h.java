package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.r;
import io.reactivex.v;
import io.reactivex.x;

public final class h<T, R> extends a<T, R> {
    final l<? super T, ? extends r<R>> b;

    static final class a<T, R> implements x<T>, b {
        final x<? super R> a;
        final l<? super T, ? extends r<R>> b;
        boolean c;
        b f;

        a(x<? super R> xVar, l<? super T, ? extends r<R>> lVar) {
            this.a = xVar;
            this.b = lVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.c) {
                this.c = true;
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.c) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.c = true;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.c) {
                try {
                    Object apply = this.b.apply(t);
                    io.reactivex.internal.functions.a.c(apply, "The selector returned a null Notification");
                    r rVar = (r) apply;
                    if (rVar.g()) {
                        this.f.dispose();
                        onError(rVar.d());
                    } else if (rVar.f()) {
                        this.f.dispose();
                        onComplete();
                    } else {
                        this.a.onNext((Object) rVar.e());
                    }
                } catch (Throwable th) {
                    yif.V(th);
                    this.f.dispose();
                    onError(th);
                }
            } else if (t instanceof r) {
                T t2 = t;
                if (t2.g()) {
                    io.reactivex.plugins.a.g(t2.d());
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.f, bVar)) {
                this.f = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public h(v<T> vVar, l<? super T, ? extends r<R>> lVar) {
        super(vVar);
        this.b = lVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        this.a.subscribe(new a(xVar, this.b));
    }
}
