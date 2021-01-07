package com.spotify.music.features.connectui.picker.legacy.util;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ SnackbarScheduler a;
    public final /* synthetic */ SnackbarConfiguration b;

    public /* synthetic */ a(SnackbarScheduler snackbarScheduler, SnackbarConfiguration snackbarConfiguration) {
        this.a = snackbarScheduler;
        this.b = snackbarConfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
