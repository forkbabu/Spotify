package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.artistrow.ArtistRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.artistrow.DefaultArtistRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerArtistRowLibraryExtensions$artistRowLibraryFactory$1 implements ComponentFactory<Component<ArtistRowLibrary.Model, ArtistRowLibrary.Events>, ArtistRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_artistRowLibraryFactory;

    EncoreConsumerArtistRowLibraryExtensions$artistRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_artistRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistRowLibrary.Model, ArtistRowLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultArtistRowLibrary make(ArtistRowLibrary.Configuration configuration) {
        return new DefaultArtistRowLibrary(this.$this_artistRowLibraryFactory.getActivity(), this.$this_artistRowLibraryFactory.getPicasso());
    }
}
