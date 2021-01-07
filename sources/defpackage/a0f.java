package defpackage;

/* renamed from: a0f  reason: default package */
public final /* synthetic */ class a0f implements Runnable {
    public final /* synthetic */ l0f a;
    public final /* synthetic */ String[] b;

    public /* synthetic */ a0f(l0f l0f, String[] strArr) {
        this.a = l0f;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.z(this.b);
    }
}
