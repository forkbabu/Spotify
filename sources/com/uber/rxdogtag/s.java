package com.uber.rxdogtag;

public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ DogTagObserver a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ s(DogTagObserver dogTagObserver, Throwable th) {
        this.a = dogTagObserver;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
