package defpackage;

import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.FacebookSignupStatus;
import defpackage.hee;
import defpackage.lee;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: wee  reason: default package */
public final /* synthetic */ class wee implements l {
    public final /* synthetic */ iae a;

    public /* synthetic */ wee(iae iae) {
        this.a = iae;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(((hee.x) obj).c()).P().W(yfe.a, false, Integer.MAX_VALUE).p0(s.i0(iee.b(new lee.b(FacebookSignupStatus.error("", SignupErrorStatus.STATUS_UNKNOWN_ERROR.g())))));
    }
}
