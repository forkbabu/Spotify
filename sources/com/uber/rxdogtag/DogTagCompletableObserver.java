package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.c;
import io.reactivex.observers.b;

/* access modifiers changed from: package-private */
public final class DogTagCompletableObserver implements c, b {
    private final RxDogTag.Configuration config;
    private final c delegate;
    private final Throwable t = new Throwable();

    DogTagCompletableObserver(RxDogTag.Configuration configuration, c cVar) {
        this.config = configuration;
        this.delegate = cVar;
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

    @Override // io.reactivex.observers.b
    public boolean hasCustomOnError() {
        c cVar = this.delegate;
        return (cVar instanceof b) && ((b) cVar).hasCustomOnError();
    }

    @Override // io.reactivex.c
    public void onComplete() {
        if (this.config.guardObserverCallbacks) {
            e eVar = new e(this);
            c cVar = this.delegate;
            cVar.getClass();
            RxDogTag.guardedDelegateCall(eVar, new a(cVar));
            return;
        }
        this.delegate.onComplete();
    }

    @Override // io.reactivex.c
    public void onError(Throwable th) {
        c cVar = this.delegate;
        if (!(cVar instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
        } else if (cVar instanceof RxDogTagTaggedExceptionReceiver) {
            cVar.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new d(this), new g(this, th));
        } else {
            cVar.onError(th);
        }
    }

    @Override // io.reactivex.c
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new c(this), new f(this, bVar));
        } else {
            this.delegate.onSubscribe(bVar);
        }
    }
}
