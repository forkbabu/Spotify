package com.spotify.encore.consumer.components.artist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.albumrow.AlbumRowArtist;
import com.spotify.encore.consumer.components.artist.impl.albumrow.DefaultAlbumRowArtist;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerAlbumRowArtistExtensions$albumRowArtistFactory$1 implements ComponentFactory<Component<AlbumRowArtist.Model, AlbumRowArtist.Events>, AlbumRowArtist.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_albumRowArtistFactory;

    EncoreConsumerAlbumRowArtistExtensions$albumRowArtistFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_albumRowArtistFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<AlbumRowArtist.Model, AlbumRowArtist.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultAlbumRowArtist make(AlbumRowArtist.Configuration configuration) {
        return new DefaultAlbumRowArtist(this.$this_albumRowArtistFactory.getActivity(), this.$this_albumRowArtistFactory.getPicasso());
    }
}
