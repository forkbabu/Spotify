package com.spotify.encore.consumer.components.yourlibrary.impl.artistcard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.artistcard.ArtistCardLibrary;

final class DefaultArtistCardLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultArtistCardLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(ArtistCardLibrary.Events.CardLongClicked);
        return true;
    }
}
