package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.k;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.net.HttpCookie;

/* renamed from: ccc  reason: default package */
public final /* synthetic */ class ccc implements ti0 {
    public final /* synthetic */ PartnerType a;
    public final /* synthetic */ AuthorizationRequest b;
    public final /* synthetic */ HttpCookie c;

    public /* synthetic */ ccc(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        this.a = partnerType;
        this.b = authorizationRequest;
        this.c = httpCookie;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        k.e eVar = (k.e) obj;
        return bdc.d(this.a, this.b, this.c);
    }
}
