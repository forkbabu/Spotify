package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import com.spotify.music.connection.g;
import defpackage.bza;
import defpackage.zya;

/* renamed from: bya  reason: default package */
public final /* synthetic */ class bya implements ti0 {
    public final /* synthetic */ bza a;
    public final /* synthetic */ zya b;

    public /* synthetic */ bya(bza bza, zya zya) {
        this.a = bza;
        this.b = zya;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        bza bza = this.a;
        zya zya = this.b;
        zya.c cVar = (zya.c) obj;
        zya.getClass();
        zya.c cVar2 = (zya.c) zya;
        if (bza.b().equals(cVar2.l())) {
            return e0.h();
        }
        g l = cVar2.l();
        bza.a f = bza.f();
        f.c(l);
        bza a2 = f.a();
        if (MoreObjects.isNullOrEmpty(a2.d())) {
            return e0.f(a2);
        }
        return (e0) cVar2.l().a(new hya(a2), new yxa(a2), zxa.a);
    }
}
