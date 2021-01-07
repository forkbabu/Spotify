package com.spotify.music.features.search.mobius;

public final class z0 {
    private final wlf<z> a;
    private final wlf<b0> b;

    public z0(wlf<z> wlf, wlf<b0> wlf2) {
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

    public x0 b(wg8 wg8, b61 b61) {
        z zVar = this.a.get();
        a(zVar, 1);
        b0 b0Var = this.b.get();
        a(b0Var, 2);
        a(wg8, 3);
        a(b61, 4);
        return new x0(zVar, b0Var, wg8, b61);
    }
}
