package defpackage;

import defpackage.kpd;
import defpackage.mpd;

/* renamed from: hpd  reason: default package */
public final /* synthetic */ class hpd implements Runnable {
    public final /* synthetic */ kpd.a a;
    public final /* synthetic */ mpd.b b;

    public /* synthetic */ hpd(kpd.a aVar, mpd.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
