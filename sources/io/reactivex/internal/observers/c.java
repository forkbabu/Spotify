package io.reactivex.internal.observers;

import io.reactivex.disposables.b;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.x;
import java.util.concurrent.CountDownLatch;

/* JADX WARN: Incorrect class signature, class is equals to this class: <T:Ljava/lang/Object;>Lio/reactivex/internal/observers/c<TT;>; */
public final class c<T> extends CountDownLatch implements x, b {
    T a;
    Throwable b;
    b c;
    volatile boolean f;

    public c() {
        super(1);
    }

    public final Object a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                throw ExceptionHelper.e(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw ExceptionHelper.e(th);
    }

    @Override // io.reactivex.disposables.b
    public final boolean d() {
        return this.f;
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        this.f = true;
        b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (this.a == null) {
            this.a = t;
            this.c.dispose();
            countDown();
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public final void onSubscribe(b bVar) {
        this.c = bVar;
        if (this.f) {
            bVar.dispose();
        }
    }
}
