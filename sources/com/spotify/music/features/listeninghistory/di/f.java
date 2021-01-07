package com.spotify.music.features.listeninghistory.di;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.entrypoint.EncoreConsumerListeningHistoryExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class f implements fjf<EpisodeRowListeningHistory> {
    private final a a;
    private final wlf<EncoreConsumerEntryPoint> b;

    public f(a aVar, wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = aVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = this.a;
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.b.get();
        aVar.getClass();
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        Component<EpisodeRowListeningHistory.Model, EpisodeRowListeningHistory.Events> make = EncoreConsumerListeningHistoryExtensions.episodeRowListeningHistoryFactory(encoreConsumerEntryPoint.getRows()).make();
        if (make != null) {
            return (EpisodeRowListeningHistory) make;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory");
    }
}
