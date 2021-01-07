package com.spotify.encore.consumer.components.podcast.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowYourLibrary;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.DefaultEpisodeRowYourLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerEpisodeRowYourLibraryExtensions$episodeRowYourLibraryFactory$1 implements ComponentFactory<Component<EpisodeRowYourLibrary.Model, EpisodeRowYourLibrary.Events>, EpisodeRowYourLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_episodeRowYourLibraryFactory;

    EncoreConsumerEpisodeRowYourLibraryExtensions$episodeRowYourLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_episodeRowYourLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<EpisodeRowYourLibrary.Model, EpisodeRowYourLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultEpisodeRowYourLibrary make(EpisodeRowYourLibrary.Configuration configuration) {
        return new DefaultEpisodeRowYourLibrary(this.$this_episodeRowYourLibraryFactory.getActivity(), this.$this_episodeRowYourLibraryFactory.getPicasso());
    }
}
