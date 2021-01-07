package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import defpackage.eq0;
import defpackage.fq0;
import defpackage.gq0;

/* renamed from: wp0  reason: default package */
public final /* synthetic */ class wp0 implements ti0 {
    public final /* synthetic */ hq0 a;

    public /* synthetic */ wp0(hq0 hq0) {
        this.a = hq0;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        hq0 hq0 = this.a;
        gq0.g gVar = (gq0.g) obj;
        String i = gVar.i();
        if (MoreObjects.isNullOrEmpty(i)) {
            return e0.f(hq0.h("Oops! You didn't enter a creative Id!"));
        }
        return e0.g(hq0.g(new eq0.a()), z42.l(new fq0.a(gVar.j(), hq0.d().get(gVar.j()), i, hq0.a())));
    }
}
