package com.uber.rxdogtag;

public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ DogTagObserver a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(DogTagObserver dogTagObserver, Object obj) {
        this.a = dogTagObserver;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
