package com.spotify.music.features.playlistentity.homemix.facepiledetail;

import android.view.LayoutInflater;
import com.squareup.picasso.Picasso;

public final class m {
    private final wlf<i> a;
    private final wlf<Picasso> b;

    public m(wlf<i> wlf, wlf<Picasso> wlf2) {
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

    public k b(d dVar, LayoutInflater layoutInflater) {
        i iVar = this.a.get();
        a(iVar, 1);
        Picasso picasso = this.b.get();
        a(picasso, 2);
        a(dVar, 3);
        a(layoutInflater, 4);
        return new k(iVar, picasso, dVar, layoutInflater);
    }
}
