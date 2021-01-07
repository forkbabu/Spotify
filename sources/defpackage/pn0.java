package defpackage;

import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.contentaccesstoken.ContentAccessTokenProvider;
import com.spotify.http.contentaccesstoken.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.text.e;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.v;
import okhttp3.w;

/* renamed from: pn0  reason: default package */
public final class pn0 implements v {
    public static final a c = new a(null);
    private final AtomicReference<Pair<Integer, String>> a = new AtomicReference<>(null);
    private final ContentAccessTokenProvider b;

    /* renamed from: pn0$a */
    public static final class a {
        public a(f fVar) {
        }

        public static final d0 a(a aVar, v.a aVar2, a0 a0Var, String str) {
            a0.a h = a0Var.h();
            h.a("content-access-token", str);
            d0 f = ((fof) aVar2).f(h.b());
            h.d(f, "chain.proceed(authenticatedRequest)");
            return f;
        }
    }

    public pn0(ContentAccessTokenProvider contentAccessTokenProvider) {
        h.e(contentAccessTokenProvider, "contentAccessTokenProvider");
        this.b = contentAccessTokenProvider;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        boolean z;
        String h;
        String h2;
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        a0 i = fof.i();
        if (!TextUtils.isEmpty(i.c("content-access-token")) || !this.b.isEnabled() || i.b().i()) {
            return fof.f(i);
        }
        try {
            d a2 = this.b.a(10000);
            List<String> a3 = a2.a();
            if (!(a3 instanceof Collection) || !a3.isEmpty()) {
                Iterator<T> it = a3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String k = i.k().k();
                    h.d(k, "request.url().host()");
                    if (e.d(k, it.next(), false, 2, null)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                return fof.f(i);
            }
            Pair<Integer, String> pair = this.a.get();
            if (pair != null) {
                Logger.b("Rejecting request due to earlier bad response: %s", pair.d());
                h.d(i, "request");
                int intValue = pair.c().intValue();
                String d = pair.d();
                d0.a aVar2 = new d0.a();
                aVar2.p(i);
                aVar2.f(intValue);
                aVar2.m(Protocol.HTTP_1_1);
                aVar2.b(e0.i(w.d("plain/text"), d));
                aVar2.j(d);
                d0 c2 = aVar2.c();
                h.d(c2, "Response.Builder()\n     …age)\n            .build()");
                return c2;
            }
            a aVar3 = c;
            h.d(i, "request");
            d0 a4 = a.a(aVar3, aVar, i, a2.c());
            if (a4.f() == 401 && (h2 = a4.h("content-access-token-error")) != null && h.a(h2, "EXPIRED_CONTENTACCESSTOKEN")) {
                Logger.b("Client token request returned 401 unauthorized. Will renew token and try again.", new Object[0]);
                if (a4.a() != null) {
                    e0 a5 = a4.a();
                    h.c(a5);
                    a5.close();
                }
                this.b.reset();
                a4 = a.a(aVar3, aVar, i, this.b.a(10000).c());
            }
            if ((a4.f() == 403 || a4.f() == 400 || a4.f() == 401) && (h = a4.h("content-access-token-error")) != null && (h.a(h, "INVALID_CONTENTACCESSTOKEN") || h.a(h, "UNSUPPORTED_CLIENT") || h.a(h, "MISSING_CONTENTACCESSTOKEN"))) {
                this.a.set(new Pair<>(Integer.valueOf(a4.f()), h));
            }
            return a4;
        } catch (ContentAccessTokenProvider.ContentAccessTokenException unused) {
            Logger.d(je.x0("Could not retrieve access token for a content_access_token request", ": %s %s"), i.g(), i.k());
            return fof.f(i);
        }
    }
}
