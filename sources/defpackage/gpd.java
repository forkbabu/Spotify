package defpackage;

import defpackage.kpd;

/* renamed from: gpd  reason: default package */
public final /* synthetic */ class gpd implements Runnable {
    public final /* synthetic */ kpd.a a;

    public /* synthetic */ gpd(kpd.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
    }
}
