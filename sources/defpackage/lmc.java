package defpackage;

import defpackage.nmc;

/* renamed from: lmc  reason: default package */
public final /* synthetic */ class lmc implements Runnable {
    public final /* synthetic */ nmc.a a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ lmc(nmc.a aVar, s81 s81) {
        this.a = aVar;
        this.b = s81;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.B(this.b);
    }
}
