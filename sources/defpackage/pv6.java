package defpackage;

/* renamed from: pv6  reason: default package */
public final /* synthetic */ class pv6 implements Runnable {
    public final /* synthetic */ xw6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ pv6(xw6 xw6, boolean z, String str) {
        this.a = xw6;
        this.b = z;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c);
    }
}
