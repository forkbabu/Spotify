package defpackage;

import com.spotify.mobius.e0;
import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.IdentifierTokenSignupStatus;
import defpackage.hee;

/* renamed from: cde  reason: default package */
public final /* synthetic */ class cde implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ cde(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        SignupErrorStatus status = ((IdentifierTokenSignupStatus.Error) obj).status();
        if (status == SignupErrorStatus.STATUS_VALIDATE_TOO_YOUNG) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.q()));
        }
        if (status == SignupErrorStatus.STATUS_EMAIL_ALREADY_EXISTS) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.o()));
        }
        return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.p()));
    }
}
