package com.spotify.encore.consumer.components.impl.trackrow;

import android.view.View;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;

final class DefaultTrackRow$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultTrackRow$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(TrackRow.Events.RowLongClicked);
        return true;
    }
}
