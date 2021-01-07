package com.spotify.encore.consumer.components.artist.impl.albumrow;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.albumrow.AlbumRowArtist;

final class DefaultAlbumRowArtist$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultAlbumRowArtist$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(AlbumRowArtist.Events.RowClicked);
    }
}
