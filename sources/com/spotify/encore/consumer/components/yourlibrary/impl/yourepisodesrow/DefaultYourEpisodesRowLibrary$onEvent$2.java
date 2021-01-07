package com.spotify.encore.consumer.components.yourlibrary.impl.yourepisodesrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.yourepisodesrow.YourEpisodesRowLibrary;

final class DefaultYourEpisodesRowLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultYourEpisodesRowLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(YourEpisodesRowLibrary.Events.RowLongClicked);
        return true;
    }
}
