package com.spotify.encore.consumer.components.yourlibrary.impl.albumcard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.albumcard.AlbumCardLibrary;

final class DefaultAlbumCardLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultAlbumCardLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(AlbumCardLibrary.Events.CardClicked);
    }
}
