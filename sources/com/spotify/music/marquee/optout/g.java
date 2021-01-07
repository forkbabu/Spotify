package com.spotify.music.marquee.optout;

import androidx.fragment.app.c;

public final class g {
    private final wlf<jjb> a;
    private final wlf<e> b;

    public g(wlf<jjb> wlf, wlf<e> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public f b(String str, String str2, String str3, String str4, c cVar) {
        jjb jjb = this.a.get();
        a(jjb, 1);
        jjb jjb2 = jjb;
        e eVar = this.b.get();
        a(eVar, 2);
        a(str, 3);
        a(str2, 4);
        a(str3, 5);
        a(str4, 6);
        a(cVar, 7);
        return new f(jjb2, eVar, str, str2, str3, str4, cVar);
    }
}
