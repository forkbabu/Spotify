package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.view.View;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;

final class DefaultEpisodeRow$onEvent$3 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultEpisodeRow$onEvent$3(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(EpisodeRow.Events.RowLongClicked.INSTANCE);
        return true;
    }
}
