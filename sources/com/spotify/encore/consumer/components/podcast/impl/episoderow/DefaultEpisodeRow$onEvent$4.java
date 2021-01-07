package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section.EpisodeRowQuickActionSection;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DefaultEpisodeRow$onEvent$4 extends Lambda implements nmf<EpisodeRowQuickActionSection.ClickEvent, f> {
    final /* synthetic */ nmf $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultEpisodeRow$onEvent$4(nmf nmf) {
        super(1);
        this.$event = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(EpisodeRowQuickActionSection.ClickEvent clickEvent) {
        invoke(clickEvent);
        return f.a;
    }

    public final void invoke(EpisodeRowQuickActionSection.ClickEvent clickEvent) {
        h.e(clickEvent, "it");
        this.$event.invoke(new EpisodeRow.Events.QuickActionClicked(clickEvent.getAction()));
    }
}
