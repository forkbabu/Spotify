package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.k;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.net.HttpCookie;

/* renamed from: ecc  reason: default package */
public final /* synthetic */ class ecc implements ti0 {
    public final /* synthetic */ PartnerType a;
    public final /* synthetic */ AuthorizationRequest b;
    public final /* synthetic */ HttpCookie c;

    public /* synthetic */ ecc(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        this.a = partnerType;
        this.b = authorizationRequest;
        this.c = httpCookie;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        k.c cVar = (k.c) obj;
        return bdc.d(this.a, this.b, this.c);
    }
}
