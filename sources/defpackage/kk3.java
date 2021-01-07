package defpackage;

import java.util.concurrent.Callable;

/* renamed from: kk3  reason: default package */
public final /* synthetic */ class kk3 implements Callable {
    public final /* synthetic */ zk3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ kk3(zk3 zk3, String str, String str2) {
        this.a = zk3;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.f(this.b, this.c);
    }
}
