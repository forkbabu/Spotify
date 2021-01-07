package defpackage;

import java.util.concurrent.Callable;

/* renamed from: g7d  reason: default package */
public final /* synthetic */ class g7d implements Callable {
    public final /* synthetic */ q7d a;

    public /* synthetic */ g7d(q7d q7d) {
        this.a = q7d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d();
    }
}
