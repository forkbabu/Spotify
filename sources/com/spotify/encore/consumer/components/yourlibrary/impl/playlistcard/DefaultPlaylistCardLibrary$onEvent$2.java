package com.spotify.encore.consumer.components.yourlibrary.impl.playlistcard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistcard.PlaylistCardLibrary;

final class DefaultPlaylistCardLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultPlaylistCardLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(PlaylistCardLibrary.Events.CardLongClicked);
        return true;
    }
}
