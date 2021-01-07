package com.spotify.music.features.playlistentity.homemix.usertoggle;

import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

public final class n {
    private final wlf<Picasso> a;

    public n(wlf<Picasso> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public m b(ViewGroup viewGroup) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        a(viewGroup, 2);
        return new m(picasso, viewGroup);
    }
}
