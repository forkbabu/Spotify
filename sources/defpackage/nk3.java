package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: nk3  reason: default package */
public final /* synthetic */ class nk3 implements Callable {
    public final /* synthetic */ fl3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;

    public /* synthetic */ nk3(fl3 fl3, String str, Map map) {
        this.a = fl3;
        this.b = str;
        this.c = map;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b, this.c);
    }
}
