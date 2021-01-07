package com.spotify.music.features.playlistentity.homemix.usertoggle;

import android.view.LayoutInflater;

public final class v {
    private final wlf<r> a;

    public v(wlf<r> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public t b(k kVar, LayoutInflater layoutInflater) {
        r rVar = this.a.get();
        a(rVar, 1);
        a(kVar, 2);
        a(layoutInflater, 3);
        return new t(rVar, kVar, layoutInflater);
    }
}
