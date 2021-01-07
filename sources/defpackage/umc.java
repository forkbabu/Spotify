package defpackage;

import defpackage.wmc;

/* renamed from: umc  reason: default package */
public final /* synthetic */ class umc implements Runnable {
    public final /* synthetic */ wmc.a a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ umc(wmc.a aVar, s81 s81) {
        this.a = aVar;
        this.b = s81;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.B(this.b);
    }
}
