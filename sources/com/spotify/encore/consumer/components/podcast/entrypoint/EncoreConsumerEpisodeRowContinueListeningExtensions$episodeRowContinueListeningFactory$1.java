package com.spotify.encore.consumer.components.podcast.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.encore.consumer.components.podcast.api.episoderow.continuelistening.EpisodeRowContinueListening;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.DefaultEpisodeRowContinueListening;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerEpisodeRowContinueListeningExtensions$episodeRowContinueListeningFactory$1 implements ComponentFactory<Component<EpisodeRowContinueListening.Model, EpisodeRowContinueListening.Events>, EpisodeRow.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_episodeRowContinueListeningFactory;

    EncoreConsumerEpisodeRowContinueListeningExtensions$episodeRowContinueListeningFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_episodeRowContinueListeningFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<EpisodeRowContinueListening.Model, EpisodeRowContinueListening.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultEpisodeRowContinueListening make(EpisodeRow.Configuration configuration) {
        return new DefaultEpisodeRowContinueListening(this.$this_episodeRowContinueListeningFactory.getActivity(), this.$this_episodeRowContinueListeningFactory.getPicasso());
    }
}
