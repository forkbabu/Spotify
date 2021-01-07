package com.spotify.instrumentation.navigation.logger;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;

public final class NavigationLoggerApplicationInstaller$init$1 implements m {
    final /* synthetic */ NavigationLoggerApplicationInstaller a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    NavigationLoggerApplicationInstaller$init$1(NavigationLoggerApplicationInstaller navigationLoggerApplicationInstaller) {
        this.a = navigationLoggerApplicationInstaller;
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onBackground() {
        this.a.a().a();
    }

    @w(Lifecycle.Event.ON_START)
    public final void onForeground() {
        this.a.a().b();
    }
}
