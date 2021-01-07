package defpackage;

/* renamed from: bu3  reason: default package */
public final /* synthetic */ class bu3 implements Runnable {
    public final /* synthetic */ du3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ bu3(du3 du3, String str) {
        this.a = du3;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b);
    }
}
