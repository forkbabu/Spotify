package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.artistcollectionrow.ArtistCollectionRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.impl.artistcollectionrow.DefaultArtistCollectionRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$artistCollectionRowListeningHistoryFactory$1 implements ComponentFactory<Component<ArtistCollectionRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_artistCollectionRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$artistCollectionRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_artistCollectionRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistCollectionRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.artistcollectionrow.DefaultArtistCollectionRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistCollectionRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultArtistCollectionRowListeningHistory(new DefaultEntityRowListeningHistoryViewBinder(this.$this_artistCollectionRowListeningHistoryFactory.getActivity(), this.$this_artistCollectionRowListeningHistoryFactory.getPicasso()));
    }
}
