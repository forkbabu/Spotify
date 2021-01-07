package com.spotify.music.libs.connect;

import com.spotify.libs.connect.g;
import com.spotify.libs.connect.picker.view.e;
import com.spotify.music.libs.connect.access.o;

public class k {
    private final wlf<g> a;
    private final wlf<k4d> b;
    private final wlf<o> c;

    public k(wlf<g> wlf, wlf<k4d> wlf2, wlf<o> wlf3) {
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

    public j b(e eVar) {
        a(eVar, 1);
        g gVar = this.a.get();
        a(gVar, 2);
        k4d k4d = this.b.get();
        a(k4d, 3);
        o oVar = this.c.get();
        a(oVar, 4);
        return new j(eVar, gVar, k4d, oVar);
    }
}
