package com.spotify.encore.consumer.components.yourlibrary.impl.podcastcard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastcard.PodcastCardLibrary;

final class DefaultPodcastCardLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultPodcastCardLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(PodcastCardLibrary.Events.CardClicked);
    }
}
