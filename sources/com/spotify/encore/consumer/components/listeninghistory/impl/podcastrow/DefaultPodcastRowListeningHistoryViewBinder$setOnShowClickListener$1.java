package com.spotify.encore.consumer.components.listeninghistory.impl.podcastrow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;

/* access modifiers changed from: package-private */
public final class DefaultPodcastRowListeningHistoryViewBinder$setOnShowClickListener$1 implements View.OnClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultPodcastRowListeningHistoryViewBinder$setOnShowClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$consumer.invoke(Events.RowClicked);
    }
}
