package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.view.View;
import com.spotify.encore.consumer.components.podcast.api.episoderow.continuelistening.EpisodeRowContinueListening;

final class DefaultEpisodeRowContinueListening$onEvent$2 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultEpisodeRowContinueListening$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(EpisodeRowContinueListening.Events.PrimaryActionClicked.INSTANCE);
    }
}
