package com.spotify.music.features.preloadnotification;

import com.spotify.mobile.android.service.plugininterfaces.d;

public class b implements d {
    private final a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.d();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PreloadNotificationController";
    }
}
