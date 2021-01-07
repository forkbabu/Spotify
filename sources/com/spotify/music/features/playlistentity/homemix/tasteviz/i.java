package com.spotify.music.features.playlistentity.homemix.tasteviz;

import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

public final class i {
    private final wlf<Picasso> a;

    public i(wlf<Picasso> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public h b(ViewGroup viewGroup) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        a(viewGroup, 2);
        return new h(picasso, viewGroup);
    }
}
