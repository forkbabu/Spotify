package com.spotify.encore.consumer.components.yourlibrary.impl.artistrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.artistrow.ArtistRowLibrary;

final class DefaultArtistRowLibrary$onEvent$3 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultArtistRowLibrary$onEvent$3(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(ArtistRowLibrary.Events.DismissClicked);
    }
}
