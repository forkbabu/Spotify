package com.spotify.encore.mobile.snackbar;

import android.app.Application;

public final class SnackbarManager_Factory implements fjf<SnackbarManager> {
    private final wlf<Application> applicationProvider;
    private final wlf<Boolean> floatingStyleEnabledProvider;

    public SnackbarManager_Factory(wlf<Application> wlf, wlf<Boolean> wlf2) {
        this.applicationProvider = wlf;
        this.floatingStyleEnabledProvider = wlf2;
    }

    public static SnackbarManager_Factory create(wlf<Application> wlf, wlf<Boolean> wlf2) {
        return new SnackbarManager_Factory(wlf, wlf2);
    }

    public static SnackbarManager newInstance(Application application, boolean z) {
        return new SnackbarManager(application, z);
    }

    @Override // defpackage.wlf
    public SnackbarManager get() {
        return newInstance(this.applicationProvider.get(), this.floatingStyleEnabledProvider.get().booleanValue());
    }
}
