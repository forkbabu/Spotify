package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.albumcard.AlbumCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.albumcard.DefaultAlbumCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerAlbumCardLibraryExtensions$albumCardLibraryFactory$1 implements ComponentFactory<Component<AlbumCardLibrary.Model, AlbumCardLibrary.Events>, AlbumCardLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_albumCardLibraryFactory;

    EncoreConsumerAlbumCardLibraryExtensions$albumCardLibraryFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_albumCardLibraryFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<AlbumCardLibrary.Model, AlbumCardLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultAlbumCardLibrary make(AlbumCardLibrary.Configuration configuration) {
        return new DefaultAlbumCardLibrary(this.$this_albumCardLibraryFactory.getActivity(), this.$this_albumCardLibraryFactory.getPicasso());
    }
}
