package com.spotify.encore.consumer.components.artist.impl.artistcardfollow;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;

final class DefaultArtistCardFollow$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultArtistCardFollow$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(ArtistCardFollow.Events.CardClicked);
    }
}
