package com.spotify.music.libs.external_integration.instrumentation;

import com.spotify.music.libs.external_integration.instrumentation.a;

public abstract class e {

    public interface a {
        a b(String str);

        e build();

        a c(Integer num);

        a d(Page page);
    }

    public static a a() {
        return new a.b();
    }

    public abstract String b();

    public abstract Page c();

    public abstract Integer d();
}
