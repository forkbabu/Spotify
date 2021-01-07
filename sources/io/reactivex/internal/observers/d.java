package io.reactivex.internal.observers;

import io.reactivex.b0;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.n;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class d<T> extends CountDownLatch implements b0<T>, c, n<T> {
    T a;
    Throwable b;
    b c;
    volatile boolean f;

    public d() {
        super(1);
    }

    public boolean a(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                if (!await(j, timeUnit)) {
                    d();
                    return false;
                }
            } catch (InterruptedException e) {
                d();
                throw ExceptionHelper.e(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return true;
        }
        throw ExceptionHelper.e(th);
    }

    public T b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                d();
                throw ExceptionHelper.e(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw ExceptionHelper.e(th);
    }

    public Throwable c() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                d();
                return e;
            }
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f = true;
        b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.c
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        this.b = th;
        countDown();
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        this.c = bVar;
        if (this.f) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.b0
    public void onSuccess(T t) {
        this.a = t;
        countDown();
    }
}
