package defpackage;

import com.spotify.mobius.e0;
import defpackage.hee;
import defpackage.iee;

/* renamed from: nce  reason: default package */
public final /* synthetic */ class nce implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ nce(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        iee.o oVar = (iee.o) obj;
        if (oVar.z()) {
            return e0.a(z42.l(new hee.n(oVar.A(), oVar.y())));
        }
        return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.r(oVar.A(), oVar.y())));
    }
}
