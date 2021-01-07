package com.spotify.music.sociallistening.participantlist.impl;

import io.reactivex.s;

public final class l {
    private final wlf<udd> a;
    private final wlf<xdd> b;

    public l(wlf<udd> wlf, wlf<xdd> wlf2) {
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

    public k b(s<edd> sVar) {
        udd udd = this.a.get();
        a(udd, 1);
        xdd xdd = this.b.get();
        a(xdd, 2);
        a(sVar, 3);
        return new k(udd, xdd, sVar);
    }
}
