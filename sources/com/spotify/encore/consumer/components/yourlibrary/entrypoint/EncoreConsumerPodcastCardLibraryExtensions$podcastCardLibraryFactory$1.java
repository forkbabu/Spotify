package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastcard.PodcastCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.podcastcard.DefaultPodcastCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerPodcastCardLibraryExtensions$podcastCardLibraryFactory$1 implements ComponentFactory<Component<PodcastCardLibrary.Model, PodcastCardLibrary.Events>, PodcastCardLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_podcastCardLibraryFactory;

    EncoreConsumerPodcastCardLibraryExtensions$podcastCardLibraryFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_podcastCardLibraryFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PodcastCardLibrary.Model, PodcastCardLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultPodcastCardLibrary make(PodcastCardLibrary.Configuration configuration) {
        return new DefaultPodcastCardLibrary(this.$this_podcastCardLibraryFactory.getActivity(), this.$this_podcastCardLibraryFactory.getPicasso());
    }
}
