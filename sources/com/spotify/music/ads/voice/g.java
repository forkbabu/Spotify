package com.spotify.music.ads.voice;

import android.content.Context;
import android.media.AudioManager;

public final class g implements fjf<AudioManager> {
    private final wlf<Context> a;

    public g(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AudioManager audioManager = (AudioManager) this.a.get().getSystemService("audio");
        yif.g(audioManager, "Cannot return null from a non-@Nullable @Provides method");
        return audioManager;
    }
}
