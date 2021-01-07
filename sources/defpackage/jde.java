package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.EmailSignupStatus;
import defpackage.hee;

/* renamed from: jde  reason: default package */
public final /* synthetic */ class jde implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ jde(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        EmailSignupStatus.Error error = (EmailSignupStatus.Error) obj;
        SignupErrorStatus status = error.status();
        if (status == SignupErrorStatus.STATUS_VALIDATE_TOO_YOUNG) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.q()));
        }
        if (status == SignupErrorStatus.STATUS_EMAIL_ALREADY_EXISTS) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.o()));
        }
        if (status != SignupErrorStatus.STATUS_REQUEST_FROM_DATACENTER) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.p()));
        }
        String str = error.errors().get("generic_error");
        if (!MoreObjects.isNullOrEmpty(str)) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.u(str)));
        }
        return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.p()));
    }
}
