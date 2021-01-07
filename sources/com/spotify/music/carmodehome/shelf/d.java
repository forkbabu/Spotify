package com.spotify.music.carmodehome.shelf;

import com.squareup.picasso.Picasso;

public final class d {
    private final wlf<Picasso> a;
    private final wlf<cs2> b;

    public d(wlf<Picasso> wlf, wlf<cs2> wlf2) {
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

    public b b(CarModeCardView carModeCardView) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        cs2 cs2 = this.b.get();
        a(cs2, 2);
        a(carModeCardView, 3);
        return new b(picasso, cs2, carModeCardView);
    }
}
