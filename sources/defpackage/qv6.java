package defpackage;

/* renamed from: qv6  reason: default package */
public final /* synthetic */ class qv6 implements Runnable {
    public final /* synthetic */ zw6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ qv6(zw6 zw6, String str) {
        this.a = zw6;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
