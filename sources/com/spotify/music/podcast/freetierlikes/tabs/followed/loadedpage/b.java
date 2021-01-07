package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

import com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.a;
import io.reactivex.s;

public final class b implements a.AbstractC0327a {
    private final wlf<g> a;
    private final wlf<d> b;

    public b(wlf<g> wlf, wlf<d> wlf2) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.a.AbstractC0327a
    public a a(s<ryd> sVar) {
        g gVar = this.a.get();
        b(gVar, 1);
        d dVar = this.b.get();
        b(dVar, 2);
        b(sVar, 3);
        return new a(gVar, dVar, sVar);
    }
}
