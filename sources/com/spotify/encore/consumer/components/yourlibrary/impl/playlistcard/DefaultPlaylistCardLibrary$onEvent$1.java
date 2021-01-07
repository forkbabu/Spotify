package com.spotify.encore.consumer.components.yourlibrary.impl.playlistcard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistcard.PlaylistCardLibrary;

final class DefaultPlaylistCardLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultPlaylistCardLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(PlaylistCardLibrary.Events.CardClicked);
    }
}
