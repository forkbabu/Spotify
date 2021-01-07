package com.spotify.music.features.ads.screensaver;

import androidx.fragment.app.c;
import com.spotify.music.features.ads.audioplus.topbanner.a;
import com.spotify.music.features.ads.p0;

public final class f0 {
    private final wlf<n0> a;
    private final wlf<q0> b;
    private final wlf<nsb> c;
    private final wlf<p0> d;

    public f0(wlf<n0> wlf, wlf<q0> wlf2, wlf<nsb> wlf3, wlf<p0> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public e0 b(c cVar, ys2 ys2, a aVar) {
        a(cVar, 1);
        a(ys2, 2);
        a(aVar, 3);
        n0 n0Var = this.a.get();
        a(n0Var, 4);
        n0 n0Var2 = n0Var;
        q0 q0Var = this.b.get();
        a(q0Var, 5);
        q0 q0Var2 = q0Var;
        nsb nsb = this.c.get();
        a(nsb, 6);
        nsb nsb2 = nsb;
        p0 p0Var = this.d.get();
        a(p0Var, 7);
        return new e0(cVar, ys2, aVar, n0Var2, q0Var2, nsb2, p0Var);
    }
}
