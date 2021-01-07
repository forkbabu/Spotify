package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: hk3  reason: default package */
public final /* synthetic */ class hk3 implements Callable {
    public final /* synthetic */ xk3 a;
    public final /* synthetic */ Map b;

    public /* synthetic */ hk3(xk3 xk3, Map map) {
        this.a = xk3;
        this.b = map;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b);
    }
}
