package com.spotify.music.features.queue.service;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class t {
    private final SnackbarManager a;

    t(SnackbarManager snackbarManager) {
        this.a = snackbarManager;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.a.show(SnackbarConfiguration.builder((int) C0707R.string.snackbar_added_to_queue).build());
    }
}
