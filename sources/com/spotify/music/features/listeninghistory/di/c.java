package com.spotify.music.features.listeninghistory.di;

import com.spotify.encore.consumer.components.listeninghistory.api.artistcollectionrow.ArtistCollectionRowListeningHistory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.C0707R;
import com.spotify.music.features.listeninghistory.ui.encore.e;
import kotlin.jvm.internal.h;

public final class c implements fjf<e<ArtistCollectionRowListeningHistory.Model>> {
    private final a a;
    private final wlf<EncoreConsumerEntryPoint> b;
    private final wlf<vd3> c;

    public c(a aVar, wlf<EncoreConsumerEntryPoint> wlf, wlf<vd3> wlf2) {
        this.a = aVar;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = this.a;
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.b.get();
        vd3 vd3 = this.c.get();
        aVar.getClass();
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        h.e(vd3, "trackRowInteractionsListener");
        return new e(new ListeningHistoryEncoreComponentsModule$provideArtistCollectionRowComponent$1(encoreConsumerEntryPoint), vd3, ListeningHistoryEncoreComponentsModule$provideArtistCollectionRowComponent$2.a, C0707R.id.encore_artist_collection_row_listening_history);
    }
}