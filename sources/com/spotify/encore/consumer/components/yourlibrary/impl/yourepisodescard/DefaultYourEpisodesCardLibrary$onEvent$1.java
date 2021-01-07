package com.spotify.encore.consumer.components.yourlibrary.impl.yourepisodescard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.yourepisodescard.YourEpisodesCardLibrary;

final class DefaultYourEpisodesCardLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultYourEpisodesCardLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(YourEpisodesCardLibrary.Events.CardClicked);
    }
}
