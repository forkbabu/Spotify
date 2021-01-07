package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.b0;
import io.reactivex.observers.b;

/* access modifiers changed from: package-private */
public final class DogTagSingleObserver<T> implements b0<T>, b {
    private final RxDogTag.Configuration config;
    private final b0<T> delegate;
    private final Throwable t = new Throwable();

    DogTagSingleObserver(RxDogTag.Configuration configuration, b0<T> b0Var) {
        this.config = configuration;
        this.delegate = b0Var;
    }

    public /* synthetic */ void a(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onError");
    }

    public /* synthetic */ void b(Throwable th) {
        this.delegate.onError(th);
    }

    public /* synthetic */ void c(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    public /* synthetic */ void d(io.reactivex.disposables.b bVar) {
        this.delegate.onSubscribe(bVar);
    }

    public /* synthetic */ void e(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSuccess");
    }

    public /* synthetic */ void f(Object obj) {
        this.delegate.onSuccess(obj);
    }

    @Override // io.reactivex.observers.b
    public boolean hasCustomOnError() {
        b0<T> b0Var = this.delegate;
        return (b0Var instanceof b) && ((b) b0Var).hasCustomOnError();
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        b0<T> b0Var = this.delegate;
        if (!(b0Var instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
        } else if (b0Var instanceof RxDogTagTaggedExceptionReceiver) {
            b0Var.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new a0(this), new w(this, th));
        } else {
            b0Var.onError(th);
        }
    }

    @Override // io.reactivex.b0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new v(this), new z(this, bVar));
        } else {
            this.delegate.onSubscribe(bVar);
        }
    }

    @Override // io.reactivex.b0
    public void onSuccess(T t2) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new x(this), new y(this, t2));
        } else {
            this.delegate.onSuccess(t2);
        }
    }
}
