package com.spotify.music.features.california.feature;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

public final class j {
    private final wlf<Picasso> a;

    public j(wlf<Picasso> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public CaliforniaViewBinderImpl b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        a(layoutInflater, 2);
        return new CaliforniaViewBinderImpl(picasso, layoutInflater, viewGroup);
    }
}
