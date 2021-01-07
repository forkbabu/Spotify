package com.uber.rxdogtag;

public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ DogTagMaybeObserver a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ m(DogTagMaybeObserver dogTagMaybeObserver, Throwable th) {
        this.a = dogTagMaybeObserver;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
