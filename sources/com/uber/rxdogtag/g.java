package com.uber.rxdogtag;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ DogTagCompletableObserver a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ g(DogTagCompletableObserver dogTagCompletableObserver, Throwable th) {
        this.a = dogTagCompletableObserver;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
