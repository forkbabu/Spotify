package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.yourepisodesrow.YourEpisodesRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.yourepisodesrow.DefaultYourEpisodesRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerYourEpisodesRowLibraryExtensions$yourEpisodesRowLibraryFactory$1 implements ComponentFactory<Component<YourEpisodesRowLibrary.Model, YourEpisodesRowLibrary.Events>, YourEpisodesRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_yourEpisodesRowLibraryFactory;

    EncoreConsumerYourEpisodesRowLibraryExtensions$yourEpisodesRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_yourEpisodesRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<YourEpisodesRowLibrary.Model, YourEpisodesRowLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultYourEpisodesRowLibrary make(YourEpisodesRowLibrary.Configuration configuration) {
        return new DefaultYourEpisodesRowLibrary(this.$this_yourEpisodesRowLibraryFactory.getActivity(), this.$this_yourEpisodesRowLibraryFactory.getPicasso());
    }
}
