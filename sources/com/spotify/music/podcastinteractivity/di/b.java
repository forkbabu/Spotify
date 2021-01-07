package com.spotify.music.podcastinteractivity.di;

import com.spotify.music.podcastinteractivity.di.PollContainerPageIdProvider;

public final class b implements fjf<PollContainerPageIdProvider.ContainerPageId> {
    private final wlf<PollContainerPageIdProvider> a;

    public b(wlf<PollContainerPageIdProvider> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PollContainerPageIdProvider.ContainerPageId containerPageId = this.a.get().get();
        yif.g(containerPageId, "Cannot return null from a non-@Nullable @Provides method");
        return containerPageId;
    }
}
