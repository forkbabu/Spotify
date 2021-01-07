package com.spotify.music.features.voice;

import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.service.plugininterfaces.d;

public class z implements b, d {
    private final t0f a;

    z(t0f t0f) {
        this.a = t0f;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "VoicePlayerStateObserverPlugin";
    }
}
