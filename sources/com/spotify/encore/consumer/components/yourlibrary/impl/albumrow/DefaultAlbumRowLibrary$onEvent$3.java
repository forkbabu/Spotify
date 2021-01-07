package com.spotify.encore.consumer.components.yourlibrary.impl.albumrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.albumrow.AlbumRowLibrary;

final class DefaultAlbumRowLibrary$onEvent$3 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultAlbumRowLibrary$onEvent$3(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(AlbumRowLibrary.Events.DismissClicked);
    }
}
