package com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile;

import android.app.Activity;
import com.squareup.picasso.Picasso;

public final class b {
    private final wlf<Activity> a;
    private final wlf<Picasso> b;
    private final wlf<tq4> c;
    private final wlf<lqa> d;

    public b(wlf<Activity> wlf, wlf<Picasso> wlf2, wlf<tq4> wlf3, wlf<lqa> wlf4) {
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

    public a b() {
        Activity activity = this.a.get();
        a(activity, 1);
        Picasso picasso = this.b.get();
        a(picasso, 2);
        tq4 tq4 = this.c.get();
        a(tq4, 3);
        lqa lqa = this.d.get();
        a(lqa, 4);
        return new a(activity, picasso, tq4, lqa);
    }
}
