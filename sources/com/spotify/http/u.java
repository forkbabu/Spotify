package com.spotify.http;

import okhttp3.u;
import retrofit2.w;

public class u {
    private final w a;
    private final a b;

    public interface a {
    }

    public u(w wVar, a aVar) {
        this.a = wVar;
        this.b = aVar;
    }

    public <T> T a(Class<T> cls, okhttp3.u uVar) {
        w.b f = this.a.f();
        f.d(uVar);
        return (T) f.e().d(cls);
    }

    public <T> T b(Class<T> cls) {
        u.a n = this.a.a().n();
        n.f("exp.wg.spotify.com");
        return (T) a(cls, n.c());
    }

    public <T> T c(Class<T> cls) {
        return (T) this.a.d(cls);
    }
}
