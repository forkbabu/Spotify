package com.spotify.music.features.ads.screensaver;

import androidx.fragment.app.o;
import com.spotify.music.features.ads.audioplus.e;
import com.spotify.music.features.ads.audioplus.topbanner.a;

public final class q0 {
    private final wlf<n0> a;
    private final wlf<jp3> b;
    private final wlf<e> c;

    public q0(wlf<n0> wlf, wlf<jp3> wlf2, wlf<e> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public p0 b(o oVar, ys2 ys2, a aVar) {
        a(oVar, 1);
        a(ys2, 2);
        a(aVar, 3);
        n0 n0Var = this.a.get();
        a(n0Var, 4);
        n0 n0Var2 = n0Var;
        jp3 jp3 = this.b.get();
        a(jp3, 5);
        jp3 jp32 = jp3;
        e eVar = this.c.get();
        a(eVar, 6);
        return new p0(oVar, ys2, aVar, n0Var2, jp32, eVar);
    }
}
