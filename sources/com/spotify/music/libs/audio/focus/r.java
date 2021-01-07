package com.spotify.music.libs.audio.focus;

import com.spotify.mobile.android.service.plugininterfaces.d;

public class r implements d {
    private final MediaFocusManager a;

    public r(MediaFocusManager mediaFocusManager) {
        this.a = mediaFocusManager;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AbandonAudioFocusPlugin";
    }
}
