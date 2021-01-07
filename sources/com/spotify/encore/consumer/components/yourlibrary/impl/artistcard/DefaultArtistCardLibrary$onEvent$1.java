package com.spotify.encore.consumer.components.yourlibrary.impl.artistcard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.artistcard.ArtistCardLibrary;

final class DefaultArtistCardLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultArtistCardLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(ArtistCardLibrary.Events.CardClicked);
    }
}
