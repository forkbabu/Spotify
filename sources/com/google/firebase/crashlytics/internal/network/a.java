package com.google.firebase.crashlytics.internal.network;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d;
import okhttp3.d0;
import okhttp3.u;
import okhttp3.w;
import okhttp3.x;
import okhttp3.y;

public class a {
    private static final y f;
    private final HttpMethod a;
    private final String b;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private x.a e = null;

    static {
        y.b q = new y().q();
        q.e(10000, TimeUnit.MILLISECONDS);
        f = q.c();
    }

    public a(HttpMethod httpMethod, String str, Map<String, String> map) {
        this.a = httpMethod;
        this.b = str;
        this.c = map;
        this.d = new HashMap();
    }

    public c a() {
        a0.a aVar = new a0.a();
        d.a aVar2 = new d.a();
        aVar2.c();
        a0.a c2 = aVar.c(aVar2.a());
        u.a n = u.p(this.b).n();
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            n.a(entry.getKey(), entry.getValue());
        }
        c2.k(n.c());
        for (Map.Entry<String, String> entry2 : this.d.entrySet()) {
            c2.e(entry2.getKey(), entry2.getValue());
        }
        x.a aVar3 = this.e;
        String str = null;
        c2.g(this.a.name(), aVar3 == null ? null : aVar3.b());
        d0 h = f.b(c2.b()).h();
        if (h.a() != null) {
            str = h.a().m();
        }
        return new c(h.f(), str, h.l());
    }

    public a b(String str, String str2) {
        this.d.put(str, str2);
        return this;
    }

    public a c(Map.Entry<String, String> entry) {
        this.d.put(entry.getKey(), entry.getValue());
        return this;
    }

    public String d() {
        return this.a.name();
    }

    public a e(String str, String str2) {
        if (this.e == null) {
            x.a aVar = new x.a();
            aVar.c(x.f);
            this.e = aVar;
        }
        x.a aVar2 = this.e;
        aVar2.getClass();
        aVar2.a(x.b.b(str, null, c0.d(null, str2)));
        this.e = aVar2;
        return this;
    }

    public a f(String str, String str2, String str3, File file) {
        c0 c2 = c0.c(w.d(str3), file);
        if (this.e == null) {
            x.a aVar = new x.a();
            aVar.c(x.f);
            this.e = aVar;
        }
        x.a aVar2 = this.e;
        aVar2.getClass();
        aVar2.a(x.b.b(str, str2, c2));
        this.e = aVar2;
        return this;
    }
}
