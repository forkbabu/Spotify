package com.spotify.encore.consumer.components.artist.impl.trackrow;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.trackrow.Event;

/* access modifiers changed from: package-private */
public final class DefaultTrackRowArtistViewBinder$setOnTrackLongClickListener$1 implements View.OnLongClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultTrackRowArtistViewBinder$setOnTrackLongClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$consumer.invoke(Event.RowLongClicked);
        return true;
    }
}
