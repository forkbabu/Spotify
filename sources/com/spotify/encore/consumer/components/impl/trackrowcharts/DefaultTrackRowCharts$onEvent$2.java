package com.spotify.encore.consumer.components.impl.trackrowcharts;

import android.view.View;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;

final class DefaultTrackRowCharts$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultTrackRowCharts$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(TrackRowCharts.Events.RowLongClicked);
        return true;
    }
}
