package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.observers.b;
import io.reactivex.x;

/* access modifiers changed from: package-private */
public final class DogTagObserver<T> implements x<T>, b {
    private final RxDogTag.Configuration config;
    private final x<T> delegate;
    private final Throwable t = new Throwable();

    DogTagObserver(RxDogTag.Configuration configuration, x<T> xVar) {
        this.config = configuration;
        this.delegate = xVar;
    }

    public /* synthetic */ void a(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    public /* synthetic */ void b(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onError");
    }

    public /* synthetic */ void c(Throwable th) {
        this.delegate.onError(th);
    }

    public /* synthetic */ void d(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onNext");
    }

    public /* synthetic */ void e(Object obj) {
        this.delegate.onNext(obj);
    }

    public /* synthetic */ void f(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    public /* synthetic */ void g(io.reactivex.disposables.b bVar) {
        this.delegate.onSubscribe(bVar);
    }

    @Override // io.reactivex.observers.b
    public boolean hasCustomOnError() {
        x<T> xVar = this.delegate;
        return (xVar instanceof b) && ((b) xVar).hasCustomOnError();
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        if (this.config.guardObserverCallbacks) {
            p pVar = new p(this);
            x<T> xVar = this.delegate;
            xVar.getClass();
            RxDogTag.guardedDelegateCall(pVar, new b(xVar));
            return;
        }
        this.delegate.onComplete();
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        x<T> xVar = this.delegate;
        if (!(xVar instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
        } else if (xVar instanceof RxDogTagTaggedExceptionReceiver) {
            xVar.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new q(this), new s(this, th));
        } else {
            xVar.onError(th);
        }
    }

    @Override // io.reactivex.x
    public void onNext(T t2) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new r(this), new t(this, t2));
        } else {
            this.delegate.onNext(t2);
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new u(this), new o(this, bVar));
        } else {
            this.delegate.onSubscribe(bVar);
        }
    }
}
