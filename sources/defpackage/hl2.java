package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.bakery.e;
import com.spotify.mobile.android.sso.k;
import io.reactivex.d0;
import io.reactivex.s;
import java.net.HttpCookie;

/* renamed from: hl2  reason: default package */
public class hl2 {
    private final av1 a;
    private final e b;

    public hl2(av1 av1, e eVar) {
        this.a = av1;
        this.b = eVar;
    }

    public s<u3<k, HttpCookie>> a(AuthorizationRequest authorizationRequest) {
        return this.b.a().a0(new gl2(this, authorizationRequest));
    }

    public /* synthetic */ d0 b(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return this.a.c(authorizationRequest, httpCookie).A(new fl2(httpCookie));
    }
}
