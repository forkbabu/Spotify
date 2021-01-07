package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class m extends io.reactivex.a {
    final e a;
    final g<? super b> b;
    final g<? super Throwable> c;
    final io.reactivex.functions.a f;
    final io.reactivex.functions.a n;
    final io.reactivex.functions.a o;
    final io.reactivex.functions.a p;

    final class a implements c, b {
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
            try {
                m.this.p.run();
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
            this.b.dispose();
        }

        @Override // io.reactivex.c
        public void onComplete() {
            if (this.b != DisposableHelper.DISPOSED) {
                try {
                    m.this.f.run();
                    m.this.n.run();
                    this.a.onComplete();
                    try {
                        m.this.o.run();
                    } catch (Throwable th) {
                        yif.V(th);
                        io.reactivex.plugins.a.g(th);
                    }
                } catch (Throwable th2) {
                    yif.V(th2);
                    this.a.onError(th2);
                }
            }
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            if (this.b == DisposableHelper.DISPOSED) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            try {
                m.this.c.accept(th);
                m.this.n.run();
            } catch (Throwable th2) {
                yif.V(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
            try {
                m.this.o.run();
            } catch (Throwable th3) {
                yif.V(th3);
                io.reactivex.plugins.a.g(th3);
            }
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            try {
                m.this.b.accept(bVar);
                if (DisposableHelper.n(this.b, bVar)) {
                    this.b = bVar;
                    this.a.onSubscribe(this);
                }
            } catch (Throwable th) {
                yif.V(th);
                bVar.dispose();
                this.b = DisposableHelper.DISPOSED;
                EmptyDisposable.i(th, this.a);
            }
        }
    }

    public m(e eVar, g<? super b> gVar, g<? super Throwable> gVar2, io.reactivex.functions.a aVar, io.reactivex.functions.a aVar2, io.reactivex.functions.a aVar3, io.reactivex.functions.a aVar4) {
        this.a = eVar;
        this.b = gVar;
        this.c = gVar2;
        this.f = aVar;
        this.n = aVar2;
        this.o = aVar3;
        this.p = aVar4;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new a(cVar));
    }
}
