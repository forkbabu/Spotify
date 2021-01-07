package com.spotify.music.carmodehome.page;

import com.spotify.music.carmodehome.b;
import io.reactivex.s;

public final class c {
    private final wlf<e> a;
    private final wlf<hr2> b;
    private final wlf<ur2> c;
    private final wlf<b> d;

    public c(wlf<e> wlf, wlf<hr2> wlf2, wlf<ur2> wlf3, wlf<b> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public a b(s<h> sVar) {
        e eVar = this.a.get();
        a(eVar, 1);
        e eVar2 = eVar;
        wlf<hr2> wlf = this.b;
        ur2 ur2 = this.c.get();
        a(ur2, 3);
        ur2 ur22 = ur2;
        b bVar = this.d.get();
        a(bVar, 4);
        a(sVar, 5);
        return new a(eVar2, wlf, ur22, bVar, sVar);
    }
}
