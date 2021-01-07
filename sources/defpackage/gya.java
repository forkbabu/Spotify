package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.bza;
import defpackage.dza;
import defpackage.zya;

/* renamed from: gya  reason: default package */
public final /* synthetic */ class gya implements ti0 {
    public final /* synthetic */ bza a;
    public final /* synthetic */ zya b;

    public /* synthetic */ gya(bza bza, zya zya) {
        this.a = bza;
        this.b = zya;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        bza bza = this.a;
        zya zya = this.b;
        zya.g gVar = (zya.g) obj;
        zya.getClass();
        dza l = ((zya.g) zya).l();
        if (MoreObjects.isNullOrEmpty(bza.d())) {
            l.getClass();
            if ((l instanceof dza.d) || (l instanceof dza.c)) {
                return e0.h();
            }
        }
        bza.a f = bza.f();
        f.f(l);
        bza.a f2 = f.a().f();
        f2.d(Optional.absent());
        return e0.f(f2.a());
    }
}
