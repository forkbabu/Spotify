package com.spotify.http.wg;

import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.wg.WebgateTokenProvider;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.v;
import okhttp3.w;

public class a implements v {
    private final b a;
    private final wlf<WebgateTokenProvider> b;

    public a(b bVar, wlf<WebgateTokenProvider> wlf) {
        this.a = bVar;
        this.b = wlf;
    }

    private d0 b(v.a aVar, a0 a0Var, String str) {
        a0.a h = a0Var.h();
        h.a("Authorization", "Bearer " + str);
        return ((fof) aVar).f(h.b());
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        fof fof = (fof) aVar;
        a0 i = fof.i();
        if (i.c("No-Webgate-Authentication") != null) {
            a0.a h = i.h();
            h.h("No-Webgate-Authentication");
            return fof.f(h.b());
        } else if (i.b().i()) {
            return fof.f(i);
        } else {
            if (this.a.a(i)) {
                this.a.getClass();
                i.i();
                if (TextUtils.isEmpty(i.c("Authorization"))) {
                    try {
                        d0 b2 = b(fof, i, this.b.get().a(10000));
                        if (b2.f() != 401 || b2.h("client-token-error") != null) {
                            return b2;
                        }
                        Logger.b("Webgate request returned 401 unauthorized. Will renew token and try again.", new Object[0]);
                        if (b2.a() != null) {
                            b2.a().close();
                        }
                        return b(fof, i, this.b.get().b(10000, true));
                    } catch (WebgateTokenProvider.WebgateTokenException unused) {
                        Logger.d("%s: %s %s", "Could not retrieve access token for a webgate request", i.g(), i.k());
                        d0.a aVar2 = new d0.a();
                        aVar2.p(i);
                        aVar2.f(503);
                        aVar2.m(Protocol.HTTP_1_1);
                        aVar2.b(e0.i(w.d("plain/text"), "Could not retrieve access token for a webgate request"));
                        aVar2.j("Could not retrieve access token for a webgate request");
                        return aVar2.c();
                    }
                }
            }
            return fof.f(i);
        }
    }
}
