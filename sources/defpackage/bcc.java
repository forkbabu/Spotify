package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.l;

/* renamed from: bcc  reason: default package */
public final /* synthetic */ class bcc implements l {
    public final /* synthetic */ PartnerType a;
    public final /* synthetic */ AuthorizationRequest b;

    public /* synthetic */ bcc(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        this.a = partnerType;
        this.b = authorizationRequest;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PartnerType partnerType = this.a;
        AuthorizationRequest authorizationRequest = this.b;
        u3 u3Var = (u3) obj;
        F f = u3Var.a;
        f.getClass();
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        return (bdc) f.b(new dcc(partnerType), new gcc(partnerType), new fcc(partnerType), new ccc(partnerType, authorizationRequest, s2), new ecc(partnerType, authorizationRequest, s2));
    }
}
