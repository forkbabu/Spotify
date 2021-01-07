package com.spotify.encore.consumer.components.listeninghistory.impl.episoderow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;

/* access modifiers changed from: package-private */
public final class DefaultEpisodeRowListeningHistoryViewBinder$setOnEpisodeClickListener$1 implements View.OnClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultEpisodeRowListeningHistoryViewBinder$setOnEpisodeClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$consumer.invoke(EpisodeRowListeningHistory.Events.RowClicked);
    }
}
