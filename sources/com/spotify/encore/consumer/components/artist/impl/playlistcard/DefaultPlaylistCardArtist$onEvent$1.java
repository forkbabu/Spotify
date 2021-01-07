package com.spotify.encore.consumer.components.artist.impl.playlistcard;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;

final class DefaultPlaylistCardArtist$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultPlaylistCardArtist$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(PlaylistCardArtist.Events.CardClicked.INSTANCE);
    }
}
