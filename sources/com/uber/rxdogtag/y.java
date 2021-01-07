package com.uber.rxdogtag;

public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ DogTagSingleObserver a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(DogTagSingleObserver dogTagSingleObserver, Object obj) {
        this.a = dogTagSingleObserver;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b);
    }
}
