package com.spotify.music.playlist.permissions;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.playlist.permissions.f;
import com.spotify.pageloader.s0;

public final class g implements f.a {
    private final wlf<SnackbarManager> a;

    public g(wlf<SnackbarManager> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public s0 b(cmf cmf) {
        SnackbarManager snackbarManager = this.a.get();
        a(snackbarManager, 1);
        a(cmf, 2);
        return new f(snackbarManager, cmf);
    }
}
