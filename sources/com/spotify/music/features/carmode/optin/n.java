package com.spotify.music.features.carmode.optin;

import android.content.res.Resources;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;

public class n implements o {
    private final SnackbarManager a;
    private final Resources b;

    public n(Resources resources, SnackbarManager snackbarManager) {
        this.a = snackbarManager;
        this.b = resources;
    }

    @Override // com.spotify.music.features.carmode.optin.o
    public void a() {
        this.a.show(SnackbarConfiguration.builder(this.b.getString(C0707R.string.opt_in_snackbar_out)).build());
    }

    @Override // com.spotify.music.features.carmode.optin.o
    public void b() {
        this.a.show(SnackbarConfiguration.builder(this.b.getString(C0707R.string.opt_in_snackbar_in)).build());
    }
}
