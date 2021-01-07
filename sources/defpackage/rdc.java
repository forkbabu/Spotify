package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rdc  reason: default package */
public final /* synthetic */ class rdc implements Callable {
    public final /* synthetic */ tdc a;

    public /* synthetic */ rdc(tdc tdc) {
        this.a = tdc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}
