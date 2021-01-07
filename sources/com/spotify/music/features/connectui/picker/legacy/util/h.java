package com.spotify.music.features.connectui.picker.legacy.util;

import androidx.appcompat.app.g;
import com.spotify.encore.mobile.snackbar.SnackbarManager;

public final class h implements fjf<SnackbarScheduler> {
    private final wlf<g> a;
    private final wlf<SnackbarManager> b;

    public h(wlf<g> wlf, wlf<SnackbarManager> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SnackbarScheduler(this.a.get(), this.b.get());
    }
}
