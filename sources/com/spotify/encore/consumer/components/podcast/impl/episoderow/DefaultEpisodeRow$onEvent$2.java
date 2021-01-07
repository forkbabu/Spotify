package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.view.View;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;

final class DefaultEpisodeRow$onEvent$2 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultEpisodeRow$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(EpisodeRow.Events.RowClicked.INSTANCE);
    }
}
