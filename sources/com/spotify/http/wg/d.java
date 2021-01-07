package com.spotify.http.wg;

import android.net.Uri;
import com.spotify.mobile.android.util.x;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.v;
import okio.e;

public final class d implements v {
    private final Map<String, Long> a = new HashMap(16);
    private final b b;
    private final cqe c;

    public d(b bVar, cqe cqe) {
        h.e(bVar, "webgateHelper");
        h.e(cqe, "clock");
        this.b = bVar;
        this.c = cqe;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        a0 i = fof.i();
        if (this.b.a(i)) {
            URL B = i.k().B();
            h.d(B, "request.url().url()");
            h.e(B, "url");
            Uri parse = Uri.parse(B.toExternalForm());
            h.d(parse, "uri");
            List<String> pathSegments = parse.getPathSegments();
            String host = parse.getHost();
            String str = pathSegments.isEmpty() ? "" : pathSegments.get(0);
            String str2 = host + ((Object) str);
            long j = 0;
            Object n = x.n(this.a.get(str2), 0L);
            h.d(n, "Util.valueOrDefault(earl…stTimeToRequest[key], 0L)");
            Date date = null;
            if (((Number) n).longValue() - this.c.b() > 0) {
                d0.a aVar2 = new d0.a();
                aVar2.p(i);
                aVar2.m(Protocol.HTTP_1_1);
                aVar2.f(429);
                e eVar = new e();
                eVar.G(new byte[0]);
                aVar2.b(e0.h(null, (long) 0, eVar));
                aVar2.j("");
                d0 c2 = aVar2.c();
                h.d(c2, "Response.Builder()\n     …                 .build()");
                return c2;
            }
            d0 f = fof.f(i);
            h.d(f, "chain.proceed(request)");
            String h = f.h("Retry-After");
            if (h != null) {
                String c3 = f.l().c("Retry-After");
                if (c3 != null) {
                    date = dof.b(c3);
                }
                if (date != null) {
                    h.e(date, "date");
                    Calendar e = this.c.e();
                    h.d(e, "clock.calendar");
                    e.setTime(date);
                    j = (e.getTimeInMillis() + this.c.b()) - this.c.d();
                } else {
                    try {
                        j = this.c.b() + TimeUnit.MILLISECONDS.convert(Long.parseLong(h), TimeUnit.SECONDS);
                    } catch (NumberFormatException unused) {
                        je.p("Could not parse Retry-After header as long: ", h);
                    }
                }
                this.a.put(str2, Long.valueOf(j));
            }
            return f;
        }
        d0 f2 = fof.f(i);
        h.d(f2, "chain.proceed(request)");
        return f2;
    }
}
