package com.uber.rxdogtag;

public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ DogTagMaybeObserver a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(DogTagMaybeObserver dogTagMaybeObserver, Object obj) {
        this.a = dogTagMaybeObserver;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(this.b);
    }
}
