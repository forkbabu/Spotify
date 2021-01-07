package com.uber.rxdogtag;

import io.reactivex.x;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ x a;

    public /* synthetic */ b(x xVar) {
        this.a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onComplete();
    }
}
