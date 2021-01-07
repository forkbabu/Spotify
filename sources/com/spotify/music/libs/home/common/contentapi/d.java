package com.spotify.music.libs.home.common.contentapi;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.playlist.endpoints.v;

public final class d implements fjf<c> {
    private final wlf<v> a;
    private final wlf<com.spotify.playlist.endpoints.d> b;
    private final wlf<SnackbarManager> c;

    public d(wlf<v> wlf, wlf<com.spotify.playlist.endpoints.d> wlf2, wlf<SnackbarManager> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
