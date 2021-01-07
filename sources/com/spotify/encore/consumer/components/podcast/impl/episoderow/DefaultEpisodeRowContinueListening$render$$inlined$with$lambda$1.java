package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import com.spotify.encore.consumer.components.podcast.api.episoderow.continuelistening.EpisodeRowContinueListening;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class DefaultEpisodeRowContinueListening$render$$inlined$with$lambda$1 extends Lambda implements cmf<Boolean> {
    final /* synthetic */ EpisodeRowContinueListening.Model $model$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultEpisodeRowContinueListening$render$$inlined$with$lambda$1(EpisodeRowContinueListening.Model model) {
        super(0);
        this.$model$inlined = model;
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // defpackage.cmf
    public final Boolean invoke() {
        return this.$model$inlined.getProgress() <= ((float) 0) ? 1 : null;
    }
}
