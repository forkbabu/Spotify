package defpackage;

import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.EmailSignupStatus;
import defpackage.hee;
import defpackage.lee;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.Collections;

/* renamed from: cge  reason: default package */
public final /* synthetic */ class cge implements l {
    public final /* synthetic */ iae a;

    public /* synthetic */ cge(iae iae) {
        this.a = iae;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(((hee.w) obj).c()).P().W(age.a, false, Integer.MAX_VALUE).p0(s.i0(iee.b(new lee.a(EmailSignupStatus.error(SignupErrorStatus.STATUS_UNKNOWN_ERROR, Collections.emptyMap())))));
    }
}
