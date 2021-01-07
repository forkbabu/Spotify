package defpackage;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.clienttoken.ClientTokenProvider;
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

/* renamed from: on0  reason: default package */
public final class on0 implements v {
    public static final a d = new a(null);
    private final AtomicReference<Pair<Integer, String>> a = new AtomicReference<>(null);
    private final boolean b;
    private final ClientTokenProvider c;

    /* renamed from: on0$a */
    public static final class a {
        public a(f fVar) {
        }

        public static final d0 a(a aVar, v.a aVar2, a0 a0Var, String str) {
            a0.a h = a0Var.h();
            h.a("client-token", str);
            d0 f = ((fof) aVar2).f(h.b());
            h.d(f, "chain.proceed(authenticatedRequest)");
            return f;
        }
    }

    public on0(ClientTokenProvider clientTokenProvider, Optional<Boolean> optional) {
        boolean z;
        h.e(clientTokenProvider, "clientTokenProvider");
        h.e(optional, "enabled");
        this.c = clientTokenProvider;
        if (optional.isPresent()) {
            Boolean bool = optional.get();
            h.d(bool, "enabled.get()");
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.b = z;
    }

    private final d0 b(a0 a0Var, int i, String str) {
        d0.a aVar = new d0.a();
        aVar.p(a0Var);
        aVar.f(i);
        aVar.m(Protocol.HTTP_1_1);
        aVar.b(e0.i(w.d("plain/text"), str));
        aVar.j(str);
        d0 c2 = aVar.c();
        h.d(c2, "Response.Builder()\n     …age)\n            .build()");
        return c2;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        boolean z;
        String h;
        String h2;
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        a0 i = fof.i();
        if (!TextUtils.isEmpty(i.c("client-token")) || !this.b || i.b().i()) {
            return fof.f(i);
        }
        try {
            com.spotify.http.clienttoken.a a2 = this.c.a(10000);
            List<String> b2 = a2.b();
            if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                Iterator<T> it = b2.iterator();
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
                return b(i, pair.c().intValue(), pair.d());
            }
            a aVar2 = d;
            h.d(i, "request");
            d0 a3 = a.a(aVar2, aVar, i, a2.a());
            if (a3.f() == 401 && (h2 = a3.h("client-token-error")) != null && h.a(h2, "EXPIRED_CLIENTTOKEN")) {
                Logger.b("Client token request returned 401 unauthorized. Will renew token and try again.", new Object[0]);
                if (a3.a() != null) {
                    e0 a4 = a3.a();
                    h.c(a4);
                    a4.close();
                }
                this.c.reset();
                a3 = a.a(aVar2, aVar, i, this.c.a(10000).a());
            }
            if ((a3.f() == 403 || a3.f() == 400 || a3.f() == 401) && (h = a3.h("client-token-error")) != null && (h.a(h, "INVALID_CLIENTTOKEN") || h.a(h, "UNSUPPORTED_CLIENT") || h.a(h, "MISSING_CLIENTTOKEN"))) {
                this.a.set(new Pair<>(Integer.valueOf(a3.f()), h));
            }
            return a3;
        } catch (ClientTokenProvider.ClientTokenException unused) {
            Logger.d(je.x0("Could not retrieve access token for a client_token request", ": %s %s"), i.g(), i.k());
            h.d(i, "request");
            return b(i, 503, "Could not retrieve access token for a client_token request");
        }
    }
}
