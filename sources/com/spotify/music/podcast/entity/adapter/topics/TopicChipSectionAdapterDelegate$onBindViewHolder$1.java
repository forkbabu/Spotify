package com.spotify.music.podcast.entity.adapter.topics;

import com.spotify.music.podcast.entity.adapter.topics.TopicChipSectionAdapterDelegate;
import com.spotify.music.podcast.ui.topic.p;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class TopicChipSectionAdapterDelegate$onBindViewHolder$1 extends Lambda implements nmf<p.a, f> {
    final /* synthetic */ TopicChipSectionAdapterDelegate.a $segment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TopicChipSectionAdapterDelegate$onBindViewHolder$1(TopicChipSectionAdapterDelegate.a aVar) {
        super(1);
        this.$segment = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(p.a aVar) {
        p.a aVar2 = aVar;
        h.e(aVar2, "event");
        if (aVar2 instanceof p.a.C0332a) {
            this.$segment.e().a(((p.a.C0332a) aVar2).a());
        }
        return f.a;
    }
}
