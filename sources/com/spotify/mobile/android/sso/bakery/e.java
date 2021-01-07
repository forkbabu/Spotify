package com.spotify.mobile.android.sso.bakery;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;
import java.net.HttpCookie;

public class e {
    private final cv1 a;
    private final w<Response, Cookie> b;
    private final y c;

    public e(cv1 cv1, ObjectMapper objectMapper, y yVar) {
        this.a = cv1;
        this.b = JacksonResponseParser.forClass(Cookie.class, objectMapper, yVar);
        this.c = yVar;
    }

    public s<HttpCookie> a() {
        return this.a.a().P().q(new j1e(5, 5, 1000, this.c)).q(this.b).j0(a.a);
    }
}
