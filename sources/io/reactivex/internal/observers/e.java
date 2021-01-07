package io.reactivex.internal.observers;

import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.x;

public final class e<T> implements x<T>, b {
    final x<? super T> a;
    final g<? super b> b;
    final a c;
    b f;

    public e(x<? super T> xVar, g<? super b> gVar, a aVar) {
        this.a = xVar;
        this.b = gVar;
        this.c = aVar;
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return this.f.d();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        b bVar = this.f;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (bVar != disposableHelper) {
            this.f = disposableHelper;
            try {
                this.c.run();
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
            bVar.dispose();
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        b bVar = this.f;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (bVar != disposableHelper) {
            this.f = disposableHelper;
            this.a.onComplete();
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        b bVar = this.f;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (bVar != disposableHelper) {
            this.f = disposableHelper;
            this.a.onError(th);
            return;
        }
        io.reactivex.plugins.a.g(th);
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        this.a.onNext(t);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        try {
            this.b.accept(bVar);
            if (DisposableHelper.n(this.f, bVar)) {
                this.f = bVar;
                this.a.onSubscribe(this);
            }
        } catch (Throwable th) {
            yif.V(th);
            bVar.dispose();
            this.f = DisposableHelper.DISPOSED;
            EmptyDisposable.k(th, this.a);
        }
    }
}
