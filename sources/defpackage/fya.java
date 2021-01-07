package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.bza;
import defpackage.xya;
import defpackage.zya;

/* renamed from: fya  reason: default package */
public final /* synthetic */ class fya implements ti0 {
    public final /* synthetic */ bza a;
    public final /* synthetic */ zya b;

    public /* synthetic */ fya(bza bza, zya zya) {
        this.a = bza;
        this.b = zya;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        bza bza = this.a;
        zya zya = this.b;
        zya.d dVar = (zya.d) obj;
        zya.getClass();
        String l = ((zya.d) zya).l();
        if (bza.d().equals(l)) {
            return e0.h();
        }
        bza.a f = bza.f();
        f.e(l);
        bza a2 = f.a();
        if (!(!MoreObjects.isNullOrEmpty(bza.d()) && MoreObjects.isNullOrEmpty(l))) {
            return (e0) bza.b().a(new mya(a2, l), new nya(a2, l), new eya(a2));
        }
        bza.a f2 = a2.f();
        f2.d(Optional.absent());
        return e0.g(f2.a(), z42.l(new xya.c()));
    }
}
