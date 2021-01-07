package defpackage;

import com.spotify.mobius.e0;
import com.spotify.signup.api.services.model.FacebookSignupStatus;
import defpackage.hee;

/* renamed from: fce  reason: default package */
public final /* synthetic */ class fce implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ fce(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        FacebookSignupStatus.Ok ok = (FacebookSignupStatus.Ok) obj;
        if (kee.e() != null) {
            return e0.a(z42.l(new hee.j(kee.e())));
        }
        return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.p()));
    }
}
