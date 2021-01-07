package com.spotify.mobile.android.service.media.search;

import android.content.Context;
import android.os.Bundle;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.u;
import com.spotify.http.w;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel;
import com.spotify.mobile.android.service.media.search.l;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;
import okhttp3.y;

public class n {
    private final ObjectMapper a;
    private final l b;

    /* access modifiers changed from: package-private */
    public class a implements f {
        final /* synthetic */ o a;

        a(o oVar) {
            this.a = oVar;
        }

        @Override // okhttp3.f
        public void onFailure(e eVar, IOException iOException) {
            Logger.e(iOException, iOException.getMessage(), new Object[0]);
            i iVar = (i) this.a;
            if (!iVar.a.d()) {
                iVar.a.onError(iOException);
            }
        }

        @Override // okhttp3.f
        public void onResponse(e eVar, d0 d0Var) {
            try {
                int f = d0Var.f();
                if (f / 100 == 2) {
                    WebApiSearchModel.Response response = (WebApiSearchModel.Response) n.this.a.readValue(d0Var.a().a(), WebApiSearchModel.Response.class);
                    i iVar = (i) this.a;
                    iVar.getClass();
                    if (!iVar.a.d()) {
                        iVar.a.onSuccess(new WebApiSearchResults(iVar.b, response));
                        return;
                    }
                    return;
                }
                o oVar = this.a;
                IOException iOException = new IOException(String.format(Locale.ENGLISH, "Status code %d from server does not indicate success.", Integer.valueOf(f)));
                i iVar2 = (i) oVar;
                if (!iVar2.a.d()) {
                    iVar2.a.onError(iOException);
                }
            } catch (IOException e) {
                Logger.e(e, "Error while deserializing response.", new Object[0]);
                i iVar3 = (i) this.a;
                if (!iVar3.a.d()) {
                    iVar3.a.onError(e);
                }
            }
        }
    }

    public n(Context context, u uVar, g gVar, cqe cqe, w wVar, i iVar) {
        com.spotify.music.json.e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.a = b2.build();
        m mVar = new m(new q(h.c, iVar.a(context), cqe), new l.a(uVar, h.a, h.b));
        y.b q = wVar.a().q();
        q.a(mVar);
        this.b = new l(q.c());
    }

    public e b(String str, String str2, long j, long j2, Bundle bundle, o<WebApiSearchModel.Response> oVar) {
        HashMap hashMap = new HashMap(5);
        kif kif = new kif(str, bundle);
        String a2 = kif.a();
        String b2 = kif.b();
        Logger.b("Searching using web API with query = \"%s\", formattedQuery = \"%s\", types = \"%s\", market = \"%s\", offset = %d, limit = %d.", str, a2, b2, str2, Long.valueOf(j), Long.valueOf(j2));
        hashMap.put("q", a2);
        hashMap.put("type", b2);
        if (j2 <= 0) {
            j2 = 50;
        }
        hashMap.put("limit", String.valueOf(j2));
        if (!MoreObjects.isNullOrEmpty(str2)) {
            hashMap.put("market", str2);
        }
        if (j > 0) {
            hashMap.put("offset", String.valueOf(j));
        }
        e a3 = this.b.a("/v1/search", hashMap);
        a3.h1(new a(oVar));
        return a3;
    }
}
