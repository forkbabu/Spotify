package com.spotify.mobile.android.sso.bakery;

import com.spotify.mobile.android.sso.bakery.c;
import java.net.HttpCookie;

public abstract class d {

    public static abstract class a {
        public abstract d a();

        public abstract a b(Long l);

        public abstract a c(String str);

        public abstract a d(Boolean bool);
    }

    public static d b(HttpCookie httpCookie) {
        String name = httpCookie.getName();
        String value = httpCookie.getValue();
        c.b bVar = new c.b();
        bVar.f(name);
        bVar.g(value);
        bVar.e(httpCookie.getDomain());
        bVar.b(Long.valueOf(httpCookie.getMaxAge()));
        bVar.c(httpCookie.getPath());
        bVar.d(Boolean.valueOf(httpCookie.getSecure()));
        return bVar.a();
    }

    public abstract String a();

    public abstract Long c();

    public abstract String d();

    public abstract String e();

    public abstract Boolean f();

    public HttpCookie g() {
        HttpCookie httpCookie = new HttpCookie(d(), h());
        httpCookie.setDomain(a());
        httpCookie.setPath(e());
        Long c = c();
        httpCookie.setMaxAge(c != null ? c.longValue() : -1);
        Boolean f = f();
        httpCookie.setSecure(f != null ? f.booleanValue() : false);
        return httpCookie;
    }

    public abstract String h();
}
