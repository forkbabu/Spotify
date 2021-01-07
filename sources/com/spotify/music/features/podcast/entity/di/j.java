package com.spotify.music.features.podcast.entity.di;

import android.os.Bundle;

public final class j implements fjf<String> {
    private final wlf<Bundle> a;

    public j(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString("episodeUri", "");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
