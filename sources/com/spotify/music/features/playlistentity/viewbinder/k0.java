package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.viewbinder.j0;
import java.util.List;

public final class k0 implements j0.b {
    private final wlf<sr6> a;

    public k0(wlf<sr6> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public j0 b(fs6 fs6, j0.c cVar, j0.a aVar, List<t> list) {
        sr6 sr6 = this.a.get();
        a(sr6, 1);
        a(fs6, 2);
        a(cVar, 3);
        a(aVar, 4);
        a(list, 5);
        return new j0(sr6, fs6, cVar, aVar, list);
    }
}
