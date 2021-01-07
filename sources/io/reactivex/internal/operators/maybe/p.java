package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.n;

public final class p<T> extends a<T, T> {
    final g<? super b> b;
    final g<? super T> c;
    final g<? super Throwable> f;
    final io.reactivex.functions.a n;
    final io.reactivex.functions.a o;
    final io.reactivex.functions.a p;

    static final class a<T> implements n<T>, b {
        final n<? super T> a;
        final p<T> b;
        b c;

        a(n<? super T> nVar, p<T> pVar) {
            this.a = nVar;
            this.b = pVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            try {
                this.b.o.run();
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(Throwable th) {
            try {
                this.b.f.accept(th);
            } catch (Throwable th2) {
                yif.V(th2);
                th = new CompositeException(th, th2);
            }
            this.c = DisposableHelper.DISPOSED;
            this.a.onError(th);
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            try {
                this.b.p.run();
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
            this.c.dispose();
            this.c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.n
        public void onComplete() {
            b bVar = this.c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                try {
                    this.b.n.run();
                    this.c = disposableHelper;
                    this.a.onComplete();
                    a();
                } catch (Throwable th) {
                    yif.V(th);
                    b(th);
                }
            }
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            if (this.c == DisposableHelper.DISPOSED) {
                io.reactivex.plugins.a.g(th);
            } else {
                b(th);
            }
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.c, bVar)) {
                try {
                    this.b.b.accept(bVar);
                    this.c = bVar;
                    this.a.onSubscribe(this);
                } catch (Throwable th) {
                    yif.V(th);
                    bVar.dispose();
                    this.c = DisposableHelper.DISPOSED;
                    n<? super T> nVar = this.a;
                    nVar.onSubscribe(EmptyDisposable.INSTANCE);
                    nVar.onError(th);
                }
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            b bVar = this.c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                try {
                    this.b.c.accept(t);
                    this.c = disposableHelper;
                    this.a.onSuccess(t);
                    a();
                } catch (Throwable th) {
                    yif.V(th);
                    b(th);
                }
            }
        }
    }

    public p(io.reactivex.p<T> pVar, g<? super b> gVar, g<? super T> gVar2, g<? super Throwable> gVar3, io.reactivex.functions.a aVar, io.reactivex.functions.a aVar2, io.reactivex.functions.a aVar3) {
        super(pVar);
        this.b = gVar;
        this.c = gVar2;
        this.f = gVar3;
        this.n = aVar;
        this.o = aVar2;
        this.p = aVar3;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new a(nVar, this));
    }
}
