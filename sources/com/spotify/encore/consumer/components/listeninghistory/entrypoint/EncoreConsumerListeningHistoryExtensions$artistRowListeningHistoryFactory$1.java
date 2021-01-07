package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.artistrow.ArtistRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.impl.artistrow.DefaultArtistRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$artistRowListeningHistoryFactory$1 implements ComponentFactory<Component<ArtistRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_artistRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$artistRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_artistRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.artistrow.DefaultArtistRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultArtistRowListeningHistory(new DefaultEntityRowListeningHistoryViewBinder(this.$this_artistRowListeningHistoryFactory.getActivity(), this.$this_artistRowListeningHistoryFactory.getPicasso()));
    }
}
