package com.spotify.encore.consumer.components.yourlibrary.impl.podcastcard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastcard.PodcastCardLibrary;

final class DefaultPodcastCardLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultPodcastCardLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(PodcastCardLibrary.Events.CardLongClicked);
        return true;
    }
}
