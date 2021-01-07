package com.spotify.music.features.ads.audioplus.topbanner.carousel;

import com.spotify.music.navigation.t;

public final class b {
    private final wlf<on3> a;
    private final wlf<qn3> b;
    private final wlf<t> c;

    public b(wlf<on3> wlf, wlf<qn3> wlf2, wlf<t> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public a b() {
        on3 on3 = this.a.get();
        a(on3, 1);
        qn3 qn3 = this.b.get();
        a(qn3, 2);
        t tVar = this.c.get();
        a(tVar, 3);
        return new a(on3, qn3, tVar);
    }
}
