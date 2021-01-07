package defpackage;

import java.util.concurrent.Callable;

/* renamed from: gr6  reason: default package */
public final /* synthetic */ class gr6 implements Callable {
    public final /* synthetic */ wr6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ gr6(wr6 wr6, String str) {
        this.a = wr6;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b);
    }
}
