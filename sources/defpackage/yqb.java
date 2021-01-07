package defpackage;

import defpackage.drb;

/* renamed from: yqb  reason: default package */
public final /* synthetic */ class yqb implements Runnable {
    public final /* synthetic */ drb.a a;
    public final /* synthetic */ int b;

    public /* synthetic */ yqb(drb.a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        drb.a aVar = this.a;
        drb.this.I(this.b);
    }
}
