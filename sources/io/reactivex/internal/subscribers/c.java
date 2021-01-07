package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.CountDownLatch;

/* JADX WARN: Incorrect class signature, class is equals to this class: <T:Ljava/lang/Object;>Lio/reactivex/internal/subscribers/c<TT;>; */
public final class c<T> extends CountDownLatch implements j {
    T a;
    Throwable b;
    vpf c;

    public c() {
        super(1);
    }

    public final Object a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                vpf vpf = this.c;
                this.c = SubscriptionHelper.CANCELLED;
                if (vpf != null) {
                    vpf.cancel();
                }
                throw ExceptionHelper.e(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw ExceptionHelper.e(th);
    }

    @Override // defpackage.upf
    public final void onComplete() {
        countDown();
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        } else {
            a.g(th);
        }
        countDown();
    }

    @Override // defpackage.upf
    public void onNext(T t) {
        if (this.a == null) {
            this.a = t;
            this.c.cancel();
            countDown();
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public final void onSubscribe(vpf vpf) {
        if (SubscriptionHelper.m(this.c, vpf)) {
            this.c = vpf;
            vpf.n(Long.MAX_VALUE);
        }
    }
}
