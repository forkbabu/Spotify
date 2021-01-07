package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.searchrow.SearchRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.components.listeninghistory.impl.searchrow.DefaultSearchRowListeningHistory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$searchRowListeningHistoryFactory$1 implements ComponentFactory<Component<SearchRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_searchRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$searchRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_searchRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<SearchRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.searchrow.DefaultSearchRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<SearchRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultSearchRowListeningHistory(new DefaultEntityRowListeningHistoryViewBinder(this.$this_searchRowListeningHistoryFactory.getActivity(), this.$this_searchRowListeningHistoryFactory.getPicasso()));
    }
}
