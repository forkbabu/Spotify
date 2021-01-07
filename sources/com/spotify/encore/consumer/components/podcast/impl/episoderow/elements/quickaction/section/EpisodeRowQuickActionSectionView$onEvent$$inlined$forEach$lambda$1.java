package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section;

import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section.EpisodeRowQuickActionSection;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class EpisodeRowQuickActionSectionView$onEvent$$inlined$forEach$lambda$1 extends Lambda implements nmf<EpisodeRowQuickAction, f> {
    final /* synthetic */ nmf $event$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EpisodeRowQuickActionSectionView$onEvent$$inlined$forEach$lambda$1(nmf nmf) {
        super(1);
        this.$event$inlined = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(EpisodeRowQuickAction episodeRowQuickAction) {
        invoke(episodeRowQuickAction);
        return f.a;
    }

    public final void invoke(EpisodeRowQuickAction episodeRowQuickAction) {
        h.e(episodeRowQuickAction, "it");
        this.$event$inlined.invoke(new EpisodeRowQuickActionSection.ClickEvent(episodeRowQuickAction));
    }
}
