package com.spotify.mobile.android.service.media.search;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.search.l;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.v;

/* access modifiers changed from: package-private */
public class m implements v {
    private final q a;
    private final a b;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    m(q qVar, a aVar) {
        this.a = qVar;
        this.b = aVar;
    }

    private static d0 b(v.a aVar, a0 a0Var, String str) {
        a0.a h = a0Var.h();
        h.a("Authorization", "Bearer " + str);
        return ((fof) aVar).f(h.b());
    }

    private String c() {
        ClientCredentialsResponse a2 = ((l.a) this.b).a();
        String accessToken = a2.getAccessToken();
        this.a.a(accessToken, TimeUnit.SECONDS.toMillis(a2.getExpiresIn().longValue()));
        return accessToken;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        fof fof = (fof) aVar;
        a0 i = fof.i();
        if (!"api.spotify.com".equals(i.k().k())) {
            return fof.f(i);
        }
        String c = this.a.c();
        if (c == null) {
            c = c();
        }
        d0 b2 = b(fof, i, c);
        if (b2.f() != 401) {
            return b2;
        }
        Logger.b("Request returned 401 unauthorized. Will renew token and try again.", new Object[0]);
        if (b2.a() != null) {
            b2.a().close();
        }
        this.a.b();
        return b(fof, i, c());
    }
}
