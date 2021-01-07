package defpackage;

import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.IdentifierTokenSignupStatus;
import defpackage.hee;
import defpackage.lee;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.Collections;

/* renamed from: wfe  reason: default package */
public final /* synthetic */ class wfe implements l {
    public final /* synthetic */ iae a;

    public /* synthetic */ wfe(iae iae) {
        this.a = iae;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(((hee.y) obj).c()).A(ffe.a).C(z.z(iee.b(new lee.c(IdentifierTokenSignupStatus.error(SignupErrorStatus.STATUS_UNKNOWN_ERROR, Collections.emptyMap()))))).P();
    }
}
