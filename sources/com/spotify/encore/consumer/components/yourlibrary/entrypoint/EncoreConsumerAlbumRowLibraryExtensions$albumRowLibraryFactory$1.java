package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.albumrow.AlbumRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.albumrow.DefaultAlbumRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerAlbumRowLibraryExtensions$albumRowLibraryFactory$1 implements ComponentFactory<Component<AlbumRowLibrary.Model, AlbumRowLibrary.Events>, AlbumRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_albumRowLibraryFactory;

    EncoreConsumerAlbumRowLibraryExtensions$albumRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_albumRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<AlbumRowLibrary.Model, AlbumRowLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultAlbumRowLibrary make(AlbumRowLibrary.Configuration configuration) {
        return new DefaultAlbumRowLibrary(this.$this_albumRowLibraryFactory.getActivity(), this.$this_albumRowLibraryFactory.getPicasso());
    }
}
