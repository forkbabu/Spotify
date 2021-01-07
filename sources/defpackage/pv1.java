package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.k;
import defpackage.qv1;

/* renamed from: pv1  reason: default package */
public final /* synthetic */ class pv1 implements ti0 {
    public final /* synthetic */ AuthorizationRequest a;
    public final /* synthetic */ tv1 b;

    public /* synthetic */ pv1(AuthorizationRequest authorizationRequest, tv1 tv1) {
        this.a = authorizationRequest;
        this.b = tv1;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        AuthorizationRequest authorizationRequest = this.a;
        k.c cVar = (k.c) obj;
        return new qv1.c(wu1.a(authorizationRequest), authorizationRequest.e(), this.b.b().get());
    }
}
