package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.podcastrow.PodcastRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.podcastrow.DefaultPodcastRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.podcastrow.DefaultPodcastRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$podcastRowListeningHistoryFactory$1 implements ComponentFactory<Component<PodcastRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_podcastRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$podcastRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_podcastRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PodcastRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.podcastrow.DefaultPodcastRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<PodcastRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultPodcastRowListeningHistory(new DefaultPodcastRowListeningHistoryViewBinder(this.$this_podcastRowListeningHistoryFactory.getActivity(), this.$this_podcastRowListeningHistoryFactory.getPicasso()));
    }
}
