package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.yourepisodescard.YourEpisodesCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.yourepisodescard.DefaultYourEpisodesCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerYourEpisodesCardLibraryExtensions$yourEpisodesCardLibraryFactory$1 implements ComponentFactory<Component<YourEpisodesCardLibrary.Model, YourEpisodesCardLibrary.Events>, YourEpisodesCardLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_yourEpisodesCardLibraryFactory;

    EncoreConsumerYourEpisodesCardLibraryExtensions$yourEpisodesCardLibraryFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_yourEpisodesCardLibraryFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<YourEpisodesCardLibrary.Model, YourEpisodesCardLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultYourEpisodesCardLibrary make(YourEpisodesCardLibrary.Configuration configuration) {
        return new DefaultYourEpisodesCardLibrary(this.$this_yourEpisodesCardLibraryFactory.getActivity(), this.$this_yourEpisodesCardLibraryFactory.getPicasso());
    }
}
