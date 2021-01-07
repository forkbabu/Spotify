package defpackage;

import com.spotify.mobius.e0;
import com.spotify.signup.api.services.model.IdentifierTokenSignupStatus;
import defpackage.hee;

/* renamed from: tce  reason: default package */
public final /* synthetic */ class tce implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ tce(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return e0.a(z42.l(new hee.k(((IdentifierTokenSignupStatus.Ok) obj).oneTimeToken(), this.a.b())));
    }
}
