package com.spotify.music.features.search;

import defpackage.qf8;
import defpackage.sg8;

public final class d {
    private final wlf<sg8.a> a;
    private final wlf<qf8.a> b;
    private final wlf<w51> c;

    public d(wlf<sg8.a> wlf, wlf<qf8.a> wlf2, wlf<w51> wlf3) {
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

    public c b(b91 b91) {
        sg8.a aVar = this.a.get();
        a(aVar, 1);
        qf8.a aVar2 = this.b.get();
        a(aVar2, 2);
        w51 w51 = this.c.get();
        a(w51, 3);
        a(b91, 4);
        return new c(aVar, aVar2, w51, b91);
    }
}
