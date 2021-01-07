package com.spotify.mobile.android.service.media.search;

import com.adjust.sdk.Constants;
import com.spotify.http.u;
import com.spotify.mobile.android.service.media.search.m;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import okhttp3.a0;
import okhttp3.e;
import okhttp3.u;
import okhttp3.y;
import okio.ByteString;
import retrofit2.v;

/* access modifiers changed from: package-private */
public class l {
    private final y a;

    /* access modifiers changed from: package-private */
    public static class a implements m.a {
        private final b a;
        private final String b;

        a(u uVar, String str, String str2) {
            u.a aVar = new u.a();
            aVar.i(Constants.SCHEME);
            aVar.f("accounts.spotify.com");
            this.a = (b) uVar.a(b.class, aVar.c());
            Charset charset = rnf.j;
            this.b = je.x0("Basic ", ByteString.l(str + ":" + str2, charset).d());
        }

        /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0042: APUT  (r2v2 java.lang.Object[]), (2 ??[int, float, short, byte, char]), (r0v3 java.lang.String) */
        public ClientCredentialsResponse a() {
            v<ClientCredentialsResponse> h = this.a.a(this.b, "client_credentials").h();
            if (h.f()) {
                return h.a();
            }
            Object[] objArr = new Object[3];
            objArr[0] = "/api/token";
            objArr[1] = Integer.valueOf(h.b());
            objArr[2] = h.d() != null ? h.d().m() : "";
            throw new IOException(String.format("%s error response: %d:%s", objArr));
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        @irf("/api/token")
        @yqf
        retrofit2.b<ClientCredentialsResponse> a(@crf("Authorization") String str, @wqf("grant_type") String str2);
    }

    public l(y yVar) {
        this.a = yVar;
    }

    /* access modifiers changed from: package-private */
    public e a(String str, Map<String, String> map) {
        y yVar = this.a;
        u.a aVar = new u.a();
        aVar.i(Constants.SCHEME);
        aVar.f("api.spotify.com");
        aVar.d(str);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            aVar.b(entry.getKey(), entry.getValue());
        }
        a0.a aVar2 = new a0.a();
        aVar2.k(aVar.c());
        return yVar.b(aVar2.b());
    }
}
