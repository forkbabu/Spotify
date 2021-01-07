package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.bakery.e;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.d0;
import io.reactivex.s;
import java.net.HttpCookie;

/* renamed from: lcc  reason: default package */
public class lcc {
    private final av1 a;
    private final e b;

    lcc(av1 av1, e eVar) {
        this.a = av1;
        this.b = eVar;
    }

    public s<bdc> a(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        return this.b.a().a0(new hcc(this, authorizationRequest)).j0(new bcc(partnerType, authorizationRequest));
    }

    public /* synthetic */ d0 b(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return this.a.c(authorizationRequest, httpCookie).A(new icc(httpCookie));
    }
}
