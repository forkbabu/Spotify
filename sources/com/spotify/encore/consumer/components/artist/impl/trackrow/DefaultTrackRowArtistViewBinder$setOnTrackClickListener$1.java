package com.spotify.encore.consumer.components.artist.impl.trackrow;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.trackrow.Event;

/* access modifiers changed from: package-private */
public final class DefaultTrackRowArtistViewBinder$setOnTrackClickListener$1 implements View.OnClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultTrackRowArtistViewBinder$setOnTrackClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$consumer.invoke(Event.RowClicked);
    }
}
