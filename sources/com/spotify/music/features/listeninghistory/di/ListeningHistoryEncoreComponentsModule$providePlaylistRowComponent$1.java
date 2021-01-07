package com.spotify.music.features.listeninghistory.di;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.playlistrow.PlaylistRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.entrypoint.EncoreConsumerListeningHistoryExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.Lambda;

final class ListeningHistoryEncoreComponentsModule$providePlaylistRowComponent$1 extends Lambda implements cmf<Component<PlaylistRowListeningHistory.Model, Events>> {
    final /* synthetic */ EncoreConsumerEntryPoint $encoreConsumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListeningHistoryEncoreComponentsModule$providePlaylistRowComponent$1(EncoreConsumerEntryPoint encoreConsumerEntryPoint) {
        super(0);
        this.$encoreConsumer = encoreConsumerEntryPoint;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Component<PlaylistRowListeningHistory.Model, Events> invoke() {
        return EncoreConsumerListeningHistoryExtensions.playlistRowListeningHistoryFactory(this.$encoreConsumer.getRows()).make();
    }
}
