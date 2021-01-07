package com.spotify.encore.consumer.components.yourlibrary.impl.podcastrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastrow.PodcastRowLibrary;

final class DefaultPodcastRowLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultPodcastRowLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(PodcastRowLibrary.Events.RowLongClicked);
        return true;
    }
}
