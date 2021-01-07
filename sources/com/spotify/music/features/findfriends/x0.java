package com.spotify.music.features.findfriends;

import io.reactivex.s;

public final class x0 {
    private final wlf<z0> a;
    private final wlf<l15> b;
    private final wlf<r0> c;

    public x0(wlf<z0> wlf, wlf<l15> wlf2, wlf<r0> wlf3) {
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

    public w0 b(s<p0> sVar) {
        a(sVar, 1);
        z0 z0Var = this.a.get();
        a(z0Var, 2);
        l15 l15 = this.b.get();
        a(l15, 3);
        r0 r0Var = this.c.get();
        a(r0Var, 4);
        return new w0(sVar, z0Var, l15, r0Var);
    }
}
