package com.spotify.mobile.android.service.media;

import android.content.Intent;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import dagger.android.g;

public class ExternalIntegrationService extends g {
    e2 a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a.g();
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        super.onCreate();
        Logger.l("ExternalIntegrationService.onCreate", new Object[0]);
        this.a.a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Logger.b("ExternalIntegrationService.onDestroy", new Object[0]);
        this.a.j();
    }
}
