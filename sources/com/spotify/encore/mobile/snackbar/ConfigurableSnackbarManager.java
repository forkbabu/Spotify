package com.spotify.encore.mobile.snackbar;

import android.app.Application;
import kotlin.jvm.internal.h;

public final class ConfigurableSnackbarManager {
    public static final ConfigurableSnackbarManager INSTANCE = new ConfigurableSnackbarManager();

    private ConfigurableSnackbarManager() {
    }

    public static final SnackbarManager create(Application application, boolean z) {
        h.e(application, "app");
        return new SnackbarManager(application, z);
    }
}
