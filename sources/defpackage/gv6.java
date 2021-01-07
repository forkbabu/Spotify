package defpackage;

/* renamed from: gv6  reason: default package */
public final /* synthetic */ class gv6 implements Runnable {
    public final /* synthetic */ nw6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ gv6(nw6 nw6, String str) {
        this.a = nw6;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
