package defpackage;

import java.util.concurrent.Callable;

/* renamed from: mx0  reason: default package */
public final /* synthetic */ class mx0 implements Callable {
    public final /* synthetic */ ux0 a;

    public /* synthetic */ mx0(ux0 ux0) {
        this.a = ux0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}
