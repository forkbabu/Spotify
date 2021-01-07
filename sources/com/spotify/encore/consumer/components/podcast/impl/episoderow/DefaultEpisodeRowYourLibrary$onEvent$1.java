package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.view.View;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowYourLibrary;

final class DefaultEpisodeRowYourLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultEpisodeRowYourLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(EpisodeRowYourLibrary.Events.RowClicked);
    }
}
