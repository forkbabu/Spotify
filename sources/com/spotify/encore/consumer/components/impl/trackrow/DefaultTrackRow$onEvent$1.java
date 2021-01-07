package com.spotify.encore.consumer.components.impl.trackrow;

import android.view.View;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;

final class DefaultTrackRow$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultTrackRow$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(TrackRow.Events.RowClicked);
    }
}
