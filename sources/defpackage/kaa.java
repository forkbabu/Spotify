package defpackage;

/* renamed from: kaa  reason: default package */
public final /* synthetic */ class kaa implements Runnable {
    public final /* synthetic */ maa a;
    public final /* synthetic */ int b;

    public /* synthetic */ kaa(maa maa, int i) {
        this.a = maa;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        maa maa = this.a;
        maa.a.e(this.b);
    }
}
