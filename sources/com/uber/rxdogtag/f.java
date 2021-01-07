package com.uber.rxdogtag;

import io.reactivex.disposables.b;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ DogTagCompletableObserver a;
    public final /* synthetic */ b b;

    public /* synthetic */ f(DogTagCompletableObserver dogTagCompletableObserver, b bVar) {
        this.a = dogTagCompletableObserver;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
