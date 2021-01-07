package com.uber.rxdogtag;

public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ DogTagSingleObserver a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ w(DogTagSingleObserver dogTagSingleObserver, Throwable th) {
        this.a = dogTagSingleObserver;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
