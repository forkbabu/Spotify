package com.uber.rxdogtag;

public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ upf a;

    public /* synthetic */ q0(upf upf) {
        this.a = upf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onComplete();
    }
}
