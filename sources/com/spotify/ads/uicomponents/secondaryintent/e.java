package com.spotify.ads.uicomponents.secondaryintent;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;

public class e {
    private final SnackbarManager a;
    private final b b;

    public e(SnackbarManager snackbarManager, b bVar) {
        this.a = snackbarManager;
        this.b = bVar;
    }

    public void a() {
        this.a.dismiss();
        this.a.show(SnackbarConfiguration.builder(this.b.f()).build());
    }

    public void b() {
        this.a.dismiss();
        this.a.show(SnackbarConfiguration.builder(this.b.d()).build());
    }
}
