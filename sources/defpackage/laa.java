package defpackage;

/* renamed from: laa  reason: default package */
public final /* synthetic */ class laa implements Runnable {
    public final /* synthetic */ paa a;
    public final /* synthetic */ long b;

    public /* synthetic */ laa(paa paa, long j) {
        this.a = paa;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(this.b);
    }
}
