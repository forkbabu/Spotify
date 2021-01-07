package com.spotify.encore.consumer.components.album.impl.trackrow;

import android.view.View;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;

/* access modifiers changed from: package-private */
public final class DefaultTrackRowAlbumViewBinder$setOnTrackLongClickListener$1 implements View.OnLongClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultTrackRowAlbumViewBinder$setOnTrackLongClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$consumer.invoke(TrackRowAlbum.Events.RowLongClicked.INSTANCE);
        return true;
    }
}
