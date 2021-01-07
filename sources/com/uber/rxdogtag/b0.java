package com.uber.rxdogtag;

public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ DogTagSubscriber a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ b0(DogTagSubscriber dogTagSubscriber, Throwable th) {
        this.a = dogTagSubscriber;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
