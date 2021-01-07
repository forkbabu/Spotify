package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.artistcard.ArtistCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.artistcard.DefaultArtistCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerArtistCardLibraryExtensions$artistCardLibraryFactory$1 implements ComponentFactory<Component<ArtistCardLibrary.Model, ArtistCardLibrary.Events>, ArtistCardLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_artistCardLibraryFactory;

    EncoreConsumerArtistCardLibraryExtensions$artistCardLibraryFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_artistCardLibraryFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistCardLibrary.Model, ArtistCardLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultArtistCardLibrary make(ArtistCardLibrary.Configuration configuration) {
        return new DefaultArtistCardLibrary(this.$this_artistCardLibraryFactory.getActivity(), this.$this_artistCardLibraryFactory.getPicasso());
    }
}
