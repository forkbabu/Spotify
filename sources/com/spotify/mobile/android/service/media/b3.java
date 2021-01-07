package com.spotify.mobile.android.service.media;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public class b3 {
    private final wlf<pea> a;
    private final wlf<g<PlayerState>> b;

    public b3(wlf<pea> wlf, wlf<g<PlayerState>> wlf2) {
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

    public a3 b(v1 v1Var) {
        a(v1Var, 1);
        pea pea = this.a.get();
        a(pea, 2);
        g<PlayerState> gVar = this.b.get();
        a(gVar, 3);
        return new a3(v1Var, pea, gVar);
    }
}
