package com.spotify.music.playlist.permissions;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import io.reactivex.y;

public final class n implements fjf<m> {
    private final wlf<s> a;
    private final wlf<y> b;
    private final wlf<a> c;
    private final wlf<SnackbarManager> d;

    public n(wlf<s> wlf, wlf<y> wlf2, wlf<a> wlf3, wlf<SnackbarManager> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a, this.b, this.c, this.d);
    }
}
