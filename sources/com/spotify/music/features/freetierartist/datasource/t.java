package com.spotify.music.features.freetierartist.datasource;

public final class t {
    private final wlf<a8a> a;
    private final wlf<c0> b;

    public t(wlf<a8a> wlf, wlf<c0> wlf2) {
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

    public s b(String str) {
        a(str, 1);
        a8a a8a = this.a.get();
        a(a8a, 2);
        c0 c0Var = this.b.get();
        a(c0Var, 3);
        return new s(str, a8a, c0Var);
    }
}
