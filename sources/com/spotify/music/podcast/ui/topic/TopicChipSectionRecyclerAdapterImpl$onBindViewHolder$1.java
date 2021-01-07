package com.spotify.music.podcast.ui.topic;

import com.spotify.music.podcast.ui.topic.o;
import com.spotify.music.podcast.ui.topic.p;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class TopicChipSectionRecyclerAdapterImpl$onBindViewHolder$1 extends Lambda implements nmf<o.a, f> {
    final /* synthetic */ TopicChipSectionRecyclerAdapterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TopicChipSectionRecyclerAdapterImpl$onBindViewHolder$1(TopicChipSectionRecyclerAdapterImpl topicChipSectionRecyclerAdapterImpl) {
        super(1);
        this.this$0 = topicChipSectionRecyclerAdapterImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(o.a aVar) {
        o.a aVar2 = aVar;
        h.e(aVar2, "singleTopicEvent");
        if (aVar2 instanceof o.a.C0331a) {
            TopicChipSectionRecyclerAdapterImpl.Z(this.this$0).invoke(new p.a.C0332a(((o.a.C0331a) aVar2).a()));
        }
        return f.a;
    }
}
