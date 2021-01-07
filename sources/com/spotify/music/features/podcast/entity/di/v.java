package com.spotify.music.features.podcast.entity.di;

import androidx.fragment.app.o;
import com.spotify.music.features.podcast.entity.PodcastEntityFragment;
import com.spotify.music.features.podcast.entity.di.PodcastQuoteSharingModule;
import kotlin.jvm.internal.h;

public final class v implements fjf<o> {
    private final wlf<PodcastEntityFragment> a;

    public v(wlf<PodcastEntityFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PodcastEntityFragment podcastEntityFragment = this.a.get();
        PodcastQuoteSharingModule.Companion companion = PodcastQuoteSharingModule.a;
        h.e(podcastEntityFragment, "fragment");
        o E2 = podcastEntityFragment.E2();
        h.d(E2, "fragment.childFragmentManager");
        return E2;
    }
}
