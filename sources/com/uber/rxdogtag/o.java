package com.uber.rxdogtag;

import io.reactivex.disposables.b;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ DogTagObserver a;
    public final /* synthetic */ b b;

    public /* synthetic */ o(DogTagObserver dogTagObserver, b bVar) {
        this.a = dogTagObserver;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(this.b);
    }
}
