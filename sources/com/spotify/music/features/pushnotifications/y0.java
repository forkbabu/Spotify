package com.spotify.music.features.pushnotifications;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.pushnotifications.l;

public class y0 implements d {
    private final l a;

    y0(l lVar) {
        this.a = lVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PushNotificationManager";
    }
}
