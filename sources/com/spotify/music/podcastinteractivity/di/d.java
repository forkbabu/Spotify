package com.spotify.music.podcastinteractivity.di;

import com.spotify.remoteconfig.AndroidLibsPodcastInteractivityProperties;

public final class d implements fjf<Boolean> {
    private final wlf<AndroidLibsPodcastInteractivityProperties> a;

    public d(wlf<AndroidLibsPodcastInteractivityProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a() != AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage.NO_POLLS);
    }
}
