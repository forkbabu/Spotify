package com.spotify.libs.nudges;

import com.spotify.encore.mobile.snackbar.SnackbarManager;

public final class g implements fjf<f> {
    private final wlf<SnackbarManager> a;

    public g(wlf<SnackbarManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
