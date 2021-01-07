package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastrow.PodcastRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.podcastrow.DefaultPodcastRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerPodcastRowLibraryExtensions$podcastRowLibraryFactory$1 implements ComponentFactory<Component<PodcastRowLibrary.Model, PodcastRowLibrary.Events>, PodcastRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_podcastRowLibraryFactory;

    EncoreConsumerPodcastRowLibraryExtensions$podcastRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_podcastRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PodcastRowLibrary.Model, PodcastRowLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultPodcastRowLibrary make(PodcastRowLibrary.Configuration configuration) {
        return new DefaultPodcastRowLibrary(this.$this_podcastRowLibraryFactory.getActivity(), this.$this_podcastRowLibraryFactory.getPicasso());
    }
}
