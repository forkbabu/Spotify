package defpackage;

/* renamed from: xed  reason: default package */
public final /* synthetic */ class xed implements Runnable {
    public final /* synthetic */ afd a;
    public final /* synthetic */ ied b;

    public /* synthetic */ xed(afd afd, ied ied) {
        this.a = afd;
        this.b = ied;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
