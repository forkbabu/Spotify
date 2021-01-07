package com.spotify.music.features.browse.view;

public final class d {
    private final wlf<kg4> a;
    private final wlf<lc4> b;
    private final wlf<w51> c;

    public d(wlf<kg4> wlf, wlf<lc4> wlf2, wlf<w51> wlf3) {
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

    public c b(b91 b91) {
        kg4 kg4 = this.a.get();
        a(kg4, 1);
        lc4 lc4 = this.b.get();
        a(lc4, 2);
        w51 w51 = this.c.get();
        a(w51, 3);
        a(b91, 4);
        return new c(kg4, lc4, w51, b91);
    }
}
