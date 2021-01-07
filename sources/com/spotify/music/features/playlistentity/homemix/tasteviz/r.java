package com.spotify.music.features.playlistentity.homemix.tasteviz;

import android.view.LayoutInflater;

public final class r {
    private final wlf<k> a;

    public r(wlf<k> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public p b(n nVar, LayoutInflater layoutInflater) {
        k kVar = this.a.get();
        a(kVar, 1);
        a(nVar, 2);
        a(layoutInflater, 3);
        return new p(kVar, nVar, layoutInflater);
    }
}
