package defpackage;

import com.spotify.mobius.e0;
import defpackage.hee;
import defpackage.iee;

/* renamed from: hde  reason: default package */
public final /* synthetic */ class hde implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ hde(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        iee.k kVar = (iee.k) obj;
        if (kee.j().c()) {
            return e0.h();
        }
        if (kee.k() == 0) {
            return e0.a(z42.l(new hee.f(0)));
        }
        return e0.f(kee.v(kee.k() - 1));
    }
}
