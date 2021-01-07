package com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol;

import com.spotify.music.nowplaying.podcast.speedcontrol.g;

public final class e {
    private final wlf<e2c> a;

    public e(wlf<e2c> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public d b(g gVar) {
        a(gVar, 1);
        e2c e2c = this.a.get();
        a(e2c, 2);
        return new d(gVar, e2c);
    }
}
