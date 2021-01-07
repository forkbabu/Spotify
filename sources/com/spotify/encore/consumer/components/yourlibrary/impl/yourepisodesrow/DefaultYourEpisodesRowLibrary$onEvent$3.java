package com.spotify.encore.consumer.components.yourlibrary.impl.yourepisodesrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.yourepisodesrow.YourEpisodesRowLibrary;

final class DefaultYourEpisodesRowLibrary$onEvent$3 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultYourEpisodesRowLibrary$onEvent$3(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(YourEpisodesRowLibrary.Events.DismissClicked);
    }
}
