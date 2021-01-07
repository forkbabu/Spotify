package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.playlistrow.PlaylistRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.components.listeninghistory.impl.playlistrow.DefaultPlaylistRowListeningHistory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$playlistRowListeningHistoryFactory$1 implements ComponentFactory<Component<PlaylistRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_playlistRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$playlistRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_playlistRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PlaylistRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.playlistrow.DefaultPlaylistRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<PlaylistRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultPlaylistRowListeningHistory(new DefaultEntityRowListeningHistoryViewBinder(this.$this_playlistRowListeningHistoryFactory.getActivity(), this.$this_playlistRowListeningHistoryFactory.getPicasso()));
    }
}
