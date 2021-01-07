package defpackage;

import com.spotify.mobius.e0;
import com.spotify.signup.api.services.model.IdentifierTokenSignupStatus;
import defpackage.hee;

/* renamed from: zce  reason: default package */
public final /* synthetic */ class zce implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ zce(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        IdentifierTokenSignupStatus.Unknown unknown = (IdentifierTokenSignupStatus.Unknown) obj;
        if (!kee.g()) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.s()));
        }
        return e0.f(kee.u(kee.j().m(false)));
    }
}
