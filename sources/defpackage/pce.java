package defpackage;

import com.spotify.mobius.e0;
import defpackage.gee;
import defpackage.hee;
import defpackage.iee;

/* renamed from: pce  reason: default package */
public final /* synthetic */ class pce implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ pce(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        iee.l lVar = (iee.l) obj;
        if (!kee.i()) {
            return e0.f(kee.v(kee.k() + 1));
        }
        gee n = kee.n();
        n.getClass();
        if (n instanceof gee.b) {
            return e0.f(kee.v(kee.k() + 1));
        }
        if (kee.f().a()) {
            return e0.h();
        }
        return e0.g(kee.s(kee.f().f(true)), z42.l(new hee.e(true)));
    }
}
