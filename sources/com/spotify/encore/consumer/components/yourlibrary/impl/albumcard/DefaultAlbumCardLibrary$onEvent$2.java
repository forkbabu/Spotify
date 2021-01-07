package com.spotify.encore.consumer.components.yourlibrary.impl.albumcard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.albumcard.AlbumCardLibrary;

final class DefaultAlbumCardLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultAlbumCardLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(AlbumCardLibrary.Events.CardLongClicked);
        return true;
    }
}
