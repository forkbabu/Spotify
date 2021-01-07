package com.spotify.music.features.california.feature;

import com.spotify.remoteconfig.bd;

public final class d {
    private final wlf<bd> a;
    private final wlf<g> b;
    private final wlf<j> c;
    private final wlf<f> d;

    public d(wlf<bd> wlf, wlf<g> wlf2, wlf<j> wlf3, wlf<f> wlf4) {
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

    public c b(String str) {
        bd bdVar = this.a.get();
        a(bdVar, 1);
        bd bdVar2 = bdVar;
        g gVar = this.b.get();
        a(gVar, 2);
        g gVar2 = gVar;
        j jVar = this.c.get();
        a(jVar, 3);
        j jVar2 = jVar;
        f fVar = this.d.get();
        a(fVar, 4);
        a(str, 5);
        return new c(bdVar2, gVar2, jVar2, fVar, str);
    }
}
