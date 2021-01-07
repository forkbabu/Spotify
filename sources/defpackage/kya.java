package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import defpackage.bza;
import defpackage.zya;

/* renamed from: kya  reason: default package */
public final /* synthetic */ class kya implements ti0 {
    public final /* synthetic */ bza a;
    public final /* synthetic */ zya b;

    public /* synthetic */ kya(bza bza, zya zya) {
        this.a = bza;
        this.b = zya;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        bza bza = this.a;
        zya zya = this.b;
        zya.j jVar = (zya.j) obj;
        zya.getClass();
        fza l = ((zya.j) zya).l();
        bza.a f = bza.f();
        f.g(l);
        bza a2 = f.a();
        if (MoreObjects.isNullOrEmpty(bza.d())) {
            return e0.f(a2);
        }
        return (e0) a2.b().a(new aya(a2), new xxa(a2), new wxa(a2));
    }
}
