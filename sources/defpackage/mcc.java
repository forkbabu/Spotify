package defpackage;

import android.app.Application;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.music.libs.partnerapps.PartnerType;
import com.spotify.music.libs.partnerapps.api.c;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: mcc  reason: default package */
public class mcc {
    private final Application a;
    private final c b;
    private final lcc c;

    public mcc(Application application, c cVar, lcc lcc) {
        this.a = application;
        this.b = cVar;
        this.c = lcc;
    }

    public s<bdc> a(PartnerType partnerType) {
        return this.b.a().P().J0(new kcc(this, partnerType)).J0(new jcc(this, partnerType)).p0(s.i0(bdc.a(partnerType, false)));
    }

    public v b(PartnerType partnerType, ImmutableMap immutableMap) {
        ClientIdentity clientIdentity;
        try {
            clientIdentity = ClientIdentity.c(this.a, partnerType.d());
        } catch (ClientIdentity.ValidationException e) {
            Logger.e(e, "Could not create ClientIdentity from package name", new Object[0]);
            clientIdentity = null;
        }
        Object obj = immutableMap.get(partnerType);
        obj.getClass();
        return s.i0(AuthorizationRequest.a(((cla) obj).a(), AuthorizationRequest.ResponseType.TOKEN, partnerType.h(), clientIdentity, null, new String[]{"app-remote-control"}, true));
    }

    public /* synthetic */ v c(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        return this.c.a(partnerType, authorizationRequest);
    }
}
