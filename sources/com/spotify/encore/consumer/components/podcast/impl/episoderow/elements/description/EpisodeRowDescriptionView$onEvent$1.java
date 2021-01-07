package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.description;

import android.view.View;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.description.EpisodeRowDescription;

final class EpisodeRowDescriptionView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    EpisodeRowDescriptionView$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(EpisodeRowDescription.Events.OnTagLineClick);
    }
}
