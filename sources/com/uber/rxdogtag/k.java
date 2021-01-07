package com.uber.rxdogtag;

import io.reactivex.disposables.b;

public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ DogTagMaybeObserver a;
    public final /* synthetic */ b b;

    public /* synthetic */ k(DogTagMaybeObserver dogTagMaybeObserver, b bVar) {
        this.a = dogTagMaybeObserver;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
