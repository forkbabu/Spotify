package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobius.e0;
import defpackage.qv1;
import defpackage.rv1;

/* renamed from: jv1  reason: default package */
public final /* synthetic */ class jv1 implements ti0 {
    public final /* synthetic */ tv1 a;

    public /* synthetic */ jv1(tv1 tv1) {
        this.a = tv1;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tv1 tv1 = this.a;
        String h = ((rv1.c) obj).h();
        AuthorizationRequest a2 = tv1.a();
        a2.getClass();
        String i = a2.i();
        ErrorMessage errorMessage = ErrorMessage.BAKERY_REQUEST_ERROR;
        if (i == null) {
            i = "";
        }
        return e0.a(ImmutableSet.of(new qv1.g(errorMessage, h, i)));
    }
}
