package com.spotify.music.features.listeninghistory.di;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import kotlin.jvm.internal.h;

public final class l implements fjf<TrackRow> {
    private final a a;
    private final wlf<EncoreConsumerEntryPoint> b;

    public l(a aVar, wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = aVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = this.a;
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.b.get();
        aVar.getClass();
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        Component<TrackRow.Model, TrackRow.Events> make = EncoreConsumerExtensions.trackRowFactory(encoreConsumerEntryPoint.getRows()).make();
        if (make != null) {
            return (TrackRow) make;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.components.api.trackrow.TrackRow");
    }
}
