package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.datasource.p3;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;

public class q3 {
    private final wlf<e1> a;
    private final wlf<z9a> b;
    private final wlf<m> c;

    public q3(wlf<e1> wlf, wlf<z9a> wlf2, wlf<m> wlf3) {
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

    public p3 b(p3.a aVar) {
        a(aVar, 1);
        e1 e1Var = this.a.get();
        a(e1Var, 2);
        z9a z9a = this.b.get();
        a(z9a, 3);
        m mVar = this.c.get();
        a(mVar, 4);
        return new p3(aVar, e1Var, z9a, mVar);
    }
}
