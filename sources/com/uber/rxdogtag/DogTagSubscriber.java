package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.j;
import io.reactivex.observers.b;

/* access modifiers changed from: package-private */
public final class DogTagSubscriber<T> implements j<T>, b {
    private final RxDogTag.Configuration config;
    private final upf<T> delegate;
    private final Throwable t = new Throwable();

    DogTagSubscriber(RxDogTag.Configuration configuration, upf<T> upf) {
        this.config = configuration;
        this.delegate = upf;
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

    public /* synthetic */ void f(Object obj) {
        this.delegate.onNext(obj);
    }

    public /* synthetic */ void g(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    public /* synthetic */ void h(vpf vpf) {
        this.delegate.onSubscribe(vpf);
    }

    @Override // io.reactivex.observers.b
    public boolean hasCustomOnError() {
        upf<T> upf = this.delegate;
        return (upf instanceof b) && ((b) upf).hasCustomOnError();
    }

    @Override // defpackage.upf
    public void onComplete() {
        if (this.config.guardObserverCallbacks) {
            f0 f0Var = new f0(this);
            upf<T> upf = this.delegate;
            upf.getClass();
            RxDogTag.guardedDelegateCall(f0Var, new q0(upf));
            return;
        }
        this.delegate.onComplete();
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        upf<T> upf = this.delegate;
        if (!(upf instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
        } else if (upf instanceof RxDogTagTaggedExceptionReceiver) {
            upf.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new h0(this), new b0(this, th));
        } else {
            upf.onError(th);
        }
    }

    @Override // defpackage.upf
    public void onNext(T t2) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new e0(this), new d0(this, t2));
        } else {
            this.delegate.onNext(t2);
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new g0(this), new c0(this, vpf));
        } else {
            this.delegate.onSubscribe(vpf);
        }
    }
}
