package defpackage;

import java.util.concurrent.Callable;

/* renamed from: c5d  reason: default package */
public final /* synthetic */ class c5d implements Callable {
    public final /* synthetic */ n5d a;

    public /* synthetic */ c5d(n5d n5d) {
        this.a = n5d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.g();
    }
}
