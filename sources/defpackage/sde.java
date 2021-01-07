package defpackage;

import com.spotify.mobius.e0;
import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.FacebookSignupStatus;
import defpackage.hee;

/* renamed from: sde  reason: default package */
public final /* synthetic */ class sde implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ sde(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        SignupErrorStatus d = SignupErrorStatus.d(((FacebookSignupStatus.Error) obj).statusCode());
        if (d == SignupErrorStatus.STATUS_VALIDATE_TOO_YOUNG) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.q()));
        }
        if (d == SignupErrorStatus.STATUS_EMAIL_ALREADY_EXISTS) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.o()));
        }
        return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.p()));
    }
}
