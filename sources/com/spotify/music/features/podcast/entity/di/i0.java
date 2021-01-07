package com.spotify.music.features.podcast.entity.di;

import com.spotify.music.podcast.entity.adapter.topics.TopicChipSectionAdapterDelegate;
import defpackage.zrc;

public final class i0 implements fjf<zrc.a> {
    private final wlf<TopicChipSectionAdapterDelegate> a;

    public i0(wlf<TopicChipSectionAdapterDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(TopicChipSectionAdapterDelegate.a.class, this.a.get());
    }
}
