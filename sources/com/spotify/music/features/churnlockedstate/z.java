package com.spotify.music.features.churnlockedstate;

import android.app.Application;
import com.spotify.mobile.android.service.o;

public class z {
    private final o a;
    private final Application b;

    public z(o oVar, Application application) {
        this.a = oVar;
        this.b = application;
    }

    public void a() {
        Application application = this.b;
        application.startService(this.a.c(application, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"));
    }
}
