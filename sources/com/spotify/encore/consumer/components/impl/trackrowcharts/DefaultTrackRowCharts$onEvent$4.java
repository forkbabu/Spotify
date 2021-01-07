package com.spotify.encore.consumer.components.impl.trackrowcharts;

import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
import com.spotify.encore.consumer.elements.quickactions.Events;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DefaultTrackRowCharts$onEvent$4 extends Lambda implements nmf<Events, f> {
    final /* synthetic */ nmf $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultTrackRowCharts$onEvent$4(nmf nmf) {
        super(1);
        this.$event = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(Events events) {
        invoke(events);
        return f.a;
    }

    public final void invoke(Events events) {
        h.e(events, "it");
        int ordinal = events.ordinal();
        if (ordinal == 0) {
            this.$event.invoke(TrackRowCharts.Events.HeartClicked);
        } else if (ordinal == 1) {
            this.$event.invoke(TrackRowCharts.Events.HideClicked);
        } else if (ordinal == 2) {
            this.$event.invoke(TrackRowCharts.Events.BanClicked);
        }
    }
}
