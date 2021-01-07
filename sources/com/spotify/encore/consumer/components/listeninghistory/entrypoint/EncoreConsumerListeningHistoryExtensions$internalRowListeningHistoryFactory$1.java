package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.internalrow.InternalRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.components.listeninghistory.impl.internalrow.DefaultInternalRowListeningHistory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$internalRowListeningHistoryFactory$1 implements ComponentFactory<Component<InternalRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_internalRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$internalRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_internalRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<InternalRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.internalrow.DefaultInternalRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<InternalRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultInternalRowListeningHistory(new DefaultEntityRowListeningHistoryViewBinder(this.$this_internalRowListeningHistoryFactory.getActivity(), this.$this_internalRowListeningHistoryFactory.getPicasso()));
    }
}
