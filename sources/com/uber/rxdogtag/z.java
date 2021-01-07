package com.uber.rxdogtag;

import io.reactivex.disposables.b;

public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ DogTagSingleObserver a;
    public final /* synthetic */ b b;

    public /* synthetic */ z(DogTagSingleObserver dogTagSingleObserver, b bVar) {
        this.a = dogTagSingleObserver;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
