package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.n;
import io.reactivex.observers.b;

/* access modifiers changed from: package-private */
public final class DogTagMaybeObserver<T> implements n<T>, b {
    private final RxDogTag.Configuration config;
    private final n<T> delegate;
    private final Throwable t = new Throwable();

    DogTagMaybeObserver(RxDogTag.Configuration configuration, n<T> nVar) {
        this.config = configuration;
        this.delegate = nVar;
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
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    public /* synthetic */ void e(io.reactivex.disposables.b bVar) {
        this.delegate.onSubscribe(bVar);
    }

    public /* synthetic */ void f(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSuccess");
    }

    public /* synthetic */ void g(Object obj) {
        this.delegate.onSuccess(obj);
    }

    @Override // io.reactivex.observers.b
    public boolean hasCustomOnError() {
        n<T> nVar = this.delegate;
        return (nVar instanceof b) && ((b) nVar).hasCustomOnError();
    }

    @Override // io.reactivex.n
    public void onComplete() {
        if (this.config.guardObserverCallbacks) {
            i iVar = new i(this);
            n<T> nVar = this.delegate;
            nVar.getClass();
            RxDogTag.guardedDelegateCall(iVar, new i0(nVar));
            return;
        }
        this.delegate.onComplete();
    }

    @Override // io.reactivex.n
    public void onError(Throwable th) {
        n<T> nVar = this.delegate;
        if (!(nVar instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
        } else if (nVar instanceof RxDogTagTaggedExceptionReceiver) {
            nVar.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new n(this), new m(this, th));
        } else {
            nVar.onError(th);
        }
    }

    @Override // io.reactivex.n
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new j(this), new k(this, bVar));
        } else {
            this.delegate.onSubscribe(bVar);
        }
    }

    @Override // io.reactivex.n
    public void onSuccess(T t2) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new h(this), new l(this, t2));
        } else {
            this.delegate.onSuccess(t2);
        }
    }
}
