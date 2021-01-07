package com.spotify.music.podcast.ui.topic;

import com.spotify.music.podcast.ui.topic.o;

public final class s implements fjf<TopicChipSectionRecyclerAdapterImpl> {
    private final wlf<o.b> a;

    public s(wlf<o.b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TopicChipSectionRecyclerAdapterImpl(this.a.get());
    }
}
