package com.spotify.music.spotlets.scannables.view;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class i {
    private final wlf<ygd> a;

    public i(wlf<ygd> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public h b(Activity activity, ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z) {
        a(activity, 1);
        a(layoutInflater, 3);
        ygd ygd = this.a.get();
        a(ygd, 5);
        return new h(activity, viewGroup, layoutInflater, z, ygd);
    }
}
