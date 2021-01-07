package com.spotify.encore.consumer.components.album.impl.trackrow;

import android.view.View;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;

/* access modifiers changed from: package-private */
public final class DefaultTrackRowAlbumViewBinder$setOnTrackClickListener$1 implements View.OnClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultTrackRowAlbumViewBinder$setOnTrackClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$consumer.invoke(TrackRowAlbum.Events.RowClicked.INSTANCE);
    }
}
