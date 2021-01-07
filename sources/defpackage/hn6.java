package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hn6  reason: default package */
public final /* synthetic */ class hn6 implements Callable {
    public final /* synthetic */ bo6 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean n;

    public /* synthetic */ hn6(bo6 bo6, List list, boolean z, boolean z2, boolean z3) {
        this.a = bo6;
        this.b = list;
        this.c = z;
        this.f = z2;
        this.n = z3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b, this.c, this.f, this.n);
    }
}
