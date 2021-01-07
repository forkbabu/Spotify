package com.spotify.music.features.yourepisodes;

import com.spotify.ubi.specification.factories.n4;

public final class u implements fjf<n4> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final u a = new u();
    }

    public static u a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        YourEpisodesFragment yourEpisodesFragment = YourEpisodesFragment.n0;
        return new n4(YourEpisodesFragment.m0.path(), "spotify:collection:your-episodes");
    }
}
