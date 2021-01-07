package defpackage;

import com.spotify.mobius.e0;
import com.spotify.signup.api.services.model.EmailSignupStatus;
import defpackage.hee;

/* renamed from: ice  reason: default package */
public final /* synthetic */ class ice implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ ice(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        EmailSignupStatus.Unknown unknown = (EmailSignupStatus.Unknown) obj;
        if (!kee.g()) {
            return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.s()));
        }
        return e0.f(kee.u(kee.j().m(false)));
    }
}
