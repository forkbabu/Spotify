package defpackage;

import java.util.concurrent.Callable;

/* renamed from: en7  reason: default package */
public final /* synthetic */ class en7 implements Callable {
    public final /* synthetic */ hn7 a;

    public /* synthetic */ en7(hn7 hn7) {
        this.a = hn7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d();
    }
}
