package defpackage;

import defpackage.gmc;

/* renamed from: fmc  reason: default package */
public final /* synthetic */ class fmc implements Runnable {
    public final /* synthetic */ gmc.a a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ fmc(gmc.a aVar, s81 s81) {
        this.a = aVar;
        this.b = s81;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.B(this.b);
    }
}
