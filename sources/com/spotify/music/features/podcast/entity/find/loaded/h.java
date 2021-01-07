package com.spotify.music.features.podcast.entity.find.loaded;

import com.spotify.music.features.podcast.entity.find.loaded.g;

public final class h implements g.a {
    private final wlf<i> a;
    private final wlf<f> b;

    public h(wlf<i> wlf, wlf<f> wlf2) {
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

    public g b(o37 o37) {
        i iVar = this.a.get();
        a(iVar, 1);
        f fVar = this.b.get();
        a(fVar, 2);
        a(o37, 3);
        return new g(iVar, fVar, o37);
    }
}
