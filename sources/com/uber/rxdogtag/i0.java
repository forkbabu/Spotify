package com.uber.rxdogtag;

import io.reactivex.n;

public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ n a;

    public /* synthetic */ i0(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onComplete();
    }
}
