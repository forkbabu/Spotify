package defpackage;

/* renamed from: au3  reason: default package */
public final /* synthetic */ class au3 implements Runnable {
    public final /* synthetic */ du3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ au3(du3 du3, String str) {
        this.a = du3;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
