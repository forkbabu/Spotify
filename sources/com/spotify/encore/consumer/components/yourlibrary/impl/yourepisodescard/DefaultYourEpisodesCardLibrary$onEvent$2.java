package com.spotify.encore.consumer.components.yourlibrary.impl.yourepisodescard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.yourepisodescard.YourEpisodesCardLibrary;

final class DefaultYourEpisodesCardLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultYourEpisodesCardLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(YourEpisodesCardLibrary.Events.CardLongClicked);
        return true;
    }
}
