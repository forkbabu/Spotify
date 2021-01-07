package com.spotify.music.features.podcast.entity.di;

import android.os.Bundle;

public final class i implements fjf<Boolean> {
    private final wlf<Bundle> a;

    public i(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Boolean valueOf = Boolean.valueOf(this.a.get().getBoolean("auto_play", false));
        yif.g(valueOf, "Cannot return null from a non-@Nullable @Provides method");
        return valueOf;
    }
}
