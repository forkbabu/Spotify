package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.k;
import com.spotify.mobile.android.util.x;
import defpackage.qv1;

/* renamed from: hv1  reason: default package */
public final /* synthetic */ class hv1 implements ti0 {
    public final /* synthetic */ AuthorizationRequest a;
    public final /* synthetic */ tv1 b;

    public /* synthetic */ hv1(AuthorizationRequest authorizationRequest, tv1 tv1) {
        this.a = authorizationRequest;
        this.b = tv1;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        AuthorizationRequest authorizationRequest = this.a;
        return new qv1.c(wu1.a(authorizationRequest), (String) x.n(((k.e) obj).e(), authorizationRequest.e()), this.b.b().get());
    }
}
