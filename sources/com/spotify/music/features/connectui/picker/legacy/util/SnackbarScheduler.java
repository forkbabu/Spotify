package com.spotify.music.features.connectui.picker.legacy.util;

import android.os.Handler;
import androidx.appcompat.app.g;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;

public class SnackbarScheduler implements m {
    private final SnackbarManager a;
    private final Handler b = new Handler();
    private Runnable c;

    public SnackbarScheduler(g gVar, SnackbarManager snackbarManager) {
        this.a = snackbarManager;
        gVar.A().a(this);
    }

    public /* synthetic */ void a(SnackbarConfiguration snackbarConfiguration) {
        this.a.show(snackbarConfiguration);
    }

    public void b(SnackbarConfiguration snackbarConfiguration, long j) {
        a aVar = new a(this, snackbarConfiguration);
        this.c = aVar;
        this.b.postDelayed(aVar, j);
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
        }
    }
}
