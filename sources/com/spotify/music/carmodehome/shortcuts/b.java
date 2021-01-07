package com.spotify.music.carmodehome.shortcuts;

import com.squareup.picasso.Picasso;

public final class b {
    private final wlf<Picasso> a;
    private final wlf<cs2> b;

    public b(wlf<Picasso> wlf, wlf<cs2> wlf2) {
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

    public a b(HomeShortcutsGridItemCardView homeShortcutsGridItemCardView) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        cs2 cs2 = this.b.get();
        a(cs2, 2);
        a(homeShortcutsGridItemCardView, 3);
        return new a(picasso, cs2, homeShortcutsGridItemCardView);
    }
}
