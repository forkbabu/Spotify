package com.spotify.music.features.listeninghistory.di;

import com.spotify.encore.consumer.components.listeninghistory.api.playlistrow.PlaylistRowListeningHistory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.C0707R;
import com.spotify.music.features.listeninghistory.ui.encore.e;

public final class h implements fjf<e<PlaylistRowListeningHistory.Model>> {
    private final a a;
    private final wlf<EncoreConsumerEntryPoint> b;
    private final wlf<vd3> c;

    public h(a aVar, wlf<EncoreConsumerEntryPoint> wlf, wlf<vd3> wlf2) {
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
        kotlin.jvm.internal.h.e(encoreConsumerEntryPoint, "encoreConsumer");
        kotlin.jvm.internal.h.e(vd3, "trackRowInteractionsListener");
        return new e(new ListeningHistoryEncoreComponentsModule$providePlaylistRowComponent$1(encoreConsumerEntryPoint), vd3, ListeningHistoryEncoreComponentsModule$providePlaylistRowComponent$2.a, C0707R.id.encore_playlist_row_listening_history);
    }
}
