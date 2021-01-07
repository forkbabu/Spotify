package com.spotify.encore.consumer.components.yourlibrary.impl.podcastrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastrow.PodcastRowLibrary;

final class DefaultPodcastRowLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultPodcastRowLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(PodcastRowLibrary.Events.RowClicked);
    }
}
