package defpackage;

/* renamed from: cb6  reason: default package */
public final /* synthetic */ class cb6 implements Runnable {
    public final /* synthetic */ sb6 a;
    public final /* synthetic */ int b;

    public /* synthetic */ cb6(sb6 sb6, int i) {
        this.a = sb6;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.C(this.b);
    }
}
