package defpackage;

import java.util.concurrent.Callable;

/* renamed from: jk3  reason: default package */
public final /* synthetic */ class jk3 implements Callable {
    public final /* synthetic */ zk3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jk3(zk3 zk3, String str, boolean z) {
        this.a = zk3;
        this.b = str;
        this.c = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.e(this.b, this.c);
    }
}
