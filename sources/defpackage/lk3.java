package defpackage;

import java.util.concurrent.Callable;

/* renamed from: lk3  reason: default package */
public final /* synthetic */ class lk3 implements Callable {
    public final /* synthetic */ zk3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ lk3(zk3 zk3, String str, String str2) {
        this.a = zk3;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.g(this.b, this.c);
    }
}
