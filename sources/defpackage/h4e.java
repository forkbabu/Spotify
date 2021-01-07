package defpackage;

import java.util.concurrent.Callable;

/* renamed from: h4e  reason: default package */
public final /* synthetic */ class h4e implements Callable {
    public final /* synthetic */ o4e a;
    public final /* synthetic */ b4e b;

    public /* synthetic */ h4e(o4e o4e, b4e b4e) {
        this.a = o4e;
        this.b = b4e;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b);
    }
}
