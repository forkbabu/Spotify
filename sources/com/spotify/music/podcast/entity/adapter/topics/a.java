package com.spotify.music.podcast.entity.adapter.topics;

import com.spotify.music.podcast.ui.topic.p;

public final class a implements fjf<TopicChipSectionAdapterDelegate> {
    private final wlf<p.b> a;

    public a(wlf<p.b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TopicChipSectionAdapterDelegate(this.a.get());
    }
}
