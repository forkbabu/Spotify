package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ob5  reason: default package */
public final /* synthetic */ class ob5 implements Callable {
    public final /* synthetic */ hc5 a;

    public /* synthetic */ ob5(hc5 hc5) {
        this.a = hc5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}
