package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobius.e0;
import defpackage.qv1;
import defpackage.rv1;

/* renamed from: mv1  reason: default package */
public final /* synthetic */ class mv1 implements ti0 {
    public final /* synthetic */ tv1 a;

    public /* synthetic */ mv1(tv1 tv1) {
        this.a = tv1;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tv1 tv1 = this.a;
        rv1.a aVar = (rv1.a) obj;
        if (tv1.c()) {
            return e0.h();
        }
        AuthorizationRequest a2 = tv1.a();
        String i = a2 != null ? a2.i() : null;
        ErrorMessage errorMessage = ErrorMessage.CONNECTION_TIMEOUT;
        if (i == null) {
            i = "";
        }
        return e0.a(ImmutableSet.of(new qv1.f(errorMessage, i)));
    }
}
