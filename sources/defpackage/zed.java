package defpackage;

import java.util.concurrent.Callable;

/* renamed from: zed  reason: default package */
public final /* synthetic */ class zed implements Callable {
    public final /* synthetic */ afd a;

    public /* synthetic */ zed(afd afd) {
        this.a = afd;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d();
    }
}
