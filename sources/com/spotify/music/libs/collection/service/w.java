package com.spotify.music.libs.collection.service;

import android.content.res.Resources;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.libs.collection.service.v;

public final class w implements v.a {
    private final wlf<SnackbarManager> a;
    private final wlf<caa> b;

    public w(wlf<SnackbarManager> wlf, wlf<caa> wlf2) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.libs.collection.service.v.a
    public v a(Resources resources) {
        SnackbarManager snackbarManager = this.a.get();
        b(snackbarManager, 1);
        caa caa = this.b.get();
        b(caa, 2);
        b(resources, 3);
        return new v(snackbarManager, caa, resources);
    }
}
