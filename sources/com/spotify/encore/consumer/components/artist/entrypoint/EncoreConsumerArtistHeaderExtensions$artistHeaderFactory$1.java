package com.spotify.encore.consumer.components.artist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.header.ArtistHeader;
import com.spotify.encore.consumer.components.artist.impl.header.DefaultArtistHeader;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerArtistHeaderExtensions$artistHeaderFactory$1 implements ComponentFactory<Component<ArtistHeader.Model, ArtistHeader.Events>, ArtistHeader.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headers $this_artistHeaderFactory;

    EncoreConsumerArtistHeaderExtensions$artistHeaderFactory$1(EncoreConsumerEntryPoint.Headers headers) {
        this.$this_artistHeaderFactory = headers;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistHeader.Model, ArtistHeader.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultArtistHeader make(ArtistHeader.Configuration configuration) {
        return new DefaultArtistHeader(this.$this_artistHeaderFactory.getActivity(), this.$this_artistHeaderFactory.getPicasso());
    }
}
