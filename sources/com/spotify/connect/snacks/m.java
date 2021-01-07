package com.spotify.connect.snacks;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import kotlin.jvm.internal.h;

public final class m implements l {
    private final SnackbarManager a;

    public m(SnackbarManager snackbarManager) {
        h.e(snackbarManager, "manager");
        this.a = snackbarManager;
    }

    @Override // com.spotify.connect.snacks.l
    public void a(SnackbarConfiguration snackbarConfiguration) {
        h.e(snackbarConfiguration, "snack");
        this.a.show(snackbarConfiguration);
    }
}
