package com.uber.rxdogtag;

import io.reactivex.c;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ c a;

    public /* synthetic */ a(c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onComplete();
    }
}
