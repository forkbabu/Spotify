package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.offlinetrials.limited.logging.a;

public final class z implements fjf<y> {
    private final wlf<SnackbarManager> a;
    private final wlf<a> b;

    public z(wlf<SnackbarManager> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get());
    }
}
