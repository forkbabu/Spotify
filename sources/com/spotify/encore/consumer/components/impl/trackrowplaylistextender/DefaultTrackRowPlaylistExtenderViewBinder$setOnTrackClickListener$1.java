package com.spotify.encore.consumer.components.impl.trackrowplaylistextender;

import android.view.View;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;

/* access modifiers changed from: package-private */
public final class DefaultTrackRowPlaylistExtenderViewBinder$setOnTrackClickListener$1 implements View.OnClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultTrackRowPlaylistExtenderViewBinder$setOnTrackClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nmf nmf = this.$consumer;
        Events rowClicked = Events.Companion.rowClicked();
        if (rowClicked != null) {
            nmf.invoke((Events.RowClicked) rowClicked);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events.RowClicked");
    }
}
