package defpackage;

/* renamed from: jl6  reason: default package */
public final /* synthetic */ class jl6 implements Runnable {
    public final /* synthetic */ sl6 a;
    public final /* synthetic */ int b;

    public /* synthetic */ jl6(sl6 sl6, int i) {
        this.a = sl6;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.w(this.b);
    }
}
