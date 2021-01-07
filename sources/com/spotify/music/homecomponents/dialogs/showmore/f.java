package com.spotify.music.homecomponents.dialogs.showmore;

import android.app.Activity;
import com.squareup.picasso.Picasso;

public final class f {
    private final wlf<Activity> a;
    private final wlf<Picasso> b;

    public f(wlf<Activity> wlf, wlf<Picasso> wlf2) {
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

    public d b() {
        Activity activity = this.a.get();
        a(activity, 1);
        Picasso picasso = this.b.get();
        a(picasso, 2);
        return new e(activity, picasso);
    }
}
