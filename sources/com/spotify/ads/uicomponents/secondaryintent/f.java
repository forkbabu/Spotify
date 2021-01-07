package com.spotify.ads.uicomponents.secondaryintent;

import com.spotify.encore.mobile.snackbar.SnackbarManager;

public final class f implements fjf<e> {
    private final wlf<SnackbarManager> a;
    private final wlf<b> b;

    public f(wlf<SnackbarManager> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get());
    }
}
