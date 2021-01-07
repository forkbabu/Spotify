package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.albumrow.AlbumRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.impl.albumrow.DefaultAlbumRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$albumRowListeningHistoryFactory$1 implements ComponentFactory<Component<AlbumRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_albumRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$albumRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_albumRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<AlbumRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.albumrow.DefaultAlbumRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<AlbumRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultAlbumRowListeningHistory(new DefaultEntityRowListeningHistoryViewBinder(this.$this_albumRowListeningHistoryFactory.getActivity(), this.$this_albumRowListeningHistoryFactory.getPicasso()));
    }
}
