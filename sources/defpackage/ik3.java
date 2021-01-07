package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ik3  reason: default package */
public final /* synthetic */ class ik3 implements Callable {
    public final /* synthetic */ zk3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String f;

    public /* synthetic */ ik3(zk3 zk3, String str, String str2, String str3) {
        this.a = zk3;
        this.b = str;
        this.c = str2;
        this.f = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.h(this.b, this.c, this.f);
    }
}
