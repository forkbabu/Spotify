package com.spotify.encore.consumer.components.yourlibrary.impl.playlistrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistrow.PlaylistRowLibrary;

final class DefaultPlaylistRowLibrary$onEvent$3 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultPlaylistRowLibrary$onEvent$3(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(PlaylistRowLibrary.Events.DismissClicked);
    }
}
