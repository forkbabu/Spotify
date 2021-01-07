package com.spotify.music.podcastentityrow;

import androidx.lifecycle.n;
import com.spotify.music.explicitcontent.ExplicitContentFacade;

public final class t implements fjf<PodcastEpisodeItemConfigImpl> {
    private final wlf<ExplicitContentFacade> a;
    private final wlf<n> b;

    public t(wlf<ExplicitContentFacade> wlf, wlf<n> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastEpisodeItemConfigImpl(this.a.get(), this.b.get());
    }
}
