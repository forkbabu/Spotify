package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hx3  reason: default package */
public final /* synthetic */ class hx3 implements Callable {
    public final /* synthetic */ ly3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ hx3(ly3 ly3, String str) {
        this.a = ly3;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b);
    }
}
