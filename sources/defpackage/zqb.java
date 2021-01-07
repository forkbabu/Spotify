package defpackage;

import defpackage.drb;

/* renamed from: zqb  reason: default package */
public final /* synthetic */ class zqb implements Runnable {
    public final /* synthetic */ drb.a a;
    public final /* synthetic */ int b;

    public /* synthetic */ zqb(drb.a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        drb.a aVar = this.a;
        drb.this.C(this.b);
    }
}
