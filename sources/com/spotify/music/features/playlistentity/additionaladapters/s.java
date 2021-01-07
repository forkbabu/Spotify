package com.spotify.music.features.playlistentity.additionaladapters;

import com.spotify.music.features.playlistentity.additionaladapters.m;
import com.spotify.music.features.playlistentity.additionaladapters.p;
import com.spotify.music.features.playlistentity.w;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class s implements p.a {
    private final wlf<m.a> a;
    private final wlf<w> b;

    s(wlf<m.a> wlf, wlf<w> wlf2) {
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

    @Override // com.spotify.music.features.playlistentity.additionaladapters.p.a
    public p a(Map map) {
        m.a aVar = this.a.get();
        b(aVar, 1);
        w wVar = this.b.get();
        b(wVar, 2);
        b(map, 3);
        return new r(aVar, wVar, map);
    }
}
