package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.viewbinder.l0;
import com.spotify.music.navigation.t;

public final class m0 implements l0.a {
    private final wlf<t> a;
    private final wlf<ere> b;

    public m0(wlf<t> wlf, wlf<ere> wlf2) {
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

    public l0 b(String str) {
        t tVar = this.a.get();
        a(tVar, 1);
        ere ere = this.b.get();
        a(ere, 2);
        a(str, 3);
        return new l0(tVar, ere, str);
    }
}
