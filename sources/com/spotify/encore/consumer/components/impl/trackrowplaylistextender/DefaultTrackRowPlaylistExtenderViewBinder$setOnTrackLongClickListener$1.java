package com.spotify.encore.consumer.components.impl.trackrowplaylistextender;

import android.view.View;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;

/* access modifiers changed from: package-private */
public final class DefaultTrackRowPlaylistExtenderViewBinder$setOnTrackLongClickListener$1 implements View.OnLongClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultTrackRowPlaylistExtenderViewBinder$setOnTrackLongClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        nmf nmf = this.$consumer;
        Events rowLongClicked = Events.Companion.rowLongClicked();
        if (rowLongClicked != null) {
            nmf.invoke((Events.RowLongClicked) rowLongClicked);
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events.RowLongClicked");
    }
}
