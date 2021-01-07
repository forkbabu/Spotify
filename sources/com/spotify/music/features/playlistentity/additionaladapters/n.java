package com.spotify.music.features.playlistentity.additionaladapters;

import com.spotify.music.features.playlistentity.additionaladapters.m;
import io.reactivex.y;

final class n implements m.a {
    private final wlf<y> a;

    n(wlf<y> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.m.a
    public m create() {
        y yVar = this.a.get();
        a(yVar, 1);
        return new m(yVar);
    }
}
