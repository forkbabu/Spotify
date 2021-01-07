package defpackage;

import com.spotify.mobius.e0;
import com.spotify.signup.api.services.model.EmailSignupStatus;
import defpackage.hee;

/* renamed from: dce  reason: default package */
public final /* synthetic */ class dce implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ dce(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        EmailSignupStatus.Ok ok = (EmailSignupStatus.Ok) obj;
        return e0.a(z42.l(new hee.i(kee.c().a(), kee.l().b())));
    }
}
