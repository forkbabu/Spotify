package com.spotify.music.podcastinteractivity.di;

import com.spotify.remoteconfig.AndroidLibsPodcastInteractivityProperties;

public final class e implements fjf<Boolean> {
    private final wlf<AndroidLibsPodcastInteractivityProperties> a;

    public e(wlf<AndroidLibsPodcastInteractivityProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().b() != AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv.NO_POLLS);
    }
}
