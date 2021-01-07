package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ul0  reason: default package */
public final /* synthetic */ class ul0 implements Callable {
    public final /* synthetic */ zl0 a;

    public /* synthetic */ ul0(zl0 zl0) {
        this.a = zl0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b();
    }
}
