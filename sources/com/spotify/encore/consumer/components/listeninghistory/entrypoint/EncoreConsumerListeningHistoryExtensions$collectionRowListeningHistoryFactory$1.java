package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.collectionrow.CollectionRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.impl.collectionrow.DefaultCollectionRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$collectionRowListeningHistoryFactory$1 implements ComponentFactory<Component<CollectionRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_collectionRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$collectionRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_collectionRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<CollectionRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.collectionrow.DefaultCollectionRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<CollectionRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultCollectionRowListeningHistory(new DefaultEntityRowListeningHistoryViewBinder(this.$this_collectionRowListeningHistoryFactory.getActivity(), this.$this_collectionRowListeningHistoryFactory.getPicasso()));
    }
}
