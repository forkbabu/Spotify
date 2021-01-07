package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.episoderow.DefaultEpisodeRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.episoderow.DefaultEpisodeRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$episodeRowListeningHistoryFactory$1 implements ComponentFactory<Component<EpisodeRowListeningHistory.Model, EpisodeRowListeningHistory.Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_episodeRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$episodeRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_episodeRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<EpisodeRowListeningHistory.Model, EpisodeRowListeningHistory.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.episoderow.DefaultEpisodeRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<EpisodeRowListeningHistory.Model, EpisodeRowListeningHistory.Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultEpisodeRowListeningHistory(new DefaultEpisodeRowListeningHistoryViewBinder(this.$this_episodeRowListeningHistoryFactory.getActivity(), this.$this_episodeRowListeningHistoryFactory.getPicasso()));
    }
}
