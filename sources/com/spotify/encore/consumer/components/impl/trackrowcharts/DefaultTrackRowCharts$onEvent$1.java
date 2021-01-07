package com.spotify.encore.consumer.components.impl.trackrowcharts;

import android.view.View;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;

final class DefaultTrackRowCharts$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultTrackRowCharts$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(TrackRowCharts.Events.RowClicked);
    }
}
