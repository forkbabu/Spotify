package defpackage;

/* renamed from: md7  reason: default package */
public final /* synthetic */ class md7 implements Runnable {
    public final /* synthetic */ xd7 a;
    public final /* synthetic */ rc7 b;

    public /* synthetic */ md7(xd7 xd7, rc7 rc7) {
        this.a = xd7;
        this.b = rc7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b);
    }
}
