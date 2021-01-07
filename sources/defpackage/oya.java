package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.bza;
import defpackage.zya;

/* renamed from: oya  reason: default package */
public final /* synthetic */ class oya implements ti0 {
    public final /* synthetic */ bza a;
    public final /* synthetic */ zya b;

    public /* synthetic */ oya(bza bza, zya zya) {
        this.a = bza;
        this.b = zya;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        bza bza = this.a;
        zya zya = this.b;
        zya.h hVar = (zya.h) obj;
        zya.getClass();
        yya l = ((zya.h) zya).l();
        bza.a f = bza.f();
        f.d(Optional.of(l));
        return e0.f(f.a());
    }
}
