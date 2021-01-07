package defpackage;

import defpackage.drb;

/* renamed from: wqb  reason: default package */
public final /* synthetic */ class wqb implements Runnable {
    public final /* synthetic */ drb.a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ wqb(drb.a aVar, int i, int i2) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        drb.a aVar = this.a;
        drb.this.H(this.b, this.c);
    }
}
