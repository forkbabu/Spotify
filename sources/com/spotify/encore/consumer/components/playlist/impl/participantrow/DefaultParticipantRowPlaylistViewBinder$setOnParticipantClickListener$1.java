package com.spotify.encore.consumer.components.playlist.impl.participantrow;

import android.view.View;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;

/* access modifiers changed from: package-private */
public final class DefaultParticipantRowPlaylistViewBinder$setOnParticipantClickListener$1 implements View.OnClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultParticipantRowPlaylistViewBinder$setOnParticipantClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$consumer.invoke(ParticipantRowPlaylist.Event.RowClicked.INSTANCE);
    }
}
